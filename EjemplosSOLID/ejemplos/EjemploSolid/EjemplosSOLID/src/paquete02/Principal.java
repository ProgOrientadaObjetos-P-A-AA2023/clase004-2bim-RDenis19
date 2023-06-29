/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.ArrayList;


public class Principal {
    public static void main(String[] args) {
        Ciudad c1 = new Ciudad("Loja");
        Ciudad c2 = new Ciudad("Quito");
        Persona persona1 = new Persona("Denis", 19, c1);
        Persona persona2 = new Persona ("Juan", 24, c2);
        
        
        ArrayList<Persona> miLista = new ArrayList<>();
        miLista.add(persona1);
        miLista.add(persona2);
        
        OperacionesEstudiantes op1 = new OperacionesEstudiantes(); 
        op1.establecerEstudiante(miLista);
        op1.establecerPromedioEdades();
        op1.establecerEdadMinima();
        op1.estalecerEdadMaxima();
        op1.establecerlistaCiudadesEstudiantes();
        System.out.printf("Promedio de las edades: %.2f\n",op1.obtenerPromedioEdades());
        System.out.printf("Edad minima: %d\n",op1.obtenerEdadMinima());
        System.out.printf("Edad maxima: %d\n",op1.obtenerEdadMaxima());
        System.out.printf("Lista ciudades: %s\n",op1.obtenerlistaCiudadesEstudiantes());

                

    }
}
    
