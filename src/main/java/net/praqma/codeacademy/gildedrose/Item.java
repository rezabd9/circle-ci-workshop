package net.praqma.codeacademy.gildedrose;

public class Item {

    public String name;

    public int sellIn;

    public int quality;
    public int price;

    public Item(String name, int sellIn, int quality,int price) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
        this.price=price;
    }

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality+ ", " + this.price;
    }
}
