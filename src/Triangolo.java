public class Triangolo {
    private float b;
    private float h;

    public Triangolo(float b, float h) {
        this.b = b;
        this.h = h;
    }

    public float getB() {
        return b;
    }

    public float getH() {
        return h;
    }

    public void setB(float b) {
        this.b = b;
    }

    public void setH(float h) {
        this.h = h;
    }

    @Override
    public String toString() {
        return "Triangolo{" +
                "b=" + b +
                ", h=" + h +
                '}';
    }
}
