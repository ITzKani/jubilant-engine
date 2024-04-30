import java.util.Scanner;

class MainResta{
    public static void main(String[] args) {
        Scanner fn = new Scanner(System.in);

        System.out.print("Ingresa un valor: ");
        int n1 = fn.nextInt();

        System.out.print("Ingresa otro valor: ");
        int n2 = fn.nextInt();

        Resta r1 = new Resta();

        r1.setN1(n1);
        r1.setN2(n2);

        r1.restar();



    }
}