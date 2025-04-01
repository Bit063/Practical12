/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.celestialinheritance;

/**
 *
 * @author ayush
 */
public class Earth extends Planet {
    private static Earth instance;

    private Earth() {
        super("Earth", true, 1, true, "Humans");
    }

    public static Earth getInstance() {
        if (instance == null) {
            instance = new Earth();
        }
        return instance;
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
}
