## 📏 UC5 – Unit-to-Unit Conversion (Same Measurement Type)

## Description  
UC5 extends UC4 by adding explicit unit-to-unit conversion functionality.  
The `QuantityLength` API now provides a `convert()` method to transform values between supported units.

## Objective  
To convert a numeric value from one LengthUnit to another using centralized conversion factors.

## Preconditions  
- `QuantityLength` class and `LengthUnit` enum exist  
- Supported units: FEET, INCHES, YARDS, CENTIMETERS  
- Conversion factors are defined relative to a base unit  

## Main Flow  
1. Client calls `convert(value, sourceUnit, targetUnit)`  
2. Validate value (finite number) and units (non-null)  
3. Normalize value to base unit  
4. Convert base value to target unit  
5. Return converted numeric result  

## Postcondition  
Returns mathematically equivalent value in target unit.  
Invalid inputs throw `IllegalArgumentException`.

## Key Concepts  
- Enum-based conversion factor management  
- Base unit normalization formula  
- Immutability and value object design  
- Method overloading and API usability  
- Floating-point precision handling  
- Bidirectional and round-trip conversion accuracy  
- Clean, scalable conversion API

🔗 _Code Link:_ 
👉 [UC5 – Unit-to-Unit Conversion](https://github.com/RAM-VISHAL/QuantityMeasurementApp/tree/feature/UC5-UnitConvertion)

---
