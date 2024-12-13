import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SepararSexo {
   public static void main(String[] args) {
      
       List<String> masculino = new ArrayList<>();
       List<String> feminino = new ArrayList<>();
       Scanner scanner = new Scanner(System.in);
        String continuar = "S"; 


       do {
           System.out.print("Digite o nome e o sexo (formato: Nome,M ou Nome,F): ");
           String entrada = scanner.nextLine();

           String[] partes = entrada.split(",");
           if (partes.length != 2) {
               System.out.println("Entrada inválida! Use o formato Nome,M ou Nome,F.");
               continue;
           }

           String nome = partes[0].trim();
           String sexo = partes[1].trim().toUpperCase();

           if (sexo.equals("M")) {
               masculino.add(nome);
           } else if (sexo.equals("F")) {
               feminino.add(nome);
           } else {
               System.out.println("Sexo inválido! Tente novamente.");
               continue;
           }

        
           System.out.print("Deseja continuar? (S/N): ");
           continuar = scanner.nextLine().trim().toUpperCase();
       } while (continuar.equals("S"));

       scanner.close();

       System.out.println("\nGrupo Masculino:");
       for (String nome : masculino) {
           System.out.println(nome);
       }

       System.out.println("\nGrupo Feminino:");
       for (String nome : feminino) {
           System.out.println(nome);
       }
   }
}
