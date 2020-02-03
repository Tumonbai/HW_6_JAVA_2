package com.company;

import java.util.*;


public class Main {

    public static void main(String[] args) {
        // write your code here

        ArrayList<String> listA = new ArrayList<>(5);
        System.out.println("Список А:");
        Scanner sc = new Scanner(System.in);
        listA.add(sc.nextLine());
        listA.add(sc.nextLine());
        listA.add(sc.nextLine());
        listA.add(sc.nextLine());
        listA.add(sc.nextLine());

        Iterator<String> iter = listA.iterator();
        while (iter.hasNext()) {
            String a = iter.next();
            System.out.println(a);
        }

        ArrayList<String> listB = new ArrayList<>(5);
        listB.add(sc.nextLine());
        listB.add(sc.nextLine());
        listB.add(sc.nextLine());
        listB.add(sc.nextLine());
        listB.add(sc.nextLine());
        System.out.println("Список В:");
        iter = listB.iterator();
        while (iter.hasNext()) {
            String b = iter.next();
            System.out.println(b);
        }
//
        ArrayList<String> listC = new ArrayList<>();
        listC.add(0, listA.get(0) + listB.get(4));
        listC.add(1, listA.get(1) + listB.get(3));
        listC.add(2, listA.get(2) + listB.get(2));
        listC.add(3, listA.get(3) + listB.get(1));
        listC.add(4, listA.get(4) + listB.get(0));
        System.out.println("Список C:");
        Iterator<String> iterator = listC.iterator();
        while (iterator.hasNext()) {
            String c = iterator.next();
            System.out.println(c);
        }
        System.out.println(listC);
        Collections.sort(listC, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        System.out.println("Сортировка по кол-ву символов:");
        iterator = listC.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
