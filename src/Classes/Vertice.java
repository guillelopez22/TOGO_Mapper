/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Memo
 */
public class Vertice {
    private String Tipo;
    private String nombre;
    private int num_tipo;

    public Vertice(Vertice vertice) {
        this.Tipo = vertice.getTipo();
        this.nombre = vertice.getNombre();
    }

    
    public Vertice(String nombre, int num_tipo) {
        this.nombre = nombre;
        this.num_tipo = num_tipo;
        switch(num_tipo){
            case 0: Tipo = "Repetidor de Red Domestica";
                    break;
            case 1: Tipo = "Repetidor de Red Empresarial";
                    break;
            case 2: Tipo = "Antena Celular";
                    break;
            case 3: Tipo = "Conexion Dedicada";
                    break;
        }
    }

    public String getTipo() {
        return Tipo;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getNum_tipo() {
        return num_tipo;
    }

    public void setNum_tipo(int num_tipo) {
        this.num_tipo = num_tipo;
        switch(num_tipo){
            case 0: Tipo = "Repetidor de Red Domestica";
                    break;
            case 1: Tipo = "Repetidor de Red Empresarial";
                    break;
            case 2: Tipo = "Antena Celular";
                    break;
            case 3: Tipo = "Conexion Dedicada";
                    break;
        }
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
