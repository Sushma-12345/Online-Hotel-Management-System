package com.hotel.bill.details;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "IssueBill")
public class BillDetails {
@Id
private String billingno;
private String quantity;
private String  price;
private String taxes;
private String date;
private String services;
private String unit;
public String getBillingno() {
	return billingno;
}
public void setBillingno(String billingno) {
	this.billingno = billingno;
}
public String getQuantity() {
	return quantity;
}
public void setQuantity(String quantity) {
	this.quantity = quantity;
}
public String getPrice() {
	return price;
}
public void setPrice(String price) {
	this.price = price;
}
public String getTaxes() {
	return taxes;
}
public void setTaxes(String taxes) {
	this.taxes = taxes;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public String getServices() {
	return services;
}
public void setServices(String services) {
	this.services = services;
}
public String getUnit() {
	return unit;
}
public void setUnit(String unit) {
	this.unit = unit;
}
public BillDetails(String billingno, String quantity, String price, String taxes, String date, String services,
		String unit) {
	super();
	this.billingno = billingno;
	this.quantity = quantity;
	this.price = price;
	this.taxes = taxes;
	this.date = date;
	this.services = services;
	this.unit = unit;
}

}