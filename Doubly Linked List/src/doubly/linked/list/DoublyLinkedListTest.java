/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doubly.linked.list;

/**
 *
 * @author Education Unlimited
 */
public class DoublyLinkedListTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DoublyLinkedList L = new DoublyLinkedList();
        L.insert("Bob", DoublyLinkedList.position.FIRST);
        L.traverse();
        System.out.println(L.getPosition());
        L.insert("Steve", DoublyLinkedList.position.FIRST);
        L.traverse();
        System.out.println(L.getPosition());
        L.insert("Chelsea", DoublyLinkedList.position.FOLLOWING);
//        L.traverse();
//        System.out.println(L.getPosition());
//        L.insert("book", DoublyLinkedList.position.FOLLOWING);
//        L.traverse();
//        System.out.println(L.getPosition());
//        L.insert("table", DoublyLinkedList.position.LAST);
//        L.traverse();
//        System.out.println(L.getPosition());

    }

}
