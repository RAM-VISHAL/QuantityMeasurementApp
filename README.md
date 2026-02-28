## 🌡️ UC14 – Temperature Measurement with Selective Arithmetic Support

## Description  
UC14 introduces **Temperature** (Celsius, Fahrenheit, Kelvin) into the generic system.  
Unlike length, weight, and volume, temperature supports **conversion and equality only**, while arithmetic operations are restricted.

## Objective  
Refactor `IMeasurable` to support **optional arithmetic operations** using default methods and capability checks.

## Key Enhancements  
- Added `TemperatureUnit` enum (CELSIUS, FAHRENHEIT, KELVIN)  
- Refactored `IMeasurable` with default operation-support methods  
- Introduced `SupportsArithmetic` functional interface  
- Arithmetic validation added to `Quantity<U>`  
- Unsupported operations throw `UnsupportedOperationException`  

## Supported Operations (Temperature)  
✔ Equality comparison  
✔ Unit conversion  
❌ Addition (absolute temperatures)  
❌ Subtraction (absolute temperatures)  
❌ Division  

## Flow  
1. Validate category compatibility  
2. Convert via non-linear temperature formulas  
3. Validate operation support before arithmetic  
4. Throw meaningful exception for unsupported operations  

## Postconditions  
- Temperature integrates without modifying existing categories  
- Length, Weight, Volume remain fully arithmetic-enabled  
- Cross-category comparisons prevented  
- Interface Segregation Principle applied  
- Backward compatibility preserved (UC1–UC13 unchanged)  

## Key Concepts  
- Interface Segregation Principle (ISP)  
- Default methods in interfaces  
- Functional interfaces & lambda expressions  
- Capability-based design  
- Non-linear unit conversion handling  
- UnsupportedOperationException semantics  
- Scalable architecture for diverse measurement rules  

🔗 _Code Link:_ 
👉 [UC14 – Temperature Measurement](https://github.com/RAM-VISHAL/QuantityMeasurementApp/tree/feature/UC14-TemperatureUnit/src)

---
