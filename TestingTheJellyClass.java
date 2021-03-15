package foop.jellysweetOOPExercise;

public class TestingTheJellyClass {

    public static void main(String[] args) {
        //Create One Kilo Bag Of Mixed Jellies Object
        //Use five argument constructor
        Jelly oneKilobagOfmixedJellies = new Jelly("Sweet King",13.99f,
                "Fizzy, plain, sweet and sour",800f,"02/01/22");
        System.out.println("One Kilo Bag Of Mixed Jellies Info");
        System.out.println("----------------------");
        //Outputs the info of Mixed Jelly Sweets Object.
        System.out.println(oneKilobagOfmixedJellies.toString());
        System.out.println("----------------------");
        //Outputs instructions to the console
        System.out.println(oneKilobagOfmixedJellies.setInstructions());
        System.out.println("/***********************************************/");
        
        //Create a second Jelly Object called Jelly Snakes
        //Use three argument constructor
        Jelly jellySnakes = new Jelly("The Natural Confectionery Co.",13.76f,
                "Plain");
         System.out.println("Jelly Snakes Info");
        System.out.println("--------------------------");
        //Outputs the info of Jelly Snakes Object
        System.out.println(jellySnakes.toString());
        System.out.println("--------------------------");
        //Outputs instructions related to Jelly Snakes Object
        System.out.println(jellySnakes.setInstructions());
        System.out.println("/***********************************************/");
        
        //Create a third Jelly Object called Cola Bottles
        //Use two argument constructor
        Jelly colaBottles = new Jelly("Count Fun Gum Tub",14.00f);
         System.out.println("Cola Bottles Info");
        System.out.println("--------------------------");
        //Outputs the info of Cola Bottles Object
        System.out.println(colaBottles.toString());
        System.out.println("--------------------------");
        //Outputs instructions related to Cola Bottles Object
        System.out.println(colaBottles.setInstructions());
        System.out.println("/***********************************************/");
        
        //Create a fourth Jelly Object called Jelly Beans
        //Use one argument constructor
        Jelly jellyBeans = new Jelly("Haribo");
         System.out.println("Jelly Beans Info");
        System.out.println("--------------------------");
        //Outputs the info of Jelly Beans Object
        System.out.println(jellyBeans.toString());
        System.out.println("--------------------------");
        //Outputs instructions related to Jelly Beans Object
        System.out.println(jellyBeans.setInstructions());
        System.out.println("/***********************************************/");
        
    }

}
