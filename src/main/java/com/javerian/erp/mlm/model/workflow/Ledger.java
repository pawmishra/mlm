package com.javerian.erp.mlm.model.workflow;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ledger")
public class Ledger {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "member_id")
	private Long member_id;

	@Column(name = "credit")
	private Double credit;

	@Column(name = "debit")
	private Double debit;

	@Column(name = "transaction_date")
	private Timestamp transaction_date;

	@Column(name = "transaction_remark")
	private String transaction_remark;

	@Column(name = "document_id")
	private String document_id;

	@Column(name = "admin_payment_approval")
	private Boolean admin_payment_approval;

	@Column(name = "admin_payment_date")
	private Timestamp admin_payment_date;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getMember_id() {
		return member_id;
	}

	public void setMember_id(Long member_id) {
		this.member_id = member_id;
	}

	public Double getCredit() {
		return credit;
	}

	public void setCredit(Double credit) {
		this.credit = credit;
	}

	public Double getDebit() {
		return debit;
	}

	public void setDebit(Double debit) {
		this.debit = debit;
	}

	public Timestamp getTransaction_date() {
		return transaction_date;
	}

	public void setTransaction_date(Timestamp transaction_date) {
		this.transaction_date = transaction_date;
	}

	public String getTransaction_remark() {
		return transaction_remark;
	}

	public void setTransaction_remark(String transaction_remark) {
		this.transaction_remark = transaction_remark;
	}

	public String getDocument_id() {
		return document_id;
	}

	public void setDocument_id(String document_id) {
		this.document_id = document_id;
	}

	public Boolean getAdmin_payment_approval() {
		return admin_payment_approval;
	}

	public void setAdmin_payment_approval(Boolean admin_payment_approval) {
		this.admin_payment_approval = admin_payment_approval;
	}

	public Timestamp getAdmin_payment_date() {
		return admin_payment_date;
	}

	public void setAdmin_payment_date(Timestamp admin_payment_date) {
		this.admin_payment_date = admin_payment_date;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((admin_payment_approval == null) ? 0 : admin_payment_approval.hashCode());
		result = prime * result + ((admin_payment_date == null) ? 0 : admin_payment_date.hashCode());
		result = prime * result + ((credit == null) ? 0 : credit.hashCode());
		result = prime * result + ((debit == null) ? 0 : debit.hashCode());
		result = prime * result + ((document_id == null) ? 0 : document_id.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((member_id == null) ? 0 : member_id.hashCode());
		result = prime * result + ((transaction_date == null) ? 0 : transaction_date.hashCode());
		result = prime * result + ((transaction_remark == null) ? 0 : transaction_remark.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ledger other = (Ledger) obj;
		if (admin_payment_approval == null) {
			if (other.admin_payment_approval != null)
				return false;
		} else if (!admin_payment_approval.equals(other.admin_payment_approval))
			return false;
		if (admin_payment_date == null) {
			if (other.admin_payment_date != null)
				return false;
		} else if (!admin_payment_date.equals(other.admin_payment_date))
			return false;
		if (credit == null) {
			if (other.credit != null)
				return false;
		} else if (!credit.equals(other.credit))
			return false;
		if (debit == null) {
			if (other.debit != null)
				return false;
		} else if (!debit.equals(other.debit))
			return false;
		if (document_id == null) {
			if (other.document_id != null)
				return false;
		} else if (!document_id.equals(other.document_id))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (member_id == null) {
			if (other.member_id != null)
				return false;
		} else if (!member_id.equals(other.member_id))
			return false;
		if (transaction_date == null) {
			if (other.transaction_date != null)
				return false;
		} else if (!transaction_date.equals(other.transaction_date))
			return false;
		if (transaction_remark == null) {
			if (other.transaction_remark != null)
				return false;
		} else if (!transaction_remark.equals(other.transaction_remark))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Ledger [id=" + id + ", member_id=" + member_id + ", credit=" + credit + ", debit=" + debit
				+ ", transaction_date=" + transaction_date + ", transaction_remark=" + transaction_remark
				+ ", document_id=" + document_id + ", admin_payment_approval=" + admin_payment_approval
				+ ", admin_payment_date=" + admin_payment_date + "]";
	}

}
