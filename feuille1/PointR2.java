public class PointR2 {
    public double x;
    public double y;
    public PointR2(){ this.x=0; this.y=0; }
    public PointR2(double a, double b){ this.x=a; this.y=b; }
    public double distance(PointR2 p){
        double dx = x - p.x;
        double dy = y - p.y;
        return Math.sqrt(dx*dx + dy*dy);
    }
    public boolean equals(Object o){
        if (!(o instanceof PointR2)) return false;
        PointR2 p = (PointR2)o;
        return Double.compare(x,p.x)==0 && Double.compare(y,p.y)==0;
    }
    public String toString(){ return "(" + x + "," + y + ")"; }
}
