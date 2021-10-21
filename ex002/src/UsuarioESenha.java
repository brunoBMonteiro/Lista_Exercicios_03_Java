import java.util.Scanner;

public class UsuarioESenha {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome de usuário: ");
        String nameUser = input.next();
        System.out.println("Digite sua senha de usuário: ");
        String userPassword = input.next();

        if(nameUser.equals(userPassword)){
            System.out.println("Usuário ou senha inválidos");
            while (nameUser.equals(userPassword)){
                System.out.println("Digite novamente sua senha");
                userPassword = input.next();
                if(nameUser.equals(userPassword)){
                    System.out.println("Senha invalida");
                }else {
                    System.out.println("Senha válida");
                }
            }
        } else {
            System.out.println("usuário válido");
        }

    }
}
