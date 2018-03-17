package com.javerian.erp.mlm.vo;

public class PurchaseHeaderVO {

	private Long id;
	private Long vendor_id;
	private String vendor;
	private String purchase_order_number;
	private String status;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getVendor_id() {
		return vendor_id;
	}

	public void setVendor_id(Long vendor_id) {
		this.vendor_id = vendor_id;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public String getPurchase_order_number() {
		return purchase_order_number;
	}

	public void setPurchase_order_number(String purchase_order_number) {
		this.purchase_order_number = purchase_order_number;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
