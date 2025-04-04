# 🧪 Saucedemo Web Application
## Hybrid Framework with Cucumber (BDD + DDT)

### 👩‍💻 Prepared By
**Cevahir B**  
*QA Automation Engineer*
* cbasibuyuk.sdet@gmail.com

---

## 📌 Overview
This project is a **Hybrid Automation Testing Framework** built using **Java**, **Cucumber**, 
and **Selenium WebDriver**, following **BDD (Behavior-Driven Development)** and **DDT (Data-Driven Testing)** principles.

---

## ⚙️ Technologies Used
- Java
- Maven
- Selenium WebDriver (4.21.0)
- Cucumber
- JUnit
- Gherkin
- IntelliJ IDEA

---

## 🧩 Framework Structure

### 🔹 Test Organization
- `features/` – Feature files written in Gherkin language
- `stepDefs/` – Step definitions implementing the test steps
- `pages/` – Page classes using Page Object Model (POM)
- `utilities/` – Utility classes like `Driver`, `ConfigurationReader`, `BrowserUtils`
- `runners/` – Test runner classes using Cucumber options (e.g. `CukesRunner`)

### 🔹 Design Patterns
- **Page Object Model (POM)**: For maintaining reusable page elements
- **Singleton Pattern**: Used in the Driver class to prevent multiple browser instances

---

## 📂 Project Features

- 📦 Maven for dependency management and build automation
- 🔗 Dependencies managed in `pom.xml`
- 🧪 JUnit used for assertions
- 🔄 Pre/post-test setups in `Hooks` class (e.g., taking screenshots on failure)
- 🏷️ Tag-based test execution for selective test runs
- 📊 JSON and HTML reports generated via Cucumber plugin
- 🌐 Configuration handled via a `configuration.properties` file
- 💬 Gherkin language used for better communication with non-technical stakeholders
- 🧹 Easy to maintain due to centralized element storage and clean structure

---

## 🚀 Getting Started

> To set up and run the framework, follow the steps below:

### 🔧 Prerequisites
- Java 8 or later
- Maven 3 or later
- Chrome / Firefox / Edge browser
- IntelliJ IDEA

### ▶️ Run the Tests

1. Open terminal and navigate to the project root
2. Install dependencies:
   ```bash
   mvn clean install
   
3. Run the tests:
 - mvn verify

4. Or open CukesRunner.java in IntelliJ
 - Add desired tag
 - Click the "Run" button

