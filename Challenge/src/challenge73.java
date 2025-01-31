public class challenge73 {//dice roll
    int roll(){
        double random=Math.random()*6;// 1 nhi aa sakta because of exclusive
        return (int)Math.ceil(random);

    }
    public static void main(String[] args) {
        challenge73 dice =new challenge73();
        for(int i=0;i<10;i++){
            System.out.println(dice.roll());
        }

    }
}
