package dk.kea;

public class Main {

    public static void main(String[] args) {

        Item bread = new Item("bread", 175);
        Item meat = new Item("meat", 0); //Veganonly??
        Item milk = new Item("milk", 500);

        Inventory inventory = new Inventory(bread, meat, milk);

        StockIterator stockIterator = inventory.iterator();

        while(stockIterator.hasNext()){
            Item item = stockIterator.next();
            System.out.println(item.getName());
        }


    }
}
