package com.anas.shape.service;

import com.anas.shape.querybean.Shape;
import com.anas.shape.querybean.ShapeQueryBean;
import com.anas.shape.repo.ShapeRepository;
import com.anas.shape.strategy.ShapeStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShapeService {

    @Autowired
    ShapeRepository repo;
    public Double calculateArea(ShapeQueryBean queryBean){
        ShapeStrategy strategy = ShapeStrategy.create(queryBean.getCategoryId(),queryBean.getRequirement());
        return strategy.area();

    }

    public void save(Shape s){

    }

    public List<Shape> getAll(){
        return repo.query();
    }
}
