public class Usuario {

    public static void main (String[] args) throws java.lang.Exception {
        SmartTv tv = new SmartTv();

        //System.out.println("A TV está ligada? " + tv.ligada );
        //System.out.println("Volume da TV: " + tv.volume );
        //System.out.println("Canal da TV: " + tv.canal );

        tv.ligar();
        System.out.println("A TV está ligada? " + tv.ligada );

        tv.desligar();
        System.out.println("A TV está ligada? " + tv.ligada );

        tv.aumentarCanal();
        tv.aumentarCanal();
        tv.aumentarCanal();
        tv.aumentarCanal();
        tv.aumentarCanal();
        tv.diminuirCanal();
        //System.out.println("Canal da TV: " + tv.canal );

        tv.aumentarVolume();
        System.out.println("Volume da TV: " + tv.volume );

        tv.mudarCanal(15);
        System.out.println("Canal da TV: " + tv.canal);


    }
}
