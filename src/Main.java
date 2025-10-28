/**
 *  Kelas Event merupakan turunan dari BaseEvent dan mengimplementasikan Ticketable.
 *  Kelas ini menambahkan logika untuk menampilkan informasi event
 */
class Event extends BaseEvent implements Ticketable {
    public static final double DISCOUNT_RATE = 0.15;

    /**
     * Membuat objek event baru
     *
     * @param name nama event
     * @param date tanggal event
     * @param price harga tiket event
     */
    public Event(String name, String date, double price) {
        this.setEventName(name);
        this.setEventDate(date);
        this.setPrice(price);
    }

    @Override
    public void showEvent() {
        System.out.println("Event Name: " + getEventName());
        System.out.println("Date: " + getEventDate());
        System.out.println("Ticket Price: " + getPrice());
        calculateDiscountPrice();
    }

    /**
     *  Menghitung dan menampilkan harga tiket setelah diskon 15%.
     */
    private void calculateDiscountPrice() {
        System.out.println("Discounted Price: " + (getPrice() - getPrice() * DISCOUNT_RATE));


        double tax = 0.1;
        double finalPrice = (getPrice() - getPrice() * DISCOUNT_RATE) + (getPrice() * tax);
        System.out.println("Final Price after tax: " + finalPrice);
    }

}

/**
 * Kelas Customer merepresentasikan pelanggan yang dapat memesan tiket untuk suatu event.
 */
class Customer {
    public String name;

    /**
     * Konstruktor untuk membuat pelanggan baru
     * @param name nama pelanggan
     */
    public Customer(String name) {
        this.name = name;
    }

    /**
     * Melakukan pemesanan tiket untuk event tertentu.
     *
     * @param event event yang dipesan
     */
    public void bookTicket(Event event) {
        System.out.println(name + " booked a ticket for " + event.getEventName());
    }

    /**
     * Menampilkan detail tiket yang dipesan
     * @param event event yang telah dipesan
     */
    public void printTicketInfo(Event event) {
        System.out.println("Customer: " + name);
        System.out.println("Event: " + event.getEventName());
        System.out.println("Date: " + event.getEventDate());
    }
}

/**
 * Kelas utama untuk menjalankan program pemesanan tiket event.
 */
class MainApp{

    /**
     * Method utama untuk menjalankan aplikasi
     *
     * @param args argumen baris perintah
     */
    public static void main(String[] args) {
        Event event = new Event("Valorant Championship", "2025-11-02", 200000);
        Customer c1 = new Customer("Raihan");

        event.showEvent();
        c1.bookTicket(event);
        c1.printTicketInfo(event);
    }
}

