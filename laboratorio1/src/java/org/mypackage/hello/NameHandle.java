/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.hello;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Usuario
 */
public class NameHandle {

    private String name;
    private String fecha ;
    

    public NameHandle() {
        name = null;
        fecha=null;
        
    }
    
    
    public String caclularEdad(String fecha){
        String[] partes = fecha.split(" ");
        int year = Integer.parseInt(partes[2]);
        Calendar fechaHoy = Calendar.getInstance();
        int yearActual = fechaHoy.get(Calendar.YEAR);
        int edad = yearActual-year;
        String suEdad = edad+"";
        return suEdad;
        
    }
    /**
     * @return the name
     */
    public String getName() {
        Calendar calendario = Calendar.getInstance();
        int hora = calendario.get(Calendar.HOUR_OF_DAY);
        int minuto = calendario.get(Calendar.MINUTE);
        if((hora >= 6 && minuto <=59)&&(hora <= 11 && minuto <=59)){
            return "buenos dias " + name;
        }else if((hora >= 12 && minuto <=59)&&(hora <= 17 && minuto <=59)){
            return "buenas tardes " + name;
        }else{
            return "buenas noches " + name;
        }
        
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return caclularEdad(fecha);
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    

}
