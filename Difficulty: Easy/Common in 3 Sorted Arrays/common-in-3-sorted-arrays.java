//{ Driver Code Starts
// Initial Template for Java

import java.util.*;

public class GFG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            List<Integer> arr = new ArrayList<>();
            List<Integer> brr = new ArrayList<>();
            List<Integer> crr = new ArrayList<>();

            String input1 = sc.nextLine();
            Scanner ss1 = new Scanner(input1);
            while (ss1.hasNextInt()) {
                arr.add(ss1.nextInt());
            }

            String input2 = sc.nextLine();
            Scanner ss2 = new Scanner(input2);
            while (ss2.hasNextInt()) {
                brr.add(ss2.nextInt());
            }

            String input3 = sc.nextLine();
            Scanner ss3 = new Scanner(input3);
            while (ss3.hasNextInt()) {
                crr.add(ss3.nextInt());
            }

            Solution ob = new Solution();
            List<Integer> res = ob.commonElements(arr, brr, crr);

            if (res.size() == 0) System.out.print(-1);
            for (int i = 0; i < res.size(); i++) System.out.print(res.get(i) + " ");
            System.out.println();
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to find common elements in three arrays.
    public List<Integer> commonElements(List<Integer> arr1, List<Integer> arr2,
                                        List<Integer> arr3) {
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0, k = 0;

        while (i < arr1.size() && j < arr2.size() && k < arr3.size()) {
            int val1 = arr1.get(i), val2 = arr2.get(j), val3 = arr3.get(k);
            if (val1 == val2 && val2 == val3) {
                result.add(val1);
                while (i < arr1.size() && arr1.get(i) == val1) i++;
                while (j < arr2.size() && arr2.get(j) == val2) j++;
                while (k < arr3.size() && arr3.get(k) == val3) k++;
            }
            else if (val1 < val2) {
                i++;
            }
            else if (val2 < val3) {
                j++;
            }
            else {
                k++;
            }
        }
        if (result.isEmpty()) {
            result.add(-1);
        }

        return result;
    }
}