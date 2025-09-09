# Student-Info-Mini-Java-MySQL

## Description
A simple **Java console application** to manage student records using **MySQL**.  
This project allows users to **add new students and view all student records** stored in a MySQL database via **JDBC**.

## Features
- Add new student records (Name & Age)
- View all student records from the database
- Console-based interface (no GUI required)
- Uses JDBC for database connectivity

## Technologies Used
- **Java** (JDK 8 or above)  
- **MySQL**  
- **JDBC**  
- **Scanner** for console input  
- **IntelliJ IDEA** (recommended IDE)

## Setup Instructions
### 1. Clone the Repository
```bash
git clone <your-repo-url>
cd <repo-folder>
2. Setup MySQL Database
Open MySQL and create a database:

sql
CREATE DATABASE testdb;
Create the students table:

sql
CREATE TABLE students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL,
    age INT NOT NULL
);
3. Configure Database Connection
In StudentApp.java, make sure the database credentials are correct:

java
String url = "jdbc:mysql://localhost:3306/testdb";
String user = "root";
String password = "root";

4. Run the Application
Open the project in IntelliJ IDEA.
Run StudentApp.java.
Enter student details when prompted.
The console will display all student records from the database.

Example Usage
Connected to Database!
Enter Student Name: Rani Tayade
Enter Student Age: 23
Student Added Successfully!

--- Student Records ---
ID: 1, Name: Rani Tayade, Age: 23

Author
Rani Tayade
Full Stack Java Developer | Intern

License
This project is licensed under the MIT License.

