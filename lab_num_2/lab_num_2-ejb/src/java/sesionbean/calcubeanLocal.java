/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesionbean;

import javax.ejb.Local;

/**
 *
 * @author Tatiana
 */
@Local
public interface calcubeanLocal {

    Integer suma(int a, int b);

    Integer resta(int c, int d);

    Integer multiplicacion(int e, int f);

    Integer division(int g, int h);

    Double potenciacion(double i, double j);
    
}
