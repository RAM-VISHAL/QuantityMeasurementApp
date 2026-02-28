## ⚖️ UC9 – Weight Measurement (Kilogram, Gram, Pound)

## Description  
UC9 extends the application to support a new measurement category: **Weight**.  
It introduces `WeightUnit` and `QuantityWeight`, mirroring the length design (UC1–UC8).

## Objective  
To support equality, conversion, and addition for weight units:  
KILOGRAM (base), GRAM, and POUND.

## Preconditions  
- `WeightUnit` is a standalone enum  
- Conversion factors are relative to kilogram (base unit)  
- Weight and Length categories are independent  

## Main Flow  
1. Validate value and unit (non-null, finite number)  
2. Normalize to base unit (kilogram)  
3. Perform equality, conversion, or addition  
4. Convert result to target unit (if specified)  
5. Return new immutable `QuantityWeight` object  

## Postcondition  
- Equivalent weights across units are equal (1 kg = 1000 g ≈ 2.20462 lb)  
- Conversion and addition are mathematically accurate within epsilon  
- Length and weight are incomparable categories  
- All UC1–UC8 functionality remains unaffected  

## Key Concepts  
- Multiple measurement categories  
- Enum-based conversion responsibility  
- Base unit normalization (kilogram)  
- Category type safety (weight ≠ length)  
- Immutability and value object design  
- Overloaded add() methods (implicit & explicit target unit)  
- Scalable architecture for future categories

🔗 _Code Link:_ 
👉 [UC9 – Weight Measurement (Kilogram, Gram, Pound)](https://github.com/RAM-VISHAL/QuantityMeasurementApp/tree/feature/UC9-WeightMeasurement)

---
