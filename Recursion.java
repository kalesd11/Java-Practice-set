public class Recursion {
    public static int factorial(int num) {
        if (num == 1 || num == 0) {
            return 1;
        }
        return num * factorial(num - 1);
    }

    public static boolean map[] = new boolean[26];

    public static void removeDuplicates(String str, int idx, String newStr) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char curchar = str.charAt(idx);
        if (map[curchar - 'a']) {
            System.out.println(curchar - 'a');
            removeDuplicates(str, idx + 1, newStr);
        } else {
            newStr += curchar;
            map[curchar - 'a'] = true;
            removeDuplicates(str, idx + 1, newStr);
        }
    }

    public static void reverseString(String str, String newStr, int idx) {
        if (idx > str.length()) {
            System.out.println(newStr);
        } else {
            newStr += str.charAt(str.length() - idx);
            reverseString(str, newStr, idx + 1);
        }
    }

    public static void fibbonaci(int a, int b,int n) {
      if(n==0){
        return ;
      }else{
        int c = a+b;
        System.out.print(c +" ");
       fibbonaci(b, c, n-1);
      }
    }

    public static void main(String args[]) {
        // int n = 5;
        // int ans = factorial(n);
        // System.out.println(ans);

        // removeDuplicates("abcdabcdf", 0,"");

        // reverseString("Suraj", "", 1);


        // int a = 0, b=1 ;
        // System.out.println(a);
        // System.out.println(b);
        // fibbonaci(a, b, 10);
    }
}
