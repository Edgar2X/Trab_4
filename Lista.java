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
        this.a[p] = x;
    }

    public void setArrayBNaPosicao(int x, int p){
        this.b[p] = x;
    }

    public void Calcula(int a, int b) throws ExcecaoDivisaoResultadoZero{
        
        int i = a/b;
        if(i >= 1 ){
            System.out.println(i);
        }else{
            throw new ExcecaoDivisaoResultadoZero();
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
