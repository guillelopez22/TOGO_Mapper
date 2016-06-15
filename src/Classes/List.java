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
public class List {

    Node head;
    int size = 0;

    public List() {
        head = new Node();
    }

    public void insert(Object object, int pos) {
        Node newNodo = new Node(object);
        Node newHead = head;
        int cont = 0;
        if (pos == 0) {
            newNodo.setNext(head);
            this.setHead(newNodo);
        }
        while (newHead.getNext() != null) {
            newHead = newHead.getNext();
            cont++;
            if (cont == pos) {
                break;
            }
        }
        Node n = newHead.getNext();
        newHead.setNext(newNodo);
        newNodo.setNext(n);
        size++;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public int find(int num) {
        return 0;
    }

    public Object get(int pos) {
        Node temp = head;
        Object valor = temp.getValue();
        for (int i = 0; i < pos; i++) {
            temp = temp.getNext();
            valor = temp.getValue();
        }
        return valor;
    }

    public void delete(int pos) {
        Node temp = head;
        for (int i = 1; i < pos - 1; i++) {
            temp = temp.getNext();
        }
        Node temp2 = temp.getNext();
        temp.setNext(temp2.getNext());
        size--;
    }

    public Object first() {
        return head.getValue();
    }

    public void Print_Lista() {
        Node temp = head;
        int cont = 0;
        while (temp != null) {
            if (cont == 0) {
                System.out.print("[H]");
            }
            if (temp.getNext() != null) {
                System.out.print("[" + temp.getValue() + "] - ");
                cont++;
            } else {
                System.out.print("[" + temp.getValue() + "]");
                cont++;
            }
            temp = temp.next;
        }
        System.out.println("");
    }

    public void setSize(int cont) {
         size = cont;
    }
    public int size(){
        return size; 
    }

}

