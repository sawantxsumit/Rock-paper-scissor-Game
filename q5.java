
class cylinder
{
    private float radius;
    private float height;

    public cylinder(float radius, float height) {
        this.radius = radius;
        this.height = height;
    }

   
    public float getRadius() {
        return this.radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getHeight() {
        return this.height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

   
}

public class q5 {
    public static void main(String[] args) {
        cylinder c1 = new cylinder();
        c1.setRadius(10);
        c1.setHeight(15);
        System.out.println("height of the cylinder is "+c1.getHeight());
        System.out.println("height of the cylinder is "+c1.getRadius());

        
    }
}
