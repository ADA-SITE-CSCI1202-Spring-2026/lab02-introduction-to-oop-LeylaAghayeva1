package geometry;

public class segment {
    private point p1;
    private point p2;
    public segment(point p1, point p2){
        this.p1=p1;
        this.p2=p2;
    }
    public segment(float x1,float y1, float x2, float y2){
        this.p1=new point(x1, y1);
        this.p2=new point(x2, y2);
    }

    public point getP1(){
        return this.p1;
    }

     public point getP2(){
        return this.p2;
    }

    public void setp1(point p){
        this.p1=p;
    }

    public void setp2(point p){
        this.p2=p;
    }
}
