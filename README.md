## ➖➗ UC12 – Subtraction and Division Operations

## Description  
UC12 extends the generic `Quantity<U>` class by adding:
- **Subtraction** → returns a new `Quantity<U>`
- **Division** → returns a dimensionless `double` ratio  

Supports all measurement categories (Length, Weight, Volume).

## Objective  
Enable full arithmetic manipulation while maintaining:
- Cross-unit support
- Immutability
- Type safety
- SOLID principles

## Preconditions  
- `Quantity<U extends IMeasurable>` is operational  
- All units implement `IMeasurable`  
- Addition, conversion, equality already functional  

## Subtraction Flow  
1. Validate non-null & same category  
2. Convert both operands to base unit  
3. Subtract base values  
4. Convert result to implicit or explicit target unit  
5. Return new immutable `Quantity<U>`  

## Division Flow  
1. Validate non-null & same category  
2. Prevent division by zero  
3. Convert both to base unit  
4. Divide values  
5. Return dimensionless `double` result  

## Postconditions  
- Subtraction supports implicit & explicit target units  
- Division returns pure scalar ratio  
- Cross-category operations are prevented  
- Original objects remain unchanged  
- Works for Length, Weight, and Volume  

## Key Concepts  
- Non-commutative operations  
- Immutability in arithmetic  
- Base unit normalization  
- Division-by-zero validation  
- Consistent validation patterns  
- Method overloading for flexibility  
- Scalable arithmetic architecture  

🔗 _Code Link:_ 
👉 [UC12 – Subtraction and Division Operations](https://github.com/RAM-VISHAL/QuantityMeasurementApp/tree/feature/UC12-SubtractDivide/src)

---
