package boxWithFruits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Класс Box в который можно складывать фрукты, коробки условно сортируются по типу фрукта,
 * поэтому в одну коробку нельзя сложить и яблоки, и апельсины.
 */
public class Box<T extends Fruit> {
    private List<T> fruitList;

    public Box() {
        this.fruitList = new ArrayList<>();
    }

    public Box(T fruits) {
        this.fruitList = new ArrayList<>(Arrays.asList(fruits));
    }


    /**
     * Метод добавления фрукта в коробку.
     */
    public void dropFruit(T fruit) {
        fruitList.add(fruit);
    }

    /**
     * Метод getWeight() который высчитывает вес коробки, зная количество фруктов и вес одного фрукта.
     */
    public float getWeight() {
        float w = 0.0f;
        for (T fruit : fruitList) {
            w += fruit.getWeight();
        }
        return w;
    }

    /**
     * Метод compare который позволяет сравнить текущую коробку с той,
     * которую подадут в compare в качестве параметра, true - если их веса равны,
     * false в противном случае(коробки с яблоками мы можем сравнивать с коробками с апельсинами).
     */
    public boolean compare(Box<?> another) {
        return Math.abs(this.getWeight() - another.getWeight()) < 0.00001;
    }


    /**
     * Метод, который позволяет пересыпать фрукты из текущей коробки в другую коробку
     * (помним про сортировку фруктов, нельзя яблоки высыпать в коробку с апельсинами),
     * соответственно в текущей коробке фруктов не остается, а в другую перекидываются объекты,
     * которые были в этой коробке.
     */
    public void transfer(Box<? super T> another) {
        if (another == this) {
            return;
        }
        another.fruitList.addAll(this.fruitList);
        this.fruitList.clear();
    }

}
