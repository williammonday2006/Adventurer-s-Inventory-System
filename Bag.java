import java.util.ArrayList;

public class Bag extends InventoryComponent {
    private String name;
    private double baseWeight;
    private ArrayList<InventoryComponent> items;

    public Bag(String name, double baseWeight) {
        this.name = name;
        this.baseWeight = baseWeight;
        items = new ArrayList<>();
    }

    @Override
    public void add(InventoryComponent component) {
        items.add(component);
    }

    @Override
    public void remove(InventoryComponent component) {
        items.remove(component);
    }

    @Override
    public InventoryComponent getChild(int i) {
        return items.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getWeight() {
        double totalWeight = baseWeight;
        for (InventoryComponent item : items) {
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }

    @Override
    public void displayInfo() {
        System.out.println(name + " - Base weight: " + baseWeight + " lbs");
        for (InventoryComponent item : items) {
            System.out.print("  ");
            item.displayInfo();
        }
    }
}
