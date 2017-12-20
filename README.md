### REST APIs


#### Start Application
`./gradlew bootRun`


## Endpoints

### Question 2:

####Find the word counts of the text passed in

Request:
```
curl -X POST -H "Content-Type: application/json" \
 http://localhost:8080/wordcount \
 -d '{"text":"a hello world world w"}' 
```

###EResponse:
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

First N Fibonacci numbers
 
```
curl http://localhost:8080/fibonacci?n=10
```

Response : 
```json
[
  0,
  1,
  1,
  2,
  3,
  5,
  8,
  13,
  21
]
```

### Question 4:

Create a program that can cause deadlocks and an endpoint to monitor the deadlocks

Request:
```
curl http://localhost:8080/deadlock

```
Response:
```
Number of deadlocked threads: 2
```



### Question 5:

-[x] HSQL In memory DB
-[x] Create, List, Delete endpoints
  

#### Create User:
 
```
curl -X POST http://localhost:8080/users -d '{"name": "User1", "email":"kv1@gmail.com"}' -H "Content-Type: application/json"
## Saved
curl -X POST http://localhost:8080/users -d '{"name": "User2", "email":"kv2@gmail.com"}' -H "Content-Type: application/json"
## Saved 
```

#### list all users:
 
Request: 
```
curl http://localhost:8080/users/all
 
```

Response:
```json
[
  {
    "id": 1,
    "name": "User1",
    "email": "kv1@gmail.com"
  },
  {
    "id": 2,
    "name": "User1",
    "email": "kv1@gmail.com"
  }
]
```

#### Find user:
 
Request: 
```
curl http://localhost:8080/users?id=1 
```

Response:
```json
{
  "id": 1,
  "name": "User1",
  "email": "kv1@gmail.com"
}
```

#### Delete User:

Request:
```
curl -X DELETE "http://localhost:8080/users?id=1"
```

Response:
```
Deleted Successfully
```


### Question 6:

Write a REST Client that calls an external service

Request:
```
curl http://localhost:8080/posts
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

