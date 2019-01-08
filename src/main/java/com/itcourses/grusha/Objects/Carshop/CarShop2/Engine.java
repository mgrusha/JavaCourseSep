package com.itcourses.grusha.Objects.Carshop.CarShop2;

import java.util.UUID;

public class Engine {
    public static final String PETROL = "Petrol";
    public static final String DIESEL = "Diesel";


    private double engineDisplacement;
    private EngineType engineType;
    public final String engineNumber;

    public Engine(double engineDisplacement, String engineType){
        this.engineDisplacement = engineDisplacement;
        setEngineType(engineType);
        engineNumber = UUID.randomUUID().toString();
    }

    public double getEngineDisplacement() {
        return engineDisplacement;
    }

    public String getEngineType() {
        return engineType.name();
    }

    public void setEngineType(String engineType){
        switch (engineType) {
            case ("Petrol"): case ("PETROL") : case("A95"): this.engineType = EngineType.Petrol; break;
            case ("Diesel") : this.engineType = EngineType.Diesel; break;
            case ("Gas") : this.engineType = EngineType.Gas; break;
            default: this.engineType = EngineType.Unknown;
        }
    }

    public String makeNoise() {
        return "Wroom-wroom";
    }
}
