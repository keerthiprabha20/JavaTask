# Library Management System (Java)

A simple Library Management System implemented in Java.  
It allows adding books, issuing books, returning books, and displaying all available books.  
This project also includes unit tests using JUnit.

---

## Features
- Add new books (title, author, ISBN)
- Show all the books in the library
- Issue a book
- Return a book
- Track availability of books

---

## Project Structure
src/
 └── library/
      ├── Book.java         → Book details
      ├── Issueable.java    → Interface for issuing/returning
      ├── Library.java      → Manages collection of books
      ├── LibraryTest.java  → JUnit tests
      └── Main.java         → Runs the program
      
## How to Run
1) Open the project in Eclipse (or any IDE).
2) Run Main.java.
3)Console menu will guide you to add, show, issue, or return books.

## How to Test

We used JUnit 4.
Run LibraryTest.java in Eclipse with Run as → JUnit Test.

## Tests included:
Adding a book
Issuing a book
Returning a book
