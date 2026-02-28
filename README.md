## 🧪 UC11 – Volume Measurement (Litre, Millilitre, Gallon)

## Description  
UC11 introduces a new measurement category: **Volume**, using the generic `Quantity<U>` class from UC10.  
Only a new `VolumeUnit` enum implementing `IMeasurable` is required.

## Objective  
To support equality, conversion, and addition for volume units:  
LITRE (base), MILLILITRE, and GALLON.

## Preconditions  
- `Quantity<U extends IMeasurable>` is fully operational  
- `IMeasurable` interface is implemented  
- No changes to existing Length or Weight logic  

## Main Flow  
1. Create `VolumeUnit` implementing `IMeasurable`  
2. Normalize values to base unit (LITRE)  
3. Perform equality, conversion, or addition  
4. Convert result to target unit (if specified)  
5. Return new immutable `Quantity<VolumeUnit>` object  

## Postcondition  
- Equivalent volumes across units are equal (1 L = 1000 mL ≈ 0.264172 gal)  
- Conversion and addition are accurate within epsilon  
- Volume is incompatible with Length and Weight  
- No changes required to `Quantity<U>` or app logic  

## Key Concepts  
- True scalability of generic architecture  
- Enum implementing shared interface  
- Base unit normalization (litre)  
- Cross-category type safety  
- Immutability and value object design  
- DRY and Open-Closed Principle validation  
- Linear system growth with new categories

🔗 _Code Link:_ 
👉 [UC11 – Volume Measurement](https://github.com/RAM-VISHAL/QuantityMeasurementApp/tree/feature/UC11-VolumeMeasurement/src)

---
