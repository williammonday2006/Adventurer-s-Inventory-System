public class Main {
    public static void main(String[] args) {
        Item sword = new Item("Iron Sword", 3.5);
        Item potion = new Item("Health Potion", 0.5);

        Bag pouch = new Bag("Belt Pouch", 0.5);
        pouch.add(sword);
        pouch.add(potion);

        pouch.displayInfo();
        System.out.println("Total weight: " + pouch.getWeight() + " lbs");
    }
}
