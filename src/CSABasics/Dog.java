package CSABasics;

public class Dog {
//    2.1 class, class variables and class constructor
    private String name = ""; // private means any code outside this class can't access this variable
    private int age = 0;

    Dog(){
        System.out.println("I'm a newborn puppy.");
    }

    Dog(String myName){
        System.out.println("I'm a newborn puppy.");
        name = myName;
        System.out.println("My name is " + name);
    }

    public void bark(){
        System.out.println(name + "barks...BARK!");
    }

    public void setName(String myName){
        name = myName;
    }

    public String getName(){
        return name;
    }
}
