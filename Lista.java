public class Lista extends ExcecaoDivisaoResultadoZero{
    
    int a[] = new int[10];
    int b[] = new int[10];

    public int[] getArrayA(){
        return a;
    }
    
    public int[] getArrayB(){
        return b;
    }

    public void setArrayA(int[] a){
        this.a = a;
    }

    public void setArrayB(int[] b){
        this.b = b;
    }

    public void setArrayANaPosicao(int x, int p){   
        if (p <10){
            this.a[p] = x;
        }else{
            System.out.println("Posição ultrapassa tamanho definido");
        }
    }

    public void setArrayBNaPosicao(int x, int p){
        if (p <10){
            this.b[p] = x;
        }else{
            System.out.println("Posição ultrapassa tamanho definido");
        }
    }

    public void Calcula(int a, int b) throws ExcecaoDivisaoResultadoZero{
        try{
            int i = a/b;
            if(i >= 1 ){
                System.out.println(i);
            }else{
                throw new ExcecaoDivisaoResultadoZero();
            }
        }catch(ArithmeticException e){
            System.out.println("Não é possivel dividir por zero!");
        }catch(ExcecaoDivisaoResultadoZero e){
            System.out.println("Valor igual a zero!");
        }
    }


    public void CalculaDivisaoArray() throws ExcecaoDivisaoResultadoZero{
        int s = 0;
        while (s <= 9 ){
            int a = this.a[s];
            int b = this.b[s];
            Calcula(a, b);
            s++;
        }
    }
}
