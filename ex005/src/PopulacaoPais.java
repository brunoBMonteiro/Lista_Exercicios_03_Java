import java.util.Scanner;

public class PopulacaoPais {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean valido = false;

        double populacaoA;
        double populacaoB;
        double taxaA;
        double taxaB;

        do {
            System.out.println("Entre com a população A");
            populacaoA = input.nextDouble();

            if (populacaoA > 0) {
                valido = true;
            } else {
                System.out.println("População A precisa ser maior que 0.");
            }

        } while (!valido);

        valido = false;

        do {
            System.out.println("Entre com a população B");
            populacaoB = input.nextDouble();

            if (populacaoB > 0) {
                valido = true;
            } else {
                System.out.println("População B precisa ser maior que 0.");
            }
        } while (!valido);


        valido = false;
        do {
            System.out.println("Entre com a Taxa de crescimento da populção A");
            taxaA = input.nextDouble();

            if (taxaA > 0) {
                valido = true;
            } else {
                System.out.println("Taxa de descimento A precisa ser maior que 0.");
            }
        } while (!valido);


        valido = false;
        do {
            System.out.println("Entre com a Taxa de crescimento da populção B");
            taxaB = input.nextDouble();

            if (taxaB > 0) {
                valido = true;
            } else {
                System.out.println("Taxa de descimento B precisa ser maior que 0.");
            }
        } while (!valido);

        int count = 0;

        while (populacaoA < populacaoB){

            populacaoA += (populacaoA / 100) * taxaA;
            populacaoB += (populacaoB / 100) * taxaB;
            count++;
        }

        System.out.printf("População A: %.3f\n", populacaoA);
        System.out.printf("População B: %.3f\n", populacaoB);
        System.out.println("Quantidade anos: " + count);

    }

}