package org.example;

public class LinkedList {
    protected Card head;
    protected Card tail;

    public LinkedList() {
        head = null;
        tail = null;
    }

    public boolean isEmpty(){
        /*
        @return if it is empty return true if not return false
         */
        return head == null;
    }
    public Card getHead(){
        return head;
        //If it has return value then it is going to be head value data in order to maximazi the value
        //IDK why is it like this bv
    }


    public void insertFirst(Card newCard) {
        /*
        @param which card going to be implemented to first order in the list
         */
        if (tail == null) {
            tail = newCard;
        }
        newCard.setNext(head);
        head = newCard;
    }

    public void insertLast(Card newCard) {
/*
        @param which card going to be implemented to last order in the list
         */
        if (head == null) {
            head = newCard;
        } else {
            tail.setNext(newCard);
        }
        tail = newCard;
    }
    public void deleteFirst() {
        /*
        delete first card in the list
        @yeter knk
         */
        head = head.getNext();
        if (head == null){
            tail = null;
        }
    }

    public void deleteLast() {
/*
        delete last card in the list
         */
    }




    public Card search(Card card) {
        /*
         @param the value that we want to find in list
         @return the node that include the value that we want
         */
        Card tmp = head;
        while (tmp != null) {
            if (card == tmp) {
                return tmp;
            }
            tmp = tmp.getNext();
        }
        return null;
    }

    public Card getCardI(int i) {
        /*
        @param index that we want to node of it
        @return Node that belongs to index of that we entered as a parameter
         */
        Card tmp = head;
        int index = 0;
        while (tmp != null) {
            if (index == i){
                return tmp;
            }
            index++;
            tmp = tmp.getNext();
        }

        return null;
    }

    public int numberOfElements(){
        /*
        @return size of list briefly
         */
        Card tmp = head;
        int count = 0;
        while (tmp != null) {
            count++;
            tmp = tmp.getNext();
        }
        return count;
    }


    public Card getPrevious(Card card){
        /*
        @param node that we want to find previous of it
        @return node that previous of we entered as a parameter
         */
        Card tmp = head;
        Card previous = null;
        while (tmp != card) {
            previous = tmp;
            tmp = tmp.getNext();
        }
        return previous;
    }





    public String toString(){
        /*
        @return toString method briefly
         */
        StringBuilder result = new StringBuilder();
        Card tmp = head;
        while (tmp != null) {
            result.append(tmp).append(" ");
            tmp = tmp.getNext();
        }
        return result.toString();
    }

}
