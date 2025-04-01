/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.celestialinheritance;

/**
 *
 * @author ayush
 */
public class CelestialInheritance {

    public static void main(String[] args) {
        Earth earth = Earth.getInstance();
        System.out.println(earth);
        System.out.println();
        Planet viltrum = new Planet("Viltrum", true, 8, true, "Viltrumites");
        System.out.println(viltrum.toString());
    }
}
