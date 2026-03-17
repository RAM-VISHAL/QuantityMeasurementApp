package com.app.quantitymeasurementapp.units;

/**
 * UC14/UC15: Functional Interface to dictate if a unit supports arithmetic.
 */
@FunctionalInterface
public interface SupportsArithmetic {
    boolean isSupported();
}
