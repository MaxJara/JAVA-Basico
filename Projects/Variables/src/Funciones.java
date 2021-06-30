public class Funciones {
    public static void main(String[] args) {
        double y = 3;
        //Area de un circulo
        //pi * r2
        circleArea(y);

        //Area de una esfera
        //4*PI*r2
        sphereArea(y);

        //Volumen de una esfera
        //(4/3) * pi * r3
        sphereVolumen(y);

        System.out.println("PESOS A DOLARES: "+ converToDolar(200, "MXN"));


    }
    /**
     * Descripcion: Funcion que te da el area del circulo
     *
     * @param r Radio del circulo
     * @return Devuelve el are del circulo
     * */
    public static double circleArea(double r){
        return Math.PI * Math.pow(r,2);
    }

    /**
     * Descripcion: Funcion que te da el area de la esfera
     *
     * @param r Radio de la esfera
     * @return Devuelve el area de la esfera
     * */
    public static double sphereArea(double r){
        return 4 * Math.PI * Math.pow(r,2);
    }

    /**
     * Descripcion: Funcion que te da el volumen de la esfera
     *
     * @param r Radio de la esfera
     * @return Devuelve el volumen de la esfera
     * */
    public static double sphereVolumen(double r){
        return  (4/3) * Math.PI * Math.pow(r,3);
    }

    /**
     * Descripcion: Funcion que especificando su moneda convierte una cantidad de dinero a dolares
     *
     * @param quantity Cantidad de dinero
     * @param currency Tipo de Moneda: Solo acepta MXN o COP
     * @return quantity Devuelve la cantidad actualizada en dolares
     * */
    public static double converToDolar (double quantity, String currency) {
        //MXN
        switch (currency) {
            case "MXN":
                quantity = quantity * 0.052;
                break;
            case "COP":
                quantity = quantity * 0.00031;
                break;
        }
        return quantity;
    }

}
