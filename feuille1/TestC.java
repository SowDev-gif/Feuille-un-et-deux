public class TestC {
    private double var1;
    private int var2;
    public TestC(){ var1=0; var2=0; }
    public String toString(){ return var1+" "+var2; }
    public void F(TestC t){ var1=t.var1+2.5; var2=t.var2+1; }
    public static void G(int v){ v=5; }
    public static void H(TestC t, double x){ x=t.var1; t.var2=3; }
    public static void main(String[] arg){
        int u=1;
        double y=3.1;
        TestC t1= new TestC();
        TestC t2= new TestC();
        t1.F(t2);
        G(u);
        H(t2,y);
        System.out.println(u);
        System.out.println(y);
        System.out.println(t1);
        System.out.println(t2);
    }
}
