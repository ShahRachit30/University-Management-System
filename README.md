# University Management System

A desktop-based University Management System built with **Java Swing** and **MySQL**. The application provides a graphical interface for managing student and teacher information, leave records, examination marks, and fee details.

## Features

- **Login:** Authenticate users through the application login screen.
- **Student management:** Add, view, and update student records.
- **Teacher management:** Add, view, and update teacher records.
- **Leave management:** Record and view student and teacher leave applications.
- **Examination:** Enter marks and view examination results.
- **Fee management:** View course fee structures and record student fee details.
- **Utilities:** Access desktop utilities from the main application menu.

## Technology Stack

- Java (Swing for the desktop GUI)
- MySQL
- JDBC for database connectivity

The source also imports these third-party Java libraries:
- **JCalendar** (`com.toedter.calendar.JDateChooser`)
- **rs2xml** (`net.proteanit.sql.DbUtils`)

Make sure the corresponding JAR files are available on the project's classpath. They are not included in this repository archive.

## Project Structure

```text
.
├── database empty/
│   └── mysql.sql
└── src/
    ├── icons/
    │   └── ... application images
    └── university/
        └── management/
            └── system/
                ├── Login.java
                ├── Project.java
                ├── Conn.java
                └── ... application screens
```

## Requirements

- JDK installed
- MySQL Server installed and running
- A Java IDE (such as IntelliJ IDEA, Eclipse, or NetBeans), or the Java compiler
- MySQL Connector/J
- JCalendar JAR
- rs2xml JAR

## Setup

### 1. Clone the repository

```bash
git clone https://github.com/ShahRachit30/University-Management-System.git

cd University-Management-System
```

### 2. Create the database

1. Open MySQL Workbench or a MySQL command-line client.
2. Run the SQL script at `database empty/mysql.sql`.
3. The script creates the `universitymanagementsystem` database, its tables, and initial fee records.

The SQL script also inserts a sample login account:

| Username | Password |
|---|---|
| `admin` | `12345` |

Change this sample credential before using the application beyond local testing.

### 3. Configure the database connection

Open:

```text
src/university/management/system/Conn.java
```

The current connection is configured as:

```java
DriverManager.getConnection(
    "jdbc:mysql:///universitymanagementsystem",
    "root",
    "password"
);
```

Update the username, password, and connection URL to match your local MySQL configuration. Do not commit real database passwords or other secrets to the repository.

### 4. Add the required libraries

Add the following JAR files to the project's classpath:

- MySQL Connector/J
- JCalendar
- rs2xml

### 5. Run the application

Run the `main` method in:

```text
src/university/management/system/Login.java
```

In an IDE, ensure that `src` is configured as a source root and that the required JAR files are on the classpath. The `icons` directory must also be available on the runtime classpath because the application loads images from the `icons` resource path.

## Database

The SQL setup script defines tables for:

- Login credentials
- Students and teachers
- Student and teacher leave records
- Subjects and marks
- Course fee structures
- Student college-fee records

## Notes and Limitations

- This is a desktop Java application; it is not a web application.
- The project archive does not include the required external library JAR files.
- Database connection settings are currently hard-coded in `Conn.java` and must be configured locally.
- The SQL script contains a sample login credential for local setup. Replace it before any real deployment.
- This project should be treated as an educational/demo application unless its authentication, input handling, and database security are reviewed and improved for production use.

## License

This project is distributed under the MIT License. See the [LICENSE](LICENSE) file for details.
