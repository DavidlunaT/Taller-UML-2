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
public class Curso {
    private String id;
    private String nombre;
    private boolean estadoDisponible;
    private Profesor responsable;
    private Estudiante estudiantesEnEsperaDeInscripcion;
    private Estudiante estudiantesInscritos;
    private ArrayList<Foro> foros;
    private ArrayList<ActividadSumativa> actividadesSumativas;

}
