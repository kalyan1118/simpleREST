package hello;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import java.util.concurrent.TimeUnit;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//Question 4: Create two threads and monitor if they are dead locked.
//Usage: curl http://localhost:8080/deadlock
@RestController
public class DeadlockController {
	
		//This method Causes the deadlock between two threads, the run method is over-rided.
  	private void causeDeadlock() 
		{
        final Object lock1 = new Object();
        final Object lock2 = new Object();

        Thread thread1 = new Thread(new Runnable(){
            @Override public void run() {
                synchronized (lock1) {
                    System.out.println("Thread1 acquired lock1");
                    try {
                        TimeUnit.MILLISECONDS.sleep(50);
                    } catch (InterruptedException ignore) {}
                    synchronized (lock2) {
                        System.out.println("Thread1 acquired lock2");
                    }
                }
            }

        });
        thread1.start();
				
        Thread thread2 = new Thread(new Runnable() {
            @Override public void run() {
                synchronized (lock2) {
                    System.out.println("Thread2 acquired lock2");
                    try {
                        TimeUnit.MILLISECONDS.sleep(50);
                    } catch (InterruptedException ignore) {}
                    synchronized (lock1) {
                        System.out.println("Thread2 acquired lock1");
                    }
                }
            }
        });
				
        thread2.start();
    }

  
		@RequestMapping("/deadlock")
    public @ResponseBody String monitor()
	  {
        causeDeadlock();
        try {
            TimeUnit.MILLISECONDS.sleep(100);
        } catch (InterruptedException ignore) {}
        ThreadMXBean threadBean = ManagementFactory.getThreadMXBean();
        long[] threadIds = threadBean.findMonitorDeadlockedThreads();
        int deadlockedThreads = threadIds != null? threadIds.length : 0;
        return "Number of deadlocked threads: " + deadlockedThreads;
    }
}
