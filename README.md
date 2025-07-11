# PNC-01-parcial-final

Este repositorio contiene un proyecto para evaluar y practicar los conceptos de seguridad en aplicaciones Spring Boot usando JWT, roles y Docker.

Estudiantes
Nombre del estudiante 1: Kattia Saraí Santana Soriano - 00036122
Nombre del estudiante 2: Juan Carlos Sibrián Palacios - 00057522
Sección: 01

-------------------

## Application.yml
```yaml
spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/supportdb
    username: postgres
    password: admin
  jpa:
    hibernate:
      ddl-auto: update
    show-sql: tru
```

## Usuarios de prueba en DataInitializer

USER:
```
{
  "nombre": "Usuario Final",
  "correo": "user@correo.com",
  "password": "user123",
  "nombreRol": "USER"
}

{
  "nombre": "Usuario Final 2",
  "correo": "user2@correo.com",
  "password": "user123",
  "nombreRol": "USER"
}
```

TECH:
```
{
  "nombre": "Soporte Técnico",
  "correo": "tech@correo.com",
  "password": "tech123",
  "nombreRol": "TECH"
}
```

## Evidencia de pruebas

1. POST login
     ![image](https://github.com/user-attachments/assets/0d64f091-ac86-4a76-9242-29e3343edc7b)

2. GET all tickets usando token de USER
     ![image](https://github.com/user-attachments/assets/b5f6c85a-8edb-4195-9c99-23e71711f5aa)

3. POST ticket con usuario
     ![image](https://github.com/user-attachments/assets/b8668233-b12a-4c87-96ae-23b2af499965)

4. GET ticket del usuario
     ![image](https://github.com/user-attachments/assets/75270562-88a6-4b59-b45c-25de70276796)

5. UPDATE ticket con rol TECH
   ![image](https://github.com/user-attachments/assets/3bb2ca5d-4bd1-4d73-bfde-115d55bd288f)

6. UPDATE ticket con rol USER
   ![image](https://github.com/user-attachments/assets/6a663ad7-4a71-4498-b61a-d1c9fa94ae03)

7. DELETE ticket con rol TECH
   ![image](https://github.com/user-attachments/assets/28ac72c1-01e9-47cc-a848-f128917bd861)

8. DELETE ticket con rol usuario
    ![image](https://github.com/user-attachments/assets/1b2807aa-6569-41e8-8667-5d4287ff8534)


## Instrucciones de compilación
   1. Nombrar a la base de datos de PostgreSQL: supportdb
   2. Usuario de la BD:
      ```
        username: postgres
        password: admin
      ```
   3. Buildear el proyecto en el IDE de su preferencia (se utilizó ItelliJ IDEA para este proyecto)



