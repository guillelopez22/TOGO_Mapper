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
public class Relacion {
    private Vertice v1;
    private Vertice v2;
    private int longitud;
    private int max_ancho_de_banda;
    private String material;

    public Relacion(Vertice v1, Vertice v2, int longitud, int max_ancho_de_banda, String material) {
        this.v1 = v1;
        this.v2 = v2;
        this.longitud = longitud;
        this.max_ancho_de_banda = max_ancho_de_banda;
        this.material = material;
    }

    public Vertice getV1() {
        return v1;
    }

    public void setV1(Vertice v1) {
        this.v1 = v1;
    }

    public Vertice getV2() {
        return v2;
    }

    public void setV2(Vertice v2) {
        this.v2 = v2;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public int getMax_ancho_de_banda() {
        return max_ancho_de_banda;
    }

    public void setMax_ancho_de_banda(int max_ancho_de_banda) {
        this.max_ancho_de_banda = max_ancho_de_banda;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return material + " longitud: " + longitud + " ,"+ max_ancho_de_banda +" mb/s";
    }
    
}
