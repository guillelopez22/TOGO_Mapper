/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import javax.swing.JOptionPane;

/**
 *
 * @author Memo
 */
public class Grafo {
    private List vertices = new List();
    private List relaciones = new List();
    private int[][] adj;

    public Grafo() {
        
    }

    public int[][] getAdj() {
        return adj;
    }

    public void setAdj(int[][] adj) {
        this.adj = adj;
    }

    
    public Grafo(List vertices, List relaciones) {
        this.vertices = vertices;
        this.relaciones = relaciones;
        adj = new int[vertices.size()][vertices.size()];
    }

    public List getVertices() {
        return vertices;
    }

    public void setVertices(List vertices) {
        this.vertices = vertices;
    }

    public List getRelaciones() {
        return relaciones;
    }

    public void setRelaciones(List relaciones) {
        this.relaciones = relaciones;
    }
    
    
    public void addVertex(Vertice vertex){
        boolean add = true;
        for (int i = 0; i < vertices.size(); i++) {
            if (vertex.equals(vertices.get(i))) {
                add = false;
            }
        }
        if (add) {
            vertices.insert(vertex, vertices.size());
        }else{
            JOptionPane.showMessageDialog(null, "Ya existe el vertice");
        }
        
    }
    public void addRelationship(Relacion relationship){
        boolean add = true;
        for (int i = 0; i < relaciones.size(); i++) {
            if (relationship.equals(relaciones.get(i))) {
                add = false;
            }
        }
        if (add) {
            relaciones.insert(relationship, relaciones.size());
        }else{
            JOptionPane.showMessageDialog(null, "Ya existe esta relacion");
        }    
    }
    public void removeVertex(Vertice vertex){
        for (int i = 0; i < vertices.size(); i++) {
            if (vertex.equals(vertices.get(i))) {
                vertices.delete(i);
            }
        }
        for (int i = 0; i < relaciones.size(); i++) {
            if (vertex.equals(((Relacion)relaciones.get(i)).getV1()) ||vertex.equals(((Relacion)relaciones.get(i)).getV2()) ) {
                relaciones.delete(i);
            }
        }
    }
    public void removeRelationship(Relacion relationship){
        for (int i = 0; i < relaciones.size(); i++) {
            if (relationship.equals(relaciones.get(i))) {
                relaciones.delete(i);
            }
        }
    }
    public void matrix(){
        for (int i = 0; i < vertices.size(); i++) {
            for (int j = 0; j < vertices.size(); j++) {
                adj[i][j] = Integer.MAX_VALUE;
            }
        }
        for (int i = 0; i < vertices.size(); i++) {
            adj[i][i] = 0;
        }
        Vertice aux1;
        Vertice aux2;
        for (int k = 0; k < relaciones.size(); k++) {
            aux1 = ((Relacion)relaciones.get(k)).getV1();
            aux2 = ((Relacion)relaciones.get(k)).getV2();
            for (int i = 0; i < vertices.size(); i++) {
                if (((Vertice)vertices.get(i)).getNombre().equals(aux1.getNombre())) {
                    for (int j = 0; j < vertices.size(); j++) {
                        if (((Vertice)vertices.get(j)).getNombre().equals(aux2.getNombre())) {
                            adj[i][j] = ((Relacion)relaciones.get(k)).getLongitud();
                        }
                    }
                }
            }
        }

        
    }
    
}
