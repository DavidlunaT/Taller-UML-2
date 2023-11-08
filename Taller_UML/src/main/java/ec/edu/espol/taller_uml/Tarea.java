/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.taller_uml;

import java.util.Date;

/**
 *
 * @author CltControl
 */
public class Tarea extends ActividadSumativa {
    private Date fechaDePublicacion;
    public Tarea(String titulo, Date fechaDeEntrega, float puntajeMaximo, String contenido, float calificacion, String id) {
        super(titulo, fechaDeEntrega, puntajeMaximo, contenido, calificacion, id);
    }
    
}
