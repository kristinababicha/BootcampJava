package com.bootcampexcercise.module8.activity;

import com.bootcampexcercise.module8.sample.ListSample;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListActivity {
    public static void main(String[] args) {
        List list = new ArrayList();
        //TODO: 1 - Type code to create a list of names. Use ArrayList.
        list.add("Kristina, Janis, Unda, Disha, Sergejs");


        //TODO: 2 - Call print method to print the list passed as its parameter.
        ListActivity obj = new ListActivity();
        obj.print(list);
    }

    void print(List list) {
        Iterator<Object> nameOfIterator = list.iterator();
        {
            System.out.println("*** Work of iterator ***");
            while (nameOfIterator.hasNext()) {
                System.out.println(nameOfIterator.next());
            }
        }


        {
            //TODO: 3 - Type code to print this list
            //Notice the order in which elements get printed.

        }
    }
}
