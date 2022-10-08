public class Palindrome {

    public boolean isPalindrome(int x) {
        int temp = x;
        int sum = 0;
        while (true) {
            sum = sum + x % 10;
            x = x / 10;
            if (x == 0) {
                break;
            } else {
                sum = sum * 10;
            }
        }
        System.out.println(sum);
        if (temp == sum) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalindrome(121));
        System.out.println(palindrome.isPalindrome(12344321));
        System.out.println(palindrome.isPalindrome(12344321));

        System.out.println(palindrome.isPalindrome(12344321));

        System.out.println(palindrome.isPalindrome(12344421));


    }
}