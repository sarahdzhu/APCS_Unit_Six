public class ArrayAlgorithms {

    public static boolean checkForAllNegatives(int[] list) {
       int count=0;
        for( int i=0; i< list.length; i++){
            if(list[i]>=0){
                count--;


            }
            }
        if (count<0){
            return false;
        }else{

       return true ; // placeholder to avoid errors. You may need to change this.
    }}

    public static boolean hasDupes(int[] list) {
        for(int i=0; i<list.length; i++){
            for(int j=i+1; j<list.length; j++)
            if(list[i]==list[j]){
                return true;
            }
         {

            }
        }



        return false; // placeholder to avoid errors. You may need to change this.
    }


    public static int[] leftShift(int[] nums, int shift) {



        return new int[] {}; // placeholder to avoid errors. You may need to change this.
    }
}
