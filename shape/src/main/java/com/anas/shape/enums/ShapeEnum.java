package com.anas.shape.enums;

public enum ShapeEnum {
    CIRCLE_ENUM("CIRCLE", 1),
    TRIANGLE("TRIANGLE",2);

    private int id;
    private String name;

    private ShapeEnum(String name,int id){
        this.name=name;
        this.id=id;
    }

    public static ShapeEnum getEnum(Integer id) {

        if (id == null) {
            return null;
        }
        for (ShapeEnum de : ShapeEnum.values())
            if (de.getId() == id) {
                return de;
            }
        return null;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
