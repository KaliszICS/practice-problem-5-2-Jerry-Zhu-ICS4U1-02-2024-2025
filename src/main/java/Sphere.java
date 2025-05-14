public class Sphere extends Circle{
    public Sphere(double radius){
        super(radius);
    }

    @Override
    public double area(){
        return Math.pow(radius, 2)*Math.PI*4;
    }

    public double volume(){
        return Math.pow(radius, 3)*Math.PI*4.0/3.0;
    }
}
