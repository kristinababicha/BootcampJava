package com.bootcampexcercise.module10;
import java.util.HashMap;
import java.util.Map;

public class ElectronicItemDetails {

    public static void main (String[] args) {
        HashMap<String,Double> map = new HashMap<>();

        map.put("TV", 10.0);
        map.put("Refrigator", 5.0);
        map.put("Washing Machine ", 20.0);
        map.put("Laptop", 30.0);

        ElectronicItemDetails obj = new ElectronicItemDetails();
        System.out.println("Price of TV is " + obj.returnPriceOfItem(map, "TV"));

        }
    public double returnPriceOfItem(Map< String,Double> map, String name){

        return map.get(name);
    }


    }

