public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

       // ----------------------------------
        // conditional logic

        boolean isFalse = false;

        if(isFalse == false){
            System.out.println("1:  it false ");
        }

        if(!isFalse){
            System.out.println("2:  Write this statement too because this is the same thing as above");

        }


        // ----------------------------------
        // conditional logic


        boolean isAlien = true;

        if(isAlien){
            System.out.println("");
            System.out.println("3   :it is an alien");
        }

        if(isAlien){
            System.out.println("4:  Write this statement too because this is the same thing as above");
        }



        //----------------------------------------------------------

        int topScore = 100;

        if(topScore == 100){
            System.out.println("");
            System.out.println("You've got the top score!");
        }

        int secondTopScore = 80;

        if((secondTopScore < topScore) && (topScore == 100)){
            System.out.println("");
            System.out.println("second top score is less");
        }


        //--------------------------------------------------------------------------------------------------------

        if((topScore < 100) || (secondTopScore == 80)){
            System.out.println("");
            System.out.println("good work !!!");
        }
    }
}