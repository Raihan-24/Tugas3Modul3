/**
 * Kelas dasar yang menyimpan informasi umum sebuah event
 * Digunakan sebagai superclass oleh kelas Event.
 *
 * @author Raihan
 * @version 1.0
 */
public class BaseEvent {
    private String eventName;
    private String eventDate;
    private double price;

    /**
     * Mengambil nama event
     * @return nama event
     */
    public String getEventName() {
        return eventName;
    }

    /**
     * Mengatur nama event
     * @param eventName nama event yang akan disimpan
     */
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    /**
     * Mengambil tanggal event
     * @return tanggal event dalam format string
     */
    public String getEventDate() {
        return eventDate;
    }

    /**
     * Mengatur tanggal event
     * @param eventDate tanggal event dalam format string
     */
    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    /**
     * Mengambil harga tiket event
     * @return harga tiket event
     */
    public double getPrice() {
        return price;
    }

    /**
     * Mengatur harga tiket event
     * @param price harga tiket event
     */
    public void setPrice(double price) {
        this.price = price;
    }
}
