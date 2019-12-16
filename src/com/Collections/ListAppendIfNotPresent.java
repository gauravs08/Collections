package com.Collections;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListAppendIfNotPresent {

    public static void main(String[] args) {
        Person p1 = new Person(1, "Gaurav1", 10.0, 1);
        Person p2 = new Person(2, "Gaurav3", 20.0, 1);
        Person p3 = new Person(3, "Gaurav2", 30.0, 1);

        Person p4 = new Person(3, "Gaurav2", 30.0, 1);
        Person p5 = new Person(4, "Gaurav4", 50.0, 1);

        List<Person> addList = new ArrayList<>();
        addList.add(p4);
        addList.add(p5);

        List<Person> myList = new ArrayList<>();
        myList.add(p1);
        myList.add(p2);
        myList.add(p3);

        //Java 8+
        final List<Person> temp_person =
                myList.stream()
                        .filter(p -> addList.stream().anyMatch(e -> e.getId() == p.getId()))
                        .collect(Collectors.toList());
        System.out.println("Common Person Object "+temp_person);

        //Java 7 and before
        for (Person newPerson : addList) {
            boolean isExist = false;
            for (int i = 0; i < myList.size(); i++) {
                Person p = myList.get(i);
                if (p.id == newPerson.id) {
                    isExist = true;
                    p.quantity = p.quantity + newPerson.quantity;
                    p.count = p.count + newPerson.count;
                    break;
                }
            }

            if (!isExist) {
                myList.add(newPerson);
            }
        }

        // ListIterator<Person> it = myList.listIterator();
//        for (Person newPerson : addList) {
//
//            if (!myList.contains(newPerson)) {
//                teamlist.add(newTeam);
//            }
//
//
//            while (it.hasNext()) {
//                Person p = it.next();
//                if (p.id == newPerson.id) {
//                    p.quantity = p.quantity + newPerson.quantity;
//                    p.count++;
//                }
//            }
//            it.add(newPerson);
//        }
        System.out.println(myList);
    }
}


class Person {
    int id;
    String name;
    double quantity;
    int count;

    public Person(int id, String name, double quantity, int count) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", count=" + count +
                '}';
    }
}