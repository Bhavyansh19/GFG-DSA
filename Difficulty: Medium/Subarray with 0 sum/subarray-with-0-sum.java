class Solution {
    // Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[]) {
        Set<Integer> prefixSums = new HashSet<>();
        int prefix = 0;
        for(int i = 0; i < arr.length; i++){
            prefix += arr[i];
            if (prefix == 0 || prefixSums.contains(prefix)) {
                return true;
            }
            prefixSums.add(prefix);
        }
        return false;
    }
}