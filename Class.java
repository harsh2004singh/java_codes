public class Class {
    private final String message;

    public Class(String message) {
        this.message = message;
    }

    public void displayMessage() {
        System.out.println("Message: " + message);
    }

    public static void main(String[] args) {
        
        Class obj = new Class("Hello, Java Class!");
        obj.displayMessage();
    }
}
