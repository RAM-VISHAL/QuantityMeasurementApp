## ♻️ UC13 – Centralized Arithmetic Logic (DRY Refactoring)

## Description  
UC13 refactors arithmetic operations (add, subtract, divide) to eliminate duplication.  
A centralized private helper method handles validation, base-unit conversion, and operation execution.

## Objective  
Enforce the **DRY principle** by extracting repeated arithmetic logic into a reusable helper method without changing public APIs.

## Key Refactoring Changes  
- Introduced private `ArithmeticOperation` enum (ADD, SUBTRACT, DIVIDE)  
- Created `validateArithmeticOperands()` helper  
- Created `performBaseArithmetic()` helper  
- Public method signatures remain unchanged  

## Flow  
1. Validate operands (null, category, finiteness, target unit)  
2. Convert both quantities to base unit  
3. Execute operation via enum dispatch  
4. Convert result to target unit (if applicable)  
5. Return new immutable `Quantity<U>` or scalar (for divide)  

## Postconditions  
- No code duplication across arithmetic methods  
- Validation logic centralized  
- Conversion logic centralized  
- All UC12 behavior preserved  
- Error handling consistent across operations  
- Future operations (multiply, modulo) easily extendable  

## Benefits  
- Single source of truth for validation & conversion  
- Reduced maintenance burden  
- Cleaner, shorter public methods  
- Enum-based type-safe operation dispatch  
- Improved scalability and readability  
- Zero behavioral change (regression-free refactoring)

🔗 _Code Link:_ 
👉 [UC13 – Centralized Arithmetic Logic](https://github.com/RAM-VISHAL/QuantityMeasurementApp/tree/feature/UC13-CentralisedArithematics/src)

---
