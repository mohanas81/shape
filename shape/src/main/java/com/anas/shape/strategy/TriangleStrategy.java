package com.anas.shape.strategy;


import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class TriangleStrategy implements ShapeStrategy {

    public static TriangleStrategy load(String strategyJson) throws IOException {
        ObjectMapper objectMapper= new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
        Triangle triangle= objectMapper.readValue(strategyJson,Triangle.class);
        return new TriangleStrategy(triangle);
    }

    public TriangleStrategy(Triangle triangle) {
        this.triangle = triangle;

    }

    @Override
    public Double area() {

        return triangle.base*triangle.height*0.5;
    }

    public static class Triangle{
            private int base;
            private int height;

        public int getBase() {
            return base;
        }

        public void setBase(int base) {
            this.base = base;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }
    }

    private Triangle triangle;


    public Triangle getTriangle() {
        return triangle;
    }

    public void setTriangle(Triangle triangle) {
        this.triangle = triangle;
    }
}
