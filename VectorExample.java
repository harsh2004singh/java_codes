import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
      
        Vector<Integer> numbers = new Vector<>();

        
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

       
        System.out.println("Vector: " + numbers);

        
        System.out.println("First element: " + numbers.get(0));

        numbers.remove(2);
        System.out.println("After removal: " + numbers);

        
        System.out.println("Contains 20? " + numbers.contains(20));

        System.out.println("Elements in Vector:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}

