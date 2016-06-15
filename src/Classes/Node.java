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
public class Node {
    Object object = null;
    Node next;

    public Node(Object object){
        this.object=object;
    }
    
    public Node(){
        
    }
            

    public Object getValue() {
        return object;
    }

    public void setValue(Object object) {
        this.object = object;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}