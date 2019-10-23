package com.anas.shape.repo;

import com.anas.shape.querybean.Shape;

import java.util.List;

public interface ShapeRepository {
    void insert(Shape s);
    List<Shape> query();
}
