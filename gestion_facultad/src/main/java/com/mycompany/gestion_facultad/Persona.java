/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestion_facultad;

/**
 *
 * @author Poto
 */
public class Persona {

    private String nombre, apellido;
    private String e_civil;
    private int id = 0;
    int tipo_persona=0;

    public Persona(String nombre, String apellido, String e_civil, int id, int tipo_persona) {

        this.apellido = apellido;
        this.nombre = nombre;
        this.e_civil = e_civil;
        this.id = id;
        this.tipo_persona=tipo_persona;

    }

    public int getTipo_persona() {
        return tipo_persona;
    }

    public void setTipo_persona(int tipo_persona) {
        this.tipo_persona = tipo_persona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getE_civil() {
        return e_civil;
    }

    public void setE_civil(String e_civil) {
        this.e_civil = e_civil;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    public void mostrar_Persona(){
        
        
        
    }
    
    public void cambiarInfo(){
        
        
    }
            

}
