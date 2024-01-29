# To Do List
Criação API RestFul com Spring Boot Java - projetinho para desafio DIO

### Tecnologias utilizadas: 
  - Spring Boot3
  - Java 17
  - Railway 

### Diagrama de Classe

````mermaid
classDiagram
    class Task {
        - int id
        - String title
        - String description
        - Status status
        - Priority priority
        - Date creationDate
    }
    class Status {
        PENDING
        FINISHED
        CANCELED
    }
    class Priority {
        LOW
        MEDIUM
        HIGH
    }
    class User {
        - int id
        - String name
        - List<Task> task
    }
    Task --> Status
    Task --> Priority
    User "1" -- "*" Task
