package com.hotel.payment.details;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "PaymentDetails")
public class PaymentDetails {
		@Id
	    private String total;
		private String paytime;
		private String  creditcardDetails;
		public String getTotal() {
			return total;
		}
		public void setTotal(String total) {
			this.total = total;
		}
		public String getPaytime() {
			return paytime;
		}
		public void setPaytime(String paytime) {
			this.paytime = paytime;
		}
		public String getCreditcardDetails() {
			return creditcardDetails;
		}
		public void setCreditcardDetails(String creditcardDetails) {
			this.creditcardDetails = creditcardDetails;
		}
		public PaymentDetails(String total, String paytime, String creditcardDetails) {
			super();
			this.total = total;
			this.paytime = paytime;
			this.creditcardDetails = creditcardDetails;
		}
		
}