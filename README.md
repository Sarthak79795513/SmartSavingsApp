# SmartSavingsApp

SmartSavingsApp is a **Java-based console application** designed to help customers explore products and shopkeepers manage their store inventory. The project is built to demonstrate key **Java concepts** such as encapsulation, inheritance, polymorphism, abstraction, exception handling, and the collections framework.

---

## 🚀 Features
- **Customer View**
  - Browse available products
  - View store-wise product listings  

- **Shopkeeper View**
  - Add new products with ID, name, price, and shop name  
  - Remove products by ID (with exception handling if not found)  
  - View all available products in the system  

- **Core Highlights**
  - Menu-driven interface for smooth navigation  
  - Uses `ArrayList` for product management  
  - Implements **custom exception** (`ProductNotFoundException`)  
  - Follows **OOP principles** with proper class design  

---

## 🛠️ Java Concepts Covered
- **Encapsulation** → `Product.java` with private fields and getters/setters  
- **Abstraction** → `View` interface implemented by `CustomerView` and `ShopKeeperView`  
- **Polymorphism** → Different implementations of `displayMenu()`  
- **Inheritance** → Unified behavior through interfaces  
- **Collections Framework** → `ArrayList<Product>` used in `ProductStore`  
- **Exception Handling** → Custom exception `ProductNotFoundException`  
- **Clean Structure** → Separation of views (`CustomerView`, `ShopKeeperView`) and business logic (`ProductStore`)  

---

## 📂 Project Structure
