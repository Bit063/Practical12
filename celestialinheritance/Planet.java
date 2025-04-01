/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.celestialinheritance;

/**
 *
 * @author ayush
 */
public class Planet extends CelestialBody {
    private int numberOfMoons;
    private boolean supportsLife;
    private String dominantSpecies;

    public Planet(String name, boolean hasPlanets, int numberOfMoons, boolean supportsLife, String dominantSpecies) {
        super(name, "Planet");
        this.numberOfMoons = numberOfMoons;
        this.supportsLife = supportsLife;
        this.dominantSpecies = dominantSpecies;
    }

    public int getNumberOfMoons() {
        return numberOfMoons;
    }

    public boolean supportsLife() {
        return supportsLife;
    }

    public void setNumberOfMoons(int numberOfMoons) {
        this.numberOfMoons = numberOfMoons;
    }

    public void setSupportsLife(boolean supportsLife) {
        this.supportsLife = supportsLife;
    }

    public String getDominantSpecies() {
        return dominantSpecies;
    }

    public void setDominantSpecies(String dominantSpecies) {
        this.dominantSpecies = dominantSpecies;
    }
    
    

    @Override
    public String toString() {
        return super.toString() + "\nNumber of Moons: " + getNumberOfMoons() + "\nSupports Life: " + (supportsLife() ? "Yes" : "No") + "\nDominant Species: " + dominantSpecies;
    }
}
