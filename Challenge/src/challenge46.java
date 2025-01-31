public class challenge46 {
    public static void main(String[] args) {
        System.out.println("array palindrome");
        int[] numArray=ArrayUtility.inputArray();
        boolean ispalindrome=ispalindrome(numArray);
        if(ispalindrome){
            System.out.println("array is palindrome");
        }else{
            System.out.println("array is not palindrome");
        }


    }
    public static boolean ispalindrome(int[] numArray){
        int i=0;
        while(i<numArray.length/2){
            if(numArray[i]!=numArray[numArray.length-1-i]){
                return false;
            }
            i++;

        }
        return true;

    }

}

