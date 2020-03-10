import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] arg){

        boolean kondisi = true;
    do{

        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Masukkan Nama Pembeli : ");
        String namaPembeli = inputScanner.nextLine();

        System.out.print("Masukkan Alamat Pembeli : ");
        String alamatPembeli = inputScanner.nextLine();
        Customer customer1 = new Customer(namaPembeli, alamatPembeli);

        
        System.out.print("Masukkan Nama Barang : ");
        String namaBarang = inputScanner.nextLine();

        System.out.print("Masukkan Harga Barang : ");
        int hargaBarang = inputScanner.nextInt();

        System.out.print("Masukkan Jumlah Barang : " );
        int jumlahBarang = inputScanner.nextInt();

        Order order1 = new Order(namaBarang, hargaBarang, jumlahBarang);
        customer1.order(order1);


        System.out.print("Lanjut ? (Y/T) : ");
        String kondisiInput = inputScanner.next();

        if (kondisiInput.equalsIgnoreCase("y")){
            kondisi = true;
        
        } else{
            kondisi = false;
        
      }
}while(kondisi);

}
}


class Customer{

        private String place_order;
        private String know_name;
        private String know_address;
        private String know_castomer;
        private String order_history;
    
        public Customer(String know_name, String know_address){
            this.know_name = know_name;
            this.know_address = know_address;
        }
        public void order(Order order){
            order.orderItemsDetail();
        }
    }
        class Order{
    
    private String Know_placement_date;
    private String delivery_date;
    private String order_items;
    private int amount;
    private int total;
    private int price_items;
    private String applicable_taxes;
    private String order_number;

    public Order(String order_items, int price_items, int amount){
        this.order_items = order_items;
        this.price_items = price_items;
        this.amount = amount;

    }
    public void orderItemsDetail(){
        total = price_items * amount;

        System.out.println("********** Pesan Kamu Bro ***********");
        System.out.println("********** Terima Kasih Jangan **********");
        System.out.println("name item : " + order_items);
        System.out.println("price item : " + price_items);
        System.out.println("amount item : " + amount);
        System.out.println("total : " + total);
        
    }
}

    