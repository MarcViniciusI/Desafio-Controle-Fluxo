import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();
        
        boolean parametrosValidos = false;
        int numero2 = 0;
        //Loop que continua até que os parâmetros sejam válidos
        while (!parametrosValidos) {
            System.out.print("Digite o segundo número inteiro: ");
            numero2 = scanner.nextInt();

            try {
                contar(numero1, numero2);
                parametrosValidos = true; // Parâmetros válidos, sai do loop
            } catch (ParametrosInvalidosException e) {
                System.out.println(e.getMessage());
                System.out.println("Por favor, insira um segundo número maior que o primeiro.");
            }
        }
    }

    public static void contar(int numero1, int numero2) throws ParametrosInvalidosException {
         // Verifica se o primeiro parâmetro é maior que o segundo
        if (numero1 > numero2) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
         // imprimir os números conforme a quantidade de interações
        int interacoes = numero2 - numero1;
        for (int i = 1; i <= interacoes; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
