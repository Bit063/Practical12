/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.celestialinheritance;

/**
 *
 * @author ayush
 */
public class Star extends CelestialBody {
    private boolean hasPlanets;

    public Star(String name, boolean hasPlanets) {
        super(name, "Star");
        this.hasPlanets = hasPlanets;
    }

    public boolean hasPlanets() {
        return hasPlanets;
    }

    private void setHasPlanets(boolean hasPlanets) {
        this.hasPlanets = hasPlanets;
    }

    @Override
    public String toString() {
        return super.toString() + "\nHas Planets: " + (hasPlanets() ? "Yes" : "No");
    }
}
