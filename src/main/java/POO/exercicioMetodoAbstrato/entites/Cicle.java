package POO.exercicioMetodoAbstrato.entites;

import POO.exercicioMetodoAbstrato.entites.enums.Color;

public class Cicle extends Shape{
    private Double radius;

    public Cicle() {
        super();
    }

    public Cicle(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double area() {
        return Math.PI * radius * radius;
    }

}
