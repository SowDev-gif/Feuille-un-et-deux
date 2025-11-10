public class Rectangle {
    public PointR2 ext1;
    public PointR2 ext2;
    public Rectangle(){ ext1 = new PointR2(0,0); ext2 = new PointR2(0,0); }
    public Rectangle(PointR2 p, PointR2 q){ ext1 = p; ext2 = q; }
    public Rectangle(PointR2 cig, double l, double h){
        ext1 = cig;
        ext2 = new PointR2(cig.x + l, cig.y + h);
    }
    public double longueur(){ return Math.abs(ext2.x - ext1.x); }
    public double hauteur(){ return Math.abs(ext2.y - ext1.y); }
    public double perimetre(){ return 2*(longueur()+hauteur()); }
    public double surface(){ return longueur()*hauteur(); }
    public boolean contient(PointR2 p){
        double x1 = Math.min(ext1.x, ext2.x), x2 = Math.max(ext1.x, ext2.x);
        double y1 = Math.min(ext1.y, ext2.y), y2 = Math.max(ext1.y, ext2.y);
        return p.x >= x1 && p.x <= x2 && p.y >= y1 && p.y <= y2;
    }
    public Rectangle symetrique(){
        // symmetry wrt first diagonal: swap x and y for points relative to origin
        PointR2 s1 = new PointR2(ext1.y, ext1.x);
        PointR2 s2 = new PointR2(ext2.y, ext2.x);
        return new Rectangle(s1,s2);
    }
    public String toString(){ return "Rect["+ext1+","+ext2+"]"; }
}
