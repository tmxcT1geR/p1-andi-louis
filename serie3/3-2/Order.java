// Louis Kruysse 19-123-041
// Andreas Dobler 19-105-238
// P1 Übungsserie 3 Aufgabe 3-1

public class Order {
    private int id;
    private String customerName;
    private String customerAddress;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;
    private Book book5;
    private static int lastUsedId = 0;

    public Order() {
        lastUsedId++;
        id = lastUsedId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("aufgabe3_2.aufgabe5_2.Order id: ");
        sb.append(id);
        sb.append(", Customer: ");
        sb.append(customerName);
        sb.append(", ");
        sb.append(customerAddress);
        if (book1 != null) {
            sb.append('\n').append(book1);
        }
        if (book2 != null) {
            sb.append('\n').append(book2);
        }
        if (book3 != null) {
            sb.append('\n').append(book3);
        }
        if (book4 != null) {
            sb.append('\n').append(book4);
        }
        if (book5 != null) {
            sb.append('\n').append(book5);
        }
        return sb.toString();
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public void setCustomerAddress(String customerAddress){
        this.customerAddress = customerAddress;
    }

    public void addBook(Book book) {
        if (book1 == null) {
            book1 = book;
        } else if (book2 == null) {
            book2 = book;
        } else if (book3 == null) {
            book3 = book;
        } else if (book4 == null) {
            book4 = book;
        } else if (book5 == null) {
            book5 = book;
        }
    }

}
