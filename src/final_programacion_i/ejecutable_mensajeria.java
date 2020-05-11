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
public class ejecutable_mensajeria {
    
    public static void main(String[] args) {
        
        int dim;
        dim= Integer.parseInt(JOptionPane.showInputDialog("ingrese dimension de la matriz"));
        
        Mensajeria m= new Mensajeria();
        
        m.cargar_mostrar(dim);
        m.porcentaje_entregados();
        m.otro_porcentaje();
        m.mensajero_mayor_cantidad_entregas();
        m.mensajero_menos_solicitado();
        m.mensajeros_por_cantidad_entregas();
        m.menor_indice_entrega();
        
        
        
    }
    
    
    
}
