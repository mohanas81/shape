package com.anas.shape.strategy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public interface ShapeStrategy {
    static ShapeStrategy create(Integer strategyType, String strategyString){
        ShapeStrategy.Type type= ShapeStrategy.Type.getByIndex(strategyType);
        try{
            Method loadMethod= type.shapeStrategyClass.getMethod("load",String.class);
            ShapeStrategy schemeStrategy = (ShapeStrategy)loadMethod.invoke(null, strategyString);
            return schemeStrategy;
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }

    enum Type{
        CIRCLE_SHAPE_STRATEGY(1,CircleShapeStrategy.class),
        TRIANGLE_SHAPE_STRATEGY(2,TriangleStrategy.class);

        private int index;
        private Class<? extends ShapeStrategy> shapeStrategyClass;

        public int getIndex() {
            return index;
        }

        public Class<? extends ShapeStrategy> getShapeStrategyClass() {
            return shapeStrategyClass;
        }

        Type(int index,Class<? extends ShapeStrategy> shapeStrategyClass){
            this.index= index;
            this.shapeStrategyClass=shapeStrategyClass;
        }

        public static ShapeStrategy.Type getByIndex(int index){
            for(ShapeStrategy.Type type:ShapeStrategy.Type.values()){
                if(type.getIndex()==index){
                    return type;
                }
            }
            return null;
        }

    }

    Double area();
}
