/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expocaravanas;

import java.util.*;

/**
 *
 * @author Usuario DAM 1
 */
public class Expocaravanas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opc1, opc2;
        Scanner sc = new Scanner(System.in);

        zona zonaprinc = new zona();
        zonaprinc.setEntradas(1000);
        zona zonacomven = new zona();
        zonacomven.setEntradas(200);
        zona zonaVip = new zona();
        zonaVip.setEntradas(25);

        System.out.println("1.Mostrar entradas libres");
        System.out.println("2.Vender entradas");
        System.out.println("3.Salir");
        opc1 = 1;

        while (opc1 != 3) {
            System.out.println("Elige una opción:");
            opc1 = sc.nextInt();
            if (opc1 == 1) {
                System.out.println("Quedan " + zonaprinc.getEntradas() + " en la zona principal.");
                System.out.println("Quedan: " + zonacomven.getEntradas() + " en la zona de compra-venta.");
                System.out.println("Quedan: " + zonaVip.getEntradas() + " en la zona VIP.");
            } else if (opc1 == 2) {
                System.out.println("Elige la zona en la que quieres estar:");
                System.out.println("1-Zona principal");
                System.out.println("2-Zona compra-venta");
                System.out.println("3-Zona VIP");
                opc2 = sc.nextInt();
                if (opc2 == 1) {
                    zonaprinc.Venta();
                    System.out.println("Vendida, quedan: " + zonaprinc.getEntradas());
                } else if (opc2 == 2) {
                    zonacomven.Venta();
                    System.out.println("Vendida, quedan: " + zonacomven.getEntradas());
                } else if (opc2 == 3) {
                    zonaVip.Venta();
                    System.out.println("Vendida, quedan: " + zonaVip.getEntradas());
                } else {
                    System.out.println("Error");
                }
            } else if (opc1 != 1 && opc1 != 2 && opc1 != 3) {
                System.out.println("Error");
            }
        }
    }

}
