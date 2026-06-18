public class Main {

    /* This
    is
    a
    simple
    java
    program
    */

    public static void main(String[] args){
        System.out.println("Hello World!");

        // primitive data types: int, double, char, boolean, ... stored in stack memory
        // reference data types: String, Arrays, Classes, Interfaces, addresses stored in stack and point to value in heap memory

        // 2 Steps to create a variable:
        // 1. Declare 
        // 2. Assign a value


        // Primitives
        int age = 23;

        System.out.println("My age is: " + age);

        boolean isStudent = true;

        if(isStudent){
            System.out.println("I am a student");
        } else {
            System.out.println("I am not a student");
        }


        // Reference data types
        String name = "Nguyen Huy Tai";
        System.out.println("My name is: " + name + " and I am " + age + " years old");
    }
}
