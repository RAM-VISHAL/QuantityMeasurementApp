## 📏 UC7 – Addition with Target Unit Specification

## Description  
UC7 extends UC6 by allowing the caller to explicitly specify the target unit for the addition result.  
The sum is returned in the chosen unit, not automatically inferred from operands.

## Objective  
To add two QuantityLength objects and return the result in any supported target unit.

## Preconditions  
- `QuantityLength` class and `LengthUnit` enum exist  
- Supported units: FEET, INCHES, YARDS, CENTIMETERS  
- A valid target unit is explicitly provided  

## Main Flow  
1. Validate operands and target unit (non-null, finite values)  
2. Convert both operands to base unit  
3. Add normalized values  
4. Convert sum to specified target unit  
5. Return a new immutable `QuantityLength` object  

## Postcondition  
Returns a new object expressed in the explicitly specified unit.  
Original objects remain unchanged.  
Invalid inputs throw `IllegalArgumentException`.

## Key Concepts  
- Method overloading for flexible API design  
- Explicit target unit control  
- Base unit normalization for arithmetic  
- Immutability and DRY principle preservation  
- Commutativity of addition across all target units  
- Precision handling using epsilon tolerance  
- Clear and scalable API design

🔗 _Code Link:_ 
👉 [UC7 – Addition with Target Unit Specification](https://github.com/RAM-VISHAL/QuantityMeasurementApp/tree/feature/UC7-TargetUnitAddition/src)
