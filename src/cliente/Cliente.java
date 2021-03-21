
package cliente;

import negocio.*;
import factory.*;


//palbara clave: FAMILIA DE PRODUCTOS


public class Cliente {

   
    public static void main(String[] args) {
        
        Cliente cliente = new Cliente();
        
        
        AutoFactory autoChicoFactory = new AutoChicoFactory();
        cliente.fabricarAuto(autoChicoFactory);
        
        AutoFactory autoGrandeFactory = new AutoGrandeFactory();
        cliente.fabricarAuto(autoGrandeFactory);        
    }
  
    public void fabricarAuto(AutoFactory factory){
        Motor motor = factory.crearMotor();
        Chasis chasis = factory.crearChasis();
        Freno frenos = factory.crearFreno();
        
        System.out.println("Construyendo auto con"
            + " motor: " + motor 
            + " chasis: " + chasis
            + " frenos: " + frenos);
  
        }
        
    
    /*  - programa sin el patron abstract factory -
    
    public static void main(String args[]){
        Cliente cliente = new Cliente();
        
        cliente.fabicarAuto("Grande");
        cliente.fabicarAuto("Chico");
    }
    
    
    public void fabicarAuto(String tipoAuto){
    
    Motor motor = null;
    Chasis chasis = null;
    Freno frenos = null;
    
    if (tipoAuto.equalsIgnoreCase("Chico")){
        motor = new Motor100();
        chasis = new ChasisChico();
        frenos = new FrenoAsistido();
        
    } else if (tipoAuto.equalsIgnoreCase("Grande")){
        motor = new Motor120();
        chasis = new ChasisGrande();
        frenos = new FrenoElectrico();
    }
    
    }
    */
        
    
}
