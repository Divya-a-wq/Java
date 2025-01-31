import java.util.Scanner;

public class challenge74 {//guessing game
    int random;
    challenge74(){
        random=(int)Math.ceil(Math.random()*100);// random means suppose we are taking tandom number 1 then is sart from 1.000000000001...to 99.99999999....
        // ceiling means number integer from 1 to simple 100 value
    }
    /**
     *
     * @param guessNumber the number that player guess
     * @return negative if the guess number is smaller
     * -negative if the guss number is smaller
     * -0 if the guesss number is correct
     * -positive if the guess number is higher
     */
    int guess( int guessNumber){
        return guessNumber-random;

    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        challenge74 game = new challenge74();
        System.out.println("welcome to number guessing game . Enter your number between  0 to 100:");
        int guess;
        int result;
        do{
            System.out.print("guess the number:");
            guess =sc.nextInt();
            result = game.guess(guess);
            if(result==0){
                System.out.println("congrat you number is correct");
            }else if(result<0){
                System.out.println("please guess higher");
            }else{
                System.out.println("plz gueass lower");
            }
        }while(result!=0);

    }

}
