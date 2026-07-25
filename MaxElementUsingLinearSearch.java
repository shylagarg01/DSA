class MaxElementUsingLinearSearch {
    public static int maxElement(int[] arr){
        int max = 0; 
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {4, 5, 8, 2, 9, 1};
        int result = maxElement(arr);
        System.out.println(result);
    }
}

