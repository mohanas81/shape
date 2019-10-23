package com.anas.shape.controller;

import com.anas.shape.querybean.Shape;
import com.anas.shape.querybean.ShapeQueryBean;
import com.anas.shape.service.ShapeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("shape")
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class ShapeController {

    @Autowired
    ShapeService service;

    @GetMapping("/list")
    public List<Shape> list(){
        return service.getAll();

    }

    @PostMapping("calculate-area")
    public ResponseEntity<Double> calculateArea(@RequestBody ShapeQueryBean queryBean){
        return ResponseEntity.ok(service.calculateArea(queryBean));
    }


}
