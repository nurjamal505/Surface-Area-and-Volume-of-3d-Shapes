### **README.md**

---

# 3D Shape Polymorphism Project

## **Description**

This project demonstrates the use of **polymorphism** in Java by implementing an interface, `Shape3DInterface`, for 3D shapes. The project includes three specific 3D shapes: **Sphere**, **Cylinder**, and **Cube**. Each class implements the `Shape3DInterface` to define methods for calculating the **surface area** and **volume** of the respective shapes.

### **Key Features:**
- Defines a common interface, `Shape3DInterface`, with methods `surfaceArea()` and `volume()`.
- Implements the interface in `Sphere`, `Cylinder`, and `Cube` classes with shape-specific formulas.
- Uses polymorphism to handle different 3D shapes uniformly.
- Generates random dimensions for each shape and calculates their surface area and volume.
- Displays the results of 10 randomly generated 3D shapes.

---

## **Polymorphism Explained**

Polymorphism in this project allows a single `Shape3DInterface` reference to point to objects of different classes (`Sphere`, `Cylinder`, and `Cube`). This enables the program to handle all shapes uniformly while invoking the shape-specific implementations of `surfaceArea()` and `volume()`. 

### **How It Works:**
- The `Shape3DInterface` type is used to store references to various shapes in an array.
- Despite being stored as `Shape3DInterface`, each object retains its behavior and methods, ensuring the correct implementation for `surfaceArea()` and `volume()` is called for each shape.

This demonstrates **runtime polymorphism** or **method overriding**, where the method called is determined by the actual object type at runtime.

---

## **Sample Output**

### **Run 1:**
```
Shape: Sphere
Surface Area: 314.16
Volume: 523.60
----------------------
Shape: Cylinder
Surface Area: 471.24
Volume: 942.48
----------------------
Shape: Cube
Surface Area: 600.00
Volume: 1000.00
----------------------
Shape: Sphere
Surface Area: 113.10
Volume: 452.39
----------------------
Shape: Cylinder
Surface Area: 361.28
Volume: 785.40
----------------------
Shape: Cube
Surface Area: 216.00
Volume: 512.00
----------------------
...
```

### **Run 2:**
```
Shape: Cylinder
Surface Area: 471.24
Volume: 942.48
----------------------
Shape: Sphere
Surface Area: 201.06
Volume: 418.88
----------------------
Shape: Cube
Surface Area: 54.00
Volume: 27.00
----------------------
Shape: Cylinder
Surface Area: 254.47
Volume: 452.39
----------------------
Shape: Cube
Surface Area: 384.00
Volume: 729.00
----------------------
Shape: Sphere
Surface Area: 113.10
Volume: 268.08
----------------------
...
```

---

## **Setup Instructions**

### **Prerequisites:**
- Java Development Kit (JDK) installed.

### **Steps:**
1. Clone the repository:
   ```bash
   git clone https://github.com/nurjamal505/Surface-Area-and-Volume-of-3d-Shapes.git
   ```
2. Navigate to the project directory:
   ```bash
   cd 3D-Shape-Polymorphism
   ```
3. Compile the Java file:
   ```bash
   javac Main.java
   ```
4. Run the program:
   ```bash
   java Main
   ```

---

## **Technologies Used**
- Java
- Object-Oriented Programming (OOP) concepts: Polymorphism, Interfaces, and Inheritance.

---

## **Credits**
This project is designed to illustrate fundamental concepts of OOP in Java, focusing on the practical use of polymorphism.
