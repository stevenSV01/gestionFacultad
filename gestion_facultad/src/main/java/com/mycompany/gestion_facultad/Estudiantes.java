/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestion_facultad;

import javax.swing.JOptionPane;

/**
 *
 * @author Poto
 */
public class Estudiantes extends Persona {
    
    private String carrera, nombre, apellido, e_civil;
    private int id;
    int cont=1, tipo_persona;

    public Estudiantes(String nombre, String apellido, String e_civil, int id, String carrera, int tipo_persona) {
        super(nombre, apellido, e_civil, id, tipo_persona);
        this.carrera = carrera;
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.e_civil=e_civil;
        this.tipo_persona=tipo_persona;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    
    @Override
    public void mostrar_Persona(){
        
        System.out.println("ESTUDIANTE ");
        System.out.println(apellido + " " + nombre);
        System.out.println("Id: " + id);
        System.out.println("Estado civil: " + e_civil);
        System.out.println("Carrera: " + carrera);
        System.out.println(" ");
        
    }
    
    @Override
    public void cambiarInfo(){
        int que_camb=0, si_no=0;
        
        while(que_camb==0){
            
            que_camb = Integer.parseInt(JOptionPane.showInputDialog("1= cambiar carrera, 2 = cambiar estado civil."));
             if((que_camb!=1)&&(que_camb!=2)){
                 que_camb=0;
                 JOptionPane.showMessageDialog(null, "Digite un numero valido por favor.");
                 
             }
            
        }
        
        if(que_camb==1){
            
            carrera = JOptionPane.showInputDialog("Cual es su nueva carrera?");
            setCarrera(carrera);
            
        }
        
        if(que_camb==2){
            
            e_civil = JOptionPane.showInputDialog("Digite su nuevo estado civil.");
            setE_civil(e_civil);
            
        }
        
        System.out.println("Consulte su nueva informacion: ");
        mostrar_Persona();
        
        
    }

    public String getE_civil() {
        return e_civil;
    }

    public void setE_civil(String e_civil) {
        this.e_civil = e_civil;
    }
    
    
}
