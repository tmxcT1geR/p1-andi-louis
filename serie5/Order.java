// Louis Kruysse 19-123-041
// Andreas Dobler 19-105-238
// P1 übungsserie 3 Aufgabe 3-1
import java.util.LinkedList;

public class Order {
    private int id;
    private String customerName;
    private String customerAddress;
    private static int lastUsedId = 0;
    LinkedList<IArticle> articles = new LinkedList<IArticle>();

    public Order() {
        lastUsedId++;
        id = lastUsedId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Order id: ");
        sb.append(id);
        sb.append(", Customer: ");
        sb.append(customerName);
        sb.append(", ");
        sb.append(customerAddress);
        for(int i = 0; i< articles.size(); i++) {
        	sb.append('\n').append(articles.get(i));
        }

        return sb.toString();
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public void setCustomerAddress(String customerAddress){
        this.customerAddress = customerAddress;
    }

    public void add(IArticle book) {
    	articles.add(book);
    }

	public String getCustomerName() {
		// TODO Auto-generated method stub
		return customerName;
	}

	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}

	public String getCustomerAddress() {
		// TODO Auto-generated method stub
		return customerAddress;
	}

	public LinkedList<IArticle> getOrderedArticles() {
		// TODO Auto-generated method stub
		return articles;
	}

	public int getTotalPrice() {
		int price = 0;
		// TODO Auto-generated method stub
		for(int i = 0; i< articles.size(); i++) {
        	 price += articles.get(i).getPrice();
        }

		return price;
	}

}
