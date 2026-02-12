package geometry;

public class point {
    private float x;
    private float y;
    public point() {
        x=0f;
        y=0f;
    }

    public point(float x, float y){
        this.x=x;
        this.y=y;
    }

    public point(point p){
        this.x=p.x;
        this.y=p.y;
    }

    public float getx(){
        return this.x;
    }

    public float gety(){
        return this.y;
    }

    public void setX(float x){
        this.x=x;
    }
}
