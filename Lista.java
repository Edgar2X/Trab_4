public class Lista extends ExcecaoDivisaoResultadoZero{
    
    int a[] = new int[10];
    int b[] = new int[10];
    int x;

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
        this.x = x;
        this.a[p] = x;
    }

    public void setArrayBNaPosicao(int x, int p){
        this.x = x;
        this.b[p] = x;
    }

    public void Calcula(int a, int b) throws ExcecaoDivisaoResultadoZero{
        this.a[a] = a;
        this.b[b] = b;

        int i = a/b;

        if(i >= 1 ){
            System.out.println(i);
        }else{
            throw new ExcecaoDivisaoResultadoZero();
        }    
    }

    public void CalculaDivisaoArray() throws ExcecaoDivisaoResultadoZero{
        int s = 1;
        while (s< 10 ){
            Calcula(s, s);
            System.out.println(s);
            s++;
        }
    }
}
