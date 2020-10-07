package bsu.rfe.java.group9.lab1.Nebyshinets.varC;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class MainApplication {

    public static void main(String[] args){
        Food[] breakfast = new Food[20];
        int breakfast_size = 0;

        for(String arg: args) {
            try {
                String[] parts = arg.split("/");
                Class currentClass = Class.forName("bsu.rfe.java.group9.lab1.Nebyshinets.varC." + parts[0]);
                Constructor currentConstructor = currentClass.getConstructor(String.class, String.class);
                breakfast[breakfast_size] = (Food) currentConstructor.newInstance(parts[1], parts[2]);
                breakfast_size++;
            } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
                System.out.println("К сожалению, в меню отсутствует данный продукт");
                //breakfast[breakfast_size] = null;
            }
        }

        for(Food dish: breakfast){
            if(dish != null){
                dish.consume();
            } else {
                break;
            }
        }

        System.out.println("Всего хорошего!");
    }
}
