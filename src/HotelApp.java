// Client Class
public class HotelApp {
    public static void main(String[] args) {
        Cart cart = new Cart();
        HouseKeeping hk = new HouseKeeping();
        Valet valet = new Valet();

        FrontDesk fd = new FrontDesk(cart, hk, valet);

        fd.requestCart(4);
        fd.requestHouseKeeping("123");
        fd.requestValet("ABC 123");
    }
}
