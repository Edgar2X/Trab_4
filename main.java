//Edgar Enthony Ferreira Lima

public class Main {
    public static void main(String[] args) throws ExcecaoDivisaoResultadoZero {
        Lista array1 = new Lista();  
        
        try {
            array1.Calcula(2, 3);
        } catch(ArithmeticException e){
            System.out.println("Não é possivel dividir por zero!");
        }

        }
}
 

