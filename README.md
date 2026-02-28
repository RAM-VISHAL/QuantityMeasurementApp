## 🔷 UC10 – Generic Quantity with Unit Interface (Multi-Category Support)

## Description  
UC10 refactors the system into a single generic `Quantity<U extends IMeasurable>` class.  
All measurement categories (Length, Weight, etc.) share a common `IMeasurable` interface.

## Objective  
To eliminate duplication across category-specific Quantity classes and enable scalable multi-category support.

## Preconditions  
- `IMeasurable` interface defines conversion contract  
- `LengthUnit` and `WeightUnit` implement `IMeasurable`  
- Generic `Quantity<U>` replaces QuantityLength & QuantityWeight  

## Main Flow  
1. Units implement `IMeasurable` (conversion responsibility)  
2. `Quantity<U>` stores value + unit (immutable)  
3. Equality normalizes via base unit comparison  
4. Conversion and addition delegate to unit methods  
5. Generics enforce compile-time category safety  

## Postcondition  
- Single reusable `Quantity<U>` class for all categories  
- No duplicate logic across length, weight, etc.  
- Cross-category comparisons prevented (Length ≠ Weight)  
- All UC1–UC9 functionality preserved  
- New categories require only a new enum implementing `IMeasurable`

## Key Concepts  
- Generic programming with bounded types  
- Interface-based design & polymorphism  
- DRY and Single Responsibility Principle  
- Open-Closed Principle (easy extension)  
- Composition over inheritance  
- Type safety with generics  
- Scalable architecture for future measurement categories

🔗 _Code Link:_ 
👉 [UC10 – Generic Quantity](https://github.com/RAM-VISHAL/QuantityMeasurementApp/tree/feature/UC10-GenericQuantity)

---
