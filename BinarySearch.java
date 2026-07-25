class BinarySearch {
    public static int bs(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(target==arr[mid]){
                return mid;
            } else if(target<arr[mid]){
                end = mid-1;
            } else{
                start = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        int target = 50;
        int ans = bs(arr, target);
        if(ans == -1){
            System.out.println("Element not found!");
        } else{
            System.out.println("Element found at index: " + ans);
        }
    }
}


