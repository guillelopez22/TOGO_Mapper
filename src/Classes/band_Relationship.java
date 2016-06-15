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
public class band_Relationship {
    private Vertice v1;
    private Vertice v2;
    private int max_ancho_de_banda;

    public band_Relationship(Vertice v1, Vertice v2, int max_ancho_de_banda) {
        this.v1 = v1;
        this.v2 = v2;
        this.max_ancho_de_banda = max_ancho_de_banda;
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

    public int getMax_ancho_de_banda() {
        return max_ancho_de_banda;
    }

    public void setMax_ancho_de_banda(int max_ancho_de_banda) {
        this.max_ancho_de_banda = max_ancho_de_banda;
    }

    @Override
    public String toString() {
        return "" + max_ancho_de_banda;
    }
    
    
}
