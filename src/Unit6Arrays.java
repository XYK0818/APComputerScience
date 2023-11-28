public class Unit6Arrays {

    public static void main(String[] args) {
//        array creation and access

        int[] scores = new int[7];
        double[] scores_double = new double[7];
//        default values
//        int -> 0, double -> 0.0, boolean -> false
//        objects including String -> null

        scores[0] = 100;
        scores[1] = 90;

        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[0] + scores[1]);
        System.out.println(scores[2]);
//        System.out.println(scores[7]); see the error

//        array of strings
        String[] names = new String[7];
        names[0] = "scott";

        System.out.println(names[0]);
        System.out.println(names[1]);

//        Array Initializer list
        String[] cities = {"Beijing", "DC", "Tokyo"};
        System.out.println(cities[0]);
        cities[0] = "Shanghai"; //can't change the length or types
        System.out.println(cities[0]);

//        length of an array
        System.out.println(cities.length);

//        6.2 traversing arrays
        for(int i=0; i<scores.length; i++){
            System.out.println(scores[i]);
        }

        for(int i=names.length-1; i>=0; i--){
            System.out.println(names[i]);
        }

        int jj = 0;
        while (jj < cities.length){
            System.out.println(cities[jj]);
            jj++;
        }

//        6.3 enhanced for loop. when order does not matter
        for(int score: scores){
            System.out.println(score);
        }

        for(String city: cities){
            System.out.println(city);
        }

//        6.4 standard algorithms
//        determining a maximum or minimum value
        int[] averages = {87, 45, 75, 99, 93, 78};
        int maximum = averages[0];
        for(int i=1; i<averages.length; i++){
            if (averages[i] > maximum) {
                maximum = averages[i];
            }
        }
        System.out.println("the maximum is: " + maximum);

//        computing sum or average
        double[] costs = {4.99, 3.99, .99, 21.98, 2.00};
        double sum = 0.0;
        double average = 0.0;
        for (double cost: costs){
            sum+= cost;
        }
        average = sum/costs.length;
        System.out.println("sum: " + sum);
        System.out.println("Average: " + average);

//        determine if one element has a particular property
        boolean isOverTen = false;
        for(double cost: costs){
            if(cost > 9.99){
                isOverTen = true;
            }
        }
        if(isOverTen){
            System.out.println("there is an item over 9.99");
        } else{
            System.out.println("there are no items over 9.99");
        }

//        determine if all element have a particular property
        boolean isUnderTen = true;
        for(double cost: costs){
            if(cost >= 10.00){
                isUnderTen = false;
            }
        }
        if(isUnderTen){
            System.out.println("all items are under 10.00");
        } else{
            System.out.println("NOT all items are under 10.00");
        }

//        access all consecutive pairs of elements
        String[] foods = {"apple", "banana", "egg", "ham"};
        for(int i=0; i< foods.length-1; i++){
            System.out.println(foods[i] + "-" + foods[i+1]);
        }

//        determine the presence or absence of duplicate elements
        boolean areDups = false;
        for(int i=0; i<foods.length; i++){
            for(int k=i+1; k<foods.length; k++){
                if(foods[i].equals(foods[k])){
                    areDups = true;
                    break;
                }
            }
        }
        System.out.println("are there duplicates? " + areDups);

//        determine the number of elements that meet a certain criteria
        int numOfHam = 0;
        for(int i=0; i< foods.length; i++){
            if(foods[i].equals("ham")){
                numOfHam++;
            }
        }
        System.out.println("number of ham is: " + numOfHam);

        String tempFood;
        for(int i=0; i< foods.length/2; i++){
            tempFood = foods[i];
            foods[i] = foods[foods.length-i-1];
            foods[foods.length-i-1] = tempFood;
        }
        for(String food: foods){
            System.out.print(food + ",");
        }


        String[] s = new String[2];
        String[] t = {"Michael", "Megan", "Chelsea"};
        s = t;
        System.out.println(s.length);

        final int[] myArray = {1, 2};
        myArray[1] = 3;
        System.out.println(myArray[1]);


        int [] scores1 = {75, 63, 52, 80};
        for (int s1 : scores1)
        {
            if (s1 < 75)
            {
                s1 += 5;
            }
            System.out.print(s1 + " ");
        }
        System.out.println(" ");
        for (int s1:scores1){
            System.out.print(s1 + " ");
        }


        String[]StudentNames = {"bob", "obo", "ava", "vav", "isi"};
        for(int i = 0; i < StudentNames.length; i++) {
            String temp = StudentNames[i];
            for (int j = 0; j < temp.length(); j++) {
                if (temp.contains("b")){
                    System.out.println(StudentNames[i]);
                    break;
                }
            }
        }

    }

}
