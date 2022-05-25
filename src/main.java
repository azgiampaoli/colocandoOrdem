import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        ArrayList<Integer> number = new ArrayList();

        System.out.println("Digite um número: ");
        numero = sc.nextInt();
        for(int i=0; i<=numero; i++){
            number.add(i);
        }
        System.out.println("Digite ");
        System.out.println("1 - ordem crescente ");
        System.out.println("2 - ordem decrescente");
        int escolha = sc.nextInt();
        if(escolha ==1) {

            for (int i : number) {
                System.out.println("Numero: " + i);
            }
        }
        if(escolha==2){
            for(int i = numero; i >= 0; i--){
                System.out.println(i);
            }
        }



    }
}
