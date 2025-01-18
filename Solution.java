class Solution {
    void nextPermutation(int[] arr) {
        // code here
        int i = arr.length - 2;
        while(i >= 0 && arr[i] >= arr[i + 1]){
            i--;
        }
        
        if(i >= 0){
            int j = arr.length - 1;
            while(arr[j] <= arr[i]){
                j--;
            }
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        Arrays.sort(arr, i + 1, arr.length);
        
    }
}

