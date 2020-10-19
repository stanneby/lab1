package bsu.rfe.java.group9.lab1.Nebyshinets.varC;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

public class MainApplication {

    public static void main(String[] args){
        Vector<Food> breakfast = new Vector<Food>(0, 1);
        int breakfast_size = 0;

        boolean sort_flag = false;
        boolean calories_flag = false;

        for(String arg: args) {
            if(arg.equals("-calories")){ calories_flag = true; continue; }
            if(arg.equals("-sort")){ sort_flag = true; continue; }

            try {
                String[] parts = arg.split("/");
                Class currentClass = Class.forName("bsu.rfe.java.group9.lab1.Nebyshinets.varC.foods." + parts[0]);
                Class fillingClass1 = Class.forName("bsu.rfe.java.group9.lab1.Nebyshinets.varC.foods." + parts[1]);
                Constructor fillingConstructor1 = fillingClass1.getConstructor();
                if(parts.length > 2) {
                    Constructor currentConstructor = currentClass.getConstructor(Food.class, Food.class);
                    Class fillingClass2 = Class.forName("bsu.rfe.java.group9.lab1.Nebyshinets.varC.foods." + parts[2]);
                    Constructor fillingConstructor2 = fillingClass2.getConstructor();
                    breakfast.add( (Food) currentConstructor.newInstance(fillingConstructor1.newInstance()
                            , fillingConstructor2.newInstance()) );
                } else {
                    Constructor currentConstructor = currentClass.getConstructor(Food.class);
                    breakfast.add( (Food) currentConstructor.newInstance(fillingConstructor1.newInstance()) );
                }
                breakfast_size++;
            } catch (ClassNotFoundException | NoSuchMethodException e) {
                System.out.println("К сожалению, в меню отсутствует указанный продукт " + arg);
                //breakfast[breakfast_size] = null;
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }

        if(sort_flag){
            Collections.sort(breakfast, new Comparator<Food>() {
                @Override
                public int compare(Food o1, Food o2) {
                    return o2.toString().length() - o1.toString().length();
                }
            });
        }

        for(Food dish: breakfast){
            if(dish != null){
                dish.consume();
            } else {
                break;
            }
        }

        if(calories_flag){
            int calories = 0;
            for(Food dish: breakfast){
                calories += dish.calculateCalories();
            }
            System.out.println("Общая калорийность завтрака: " + calories + " Кл");
        }

        System.out.println("Всего хорошего!");
    }
}
