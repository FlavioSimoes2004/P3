public class Main {
    public static void main(String main[]){
        Motorista moto = new Motorista("Caio", 18, "HDJ3N74", 1000); //1000 = 1km
        Passageiro passa = new Passageiro("Joao", 19);
        moto.setPhone("9234873");
        passa.setPhone("6574832");
        passa.setDistance(1100); //900m

        passa.solicitarCorrida(moto);
    }
}