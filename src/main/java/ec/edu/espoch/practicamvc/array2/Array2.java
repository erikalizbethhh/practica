/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.practicamvc.array2;

import ArrayProductos.Productos;

/**
 *
 * @author USUARIO
 */
public class Array2 {

    public static void main(String[] args) {
        Productos [] productos = new Productos [10];
        
        productos [0]= new Productos("lechuga",3.50,2);
        productos [1]= new Productos("arroz",4,1);
        productos [2]= new Productos("televisor",120,4);
        productos [3]= new Productos("computadora",3,9);
        productos [4]= new Productos("moto",100,5);
        productos [5]= new Productos("carro",400,1);
        productos [6]= new Productos("telefono",600,9);
        productos [7]= new Productos("tablets",75,7);
        productos [8]= new Productos("audifonos",80,6);
        productos [9]= new Productos("refrigeradora",90,1);
        
       
        System.out.println("los productos con precio mayor a 100 son: "); 
        for (Productos producto: productos){
            if (producto.getPrecio() >100 ){
                producto.mostrarProductos();
                
            }
        }
       
        
        
    }
}
