# 🥤 Vending Machine (Java)

A console-based **Vending Machine simulation** built using Core Java.
This project models real-world vending machine behavior including product selection, payment validation, and purchase handling.

---

## 🚀 Features

* 🛒 Multiple product support (dynamic product list)
* 🔍 Product search based on user input
* 💰 Money insertion & validation
* 📦 Product availability check
* 💳 Purchase processing
* 💸 Remaining balance returned to user
* ⚙️ Clean and modular structure

---

## 🧠 How It Works

1. User inserts money
2. User enters product name
3. System searches through all available products
4. If product is found:

    * Checks if sufficient balance is available
    * Deducts product price
    * Dispenses product
    * Returns remaining balance
5. If not found → shows error

---

## 📁 Project Structure

```
Vender-Machine/
│
├── src/
│   ├── Main.java
│
├── machine/
│   ├── ProdsList.java
│
├── users/
│   ├── User.java
│
├── .gitignore
├── README.md
├── LICENSE
├── Vender-Machine.iml
└── .idea/ (IDE config)
```

---

## 🛠️ Tech Stack

* Java (Core Java)
* OOP Concepts
* Streams API (for filtering/search)

---

## ▶️ How to Run

1. Clone the repository:

```bash
git clone https://github.com/your-username/vender-machine.git
```

2. Open in IntelliJ IDEA or any Java IDE

3. Run:

```
Main.java
```

---

## 💡 Future Improvements

* Add product quantity (inventory system)
* Implement transaction history
* Add menu-driven interface
* Introduce enums for transaction types
* Improve error handling and validation
* Convert to GUI or web-based app

---

## 🤝 Contributing

Contributions are welcome!

Feel free to:

* Fork the repo
* Create a feature branch
* Submit a Pull Request

---

## 📄 License

This project is licensed under the MIT License.

---

## ⭐ Acknowledgment

This project is built as part of learning **Java, OOP, and system design fundamentals**.

---
