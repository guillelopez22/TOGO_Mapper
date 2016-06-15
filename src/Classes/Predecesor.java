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
public class Predecesor {
    private Vertice node1;
    private Vertice node2;

    public Predecesor(Vertice node1, Vertice node2) {
        this.node1 = node1;
        this.node2 = node2;
    }

    public Vertice getNode1() {
        return node1;
    }

    public void setNode1(Vertice node1) {
        this.node1 = node1;
    }

    public Vertice getNode2() {
        return node2;
    }

    public void setNode2(Vertice node2) {
        this.node2 = node2;
    }
    
}
