public class arrayquestion1 {
    public static void main(String[] args) {
        int[] arr = {5,3,7,2,4,0,1,2};
        int n = arr.length;
        int[] right = new int[n];
        int[] left = new int[n];
        

        left[0] = 0;
        for(int i= 1;i<n;i++){
            if(arr[i-1]>left[i-1]){
                left[i] = arr[i-1];
            }else{
                left[i] = left[i-1];
            }
            // else we can use  left[i] =  Math.max(arr[i-1], left[i-1]);
        }

        right[n-1] = 0;
        for(int i = n-2;i>=0;i--){
            if(arr[i+1]>right[i+1]){
                right[i] = arr[i+1];
            }else{
                right[i]= right[i+1];
            }
        }

        int count = 0;
        for(int i = 1;i<n-1;i++){
            int a = Math.min(left[i], right[i]);
            if(a > arr[i]){
                count +=  a - arr[i];
            }
        }
        System.out.println(count);
    }
}
