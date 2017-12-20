## About Application
This is a simple SpringBoot application with multiple REST endpoints.

#### Start Application
Change the working the directory to the the projects folder.
Enter the Command :`./gradlew bootRun`

### Question 1
Simple "Hello World" REST End point

Request#1:
```
curl localhost:8080\greeting
```

Response:
```json
{ "id":1,
  "content":"Hello, World!"
}
```

Request#2:
```
curl localhost:8080\greeting?name=Kalyan
```

Response:
```json
{ "id":1,
  "content":"Hello, Kalyan!"
}
```

### Question 2:
REST endpoint that accepts a JSON object containing a paragraph of text and returns a JSON array of objects. The returned objects represent the unique words from the supplied paragraph along with a count of the number of occurrences. The array of objects must be sorted alphabetically.


Request:
```
curl -X POST http://localhost:8080/wordCount -d '{"text":"A world hello w world"}'
-H "Content-Type: application/json"
```
Response:
```json
[
  {
    "word": "a",
    "count": 1
  },
  {
    "word": "hello",
    "count": 1
  },
  {
    "word": "w",
    "count": 1
  },
  {
    "word": "world",
    "count": 2
  }
]
```

### Question 3:
REST endpoint that accepts a number, N, and returns a JSON array with the first N Fibonacci numbers. 
Request takes default value of 10.
Request:
```
curl http://localhost:8080/fibonacci?n=10
```
Response : 
```json
{"nfibonacci":[1,1,2,3,5,8,13,21,34,55]}
```

### Question 4:
REST endpoint that creates two threads that become deadlocked with each other. Use the REST function to monitor the two threads and detect the deadlock.

Request:
```
curl http://localhost:8080/deadlock

```
Response:
```
Number of deadlocked threads: 2
```

### Question 5:
Add three REST endpoints that add, query, and delete rows in a database.
HyperSQL(hsqldb.org) is Used and database dependency is added.

#### Create Entry(Add): 
Request:
```
curl -X POST http://localhost:8080/Users -d '{"name": "Kalyan", "email":"Kalyan@gmail.com"}' 
-H "Content-Type: application/json"
```
Response:
```
User:  Kalyan Saved Sucessfully
```

Request:
```
curl -X POST http://localhost:8080/Users -d '{"name": "Chintalapati", "email":"Chintalapati@gmail.com"}'
-H "Content-Type: application/json"
```
Response:
```
User: Chintalapati Saved Sucessfully 
```

#### List all users(Query-1):
 
Request: 
```
curl http://localhost:8080/Users/all 
```
Response:
```json
[
  {
    "id": 1,
    "name": "Kalyan",
    "email": "Kalyan@gmail.com"
  },
  {
    "id": 2,
    "name": "Chintalapati",
    "email": "Chintalapati@gmail.com"
  }
]
```

#### Get a particular User(Query-2):
 
Request: 
```
curl http://localhost:8080/Users?id=1
```
Response:
```json
{
  "id": 1,
  "name": "Kalyan",
  "email": "Kalyan@gmail.com"
}
```

#### Delete User:

Request:
```
curl -X DELETE "http://localhost:8080/Users?id=1
```

Response:
```
User-Id 1 Deleted Successfully
```


### Question 6:
REST endpoint that queries an external REST service using Spring RestTemplate. The response should be returned to the caller. 
External Service which is Used to get Information : https://jsonplaceholder.typicode.com/posts

 
Request:
```
curl  http://localhost:8080/books
```

Response:
```json
[
  {
    "id": 1,
    "userId": 1,
    "title": "sunt aut facere repellat provident occaecati excepturi optio reprehenderit",
    "body": "quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto"
  },
  {
    "id": 2,
    "userId": 1,
    "title": "qui est esse",
    "body": "est rerum tempore vitae\nsequi sint nihil reprehenderit dolor beatae ea dolores neque\nfugiat blanditiis voluptate porro vel nihil molestiae ut reiciendis\nqui aperiam non debitis possimus qui neque nisi nulla"
  },
  {
    "id": 3,
    "userId": 1,
    "title": "ea molestias quasi exercitationem repellat qui ipsa sit aut",
    "body": "et iusto sed quo iure\nvoluptatem occaecati omnis eligendi aut ad\nvoluptatem doloribus vel accusantium quis pariatur\nmolestiae porro eius odio et labore et velit aut"
  },
  {
    "id": 4,
    "userId": 1,
    "title": "eum et est occaecati",
    "body": "ullam et saepe reiciendis voluptatem adipisci\nsit amet autem assumenda provident rerum culpa\nquis hic commodi nesciunt rem tenetur doloremque ipsam iure\nquis sunt voluptatem rerum illo velit"
  },
  {
    "id": 5,
    "userId": 1,
    "title": "nesciunt quas odio",
    "body": "repudiandae veniam quaerat sunt sed\nalias aut fugiat sit autem sed est\nvoluptatem omnis possimus esse voluptatibus quis\nest aut tenetur dolor neque"
  },
  {
    "id": 6,
    "userId": 1,
    "title": "dolorem eum magni eos aperiam quia",
    "body": "ut aspernatur corporis harum nihil quis provident sequi\nmollitia nobis aliquid molestiae\nperspiciatis et ea nemo ab reprehenderit accusantium quas\nvoluptate dolores velit et doloremque molestiae"
  },
  {
    "id": 7,
    "userId": 1,
    "title": "magnam facilis autem",
    "body": "dolore placeat quibusdam ea quo vitae\nmagni quis enim qui quis quo nemo aut saepe\nquidem repellat excepturi ut quia\nsunt ut sequi eos ea sed quas"
  }
]
```

