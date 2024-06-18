public class binarysearch {
    public static void main(String[] args) {
        int arr1[] = new int[] { 34, 23, 54, 64, 2, 6, 7 };
        int target = 23;
        System.out.println(search(arr1, target, 0, arr1.length - 1));
        
    }

    static int search(int arr[], int target, int start, int end) {
        if (start > end) 
            return -1;
        
        int midelm = start + (end - start) / 2;
        if (arr[midelm] == target) {
            return midelm;

        }
        else if (target<arr[midelm]) {
            return search(arr, target, start, midelm - 1);
        }

       else
        return search(arr, target, midelm + 1, end);
    }

}
