/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quiz1;

/**
 *
 * @author Laboratorio
 */
public class Quiz1 {

    public static void main(String[] args) {
        
        int valorcif = 1000;
        int iva;
        int arancel;
        int almacen;
        int total;
        int variablemuestra;

        // Categoria: 1=TEC, 2=ROP, 3=HOG, otro=OTRA
        int categoria = 0;

        // while + if + else + break
        while (true) {
            if (categoria == 0) {
                categoria = 1; // TEC
            } else {
                break;
            }
        }

        // IVA 13%
        iva = valorcif * 13 / 100;

        // Arancel
        if (categoria == 1) {
            arancel = valorcif * 5 / 100;
        } else {
            if (categoria == 2) {
                arancel = valorcif * 15 / 100;
            } else {
                if (categoria == 3) {
                    arancel = valorcif * 10 / 100;
                } else {
                    arancel = valorcif * 25 / 100;
                }
            }
        }

        // Almacén
        if (valorcif > 500) {
            almacen = 20;
        } else {
            almacen = 0;
        }

        variablemuestra = valorcif + arancel;
        total = valorcif + iva + arancel + almacen;

        System.out.println(total);
   System.out.println("CIF: " + valorcif);
System.out.println("IVA: " + iva);
System.out.println("Arancel: " + arancel);
System.out.println("Almacen: " + almacen);
System.out.println("Total: " + total);
 }
}
 

