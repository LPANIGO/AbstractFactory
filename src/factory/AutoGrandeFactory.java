
package factory;

import negocio.*;


public class AutoGrandeFactory implements AutoFactory {
    
     public Chasis crearChasis(){
        return new ChasisGrande();
    }
    
    public Freno crearFreno(){
        return new FrenoElectrico();
    }
    
    public Motor crearMotor(){
        return new Motor120();
    }
}