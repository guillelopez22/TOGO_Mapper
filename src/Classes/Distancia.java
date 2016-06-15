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
public class Distancia {
    private Vertice node;
    private int distance;

    public Distancia(Vertice node, int distance) {
        this.node = node;
        this.distance = distance;
    }

    public Vertice getNode() {
        return node;
    }

    public void setNode(Vertice node) {
        this.node = node;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
    
}
