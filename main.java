//Edgar Enthony Ferreira Lima

public class Main {
    public static void main(String[] args) throws ExcecaoDivisaoResultadoZero {
        Lista array1 = new Lista();  
        
        array1.setArrayANaPosicao(19,0);
        array1.setArrayANaPosicao(10,1);
        array1.setArrayANaPosicao(11,2);
        array1.setArrayANaPosicao(13,3);
        array1.setArrayANaPosicao(15,4);
        array1.setArrayANaPosicao(21,5);
        array1.setArrayANaPosicao(14,6);
        array1.setArrayANaPosicao(17,7);
        array1.setArrayANaPosicao(16,8);
        array1.setArrayANaPosicao(18,9);

        array1.setArrayBNaPosicao(1,0);
        array1.setArrayBNaPosicao(3,1);
        array1.setArrayBNaPosicao(2,2);
        array1.setArrayBNaPosicao(7,3);
        array1.setArrayBNaPosicao(1,4);
        array1.setArrayBNaPosicao(14,5);
        array1.setArrayBNaPosicao(6,6);
        array1.setArrayBNaPosicao(7,7);
        array1.setArrayBNaPosicao(8,8);
        array1.setArrayBNaPosicao(11,9);

        try {
            //array1.Calcula(2, 0);
            array1.CalculaDivisaoArray();
        } catch(ArithmeticException e){
            System.out.println("Não é possivel dividir por zero!");
        } finally{
           
        }

        

        }
}
 

