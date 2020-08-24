public class MaximumSubarraySum {
    public static void main(String[] args) {
        System.out.println(sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        System.out.println(sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    //Kadane’s Algorithm:
    //Initialize:
    //    max_so_far = 0
    //    max_ending_here = 0
    //
    //Loop for each element of the array
    //  (a) max_ending_here = max_ending_here + a[i]
    //  (b) if(max_so_far < max_ending_here)
    //            max_so_far = max_ending_here
    //  (c) if(max_ending_here < 0)
    //            max_ending_here = 0
    //return max_so_far
    //Sample: -2, 1, -3, 4, -1, 2, 1, -5, 4
    //return: 6
    public static int sequence(int[] arr) {
        if(arr == null || arr.length == 0)
            return 0;

        var max_so_far = 0;
        var max_ending_here = 0;

        for(int i = 0; i < arr.length; i++){
            max_ending_here = max_ending_here + arr[i];

            if(max_so_far < max_ending_here)
                max_so_far = max_ending_here;

            if(max_ending_here < 0)
                max_ending_here = 0;
        }

        return max_so_far;
    }
}
