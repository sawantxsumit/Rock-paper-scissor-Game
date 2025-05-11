class circle
{
    double radius;
    double perimeter;
    double area;

    public circle(float r)
    {
        this.radius=r;
    }
    protected double getPerimeter() {
        perimeter=2*radius*3.14;
        return this.perimeter;
    }
    protected double getArea() {
        area=radius*radius*3.14;
        return this.area;
    }  
}

class cylinder extends circle
{
    double total_surfacearea;
    double curved_surfacearea;
    double hieght;

    public cylinder(int r , int h)
    {
        super(r);
        this.hieght=h;
    }
    public double getTotal_surfacearea() {
        total_surfacearea= 2*3.14*radius*(radius+hieght);
        return this.total_surfacearea;
    }

    public double getCurved_surfacearea() {
        curved_surfacearea= 2*3.14*radius*hieght;
        return this.curved_surfacearea;
    }

}


public class q6 {
    public static void main(String[] args) {
        circle a= new circle(10);
        cylinder b= new cylinder(10,14);

        System.out.println(a.getArea());
        System.out.println(a.getPerimeter());

        System.out.println(b.getCurved_surfacearea());
        System.out.println(b.getTotal_surfacearea());
        

    }
}
