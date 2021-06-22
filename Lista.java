public class Lista {
    
    double a[] = new double[10];
    double b[] = new double[10];

    public double[] getArrayA(){
        return a;
    }
    
    public double[] getArrayB(){
        return b;
    }

    public void setArrayA(double a){
        this.a[1] = a;
    }

    public void setArrayB(double[] b){
        this.b = b;
    }
}
