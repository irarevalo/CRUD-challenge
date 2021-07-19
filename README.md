# Proyecto realizado con Spring Boot
Para ejecutar este proyecto en local es necesario tener instalado Postgres.

### 1)
Se abre el proyecto en Spring tool suite (https://spring.io/tools).
### 2)
Se corre el proyecto como Spring Boot App.
### 3) 
El proyecto genera de forma automatica la tabla de Employees sobre la DB llamada postgres, la contraseña debe ser postgres.
### End Points
GET http://localhost:8080/api/Employee
GET http://localhost:8080/api/Employee/{:id}
POST http://localhost:8080/api/Employee
