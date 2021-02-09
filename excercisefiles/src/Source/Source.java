package Source;

public class Source {
	private String product;
	private Double price;
	private Integer quantity;
	
	public Source(String product, Double price, Integer quantity) {
		this.product = product;
		this.price = price;
		this.quantity = quantity;
		
	}
	
	public String getProduct() {
		return product;
		
	}
	public void setProduct(String product) {
		this.product = product;
		
	}
	
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
		
	}
	
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
		
	}
	
	public Double total() {
		return price * quantity;
		
	}

}
