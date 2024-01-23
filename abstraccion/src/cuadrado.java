public class cuadrado extends numeroabstracto {
    public int number;
    //metodo abstracto heredado
    @Override
    public int obtenernumero(int number){
        return number;
    }

    public int cuadradonumero(int number) {
        return number * number;
    }
}