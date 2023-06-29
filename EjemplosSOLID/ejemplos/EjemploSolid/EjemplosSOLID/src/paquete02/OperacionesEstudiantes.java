/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import java.util.ArrayList;

/**
 *
 * @author denis
 */
public class OperacionesEstudiantes {

    private ArrayList<Persona> estudiantes;
    private double promedioEdades;
    private int edadminima;
    private int edadmaxima;
    private String listaCiudadesEstudiantes = "";
    // Una Persona, tiene un atributo ciudad de tipo Ciudad
    // Una Ciudad, tiene un atributo nombre de tipo String

    public void establecerEstudiante(ArrayList<Persona> lista) {
        estudiantes = lista;
    }

    public ArrayList<Persona> obtenerEstudiante() {
        return estudiantes;
    }

    public void establecerPromedioEdades() {
        double suma = 0;
        for (Persona e : obtenerEstudiante()) {
            suma = e.obtenerEdad();
        }
        promedioEdades = suma / obtenerEstudiante().size();
    }

    public double obtenerPromedioEdades() {

        return promedioEdades;
    }

    public void establecerEdadMinima() {
        edadminima = estudiantes.get(0).obtenerEdad();
        for (int i = 0; i < obtenerEstudiante().size(); i++) {
            if (edadminima > estudiantes.get(i).obtenerEdad()) {
                edadminima = estudiantes.get(i).obtenerEdad();
            }
        }
        
    }
    public void estalecerEdadMaxima() {
        edadmaxima = estudiantes.get(0).obtenerEdad();
        for (int i = 0; i < obtenerEstudiante().size(); i++) {
            if (edadmaxima < estudiantes.get(i).obtenerEdad()) {
                edadmaxima = estudiantes.get(i).obtenerEdad();

            }
        }
    }
    public int obtenerEdadMinima() {
        return edadminima;
    }
    public int obtenerEdadMaxima() {
        return edadmaxima;
    }
    

    public void establecerlistaCiudadesEstudiantes() {
        for (int i = 0; i < estudiantes.size(); i++) {
            listaCiudadesEstudiantes = String.format("%s\nCiudad %d: %s",
                    listaCiudadesEstudiantes, i + 1, 
                    estudiantes.get(i).obtenerCiudad().obtenerNombre());
        }
    }

    public String obtenerlistaCiudadesEstudiantes() {
        return listaCiudadesEstudiantes;
    }
}
