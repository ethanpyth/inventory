public class Product {
    //Déclaration de champ d'instance
    private String name;
    private int number;
    private int stockUnit;
    private int unitPrice;

    //creation d'un Produit par défault
    public Product() {
        this.name = "";
        this.number = 0;
        this.stockUnit = 0;
        this.unitPrice = 0;
    }

    /**
     * @param names
     * @param numbers
     * @param stockUnits
     * @param unitPrices
     */
    //création d'un produit
    public Product(String names, int numbers, int stockUnits, int unitPrices) {
        this.name = names;
        this.number = numbers;
        this.stockUnit = stockUnits;
        this.unitPrice = unitPrices;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getStockUnit() {
        return stockUnit;
    }

    public void setStockUnit(int stockUnit) {
        this.stockUnit = stockUnit;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Numéro de l'article : " + this.number + "\n" +
                "Nom                : " + this.name + "\n" +
                "Quantité en stock  : " + this.stockUnit + "\n" +
                "Prix               : " + this.unitPrice;
    }
}
