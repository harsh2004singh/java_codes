public class StringExample {
    public static void main(String[] args) {
        String text = "  Java Programming  ";
        
        System.out.println("Original: " + text);
        System.out.println("Trimmed: " + text.trim());
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Substring: " + text.substring(2, 6));
        System.out.println("Replace: " + text.replace("Java", "Python"));
    }
}

