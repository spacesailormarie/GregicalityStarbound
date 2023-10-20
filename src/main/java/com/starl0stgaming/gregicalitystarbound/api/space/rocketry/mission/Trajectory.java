package com.starl0stgaming.gregicalitystarbound.api.space.rocketry.mission;

import com.starl0stgaming.gregicalitystarbound.api.space.rocketry.orbit.Orbit;

public class Trajectory {


    private double requiredDeltaV;
    private Orbit destinationOrbit;


    public Trajectory(Orbit destinationOrbit) {
        this.destinationOrbit = destinationOrbit;

    }


    public double getRequiredDeltaV() {
        return requiredDeltaV;
    }

    public void setRequiredDeltaV(double requiredDeltaV) {
        this.requiredDeltaV = requiredDeltaV;
    }

    public Orbit getDestinationOrbit() {
        return destinationOrbit;
    }

    public void setDestinationOrbit(Orbit destinationOrbit) {
        this.destinationOrbit = destinationOrbit;
    }
}
