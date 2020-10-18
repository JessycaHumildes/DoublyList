package com.jhumildes;

public class Main {

    public static void main(String[] args) {

        Employee JessyHumildes = new Employee("Jessy","Humildes", 9889);
        Employee BiaLinda = new Employee("Bia","Linda", 4567);
        Employee WiviBento = new Employee("Wivi","Bento",7865);
        Employee DoraLicia = new Employee("Dora","Licia",4567);
        Employee JakeYoung = new Employee("Jake","Young",5467);

        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();

        list.addToFront(JessyHumildes);
        list.addToFront(BiaLinda);
        list.addToFront(WiviBento);

        list.printList();
        System.out.println(list.getSize());

        Employee doraEnd = new Employee("Dora","End", 46);
        list.addToEnd(doraEnd);

        list.printList();
        System.out.println(list.getSize());
        list.removeFromFront();
        list.printList();

        list.removeFromEnd();
        list.printList();
        System.out.println(list.getSize());

    }
}
