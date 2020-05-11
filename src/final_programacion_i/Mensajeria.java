/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final_programacion_i;

import javax.swing.JOptionPane;

/**
 *
 * @author Comodore
 */
public class Mensajeria {

    String pedidos[][];
    String entregados[][];
    String cargar;

    public void cargar_mostrar(int d) {

        pedidos = new String[d][d];
        entregados = new String[d][d];

        System.out.println("matriz con mensajeros y pedidos de mensaje");
        for (int f = 0; f < pedidos.length; f++) {
            for (int c = 0; c < pedidos[f].length; c++) {

                cargar = JOptionPane.showInputDialog("Ingrese los datos");
                pedidos[f][c] = cargar;

                System.out.print(pedidos[f][c] + "-");
            }
            System.out.println("");
        }
        System.out.println("");

        System.out.println("matriz con mensajeros y mensajes efectivamente entregados en el dia");
        for (int f = 0; f < entregados.length; f++) {
            for (int c = 0; c < entregados[f].length; c++) {

                cargar = JOptionPane.showInputDialog("Ingrese los datos");
                entregados[f][c] = cargar;

                System.out.print(entregados[f][c] + "-");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public void porcentaje_entregados() {

        double suma = 0;
        double porcentaje[];
        double mensajes[] = new double[4];
        String emp[] = new String[4];

        System.out.println("PORCENTAJE EFECTIVIDAD MENSAJEROS");
        for (int f = 0; f < entregados.length; f++) {
            for (int c = 0; c < entregados[f].length; c++) {

                mensajes[f] = Double.parseDouble(entregados[f][3]);
                emp[f] = pedidos[f][0];
            }
            suma = suma + mensajes[f];
        }
        System.out.println("total mensajes entregados: " + suma);
        System.out.println("");

        porcentaje = new double[4];
        System.out.println("porcentaje de entrega de cada mensajero");
        for (int f = 0; f < mensajes.length; f++) {

            porcentaje[f] = (mensajes[f] * 100) / suma;
            System.out.println(emp[f] + " " + porcentaje[f]);

        }
        System.out.println("");

        double may = porcentaje[0];
        String men = emp[0];

        System.out.println("porcentaje de empleado con mayor eficiencia");
        for (int f = 0; f < porcentaje.length; f++) {

            if (porcentaje[f] > may) {

                may = porcentaje[f];
                men = emp[f];
            }
        }
        System.out.println("el mensajero con mayor porcentaje de eficiencia es:" + men + " y su porcentaje es " + may+"%");
        System.out.println("");
    }

    public void otro_porcentaje() {

        double porcentaje[];
        double men_pedidos[] = new double[4];
        double men_entregados[] = new double[4];
        String emp[] = new String[4];
        
        System.out.println("SEGUNDO PORCENTAJE DE EFECTIVIDAD DE ENTREGA");
         for (int f = 0; f < entregados.length; f++) {
            for (int c = 0; c < entregados[f].length; c++) {

                men_pedidos[f] = Double.parseDouble(pedidos[f][3]);
                men_entregados[f] = Double.parseDouble(entregados[f][3]);
                
                emp[f] = pedidos[f][0];
            }       
        }
         
        porcentaje = new double[4];
        System.out.println("porcentaje de entrega de cada mensajero");
        for (int f = 0; f < porcentaje.length; f++) {

            porcentaje[f] = (men_entregados[f]*100)/men_pedidos[f];
            System.out.println(emp[f] + " " + porcentaje[f]);

        }
        System.out.println("");
        
        double may = porcentaje[0];
        String men = emp[0];

        System.out.println("porcentaje de empleado con mayor eficiencia");
        for (int f = 0; f < porcentaje.length; f++) {

            if (porcentaje[f] > may) {

                may = porcentaje[f];
                men = emp[f];
            }
        }
        System.out.println("el mensajero con mayor porcentaje de eficiencia es  " + men + " y su porcentaje es " + may+"%");
        System.out.println("");
        
        
    }

    public void mensajero_mayor_cantidad_entregas() {

        double mensajes[] = new double[4];
        String men[] = new String[4];

        for (int f = 0; f < entregados.length; f++) {
            for (int c = 0; c < entregados[f].length; c++) {

                mensajes[f] = Double.parseDouble(entregados[f][3]);
                men[f] = pedidos[f][0];
            }
        }

        String m = men[0];
        double may = mensajes[0];

        System.out.println("MENSAJERO QUE MAS MENSAJES ENTREGO");
        for (int f = 0; f < mensajes.length; f++) {

            if (mensajes[f] > may) {

                may = mensajes[f];
                m = pedidos[f][0];
            }
        }
        System.out.println("el mensajero con mayores entregas es " + m + ", entrego " + may + " mensajes");
        System.out.println("");
    }

    public void mensajero_menos_solicitado() {

        double ped[] = new double[4];
        String men[] = new String[4];

        for (int f = 0; f < pedidos.length; f++) {
            for (int c = 0; c < pedidos[f].length; c++) {

                ped[f] = Double.parseDouble(pedidos[f][3]);
                men[f] = pedidos[f][0];
            }
        }

        String m = men[0];
        double may = ped[0];
        double menor = ped[0];

        System.out.println("MENSAJERO QUE MAS MENSAJES ENTREGO");
        for (int f = 0; f < ped.length; f++) {

            if (ped[f] > may) {

                may = ped[f];
                menor = may;

            }
            if (ped[f] < menor) {
                menor = ped[f];
                m = men[f];
            }
        }
        System.out.println("el mensajero menos solicitado es   " + m + ", entrego " + menor + " mensajes");
        System.out.println("");
    }

    public void mensajeros_por_cantidad_entregas() {

        double aux;
        String aux_m;
        String men[] = new String[4];
        double mensajes[] = new double[4];
        int f;

        for (f = 0; f < entregados.length; f++) {
            for (int c = 0; c < entregados[f].length; c++) {

                mensajes[f] = Double.parseDouble(entregados[f][3]);
                men[f] = pedidos[f][0];

            }
        }

        System.out.println("LISTADO DECRECIENTE DE MENSAJEROS POR CANTIDAD DE ENTREGAS");
        for (int i = 0; i < mensajes.length; i++) {
            for (f = 0; f < mensajes.length - 1 - i; f++) {
                if (mensajes[f] > mensajes[f + 1]) {

                    aux = mensajes[f];
                    mensajes[f] = mensajes[f + 1];
                    mensajes[f + 1] = aux;

                    aux_m = men[f];
                    men[f] = men[f + 1];
                    men[f + 1] = aux_m;
                }

            }
            System.out.println(men[f] + " " + mensajes[f]);
        }
        System.out.println("");

    }

    public void menor_indice_entrega() {

        String zon[] = new String[4];
        double mensajes[] = new double[4];
        double may = 0, menor = 0;

        for (int f = 0; f < entregados.length; f++) {
            for (int c = 0; c < entregados[f].length; c++) {

                mensajes[f] = Double.parseDouble(entregados[f][3]);
                zon[f] = pedidos[f][2];
            }
        }

        String z = zon[0];
        may = mensajes[0];
        menor = mensajes[0];

        System.out.println("ZONA CON MENOR INDICE DE ENTREGAS ");
        for (int f = 0; f < mensajes.length; f++) {

            if (mensajes[f] > may) {

                may = mensajes[f];
                menor = may;

            }
            if (mensajes[f] < menor) {
                menor = mensajes[f];
                z = zon[f];
            }
        }
        System.out.println("la zona con menor indice de entrega es la zona  " + z + ", se entrego " + menor + " mensajes");
        System.out.println("");

    }

}
