# inventoryCRUD

1. Create REST Web Service
1.1 Use following technologies:
    • Language - Java
    • Framework - Spring Boot
    • Project management - Maven
1.2  Requirements:
    • Service has to communicate with DB 
        ◦ On startup application has to create entire DB structure
        ◦ In memory DB can be used
    • Map to DB at least two entities using JPA.
        ◦ Entities should be in relation – one to many or many to many
        ◦ One of the entities has to be implemented using inheritance
    • It should be possible to perform CRUD operations on entities through exposed WEB API
    • Create at least one unit test for calling exposed WEB API and at least one unit test for business logic
    • Create at least one integration test
    • Application should log relevant information to file
    • Exposed API should be documented
        ◦ Swagger UI can be used
    • Project should be tracked by GIT
        ◦ Put repository on github.com
2 Create UI for consuming Web Service
    • Create simple UI which will use REST API of the implemented service.
    • UI should allow for performing at least CRUD operations for a  single entity.
    • Use any SPA technology
3 Additional information
    • If requirement is not clear, propose your own solution
    • Timebox for task: 1 week
