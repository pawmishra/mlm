package com.javerian.erp.mlm.jqgrid;

import java.util.List;

import com.javerian.erp.mlm.vo.LedgerAccountVO;

public class CustomLedgerAccountResponse {

	public CustomLedgerAccountResponse() {

	}

	private String page;
	private String total;
	private String records;
	private List<LedgerAccountVO> rows;

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public String getRecords() {
		return records;
	}

	public void setRecords(String records) {
		this.records = records;
	}

	public List<LedgerAccountVO> getRows() {
		return rows;
	}

	public void setRows(List<LedgerAccountVO> rows) {
		this.rows = rows;
	}

}
