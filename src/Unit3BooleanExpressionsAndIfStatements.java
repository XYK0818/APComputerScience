public class Unit3BooleanExpressionsAndIfStatements {

    public static void main(String[] args) {
//        boolean expressions
        int x = 4;
        int y = 4;
        double yy = 4.0;

        System.out.println(x == y);
        System.out.println(x != y);
        System.out.println(x > y);
        System.out.println(x >= y);
        System.out.println(x < y);
        System.out.println(x <= y);

        System.out.println(x + " == " + y + ": " + (x == y));

//        if statement and control flow
        int age = 47;
        if (age > 25) {
            System.out.println("Wow, you are really old!");
        } else {
            System.out.println("You are still young!");
        }

//        else if
        age = 25;
        if (age > 25) {
            System.out.println("Wow, you are really old!");
        } else if (age<25) {
            System.out.println("You are still young!");
        } else {
            System.out.println("You could go either way");
        }

//        compond Boolean Expressions
        double score = 87.5;
        if((score >= 90) && (score <= 100)) {
            System.out.println("Excellent!");
        }

        boolean isDisabled = true;
        if((age < 18) || (age > 65) || isDisabled){
            System.out.println("You are able to get 50% off!");
        } else {
            System.out.println("You have to pay full price");
        }

//        equivalent boolean expressions
        boolean a = false;
        boolean b = true;

        System.out.println(!(a || b));
        System.out.println(!a && !b);

        System.out.println(!(a && b));
        System.out.println(!a || !b);

//        comparing Objects
        String name1 = "chris";
        String name2 = "chris";
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name1 == name2);

        name2 = "kris";
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name1 == name2);

        String name3 = new String("chris");
        String name4 = new String("chris");
        System.out.println(name3);
        System.out.println(name4);
        System.out.println(name3 == name4);
        System.out.println(name3.equals(name4));




    }

}
