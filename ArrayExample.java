public class ArrayExample {
    public static void main(String[] args) {
        
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("First element: " + numbers[0]);
        System.out.println("Third element: " + numbers[2]);

        System.out.print("Array Elements: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}



