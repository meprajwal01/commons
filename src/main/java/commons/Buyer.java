package commons;

public class Buyer {

	private Integer buyerId;
	private String buyerName;

	public Buyer() {
	}

	public Buyer(Integer buyerId, String buyerName) {
		this.buyerId = buyerId;
		this.buyerName = buyerName;
	}

	public Integer getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(Integer buyerId) {
		this.buyerId = buyerId;
	}

	public String getBuyerName() {
		return buyerName;
	}

	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}

}
