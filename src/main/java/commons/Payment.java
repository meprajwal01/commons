package commons;

public class Payment {

	private Integer paymentId;
	private String paymentType;
	private Order order;

	public Payment() {
	}

	public Payment(Integer paymentId, String paymentType, Order order) {
		this.paymentId = paymentId;
		this.paymentType = paymentType;
		this.order = order;
	}

	public Integer getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Integer paymentId) {
		this.paymentId = paymentId;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", paymentType=" + paymentType + ", order=" + order + "]";
	}

}
