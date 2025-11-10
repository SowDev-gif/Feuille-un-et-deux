// Simple static ABR implementation using array of nodes
class Noeud { public int val, g, d; public Noeud(int v){ val=v; g=0; d=0; } }
public class AbrStatic {
    private static Noeud[] TabAbr = new Noeud[100]; // simple fixed size
    private static int next = 1;
    public static void inserI(int[] t){
        if (t.length==0) return;
        TabAbr[1] = new Noeud(t[0]); next = 2;
        for (int i=1;i<t.length;i++){
            int cur = 1;
            while (true){
                if (t[i] < TabAbr[cur].val){
                    if (TabAbr[cur].g==0){ TabAbr[cur].g = next; TabAbr[next++] = new Noeud(t[i]); break; }
                    else cur = TabAbr[cur].g;
                } else {
                    if (TabAbr[cur].d==0){ TabAbr[cur].d = next; TabAbr[next++] = new Noeud(t[i]); break; }
                    else cur = TabAbr[cur].d;
                }
            }
        }
    }
    private static void affichR(int racine){
        if (racine==0) return;
        affichR(TabAbr[racine].g);
        System.out.print(TabAbr[racine].val + " ");
        affichR(TabAbr[racine].d);
    }
    public static void main(String[] args){
        int[] Tab = {20,10,45,30,5,15};
        inserI(Tab);
        affichR(1);
        System.out.println();
    }
}
