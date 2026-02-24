## 📏 UC4 – Extended Unit Support (Yards & Centimeters)

## Description  
UC4 extends UC3 by adding YARDS and CENTIMETERS to the `LengthUnit` enum.  
The generic `QuantityLength` class now supports feet, inches, yards, and centimeters without code duplication.

## Objective  
To compare measurements across multiple units (ft, in, yd, cm) using common base conversion.

## Preconditions  
- Refactored `QuantityLength` class from UC3 is used  
- Units supported: FEET, INCHES, YARDS, CENTIMETERS  
- Conversion factors are defined in the enum  

## Main Flow  
1. User provides value and unit  
2. Input and unit are validated  
3. Values are converted to a common base unit  
4. Converted values are compared using `Double.compare()`  
5. Equality result is returned  

## Postcondition  
Returns `true` if converted values are equal across any unit combination.  
All UC1–UC3 functionality remains intact.

## Key Concepts  
- Scalable generic design  
- Enum extensibility  
- Cross-unit conversion (1 yd = 3 ft = 36 in, 1 cm = 0.393701 in)  
- DRY principle validation  
- Mathematical accuracy in conversions  
- Backward compatibility

🔗 _Code Link:_ 
👉 [UC4 – Extended Unit Support (Yards & Centimeters)](https://github.com/RAM-VISHAL/QuantityMeasurementApp/tree/feature/UC4-YardEquality)
