public class ProdPot {
    public static int prodI(int n){
        n = Math.abs(n);
        if (n==0) return 0;
        int p = 1;
        while (n>0){ p *= (n%10); n /= 10; }
        return p;
    }
    public static int prodR(int n){
        n = Math.abs(n);
        if (n<10) return n;
        return (n%10) * prodR(n/10);
    }
    public static int potI(int n){
        n = Math.abs(n);
        if (n<10) return 1;
        int count = 1;
        int cur = n;
        while (cur >= 10){
            cur = prodI(cur);
            count++;
        }
        return count;
    }
    public static int potR(int n){
        n = Math.abs(n);
        if (n<10) return 1;
        return 1 + potR(prodR(n));
    }
    public static int maxPot(int n){
        int best = 0;
        for (int i=0;i<=n;i++){
            int p = potI(i);
            if (p > best) best = p;
        }
        return best;
    }
    public static void main(String[] args){
        System.out.println("prodI(77)="+prodI(77)+" prodR(77)="+prodR(77));
        System.out.println("potI(77)="+potI(77)+" potR(77)="+potR(77));
        System.out.println("maxPot(1000)="+maxPot(1000));
    }
}
