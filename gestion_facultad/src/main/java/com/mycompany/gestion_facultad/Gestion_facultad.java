/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.gestion_facultad;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Poto
 */
public class Gestion_facultad {

    public static void main(String[] args) {
        int edit = 1, tipo_persona = 0, n_p = 0, id;
        String nombre = "", apellido = "", e_civil = "";

        ArrayList<Persona> p = new ArrayList<Persona>();

        while (n_p == 0) {
            nombre = JOptionPane.showInputDialog("Cual es su nombre?");
            apellido = JOptionPane.showInputDialog("Cual es su apellido?");
            id = Integer.parseInt(JOptionPane.showInputDialog("Digite su numero de identificacion."));
            e_civil = JOptionPane.showInputDialog("Cual es su estado civil?");

            while (tipo_persona == 0) {

                tipo_persona = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite 1 si es del area de servicio, 2 si es profesor, 3 si es estudiante."));

                if ((tipo_persona != 1) && (tipo_persona != 2) && (tipo_persona != 3)) {

                    JOptionPane.showMessageDialog(null, "Digite un numero valido.");
                    tipo_persona = 0;

                }

            }

            if (tipo_persona == 1) {

                String area_trabajo;
                int año_inc = 0, num_desp = 0;
                area_trabajo = JOptionPane.showInputDialog("En que area de la faciltad trabaja?");
                año_inc = Integer.parseInt(JOptionPane.showInputDialog("En que año llego usted a la facultad?"));
                num_desp = Integer.parseInt(JOptionPane.showInputDialog("Digite su numero de despacho."));

                Persona PS = new P_Servicio(nombre, apellido, e_civil, id, año_inc, area_trabajo, num_desp, tipo_persona);
                p.add(PS);

            }

            if (tipo_persona == 2) {
                String area_dept;
                int año_inc = 0, num_desp = 0;
                area_dept = JOptionPane.showInputDialog("Usted es profesor de?");
                año_inc = Integer.parseInt(JOptionPane.showInputDialog("En que año llego usted a la facultad?"));
                num_desp = Integer.parseInt(JOptionPane.showInputDialog("Digite su numero de despacho."));
                Persona PF = new Profesores(nombre, apellido, e_civil, id, año_inc, area_dept, num_desp, tipo_persona);
                p.add(PF);
            }

            if (tipo_persona == 3) {
                String carrera;
                carrera = JOptionPane.showInputDialog("Que carrera estudia?");
                Persona e = new Estudiantes(nombre, apellido, e_civil, id, carrera, tipo_persona);
                p.add(e);

            }

            tipo_persona = 0;

            n_p = Integer.parseInt(JOptionPane.showInputDialog("Desea agregar otra persona? 0 = si, cualquier otro numero = no."));

        }

        for (Persona v : p) {

            v.mostrar_Persona();

        }

        id = 0;
        edit = Integer.parseInt(JOptionPane.showInputDialog(null, "Presione 0 para editar alguna informacion. Presione otro numero para cerrar el programa."));
        int index = 0;
        while (edit == 0) {

            id = Integer.parseInt(JOptionPane.showInputDialog("Digite su id para buscar su informacion."));
            for (Persona k : p) {

                if (k.getId() == id) {

                    System.out.println("ID ENCONTRADO!");
                    System.out.println("Usted es: " + k.getApellido() + " " + k.getNombre());

                    if (k.getTipo_persona() == 1) {

                        k.cambiarInfo();

                    }

                    if (k.getTipo_persona() == 2) {

                        k.cambiarInfo();

                    }

                    if (k.getTipo_persona() == 3) {

                        k.cambiarInfo();

                    }

                } else {

                    System.out.println("Buscando...");

                }

            }

            edit = Integer.parseInt(JOptionPane.showInputDialog("Alguna otra persona necesita cambiar su informacion? 0=si, otro numero = no."));

            if (edit != 0) {
                
                System.out.println("NUEVAS INFOS: ");

                for (Persona m : p) {

                    m.mostrar_Persona();

                }

            }

        }

    }
}
