import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Searching {
    static boolean search(String str, char s) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == s) {
                return true;
            }
        }
        return false;
    }

    static int findMin(int arr[]) {
        if (arr.length == 0) {
            return -1;
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

        }
        return min;
    }

    static int linearSearch(int arr[], int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    static int binarySearch(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        if (arr.length == 0) {
            return -1;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static Map<Integer, Integer> findFrequency(int[] nums) {
        // Map to store the frequency of each array element
        Map<Integer, Integer> freq = new HashMap<>();

        // search space is nums[left…right]
        int left = 0, right = nums.length - 1;

        // loop till the search space is exhausted
        while (left <= right) {
            // if nums[left…right] consists of only one element, update its count
            if (nums[left] == nums[right]) {
                freq.put(nums[left], freq.getOrDefault(nums[left], 0) +
                        (right - left + 1));

                // now discard nums[left…right] and continue searching in
                // nums[right+1… n-1] for nums[left]
                left = right + 1;
                right = nums.length - 1;
            } else {
                // reduce the search space
                right = (left + right) / 2;
            }
        }

        return freq;
    }

    static String search2D(int arr[][], int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return ("Fount at row " + i + " and column " + j);
                }
            }
        }
        return ("Not Found");
    }

    static String FirstAndLastPosition(int arr[], int target) {
        int f = -1;
        int l = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                if (f == -1) {
                    f = i;
                    l = i;
                }else{
                    l=i;
                }
            }
        }
        return ("first => "+f+" and"+ " last => "+l);
    }


    public char nextGreatestLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
    public static void main(String[] args) {
        // String name = "Suraj";
        // System.out.println(Arrays.toString(name.toCharArray()));
        // System.out.println(search(name, 'a'));

        // int arr[] = {12,14,54,67,76,45,32,1};
        // System.out.println(findMin(arr));

        // int arr[] = {1,3,5,7,9,11,23,34};
        // System.out.println(linearSearch(arr, 33));

        // int arr[] = { 1, 3, 5, 7, 9, 11, 23, 34 };
        // System.out.println(binarySearch(arr, 35));

        // int arr[] = { 1, 3, 5, 7, 9, 11, 23, 34, 34 };
        // System.out.println(findFrequency(arr));

        // int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        // System.out.println(search2D(arr, 6));


        int arr[] = { 1, 3, 5, 7, 9, 11, 23, 7, 34, 34 };
        System.out.println(FirstAndLastPosition(arr, 7));
    }
}
