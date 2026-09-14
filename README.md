# Sauce Demo UI Tests

Automated UI tests for [Sauce Demo](https://www.saucedemo.com/) using Selenium, Cucumber, JUnit, and the Page Object Model pattern.

## Project Information

| Field | Details                                                             |
|-------|---------------------------------------------------------------------|
| **Author** | Susan Laime Lucero                                                  |
| **Course** | Certification II                                                    |
| **Instructor** | Mauricio Viscarra Rivera                                            |
| **Repository** | Upload this project to a new GitHub repository and add its URL here |

## Requirements Covered

- Selenium WebDriver browser automation
- JUnit test execution
- Cucumber feature files and step definitions
- Page Object Model (POM)
- Five automated scenarios
- Cucumber `Background`
- Cucumber `Scenario Outline` with examples
- Cucumber `DataTable` for checkout information
- Hooks for setup and cleanup
- Extent HTML, Spark HTML, and PDF reports

## Tech Stack

- **Java 21** - Programming language
- **Maven** - Build tool
- **JUnit 5** - Test support
- **Selenium 4** - Web browser automation
- **Cucumber 7** - BDD test framework
- **WebDriverManager** - ChromeDriver management
- **ExtentReports** - Test reporting

## Getting Started

### Prerequisites

- Java 21 or newer
- Maven 3.6 or newer
- Google Chrome
- Internet connection

### Run Tests

From the project root, execute:

```bash
mvn test
```

The tests open Sauce Demo, log in, and execute the home page, cart, and checkout scenarios.

## Test Coverage

### Home Feature

- **Verify that Reset App State restores the product button**
  - Adds the Sauce Labs Backpack.
  - Confirms the button changes to `Remove`.
  - Resets the application state.
  - Verifies the button returns to `Add to cart`.
- **Verify that products can be added/removed to the cart**
  - Sauce Labs Backpack
  - Sauce Labs Bolt T-Shirt

### Checkout Feature

- **Verify checkout item total**
  - Adds two products and verifies the item total.
- **Verify checkout total with tax**
  - Adds two products and verifies the total including tax.
- **User can checkout a purchase**
  - Completes the checkout form and verifies the order confirmation.

## Project Structure

```text
src/
├── main/java/
│   ├── pages/                 # Page Object classes
│   │   ├── LoginPage.java
│   │   ├── HomePage.java
│   │   ├── YourCartPage.java
│   │   ├── CheckoutYourInformationPage.java
│   │   ├── CheckoutOverviewPage.java
│   │   └── CheckoutCompletePage.java
│   └── utils/
│       └── DriverManager.java
└── test/
    ├── java/
    │   ├── TestRunner.java
    │   └── stepDefinitions/    # Cucumber steps and Hooks
    └── resources/
        ├── home.feature
        ├── checkout.feature
        ├── extent.properties
        └── extent reports configuration
```

## Reports

After the test execution, reports are generated in:

```text
test-output/
├── HtmlReport/Html-Report.html
├── SparkReport/Spark-Report.html
└── PdfReport/Pdf-Report.pdf
```

Open the HTML files in a browser and the PDF file with any PDF reader.
