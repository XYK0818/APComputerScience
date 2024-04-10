package CSABasics;

public class Unit4Iteration {

    public static void main(String[] args) {

//        infiniteLoop();
//        whileLoopIncrease();
//        whileLoopDecrease();
//        forLoopIncrease();
//        forLoopDecrease();
//        loopingString();
//        nestedIteration();
        informalCodeAnalysis();
    }

    public static void infinateLoop(){

        while(true){
            System.out.println("infinite loop!");
        }
    }

    public static void whileLoopIncrease(){

        int x = 0;
        while(x < 10){
//            x++;
            System.out.println("x: " + x);
            x++;
        }
    }

    public static void whileLoopDecrease(){

        int x = 10;
        while(x >= 10){
            System.out.println("x: " + x);
            x--;
        }
    }

    public static void forLoopIncrease(){

        for(int y=0; y<10; y++){
            System.out.println("y: " + y);
        }
    }

    public static void forLoopDecrease(){

        for(int y=10; y>0; y-=2){
            System.out.println("y: " + y);
        }
    }

    public static void loopingString(){

        String grades = "ABBABCCABA";

        int numOfA = 0;
        for(int i=0; i<grades.length(); i++){
            if(grades.substring(i, i+1).equals("A")){
                numOfA++;
            }
        }
        System.out.println("Number of As: " + numOfA);
    }

    public static void nestedIteration(){

        for(int a=0; a<5; a++){

            for(int b=0; b<5; b++){
                System.out.println(a + " : " + b);
            }
        }

        int a = 100;
        int b = 1000;
//        int a = 2;
//        int b = 20;
    }

    public static void informalCodeAnalysis(){

        int numOfIterations = 0;
        for(int a=0; a<10; a++){
            for(int b=0; b<5; b++){
                numOfIterations++;
            }
        }

        System.out.println("number of iterations: " + numOfIterations);

    }

}
