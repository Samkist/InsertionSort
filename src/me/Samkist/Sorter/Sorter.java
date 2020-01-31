package me.Samkist.Sorter;

import java.util.ArrayList;
import java.util.Arrays;

public class Sorter<T extends Comparable<T>> {
    private ArrayList<T> list;

    public Sorter(ArrayList<T> list) {
        this.list = (ArrayList<T>) list.clone();
        sort();
    }

    public Sorter(T[] list) {
        this.list = new ArrayList<>(Arrays.asList(list));
        sort();
    }

    private void sort() {
        for(int i = 1; i < list.size(); i++) {
            T t = list.get(i);
            int pos = i;

            while(pos > 0 && list.get(pos-1).compareTo(t) > 0) {
                list.set(pos, list.get(pos-1));
                pos--;
            }

            list.set(pos, t);
        }
    }

    public ArrayList<T> get() {
        return list;
    }
}
