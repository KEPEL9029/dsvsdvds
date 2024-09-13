public class Main {
    public static void main(String[] args) {
        Admin admin = new Admin("Евгений","Evgeniy@evgenia.com",25,"Админ\n");
        Seller first_seller = new Seller("Александр", "Aleksandr@aleksander.com", 18, "Продавец", "Сигарет нет", 200, 50);
        System.out.println();
        MainShop shop = new MainShop("Магазин 1", "Улица Ленина 1а", 0.0f, first_seller);

        System.out.println(first_seller.getValues());
        System.out.println();
        System.out.println(shop);

        shop.sellProduct(1000);  // Продано  товаров
        shop.buyProduct(1);  // КУплено  товаров

        System.out.println(shop);
    }
}
