package com.anas.shape.strategy;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class CircleShapeStrategy implements ShapeStrategy{

    public CircleShapeStrategy(Circle c) {
        this.circle=c;
    }

    public static CircleShapeStrategy load(String strategyJson) throws IOException {
        ObjectMapper objectMapper= new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
        CircleShapeStrategy.Circle c= objectMapper.readValue(strategyJson, CircleShapeStrategy.Circle.class);
        return new CircleShapeStrategy(c);
    }
    public static class Circle{
        private int radius;

        public int getRadius() {
            return radius;
        }

        public void setRadius(int radius) {
            this.radius = radius;
        }
    }

    private CircleShapeStrategy.Circle circle;

    public Circle getCircle() {
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    @Override
    public Double area() {

        return 2*3.14*circle.radius;
    }

}
