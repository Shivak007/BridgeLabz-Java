package javacollectionsandstreams.javagenerics;
import java.util.*;

abstract class WarehouseItem {
    private String name;

    WarehouseItem(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    abstract String getCategory();
}

class FurnitureItem extends WarehouseItem {

    FurnitureItem(String name) {
        super(name);
    }

    @Override
    String getCategory() {
        return "Furniture";
    }
}

class ElectronicsItem extends WarehouseItem {

    ElectronicsItem(String name) {
        super(name);
    }

    @Override
    String getCategory() {
        return "Electronics";
    }
}

class GroceryItem extends WarehouseItem {

    GroceryItem(String name) {
        super(name);
    }

    @Override
    String getCategory() {
        return "Groceries";
    }
}

class WarehouseStorage<T extends WarehouseItem> {

    private List<T> items = new ArrayList<>();

    void addItem(T item) {
        items.add(item);
    }

    List<T> getItems() {
        return items;
    }

    static void displayItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            System.out.println(item.getName() + " (" + item.getCategory() + ")");
        }
    }
}


public class SmartWarehouse {

    public static void main(String[] args) {

        WarehouseStorage<ElectronicsItem> electronicsStorage =
                new WarehouseStorage<>();
        WarehouseStorage<GroceryItem> groceryStorage =
                new WarehouseStorage<>();
        WarehouseStorage<FurnitureItem> furnitureStorage =
                new WarehouseStorage<>();

        electronicsStorage.addItem(new ElectronicsItem("Laptop"));
        electronicsStorage.addItem(new ElectronicsItem("Mobile Phone"));

        groceryStorage.addItem(new GroceryItem("Rice"));
        groceryStorage.addItem(new GroceryItem("Milk"));

        furnitureStorage.addItem(new FurnitureItem("Chair"));
        furnitureStorage.addItem(new FurnitureItem("Table"));

        System.out.println("*** Electronics Items ***");
        WarehouseStorage.displayItems(electronicsStorage.getItems());

        System.out.println("\n*** Grocery Items ***");
        WarehouseStorage.displayItems(groceryStorage.getItems());

        System.out.println("\n*** Furniture Items ***");
        WarehouseStorage.displayItems(furnitureStorage.getItems());
    }
}

