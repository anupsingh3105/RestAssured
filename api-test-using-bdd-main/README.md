# Rest-Assured Cucumber BDD Framework with Extent Reports

This is a test automation framework using Rest-Assured for API testing, Cucumber for BDD, and ExtentReports for reporting. The framework allows automated API tests using the Cucumber BDD approach while generating detailed HTML reports with Extent Reports.

## Table of Contents
- [Project Setup](#project-setup)
- [Installation](#installation)
- [Project Structure](#project-structure)
- [How to Run the Tests](#how-to-run-the-tests)
- [License](#license)

## Project Setup

### Prerequisites:
1. **Java 8+**
2. **Maven** - To manage dependencies
3. **IDE** (e.g., IntelliJ, Eclipse)

### Libraries and Tools Used:
- **Rest-Assured**: For API Testing
- **Cucumber**: For Behavior-Driven Development (BDD)
- **JUnit**: To execute Cucumber tests
- **ExtentReports**: For detailed HTML test reports

## Installation

1. Clone the repository:
    ```bash
    git clone https://github.com/kulwinder-singh17/restassured-cucumber-bdd.git
    cd restassured-cucumber-bdd
    ```

2. Install dependencies via Maven:
    ```bash
    mvn clean install
    ```

## Project Structure
```bash
src/
├── main/
│   └── java/
│       └── com/
│           └── yourcompany/
│               └── utils/
│               │    ├── ExtentManager.java
│               │    └── ExtentTestManager.java
│               └── base/
│                    └── ApiService.java
├── test/
│   └── java/
│       └── com/
│           └── yourcompany/
│               ├── hooks/
│               │   └── Hooks.java
│               ├── steps/
│               │   └── Steps.java
│               └── runners/
│               │   └── Runner.java
│               └── features/
│                   └── city.feature
└── resources/
```


## How to Run the Tests

### Using Maven:
To run the tests, execute the following command:
```bash
mvn test
```
### Cucumber Feature File Example:
```bash
Feature: Weather API Testing

  Scenario Outline: Get current weather of "<City>"
    Given check weather of "<City>" using GET
    Then status code should be 200
    Examples:
      | City   |
      | London |
      | Mexico |
      | Mumbai |
```

## License

This script is licensed under the Apache License. See [LICENSE.md](LICENSE.md) for more details.
