import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n degerini giriniz: ");
        int n = scanner.nextInt();

        System.out.print("r degerini giriniz: ");
        int r = scanner.nextInt();

        int nfak =1;
        for(int i=1; i<=n; i++) {
            nfak *= i;
        }
         int rfak =1;
        for(int i=1; i<=r; i++){
            rfak *=i;
        }
        int nrfak =1;
        for(int i=1; i<=n-r; i++){
            nrfak *=i;
        }

        int combination = nfak/(rfak*nrfak);
        System.out.println("C(n,r)=" +combination);


    }
}
