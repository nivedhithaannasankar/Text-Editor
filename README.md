#  Text-Editor


## 📌 Overview

This project is a **console-based Notepad application built using Java**.
It simulates basic features of a text editor such as inserting, deleting, copying, and pasting text.

The application also supports **Undo ↩️ and Redo ↪️ operations** using **Stack data structures**, making it similar to how real editors work.

This project demonstrates the use of **Java Collections, Object-Oriented Programming, and Data Structures**.

---

## ✨ Features

✅ Display the entire text
✅ Display text between selected lines
✅ Insert text into a specific line
✅ Delete a specific line
✅ Delete multiple lines
✅ Copy text between lines 📋
✅ Paste copied text 📄
✅ Undo previous action ↩️
✅ Redo undone action ↪️
✅ Exit the program 🚪

---

## 🛠️ Technologies Used

* ☕ **Java**
* 🧩 **Object-Oriented Programming (OOP)**
* 📚 **Java Collections Framework**
* 🗂️ **Stack (Undo/Redo)**
* 📋 **Queue (Clipboard)**
* 🧮 **Arrays (Text Storage)**

---

## 📂 Project Structure

```text
Notepad-Console-App
│
├── App.java
├── notepad
│   └── Notepad.java
│
├── action
│   └── Action.java
│
└── README.md
```

---

## 📄 File Descriptions

### 🚀 App.java

This file contains the **main method** and acts as the **entry point of the application**.

Responsibilities:

* Displays the menu
* Accepts user input
* Calls methods from the `Notepad` class

---

### 🗒️ Notepad.java

This class contains the **core functionality of the notepad**.

Functions include:

* Insert text
* Delete text
* Display text
* Copy & paste operations
* Undo and redo functionality

Data structures used:

* **Stack** → Undo and Redo operations
* **Queue** → Clipboard storage
* **Array** → Stores text lines

---

### ⚙️ Action.java

This class represents **each user action performed in the notepad**.

Each action stores:

* 🔢 Action ID
* ⏰ Timestamp
* ✏️ Action type (Insert/Delete)
* 📍 Line number
* 📝 Text content

This information is used to implement **Undo and Redo operations**.

---

## 🔄 Undo & Redo Mechanism

Undo and redo are implemented using **two stacks**.

```
Undo Stack  → Stores performed actions
Redo Stack  → Stores undone actions
```

### ↩️ Undo Operation

1. Remove the action from the **Undo Stack**
2. Reverse the action
3. Push it into the **Redo Stack**

### ↪️ Redo Operation

1. Remove the action from the **Redo Stack**
2. Reapply the action
3. Push it back to the **Undo Stack**

---

## 🖥️ Example Menu

```
Choose your option

1. Display the text
2. Display text between lines
3. Insert text
4. Delete text
5. Delete from given lines
6. Copy text
7. Paste text
8. Undo action
9. Redo action
10. Exit
```

---

## ▶️ How to Run the Project

### 1️⃣ Clone the Repository

```
git clone https://github.com/your-username/notepad-console-app.git
```

### 2️⃣ Compile the Project

```
javac App.java
```

### 3️⃣ Run the Application

```
java App
```

---

## 💡 Example Usage

```
Enter your choice: 3
Enter the text: Hello World
Enter the line number: 1

Text inserted successfully.
```

---

## 🚀 Future Improvements

🔹 Save text to a file
🔹 Load text from a file
🔹 GUI version using **Java Swing / JavaFX**
🔹 Search functionality 🔍
🔹 Multiple clipboard support

---

