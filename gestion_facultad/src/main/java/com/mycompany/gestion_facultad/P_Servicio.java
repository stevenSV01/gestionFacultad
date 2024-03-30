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
public class P_Servicio extends Persona {
    
    private int año_inc=0, num_desp=0, id;
    private String area_trabajo, nombre, apellido, e_civil;
    int tipo_persona, cont=1;
    
    

    public P_Servicio(String nombre, String apellido, String e_civil, int id, int año_inc, String area_trabajo, int num_desp, int tipo_persona) {
        super(nombre, apellido, e_civil, id, tipo_persona);
        this.año_inc = año_inc;
        this.area_trabajo = area_trabajo;
        this.num_desp= num_desp;
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.e_civil=e_civil;
    }

    public int getAño_inc() {
        return año_inc;
    }

    public void setAño_inc(int año_inc) {
        this.año_inc = año_inc;
    }

    public int getNum_desp() {
        return num_desp;
    }

    public void setNum_desp(int num_desp) {
        this.num_desp = num_desp;
    }

    

    public String getArea_trabajo() {
        return area_trabajo;
    }

    public void setArea_trabajo(String area_trabajo) {
        this.area_trabajo = area_trabajo;
    }
    
    @Override
    public void cambiarInfo(){
        int que_camb=0, si_no=0;
        
        while(que_camb==0){
            
            que_camb = Integer.parseInt(JOptionPane.showInputDialog("1= cambiar area de trabajo, 2 = cambiar numero de despacho., 3 = cambiar estado civil."));
             if((que_camb!=1)&&(que_camb!=2)&&(que_camb!=3)){
                 que_camb=0;
                 JOptionPane.showMessageDialog(null, "Digite un numero valido por favor.");
                 
             }
            
        }
        
        if(que_camb==1){
            
            area_trabajo = JOptionPane.showInputDialog("Cual es su nueva area de trabajo?");
            setArea_trabajo(area_trabajo);
            
        }
        
        if(que_camb==2){
            
            num_desp = Integer.parseInt(JOptionPane.showInputDialog("Cual es su nuevo numero de despacho?"));
            setNum_desp(num_desp);
            
        }
        
        if(que_camb==3){
            
            e_civil = JOptionPane.showInputDialog("Digite su nuevo estado civil.");
            setE_civil(e_civil);
            
        }
        
        System.out.println("Consulte su nueva informacion: ");
        mostrar_Persona();
        
        
    }

    
    @Override
    public void mostrar_Persona(){
        
        System.out.println("EMPLEADO ");
        System.out.println(apellido + " " + nombre);
        System.out.println("Id: " + id);
        System.out.println("Estado civil: " + e_civil);
        System.out.println("Año incorporacion: " + año_inc);
        System.out.println("Area trabajo: " + area_trabajo);
        System.out.println("Despacho: " + num_desp);
        System.out.println(" ");
        
    }

    public String getE_civil() {
        return e_civil;
    }

    public void setE_civil(String e_civil) {
        this.e_civil = e_civil;
    }
    
    
}
