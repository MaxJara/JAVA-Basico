public class Casting {
    public static void main(String[] args) {

        //En un a;o ubicar 30 perritos
        //Cuantos perritos ubique al mes

        double monthlyDogs = 30.0/12.0;
        System.out.println(monthlyDogs);

        //ESTIMACION
        int estimatedMontlyDogs = (int) monthlyDogs;
        System.out.println(estimatedMontlyDogs);

        //EXACTITUD
        int a = 30;
        int b = 12;

        System.out.println((double) a/b);
    }
}
