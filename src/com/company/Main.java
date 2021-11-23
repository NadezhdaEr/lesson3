public class Main {

    public static void main(String[] args) {
        int[] G = new int[20];
        int sum = 0;
        for (int i = 0; i < G.length; i++) {
            G[i] = new Random().nextInt();
            System.out.println(i);
            System.out.println(G[i]);
        }
        for (int i = 0; i < G.length; i++)
            sum = sum + G[i];
        System.out.println("Сумма");
        System.out.println(sum);
        if((sum%2)==0)
            System.out.println("ЧЕТНО");
        else
            System.out.println("НЕЧЕТНО");
    }
    //private static float getAvr(int g1, int g2, int g3, int g4, int g5, int g6, int g7, int g8, int g9, int g10, int g11, int g12, int g13, int g14, int g15, int g16, int g17, int g18, int g19, int g20)
    //   {
    //        return (g1 + g2 + g3 + g4 + g5 + g6 + g7 + g8 + g9 + g10 + g11 + g12 + g13 + g14 + g15 + g16 + g17 + g18 + g19 + g20);
    //    }
    //        return (g1 + g2 + g3 + g4 + g5 + g6 + g7 + g8 + g9 + g10 + g11 + g12 + g13 + g14 + g15 + g16 + g17 + g18 + g19 + g20) / 2;
}
