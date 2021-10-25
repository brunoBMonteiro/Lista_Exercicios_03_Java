import java.util.Scanner;

public class LerEValidar {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);



        System.out.println("Digite seu nome: ");
        String name = input.next();

        while (name.length() <= 3){
            System.out.println("Poucos caracteres, tem que ter mais de 3");
            System.out.println("Digite novamente seu nome: ");
            name = input.next();

            if(name.length() > 3){
                System.out.println("Nome válido");
            }
        }

        System.out.println("Digite sua idade: ");
        int age = input.nextInt();

        while(age <= 0 || age > 150){
            System.out.println("Idade inválida");
            System.out.println("Digite novamente sua idade");
            age = input.nextInt();
        }
        if(age > 0 || age < 150) {
            System.out.println("Idade válida");
        }

        System.out.println("Digite seu salário");
        double wage = input.nextDouble();

        while (wage <= 0){
            System.out.println("Salário inválido");
            System.out.println("Digite novamente o salario: ");
            wage = input.nextDouble();
        }
        if (wage > 0){
            System.out.println("Salário válido ");
        }

        System.out.println("Digite (m) para masculino e (f)feminino");
        String sexo = input.next();
        if(sexo.equalsIgnoreCase("m")){
            System.out.println("Sexo masculino");
        }else if(sexo.equalsIgnoreCase("f")){
            System.out.println("Sexo feminino");
        }

        System.out.println("Digite uma letra correspondente ao seu estado civil");
        String estadoCivil = input.next();

        switch (estadoCivil){
            case "s" : System.out.println("Solteiro"); break;
            case "c" : System.out.println("casado"); break;
            case "v" : System.out.println("sei lá"); break;
            case "d" : System.out.println("divorciado"); break;
        }

    }
}
