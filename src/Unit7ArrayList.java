import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Unit7ArrayList {

    public static void main(String[] args) {
//        7.1 introduction to ArrayList
        ArrayList<String> superheroes = new ArrayList<>();

//        7.2 ArrayList Methods
        System.out.println(superheroes.size());

        superheroes.add("Clark Kent");
        superheroes.add("Bruce Wayne");
        superheroes.add("Diana Prince");

        System.out.println(superheroes.size());

        System.out.println(superheroes.get(2));

        superheroes.set(2, "Wonder Woman");
        System.out.println(superheroes.get(2));

        String identity = superheroes.set(1, "The Batman");
        System.out.println(superheroes.get(1) + " is " + identity + ".");

        System.out.println(superheroes);

        superheroes.remove(0);
        System.out.println(superheroes);

//        7.3 traversing ArrayLists
        String hero;
        for(int i=0; i<superheroes.size(); i++){
            hero = superheroes.get(i);
            System.out.println(hero);
        }
//        enhanced for loop
        for(String sh: superheroes){
            System.out.println(sh);
        }

//        7.4 developing algorithms using ArrayList
        ArrayList<Integer> averages = new ArrayList<>();
        averages.add(87);
        averages.add(45);
        averages.add(75);
        averages.add(99);
        averages.add(93);
        averages.add(78);

        int max = averages.get(0);
        for(int i=1; i<averages.size(); i++){
            if(averages.get(i) > max){
                max = averages.get(i);
            }
        }

        System.out.println("the max is " + max);

//        7.5 Searching
        for(int i=0; i<superheroes.size(); i++){
            if(superheroes.get(i).equals("The Batman")){
                System.out.println("The Batman is a superhero");
            }
        }

        System.out.println(superheroes.indexOf("The Batman"));

//        7.6 Sorting
        averages.sort(Comparator.naturalOrder());
        System.out.println(Arrays.toString(averages.toArray()));
        System.out.println(averages);

    }
}
