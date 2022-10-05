/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesionbean;

import javax.ejb.Stateless;

/**
 *
 * @author Tatiana
 */
@Stateless
public class calcubean implements calcubeanLocal {

    @Override
    public Integer suma(int a, int b) {
        return (a+b);
        
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public Integer resta(int c, int d) {
        return (c-d);
    }

    @Override
    public Integer multiplicacion(int e, int f) {
        return (e*f);
    }

    @Override
    public Integer division(int g, int h) {
        return (g/h);
    }

    @Override
    public Double potenciacion(double i, double j) {
        return Math.pow(i, j);
    }
   
    

 
    }

    
    

    
    

