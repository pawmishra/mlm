package com.javerian.erp.mlm.vo;

public class PurchaseLineVO {

	private Long id;
	private String purchase_line_number;
	private int item_id;
	private String purchase_order_number;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPurchase_line_number() {
		return purchase_line_number;
	}

	public void setPurchase_line_number(String purchase_line_number) {
		this.purchase_line_number = purchase_line_number;
	}

	public int getItem_id() {
		return item_id;
	}

	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}

	public String getPurchase_order_number() {
		return purchase_order_number;
	}

	public void setPurchase_order_number(String purchase_order_number) {
		this.purchase_order_number = purchase_order_number;
	}

}
