## 📏 UC8 – Standalone LengthUnit with Conversion Responsibility

## Description  
UC8 refactors the design by extracting `LengthUnit` into a standalone enum.  
Conversion logic is moved from `QuantityLength` to `LengthUnit`, improving cohesion and scalability.

## Objective  
To centralize unit conversion responsibility inside `LengthUnit` and simplify `QuantityLength`.

## Preconditions  
- `LengthUnit` is a top-level enum (FEET, INCHES, YARDS, CENTIMETERS)  
- Conversion factors are defined inside the enum  
- `QuantityLength` delegates conversion logic to `LengthUnit`  

## Main Flow  
1. `LengthUnit` provides `convertToBaseUnit()` and `convertFromBaseUnit()`  
2. `QuantityLength` delegates conversion to unit methods  
3. Equality, conversion, and addition use delegated logic  
4. All UC1–UC7 functionality remains unchanged  

## Postcondition  
- Conversion logic is centralized in `LengthUnit`  
- `QuantityLength` focuses only on arithmetic and comparison  
- Circular dependency risks are eliminated  
- Backward compatibility is preserved  

## Key Concepts  
- Single Responsibility Principle (SRP)  
- Separation of concerns  
- Delegation pattern  
- Enum encapsulating behavior  
- Architectural scalability for multiple measurement categories  
- Refactoring without breaking public API  
- Improved cohesion and reduced coupling

🔗 _Code Link:_ 
👉 [UC8 – Standalone LengthUnit with Conversion Responsibility](https://github.com/RAM-VISHAL/QuantityMeasurementApp/tree/feature/UC8-StandaloneUnit/src)

---
