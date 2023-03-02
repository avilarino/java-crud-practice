
package logica;

import java.util.List;
import persistencia.ControladoraPersistencia;


public class Controladora {
    
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void agregarAutomovil(String modelo, String color, String marca, String motor, String patente, int puertas) {
       
        
        Automovil auto1 = new Automovil();
        
        auto1.setModelo(modelo);
        auto1.setMarca(marca);
        auto1.setMotor(motor);
        auto1.setPatente(patente);
        auto1.setCantPuertas(puertas);
        
        
        controlPersis.agregarAutomovil(auto1);
        
    }

    public List<Automovil> traerAutos() {
       
        return controlPersis.traerAutos();
        
        
    }

    public void borrarAuto(int idAuto) {
        controlPersis.borrarAuto(idAuto);
    }

    public Automovil traerAuto(int idAuto) {
        return controlPersis.traerAuto(idAuto);
    }

    public void modificarAutomovil(Automovil auto, String modelo, String color, String marca, String motor, String patente, int puertas) {
        
    }

    public void modificarAuto(Automovil auto, String modelo, String marca, String motor, String patente, int puertas) {

        
        auto.setModelo(modelo);
      
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setPatente(patente);
        auto.setCantPuertas(puertas);
        
        controlPersis.modificarAuto(auto);

    }


    public void agregarAutomovil(String modelo, String marca, String motor, String patente, int puertas) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
