public class MainShop {
    private String name;
    private String address;
    private float allRevenue;
    private Seller seller;

    public MainShop(String name, String address, float allRevenue, Seller seller) {
        this.name = name;
        this.address = address;
        this.allRevenue = allRevenue;
        this.seller = seller;
    }

    public void sellProduct(int quantity) {
        if (seller.getGoodsProduct() >= quantity) {
            seller.decreaseGoodsProduct(quantity);
            float revenue = quantity * 10.0f; //
            this.allRevenue += revenue;
            System.out.println("Продано " + quantity + " товаров. Прибыль: " + revenue);
        } else {
            System.out.println("Недостаточно товаров на складе.");
        }
    }

    public void buyProduct(int quantity) {
        seller.increaseGoodsProduct(quantity);
        System.out.println("Купил " + quantity + " продуктов.");
    }

    @Override
    public String toString() {
        return "Shop: " + name + "\nАдрес: " + address + "\nВся выручка: " + allRevenue;
    }
}
