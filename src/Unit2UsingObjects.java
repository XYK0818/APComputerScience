public class Unit2UsingObjects {
/*
java is an Object-Oriented-Language
everything in java is a class
 */
    public static void main(String[] arg) {
//        Unit2a();
        Unit2b();
    }

    public static void Unit2a() {
//        2.2 constructors, parameters and overloading
        Dog dog1 = new Dog();
        Dog dog2 = new Dog("lucky");

//        2.3 calling a void method
        dog2.bark();
        dog1.bark();

//        2.4 calling a void method with parameters
        dog2.setName("Lucky Luciano"); // how to check dogs name is set or not?

//        2.5 calling a non-void method
//        System.out.println("My name is " + dog2.name + ".");
        System.out.println("My name is " + dog2.getName() + ".");
        dog2.bark();

//      meaning of null: null means nothing, means it doesn't exist at all,
//      it doesn't have data type, it doesn't have value
        dog2.setName(""); // that's not null
        dog2.bark();

        dog2 = null;
        dog2.bark();

    }

    public static void Unit2b(){
//        2.6 String Objects: Concatenation, Literals, and more
        String name1 = new String("Zaphod Beeblebrox");
        String name2 = "Ford Perfect";
        System.out.println("name1: " + name1 + " name2: " + name2);

        String firstName = "Arthur";
        String lastName = "Dent";
        String fullName = "";

//        fullName = firstName + " " + lastName;
        fullName += firstName;
        fullName += " ";
        fullName += lastName;
        System.out.println("fullName: " + fullName);

        int theAnswer = 42;
        System.out.println("the answer is: " + theAnswer);

//        escape sequences
        System.out.println("\"why are you so far away?\", she said.");
        System.out.println("\\<- That is a backslash");
        System.out.println("\n\nI just printed two extra blank lines");
        System.out.println("A\tB\tC");

//        string Methods
        System.out.println("fullName: " + fullName);
        System.out.println("fullName length: " + fullName.length());
        System.out.println("fullName substring 0, 6: " + fullName.substring(0, 6));
        System.out.println("fullName substring 2, 8: " + fullName.substring(2, 8));
        System.out.println("fullName indexOf Dent: " + fullName.indexOf("Dent"));
        System.out.println("fullName indexOf dent: " + fullName.indexOf("dent"));

//        string comparisions
        System.out.println("lastName: " + lastName);
        System.out.println("fullName == lastName: " + fullName == lastName);
        System.out.println("fullName equals lastName: " + fullName.equals(lastName));
        System.out.println("fullName compareTo lastName: " + fullName.compareTo(lastName));
        System.out.println("lastName compareTo fullName: " + lastName.compareTo(fullName));
        System.out.println(lastName.compareTo("E"));
        System.out.println(lastName.compareTo("C"));
        System.out.println(lastName.compareTo("Eent"));
        System.out.println(lastName.compareTo("Denti"));

//        getting one letter from a string: substring(index, index+1)
        System.out.println("fullName substring 7,8: " + fullName.substring(7, 8));

//        Wrapper Classes: Integer and Double
        Integer age = new Integer(25); // int age = 25
        Double height = new Double(175.0); // double height = 175.0

        Integer age2 = 25;

        System.out.println("age: " + age.intValue());
        System.out.println("height: " + height.doubleValue());
        System.out.println("age: " + age);
        System.out.println("height: " + height);

//        MIN_VALUE and MAX_VALUE
        System.out.println("Integer.MIN_VALUE: " + Integer.MIN_VALUE);
        System.out.println("Integer.MAX_VALUE: " + Integer.MAX_VALUE);
        System.out.println("Double.MIN_VALUE: " + Double.MIN_VALUE);
        System.out.println("Double.MAX_VALUE: " + Double.MAX_VALUE);

//        Integer aboveMax = new Integer(3000000000);

//        math class
        int x = -43;
        double y = -2.0;

        System.out.println("abs(x): " + Math.abs(x));
        System.out.println("abs(y): " + Math.abs(y));
        System.out.println("y squared: " + Math.pow(y, 2.0));
        System.out.println("25 square root: " + Math.sqrt(25.0));
        System.out.println("random: " + Math.random() * 100);


    }

}
