import java.util.Scanner;
public class challenge44 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Array Deletion and printing new Array");
        int[] numArray=ArrayUtility.inputArray();
        System.out.print("enter the number you want to delete:");
        int numToDelete=sc.nextInt();
        int[] newArray=deleteNumber(numArray, numToDelete);
        System.out.println("here is your new array ");
        ArrayUtility.displayArray(newArray);
    }

    public static int[] deleteNumber(int[] numArray,int numToDelete){
        int occ=challenge44.numberOfOccurence(numArray,numToDelete);
        if(occ==0){
            return numArray;
        }

        int newSize=numArray.length-occ;
        int[] newArr=new int[newSize];
        int i=0,j=0;
        while(i<numArray.length){
            if(numArray[i]!=numToDelete){
                newArr[j]=numArray[i];
                j++;
            }
            i++;
        }
        return newArr;

    }
<<<<<<< HEAD
}

=======
}
>>>>>>> 3b4bfcbbb69472188b6901904c5251468e87e446
