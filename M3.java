import java.util.Scanner;

public class M3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int numElements = scanner.nextInt();
        
        int[] numbers = new int[numElements];
        int sum = 0;
        int index = 0;
        
        System.out.println("Enter the numbers:");
        do {
            numbers[index] = scanner.nextInt();
            sum += numbers[index];
            index++;
        } while (index < numElements);
        
        double average = (double) sum / numElements;
        
        System.out.println("Average: " + average);
        
        scanner.close();
    }
}
