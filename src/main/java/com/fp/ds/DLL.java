package com.fp.ds;

import java.util.List;
import java.util.stream.Collectors;

class DLLNode<E> {
    protected E element;
    protected DLLNode<E> pred, succ;

    public DLLNode(E elem, DLLNode<E> pred, DLLNode<E> succ) {
        this.element = elem;
        this.pred = pred;
        this.succ = succ;
    }

    @Override
    public String toString() {
        return element.toString();
    }
}

public class DLL<E> {
    private DLLNode<E> first, last;

    public DLL() {
        this.first = null;
        this.last = null;
    }

    public void insertFirst(E o) {
        DLLNode<E> ins = new DLLNode<>(o, null, first);
        if (first == null)
            last = ins;
        else
            first.pred = ins;
        first = ins;
    }

    public void insertLast(E o) {
        if (first == null)
            insertFirst(o);
        else {
            DLLNode<E> ins = new DLLNode<>(o, last, null);
            last.succ = ins;
            last = ins;
        }
    }

    public DLLNode<E> getFirst() {
        return first;
    }

    public DLLNode<E> getLast() {
        return last;
    }

    @Override
    public String toString() {
        if (first == null) return "Empty list!";
        StringBuilder sb = new StringBuilder();
        DLLNode<E> tmp = first;
        sb.append(tmp);
        while (tmp.succ != null) {
            tmp = tmp.succ;
            sb.append("<->").append(tmp);
        }
        return sb.toString();
    }

    public List<E> toList() {
        List<E> list = new java.util.ArrayList<>();
        DLLNode<E> current = first;
        while (current != null) {
            list.add(current.element);
            current = current.succ;
        }
        return list;
    }

    public static void main(String[] args) {
        DLL<Integer> dll = new DLL<>();
        dll.insertLast(10);
        dll.insertLast(20);
        dll.insertLast(30);
        dll.insertLast(40);

        System.out.println(dll);

        List<Integer> squared = dll.toList().stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println(squared);

        List<Integer> greaterThan20 = dll.toList().stream()
                .filter(n -> n > 20)
                .collect(Collectors.toList());
        System.out.println(greaterThan20);
    }
}
