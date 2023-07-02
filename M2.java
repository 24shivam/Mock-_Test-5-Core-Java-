import java.util.Scanner;

public class M2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of terms: ");
        int numTerms = scanner.nextInt();
        
        int firstTerm = 0;
        int secondTerm = 1;
        
        System.out.println("Fibonacci series:");
        
        for (int i = 1; i <= numTerms; i++) {
            System.out.print(firstTerm + " ");
            
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        
        scanner.close();
    }
}
