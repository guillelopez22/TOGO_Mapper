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
public class dist_Relationship {

    private Vertice v1;
    private Vertice v2;
    private int longitud;

    public dist_Relationship(Vertice v1, Vertice v2, int longitud) {
        this.v1 = v1;
        this.v2 = v2;
        this.longitud = longitud;
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

    @Override
    public String toString() {
        return ""+longitud;
    }
    
    
}
