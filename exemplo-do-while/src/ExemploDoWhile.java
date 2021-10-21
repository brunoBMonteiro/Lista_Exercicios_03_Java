public class ExemploDoWhile {
    public static void main(String[] srgs){
        int i = 0;
        int max = 10;

        while (i < 10){
            i++;
            System.out.println(i);
        }

        do {
            i++;
            System.out.println(i);
        } while(i < 20);
            System.out.println("O valor de i: " + i);

    }
}
