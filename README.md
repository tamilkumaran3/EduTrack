# 🎓 EduTrack

EduTrack is a simple **Student Management System** built with **Java and MySQL**.  
It provides basic functionality to manage student records, connect with a database, and perform CRUD (Create, Read, Update, Delete) operations.

---

## 🚀 Features

- Add new student records
- View student details
- Update student information
- Delete student records
- JDBC-based database connectivity (MySQL)
- Modular design using DAO (Data Access Object) pattern

---

## 🛠️ Tech Stack

- **Programming Language:** Java  
- **Database:** MySQL  
- **Libraries/Tools:** JDBC  

---

## 📂 Project Structure

```
EduTrack/
│
├── DBConnection.java    # Handles MySQL database connection
├── Student.java         # Student entity/model class
├── StudentDAO.java      # Data Access Object for CRUD operations
└── Main.java            # Entry point of the application
```

---

## ⚙️ Installation & Setup

### 1️⃣ Clone the Repository
```bash
git clone https://github.com/tamilkumaran3/EduTrack.git
cd EduTrack
```

### 2️⃣ Set Up the Database
1. Install [MySQL](https://dev.mysql.com/downloads/).
2. Open MySQL and create a database:
   ```sql
   CREATE DATABASE edutrack;
   USE edutrack;
   ```
3. Create the `students` table:
   ```sql
   CREATE TABLE students (
       id INT PRIMARY KEY AUTO_INCREMENT,
       name VARCHAR(100) NOT NULL,
       age INT NOT NULL,
       grade VARCHAR(10)
   );
   ```

### 3️⃣ Configure Database Connection
In `DBConnection.java`, update your MySQL username and password:
```java
private static final String URL = "jdbc:mysql://localhost:3306/edutrack";
private static final String USER = "your-username";
private static final String PASSWORD = "your-password";
```

### 4️⃣ Compile & Run
```bash
javac *.java
java Main
```

---

## ▶️ Usage

- On running the program, you’ll be prompted with menu options like:
  - Add Student  
  - View Students  
  - Update Student  
  - Delete Student  
  - Exit  

Example (adding a student):
```
Enter student name: John
Enter age: 20
Enter grade: A
✅ Student added successfully!
```

---

## 🤝 Contributing

Contributions are welcome! To contribute:
1. Fork the repository  
2. Create a new branch (`feature-xyz`)  
3. Commit your changes  
4. Open a Pull Request  

---

## 📜 License

This project is licensed under the **MIT License** – you’re free to use, modify, and distribute it.

---

## 🙌 Acknowledgements

- Java JDBC Documentation  
- MySQL Community Edition  
- Inspiration from simple Student Management projects
