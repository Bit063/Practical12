/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.celestialinheritance;

/**
 *
 * @author ayush
 */
public class CelestialBody {
    private String name;
    private String type;

    public CelestialBody(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\nType: " + getType();
    }
}
