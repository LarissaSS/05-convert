import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    System.out.print("Digite o valor que deseja converter de metros para centimetros: ");
    float m = sc.nextFloat();
    float c = m * 100;

    System.out.println("Centimetros: " + c); 
  }
}