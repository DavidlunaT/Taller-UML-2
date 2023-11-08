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
public class PersonalAcademico extends Usuario {
    protected ArrayList<Indicente> incidentes;
    
    public PersonalAcademico(String usuario, String contraseña, String nombre, String apellido) {
        super(usuario, contraseña, nombre, apellido);
    }
    public void reportarError(String email, String contenido){
        
    }
    public void solicitarAsesoramientoDelSistema(String email, String contenido){
        
    }
    public void comentarEnForo(Foro foro, String comentario){
        
    }
}
