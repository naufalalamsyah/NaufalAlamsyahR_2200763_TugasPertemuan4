/* @author Naufal Alamsyah R
 */
    package perulangan1;
    import java.util.Scanner;
    
        public class Perulangan1 {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai n (n >= 1): ");
        int n = input.nextInt();
        
        // Memastikan n >= 1
        if (n < 1) {
            System.out.println("Masukkan n yang lebih besar dari atau sama dengan 1.");
            return; // Menghentikan program
        }
        
        System.out.println("Bilangan dari 1 sampai " + n + " adalah:");
        
        // Menampilkan bilangan dari 1 sampai n
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }
}
