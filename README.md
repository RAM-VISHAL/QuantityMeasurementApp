## 📏 UC3 – Generic Quantity Class (DRY Principle)

## Description  
UC3 refactors separate Feet and Inches classes into a single `QuantityLength` class using an enum.  
This eliminates code duplication and follows the DRY (Don't Repeat Yourself) principle.

## Objective  
To compare measurements across units (e.g., 1 ft == 12 inches) using a common base unit conversion.

## Preconditions  
- `QuantityMeasurementApp` is instantiated  
- Two numeric values with unit types are provided  
- Conversion factors are defined in `LengthUnit` enum  

## Main Flow  
1. User provides value and unit  
2. Input and unit are validated  
3. Values are converted to base unit (feet)  
4. Converted values are compared using `Double.compare()`  
5. Equality result is returned  

## Postcondition  
Returns `true` if converted values are equal, otherwise `false`.  
All UC1 and UC2 functionality remains preserved.

## Key Concepts  
- DRY Principle (no duplicate unit classes)  
- Enum for type-safe units  
- Cross-unit comparison (1 ft = 12 inches)  
- Encapsulation and abstraction  
- Equality contract and null safety  
- Scalable design for adding new units

🔗 _Code Link:_ 
👉 [UC3 – Generic Quantity Class (DRY Principle)](https://github.com/RAM-VISHAL/QuantityMeasurementApp/tree/feature/UC3-GenericLength)

---
