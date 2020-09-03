public class Palindrome {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            System.out.println(s + " " + isPalindrome(s));
            System.out.println("-----------------------");
        }
    }
    
    // переворачивает строку
    public static String reverseString(String s) {
        String s1 = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            s1 = s1 + s.charAt(i); // возвращает символ по индексу 
        }
        System.out.println(s1);
        return s1;
    }
    
    // проверяет является ли строка палиндромом 
    public static boolean isPalindrome(String s)
    {
        String s2 = reverseString(s);
        return s2.equals(s); // проверяет равентсво 
    }
}
