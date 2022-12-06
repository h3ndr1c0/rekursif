package rekursif_faktorial;
import java.util.Scanner;

public class Rekursif_faktorial {

      static int faktorial(int num) {
    if(num == 0){
      return 1;
    }
    return num * faktorial(num-1);
  }
  public static void main(String[] args){
    int bil, hasil;
    Scanner scan = new Scanner(System.in);
    System.out.print("Masukkan bilangan: ");
    bil = scan.nextInt();
    hasil = faktorial(bil);
    
    System.out.println("Hasil Faktorial dari "+ bil+" = "+hasil);
  }
}