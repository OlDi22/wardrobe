public class Main {
    public static void main(String[] args) {

        Thing shirt = new Thing(19, 0);
        Thing shoes = new Thing(41, 32);
        Thing business_suit = new Thing(53, 44);
        Thing hat = new Thing(25, 37);
        Thing coat = new Thing(70, 77);

        Bill billShirt = new Bill(shirt, 1);
        Bill billShoes = new Bill(shoes, 1);
        Bill billBusiness_suit = new Bill(business_suit, 1);
        Bill billHat = new Bill(hat, 1);
        Bill billCoat = new Bill(coat, 1);


        System.out.println("Общая стоимость вещей:  " + (billShirt.getAllSumm() + billCoat.getAllSumm() +
                billHat.getAllSumm() + billBusiness_suit.getAllSumm() + billShoes.getAllSumm()));

        

    }


}
