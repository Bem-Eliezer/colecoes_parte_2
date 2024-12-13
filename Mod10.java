import java.util.Scanner;

public class Mod10 {

   public static void main(String args[]) {

      Scanner s = new Scanner(System.in);

      System.out.println("Digite sua note de Português: ");
       int nota1 = s.nextInt();
       System.out.println("Digite sua note de Matematica: ");
       int nota2 = s.nextInt();
       System.out.println("Digite sua note de Historia: ");
       int nota3 = s.nextInt();
       System.out.println("Digite sua note de Inglês: ");
       int nota4 = s.nextInt();
     

       int media = (nota1 + nota2 + nota3 + nota4) / 4;

       System.out.println("Sua media é: " + media);

       if (media >= 7) {
          System.out.println("Parabens você foi Aprovado");
       } else if (media >= 5 ) {
         System.out.println("Recuperação");
       }else {
         System.out.println("Reprovado");
       }
   }
}
