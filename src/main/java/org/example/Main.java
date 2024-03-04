package org.example;

import org.example.gb_collections.GbList;
import org.example.gb_collections.lists.GbArrayList;

public class Main {
    public static void main(String[] args) {
        GbList<Integer> list = new GbArrayList<>();
        list.add(5);
        list.add(9);
        list.add(66);
        list.add(8);
        list.add(5);
        list.add(9);
        list.add(66);
        list.add(8);
        list.add(5);
        list.add(9);
        list.add(66);
        list.add(8);
        System.out.println(list.size());
        System.out.println(list);
        list.removeByIndex(1);
        list.remove(66);
        System.out.println(list);
        GbList<String> s = new GbArrayList<>();
        s.add("asdf");
        s.add("xcdf");
        s.add("hjdf");
        s.add("lkjf");
    }
}