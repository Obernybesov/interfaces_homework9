package com.company.details;

public enum Engine implements IEngine{
    INLINE("Inline engine"),
    V_SHAPED("V-shaped engine"),
    VR_SHAPED("VR-shaped engine"),
    BOXER("Boxer engine"),
    W_SHAPED("W-shaped engine");


    private String engineType;

    Engine(String engineType) {
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return engineType;
    }
}
