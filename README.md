# SOLID Principles – Java Lab

## Project Title
**SOLID Principles Java Lab**

## Getting Started
This project demonstrates the application of the **SOLID principles** in Java through small, focused exercises. Each principle is implemented in its own package with clean, readable examples designed for academic explanation and presentation.

## Prerequisites
- Java JDK 17 or higher  
- Apache Maven 3.8+  
- Git (optional, for version control)

## Installing
Clone the repository and navigate to the project root:

```bash
git clone https://github.com/sebRedi/solid-principles-java-lab
cd solid-principles-java-lab
```

Compile the project using Maven:

```bash
mvn clean install
```

## Running tests
To execute the unit tests:

```bash
mvn test
```

## Project Structure
```
solid-principles-java-lab/
├── src/
│   ├── main/java/com/example/solid/
│   │   ├── srp/  (Single Responsibility Principle)
│   │   ├── ocp/  (Open/Closed Principle)
│   │   ├── lsp/  (Liskov Substitution Principle)
│   │   ├── isp/  (Interface Segregation Principle)
│   │   ├── dip/  (Dependency Inversion Principle)
│   ├── test/java/com/example/solid/
├── pom.xml
├── README.md
```

## SOLID Principles Implemented

### Single Responsibility Principle (SRP)
Each class has one and only one responsibility.  
Example: Invoice logic is separated into data, calculation, printing, and persistence.

**Design patterns applicable:**
- Single Responsibility separation (core principle)
- Facade (to coordinate multiple responsibilities)
- Strategy (for calculation logic)

### Open/Closed Principle (OCP)
The system is open for extension but closed for modification.  
Example: Discounts are implemented using strategies instead of conditional logic.

**Design patterns applicable:**
- Strategy
- Factory Method
- Template Method

### Liskov Substitution Principle (LSP)
Objects of a superclass should be replaceable with objects of its subclasses without breaking the system.

**Design patterns applicable:**
- Interface-based design
- Bridge
- Strategy

### Interface Segregation Principle (ISP)
Clients should not be forced to depend on methods they do not use.

**Design patterns applicable:**
- Role Interfaces
- Adapter
- Decorator

### Dependency Inversion Principle (DIP)
High-level modules should not depend on low-level modules, both should depend on abstractions.

**Design patterns applicable:**
- Dependency Injection
- Factory
- Service Locator

## Deployment
This project is intended for educational purposes and does not require deployment. It can be executed locally using Maven.

## Built With
- Java 17  
- Maven  
- JUnit 5  

## Contributing
This project was developed as part of an academic lab. Contributions are not required.

## Versioning
Version 1.0 – Initial implementation of SOLID principles.

## Authors
**Sebastian Galvis Briceño**

## License
This project is licensed for academic and educational use.

## Acknowledgments
- Robert C. Martin (Uncle Bob) for defining the SOLID principles  
- Escuela Colombiana de Ingeniería Julio Garavito
