// Louis Kruysse 19-123-041
// Andreas Dobler 19-105-238
// P1 �bungsserie 5 Aufgabe 5-2

package aufgabe5_2;

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
        StringBuilder sb = new StringBuilder("aufgabe3_2.aufgabe5_2.Order id: ");
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
		return customerName;
	}

	public int getId() {
		return id;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public LinkedList<IArticle> getOrderedArticles() {
		return articles;
	}

	public int getTotalPrice() {
		int price = 0;
		for(int i = 0; i< articles.size(); i++) {
        	 price += articles.get(i).getPrice();
        }

		return price;
	}

}
