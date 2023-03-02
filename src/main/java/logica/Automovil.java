
package logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Automovil implements Serializable {
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    private String motor;
    private String modelo;
    private String marca;
    private String patente;
 
    private int cantPuertas;
    
    public Automovil(){
    }

    public Automovil(int id, String modelo, String marca, String patente, int cantPuertas) {
        this.id = id;
     
        this.modelo = modelo;
        this.marca = marca;
        this.patente = patente;
        this.cantPuertas = cantPuertas;
    }

    public int getId() {
        return id;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getPatente() {
        return patente;
    }

    public int getCantPuertas() {
        return cantPuertas;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public void setCantPuertas(int cantPuertas) {
        this.cantPuertas = cantPuertas;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

 
    
    
    
    
    
    
    
    
    
    
}
