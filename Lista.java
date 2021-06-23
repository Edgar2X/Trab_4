public class Lista extends ExcecaoDivisaoResultadoZero{
    
    int a[] = new int[10];
    int b[] = new int[10];

    public int[] getArrayA(){
        return a;
    }
    
    public int[]getArrayB(){
        return b;
    }

    public void setArrayA(int[] a){
        this.a = a;
    }

    public void setArrayB(int[] b){
        this.b = b;
    }

    public void Calcula(int a, int b) throws ExcecaoDivisaoResultadoZero{
        int i = 2/3;
        if(i >= 1 ){
            System.out.println(i);
        }else{
            throw new ExcecaoDivisaoResultadoZero();
        }    
    }

    public void CalculaDivisaoArray(){
        
    }
}
