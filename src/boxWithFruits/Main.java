package boxWithFruits;

public class Main {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();
        Box<Apple> appleBox1 = new Box<>();
        Box<Orange> orangeBox = new Box<>();
        orangeBox.dropFruit(new Orange());
        orangeBox.dropFruit(new Orange());
        appleBox.dropFruit(new Apple());
        appleBox.dropFruit(new Apple());
        appleBox.dropFruit(new Apple());

        appleBox1.dropFruit(new Apple());
        appleBox1.dropFruit(new Apple());
        appleBox1.dropFruit(new Apple());
        appleBox1.dropFruit(new Apple());
        appleBox1.dropFruit(new Apple());
        appleBox1.dropFruit(new Apple());


        System.out.println(appleBox1.getWeight());
        System.out.println(appleBox.getWeight());
        appleBox.transfer(appleBox1);
        System.out.println(appleBox1.getWeight());
        System.out.println(appleBox.getWeight());

        System.out.println(appleBox.getWeight());
        System.out.println(orangeBox.getWeight());

        System.out.println(appleBox.compare(orangeBox));
    }
}
