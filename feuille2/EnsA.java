import java.util.ArrayList;
public class EnsA {
    private ArrayList<Integer> liste;
    public EnsA(){ liste = new ArrayList<Integer>(); }
    public EnsA(int a){ this(); add(a); }
    public EnsA(EnsA e){ this(); for(int i=0;i<e.liste.size();i++) liste.add(e.liste.get(i)); }
    public boolean isEmpty(){ return liste.isEmpty(); }
    public int cardinal(){ return liste.size(); }
    public boolean singleton(){ return liste.size()==1; }
    public String toString(){ return liste.toString(); }
    public boolean appartient(int a){ return liste.indexOf(Integer.valueOf(a))!=-1; }
    public void add(int a){ if (!appartient(a)) liste.add(Integer.valueOf(a)); }
    private void remove(int a){ Integer A = Integer.valueOf(a); liste.remove(A); }
    private int getE(int i){ return liste.get(i); }
    public EnsA union(EnsA e){
        EnsA r = new EnsA(this);
        for(int i=0;i<e.liste.size();i++) r.add(e.liste.get(i));
        return r;
    }
    public EnsA inter(EnsA e){
        EnsA r = new EnsA();
        for(int i=0;i<liste.size();i++){
            int v = liste.get(i);
            if (e.appartient(v)) r.add(v);
        }
        return r;
    }
    public EnsA diff(EnsA e){
        EnsA r = new EnsA();
        for(int i=0;i<liste.size();i++){
            int v = liste.get(i);
            if (!e.appartient(v)) r.add(v);
        }
        return r;
    }
    public boolean inclus(EnsA e){
        for(int i=0;i<liste.size();i++) if (!e.appartient(liste.get(i))) return false;
        return true;
    }
    public boolean equals(Object o){
        if (!(o instanceof EnsA)) return false;
        EnsA e = (EnsA)o;
        if (cardinal() != e.cardinal()) return false;
        for(int i=0;i<liste.size();i++) if (!e.appartient(liste.get(i))) return false;
        return true;
    }
}
