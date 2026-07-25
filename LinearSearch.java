public class LinearSearch {
   public static int linearSearch(int[] arr, int target){

       for(int i=0; i<arr.length; i++){
           if(arr[i]==target){
               return i;
           }
       }
       return -1;
   }
    public static void main(String[] args) {
        int[] arr = {2,4,65,90,31};
        int target = 90;
        int result = linearSearch(arr, target);
        if(result == -1){
            System.out.println("Element not found");
        } else{
            System.out.println("Element found at: " + result);
        }
        
        
    }
}

