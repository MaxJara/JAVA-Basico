public class Ejercicio2 {
    public static void main(String[] args) {

        char c = 'z';
        int i1 = 250;
        double d1 = 301.067;
        int i2 = 100;
        int i3 = 737;
        double d2 = 298.638;


        int cI = (int) c;
        short iS = (short)i1;
        long iL = iS;
        long dL = (long)d1;
        float iF = (float)i2;
        byte iB = (byte)i3;
        long d2L = (long) d2 / 25;

        System.out.println(cI);
        System.out.println(iS);
        System.out.println(iL);
        System.out.println(iL);
        System.out.println(dL);
        System.out.println(iF+5000.66);
        System.out.println(iB*100);
        System.out.println(d2L);
    }

}

