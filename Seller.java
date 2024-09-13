public class Seller extends Admin {
    private String NameShop;
    private int quantity_product;
    private int goods;

    public Seller(String name, String Email, int age, String status, String NameShop, int quantity_product, int goods) {
        super(name, Email, age, status);
        this.NameShop = NameShop;
        this.quantity_product = quantity_product;
        this.goods = goods;
    }

    @Override
    public String getValues() {
        String adminInfo = super.getValues();
        String sellerInfo = "\nМагазин: " + this.NameShop + "\nКоличество товаров: " + this.quantity_product + "\nТоваров на складе: " + this.goods;
        return adminInfo + sellerInfo;
    }

    public int getGoodsProduct() {
        return this.goods;
    }

    public void decreaseGoodsProduct(int quantity) {
        if (this.goods >= quantity) {
            this.goods -= quantity;
        }
    }

    public void increaseGoodsProduct(int quantity) {
        this.goods += quantity;
    }


}
