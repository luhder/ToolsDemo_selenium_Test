# ToolsDemo Selenium Cucumber Test Automation
This repository contains an automated test suite for the Practice Software Testing website using Selenium WebDriver, Cucumber (BDD), TestNG, and Java.

📂 Project Structure
```
luhder-toolsdemo_selenium_test/
├── README.md
└── ToolsDemo/
    ├── pom.xml
    ├── testng.xml
    ├── src/
    │   ├── main/
    │   │   └── Feature/
    │   │       ├── Registration.feature
    │   │       └── login.feature
    │   └── test/
    │       └── java/
    │           ├── Feature/
    │           │   ├── addToCart.feature
    │           │   ├── login.feature
    │           │   └── registration.feature
    │           ├── Stepdefinition/
    │           │   ├── AddtoCartStep.java
    │           │   ├── LoginStepdefinitions.java
    │           │   └── RegisterStep.java
    │           ├── Testrunner/
    │           │   └── runner.java
    │           ├── pages/
    │           │   ├── AddToCartPage.java
    │           │   ├── LoginPage.java
    │           │   └── RegistrationPage.java
    │           └── utils/
    │               └── ExtentReportUtil.java
    └── target/
```
**🛠 Tech Stack**

- Programming Language: Java
  
 -Test Automation: Selenium WebDriver

-BDD Framework: Cucumber

-Build Tool: Maven

-Reporting: Extent Reports

**🚀 Setup & Installation**

1️⃣ Prerequisites
Ensure you have the following installed:

Java JDK (11 or later)
Apache Maven
Google Chrome
ChromeDriver (match your Chrome version)
IntelliJ IDEA / Eclipse.

2️⃣ Clone the Repository-

- git clone https://github.com/your-username/luhder-toolsdemo_selenium_test.git
  
-cd luhder-toolsdemo_selenium_test

3️⃣ Install Dependencies

Run the following command to install required dependencies:

mvn clean install


**📝 Test Scenarios**

1️⃣ Registration Feature (registration.feature)
Scenario: User registers on the website
Given User is on the registration page  
When User enters valid details  
And Clicks on the register button  
Then User should be registered successfully 

2️⃣ Login Feature (login.feature)
Scenario: User logs into the website
Given User is on the login page  
When User enters valid credentials  
And Clicks the login button  
Then User should be logged in successfully 

3️⃣ Add to Cart Feature (addToCart.feature).
Scenario: User adds an item to the cart
Given User entered in website  
When User selects an item  
And Clicks on add to cart  
Then The product is added successfully  

**📜 Reports & Logs**
After test execution, reports are generated in:
target/reports/ExtentReport.html
Open the HTML report in a browser for test results.


