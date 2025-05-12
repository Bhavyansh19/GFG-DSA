//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends

// User function Template for Java

class GFG {
    ArrayList<Integer> find(int arr[], int x) {
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        int left = 0;
        int right = n - 1;

        int first = -1, last = -1;

        while (left <= right) {
            if (arr[left] == x && first == -1) {
                first = left;
            } else if (first == -1) {
                left++;
            }
            if (arr[right] == x && last == -1) {
                last = right;
            } else if (last == -1) {
                right--;
            }
            if (first != -1 && last != -1) break;
        }
        list.add(first);
        list.add(last);
        return list;
    }
}



//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while (testcases-- > 0) {

            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            int n = a1.length;
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(a1[i]);
            }
            int x = Integer.parseInt(br.readLine());
            GFG ob = new GFG();
            ArrayList<Integer> ans = ob.find(arr, x);
            System.out.println(ans.get(0) + " " + ans.get(1));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends