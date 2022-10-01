import java.util.Scanner;
class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double lado = 0.0f;
        double area = 0.0f;
        double dobraArea = 0.0f;


        System.out.print("Digite o valor do lado do quadrado: ");
        lado = sc.nextInt();

        area = lado*lado;
        dobraArea = area * 2;

        System.out.println("A area do quadrado de lado " + lado +" e: " + area);
        System.out.println("O dobro da area e : " + dobraArea);
    }
}