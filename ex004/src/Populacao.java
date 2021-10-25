public class Populacao {
    public static void main(String[] args){

        int populacaoPaisA = 80000;
        int populacaoPaisB = 200000;
        int count = 0;

        while (populacaoPaisA < populacaoPaisB){
            populacaoPaisA += (populacaoPaisA / 100) * 3;
            populacaoPaisB += (populacaoPaisB / 100) * 1.5;

            count++;

            System.out.println("A população é : " + populacaoPaisA);
            System.out.println("A população é : " + populacaoPaisB);
            System.out.println("Quantidade anos : " + count);
        }
    }
}
