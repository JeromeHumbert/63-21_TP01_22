public class Test {
    /* Variables de tests */
    private static final int NB_MAX = 100;
    private static final int NB1 = 15;
    private static final int NB2 = 9;


    public static void main(String[] args) {
        System.out.println("--------- Ex 1 ---------");
        Exercice1.fibonacci(NB_MAX);
        System.out.println();
        System.out.println("--------- Ex 2 ---------");
        Exercice2.ppcm(NB1,NB2);
        System.out.println();
        System.out.println("--------- Ex 3 ---------");
        Exercice3.escapeRoom();
    }
}
