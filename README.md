# 📏 UC2 – Feet and Inches Measurement Equality

## Description  
This use case extends UC1 to support equality checks for both Feet and Inches measurements.  
Feet and Inches are treated as separate entities and compared independently.

## Objective  
To validate and compare two Feet values and two Inches values using proper equality logic.

## Preconditions  
- `Inches.java` is instantiated  
- Two numeric values for Feet and Inches are provided  

## Main Flow  
1. Main method calls static method for Feet equality  
2. Main method calls static method for Inches equality  
3. Separate `Feet` and `Inches` objects are created  
4. `equals()` method is invoked  
5. Values are compared using `Double.compare()`  
6. Result (`true` / `false`) is returned  

## Postcondition  
Returns equality result for Feet-to-Feet and Inches-to-Inches comparisons.

## Key Concepts  
- Object Equality and equals() contract  
- Floating-point comparison using `Double.compare()`  
- Null and type safety checks  
- Encapsulation and immutability  
- DRY principle consideration (code duplication in Feet & Inches classes)

🔗 _Code Link:_ 
👉 [UC2 – Feet and Inches Measurement Equality](https://github.com/RAM-VISHAL/QuantityMeasurementApp/tree/feature/UC2-InchEquality/src)

---
