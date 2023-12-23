package oopsConcept.inheretance;

public class Parent {

    public static String cycle = "hero";
    public String car = "BMW";


    public void jameen(){
        System.out.println("100 acre");
    }

    public static void mixer(){}


    public static void main(String[] args) {
        System.out.println(cycle);
        cycle="AOne";
        System.out.println(cycle);

        Parent parent= new Parent();
        parent.jameen();
        Parent.mixer();
        System.out.println(parent.car);

    }

}
