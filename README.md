# Employees

Select salary from salaries where emp_id = 1 and sysdate between start_date and end_date

Сотрудники:

```java
POST – создать
PUT – редактировать
GET – получить список
DELETE – удалить

POST
  {
    “name”: Aselya,
    “surname”: Adieva,
    “salary”: 10000
  }

PUT
  {
    “id”:1
    “name”: Aselya,
    “surname”: Adieva,
    “salary”: 10000
  }

DELETE
Url/{emp_id}
GET
[
  {
    “id”:1
    “name”: Aselya,
    “surname”: Adieva,
    “salary”: 10000
  }
]
```

1. Cоздаете проект
2. Share project on github
3. Создаете entity
4. Commit
5. Создаете dto и mappers
6. Commit
7. Создаете функционал POST
8. Commit
9. Создаете функционал PUT
10. Commit
11. GET
12. Commit
13. DELETE
14. Commit
15. PUSH
