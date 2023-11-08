/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.taller_uml;

import java.util.ArrayList;

/**
 *
 * @author CltControl
 */
public class Estudiante extends PersonalAcademico {
    private ArrayList<Curso> cursosACargo;
    private ArrayList<Curso> cursosEnEsperaDeInscripcion;
    private ArrayList<Curso> cursosInscritos;
    
    public Estudiante(String usuario, String contraseña, String nombre, String apellido) {
        super(usuario, contraseña, nombre, apellido);
    }
    public void solicitarIncripcionCurso(Curso curso){
        
    }
    public void realizarActividadSumativa(Curso curso, ActividadSumativa actividadSumativa){
        
    }
    
}
