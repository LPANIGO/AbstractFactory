
package factory;

import negocio.*;

public class AutoChicoFactory implements AutoFactory{
    
    public Chasis crearChasis(){
        return new ChasisChico();
    }
    
    public Freno crearFreno(){
        return new FrenoAsistido();
    }
    
    public Motor crearMotor(){
        return new Motor100();
    }
    
}
