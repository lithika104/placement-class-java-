import java.util.Scanner;

class Solution {
    public static boolean isPalindrome(int x) {
        int original = x, reversed = 0;

    
        if (x < 0) return false;

        
        while (x > 0) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }

       
        return original == reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
        
        scanner.close(); 
    }
}
