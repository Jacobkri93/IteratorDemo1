package dk.kea;

public class Client {

    public static void main(String[] args) {

        Item bread = new Item("Bread", 175);
        Item meat = new Item("Meat", 0); //Vegan only??
        Item milk = new Item("Milk", 500);



        Inventory inventory = new Inventory(bread, meat, milk);
        StockIterator stockIterator = inventory.iterator();


        while(stockIterator.hasNext()){
            Item item = stockIterator.next();
            System.out.println(item.getName()+ ": " + item.getQuantity());
        }

    }
}
