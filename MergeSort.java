class Main {
    
    static void mergeSort(int[] arr, int start, int end){
        if(start>=end){
            return;
        }
        int mid = start + (end-start)/2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);
        merge(arr, start, mid, end);
    }
    
    static void merge(int[] arr, int start, int mid, int end){
        int[] temp = new int[end-start+1];
        int left = start;
        int right = mid+1;
        int k = 0;
        while(left<=mid && right<=end){
            if(arr[left] <= arr[right]){
                temp[k++] = arr[left++];
            } else{
                temp[k++] = arr[right++];
            }
        }
        while(left<=mid){
            temp[k++] = arr[left++];
        }
        
        while(right<=end){
            temp[k++] = arr[right++];
        }
        
        for(int i=start; i<=end; i++){
            arr[i] = temp[i-start];
        }
    }
    
    
    public static void main(String[] args) {
        int[] arr = {10, 4, 6, 1, 11, 3, 2, 8};
        mergeSort(arr, 0, arr.length-1);
        for(int i:arr){
            System.out.print(i + " ");
        }
    }
}


