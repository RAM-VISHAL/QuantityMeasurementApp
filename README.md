## 📏 UC6 – Addition of Two Length Units (Same Category)

## Description  
UC6 extends UC5 by introducing addition between two length measurements.  
Two lengths (possibly different units) can be added, and the result is returned in the unit of the first operand.

## Objective  
To add two QuantityLength objects using base unit normalization and return a new immutable result.

## Preconditions  
- `QuantityLength` class and `LengthUnit` enum exist  
- Units supported: FEET, INCHES, YARDS, CENTIMETERS  
- Both operands belong to the same measurement category (length)  

## Main Flow  
1. Validate operands and units (non-null, finite values)  
2. Convert both values to a common base unit  
3. Add the normalized values  
4. Convert the sum to the unit of the first operand  
5. Return a new `QuantityLength` object  

## Postcondition  
Returns a new immutable object representing the sum.  
Original objects remain unchanged.  
Invalid inputs throw `IllegalArgumentException`.

## Key Concepts  
- Arithmetic on value objects  
- Base unit normalization for cross-unit addition  
- Immutability and factory-style method design  
- Commutative property (A + B = B + A)  
- Identity element (adding zero)  
- Precision handling with floating-point tolerance  
- Reuse of conversion logic from UC5

🔗 _Code Link:_ 
👉 [UC6 – Addition of Two Length Units](https://github.com/RAM-VISHAL/QuantityMeasurementApp/tree/feature/UC6-UnitAddition/src)
