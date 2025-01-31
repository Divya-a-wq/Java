public class forEachLoop {
    public static void main(String[] args) {
        String[] array=new String[]{
                "Ram","Sohan","Mohan","Sohan","Seeta"
        };
// printarray(array);
        printArrayForEach(array);
    }
    public static void printArrayForEach(String[] array){
        for(String name:array){//using foreach loop
            System.out.println(name);
        }
    }
    // public static void printarray(String[] array){
    // for(int i=0;i<array.length;i++){
    //     System.out.println(array[i]);
    // }//using for loop
}


