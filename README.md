# 🏧 ATM Simulation System

A simple yet powerful **Java-based ATM Simulation System** that demonstrates the concepts of **Object-Oriented Programming (OOP), Exception Handling, User Authentication, and Banking Transactions** in a real-world scenario.

---

## 📌 Project Overview

The ATM Simulation System mimics the basic functionalities of an Automated Teller Machine (ATM). Users must authenticate themselves using a PIN before accessing banking services such as deposits, withdrawals, and balance inquiries.

This project is designed to provide hands-on experience with Java programming concepts while simulating a practical banking application.

---

## ✨ Features

### 🔐 Secure PIN Authentication

* Validates users before granting access.
* Prevents unauthorized account access.

### 💰 Deposit Money

* Deposit funds into the account.
* Validates positive transaction amounts.

### 💸 Withdraw Money

* Withdraw available funds securely.
* Prevents overdrawing the account.

### 📊 Balance Inquiry

* Displays the current account balance instantly.

### ⚠️ Custom Exception Handling

* Uses a user-defined exception:

  * `InsufficientFundsException`
* Handles invalid transactions gracefully.

### 🔄 Interactive Menu System

* User-friendly menu-driven interface.
* Continuous banking operations until the user exits.

---

## 🛠 Technologies Used

* Java
* Object-Oriented Programming (OOP)
* Exception Handling
* Scanner Class
* Custom Exceptions

---

## 📂 Project Structure

```text
ATM Simulation
│
├── InsufficientFundsException.java
├── BankAccount.java
└── ATMSimulation.java
```

---

## 🧠 Concepts Demonstrated

### Object-Oriented Programming

* Classes and Objects
* Encapsulation
* Constructors
* Methods

### Exception Handling

* try-catch-finally
* Custom Exceptions
* IllegalArgumentException

### User Authentication

* PIN Verification
* Access Control

### Banking Operations

* Deposit
* Withdrawal
* Balance Inquiry

---

## 🚀 How to Run

### Step 1: Compile

```bash
javac ATMSimulation.java
```

### Step 2: Execute

```bash
java ATMSimulation
```

---

## 🖥 Sample Execution

```text
Enter your 4-digit PIN: 1234

=== ATM Menu ===
1. Deposit
2. Withdraw
3. Check Balance
4. Exit

Select an option: 1

Enter amount to deposit: 5000

Rs.5000 deposited.
New Balance: Rs.105000
```

---

## 🔒 Exception Handling Scenarios

### Invalid Deposit

```text
Enter amount to deposit: -100

Error: Deposit amount should be positive.
```

### Insufficient Funds

```text
Enter amount to withdraw: 200000

Error: You do not have enough funds for this transaction.
```

### Invalid PIN

```text
Enter your 4-digit PIN: 1111

Invalid PIN. Access denied.
```

---

## 🎯 Learning Outcomes

By completing this project, learners will understand:

* Java Class Design
* Encapsulation and Data Hiding
* Custom Exception Creation
* Real-world Banking Logic
* Menu-driven Console Applications
* User Authentication Mechanisms

---

## 🔮 Future Enhancements

* Multiple User Accounts
* PIN Change Feature
* Transaction History
* Mini Statement Generation
* Fund Transfer Between Accounts
* Database Connectivity (MySQL)
* GUI using JavaFX or Swing
* Online Banking Integration

---

## 👨‍💻 Author

**Ashaaz Ahmed Khan A**

---

## ⭐ Project Highlights

* ✔ Real-world Banking Simulation
* ✔ Custom Exception Handling
* ✔ Secure PIN Authentication
* ✔ Object-Oriented Design
* ✔ Beginner-Friendly Java Project
* ✔ Strong Foundation for Advanced Banking Applications


---

*"Learning Java becomes meaningful when concepts are applied to real-world problems. This ATM Simulation System is a step towards building robust banking and financial applications."*
