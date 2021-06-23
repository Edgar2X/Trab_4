//Edgar Enthony Ferreira Lima

public class Main {
    public static void main(String[] args) throws ExcecaoDivisaoResultadoZero {
        Lista array1 = new Lista();  
        
        array1.setArrayANaPosicao(4,3);
        System.out.println(array1.getArrayA()[3]);

        try {
            array1.Calcula(2, 0);
        } catch(ArithmeticException e){
            System.out.println("Não é possivel dividir por zero!");
        }

        array1.CalculaDivisaoArray();

        }
}
 

