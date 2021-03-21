/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import negocio.*;

/**
 *
 * @author leopa
 */
public interface AutoFactory {
    
    public Chasis crearChasis();
    public Freno crearFreno();
    public Motor crearMotor();
}
