package com.javerian.erp.mlm.model.auth;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

import com.javerian.erp.mlm.model.workflow.MemberDetails;

@Entity
@Table(name = "user")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "firstname")
	private String firstName;

	@Column(name = "lastname")
	private String lastName;

	@Column(name = "email")
	private String email;

	@Column(name = "username")
	private String username;

	@Column(name = "password")
	private String password;

	@Column(name = "sponser_id")
	private Long sponser_id;

	@Column(name = "sponser_name")
	private String sponser_name;

	@Column
	private String position_left_or_right;

	@Column
	private Long level_from_root;

	@Column
	private Boolean eligibility_status;

	@NotEmpty
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "app_user_user_profile", joinColumns = { @JoinColumn(name = "user_id") }, inverseJoinColumns = {
			@JoinColumn(name = "user_profile_id") })
	private Set<UserProfile> userProfiles = new HashSet<UserProfile>();

	@OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
	private MemberDetails memberDetails;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getSponser_id() {
		return sponser_id;
	}

	public void setSponser_id(Long sponser_id) {
		this.sponser_id = sponser_id;
	}

	public String getSponser_name() {
		return sponser_name;
	}

	public void setSponser_name(String sponser_name) {
		this.sponser_name = sponser_name;
	}

	public String getPosition_left_or_right() {
		return position_left_or_right;
	}

	public void setPosition_left_or_right(String position_left_or_right) {
		this.position_left_or_right = position_left_or_right;
	}

	public Long getLevel_from_root() {
		return level_from_root;
	}

	public void setLevel_from_root(Long level_from_root) {
		this.level_from_root = level_from_root;
	}

	public Set<UserProfile> getUserProfiles() {
		return userProfiles;
	}

	public void setUserProfiles(Set<UserProfile> userProfiles) {
		this.userProfiles = userProfiles;
	}

	public MemberDetails getMemberDetails() {
		return memberDetails;
	}

	public void setMemberDetails(MemberDetails memberDetails) {
		this.memberDetails = memberDetails;
	}

	public Boolean getEligibility_status() {
		return eligibility_status;
	}

	public void setEligibility_status(Boolean eligibility_status) {
		this.eligibility_status = eligibility_status;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((userProfiles == null) ? 0 : userProfiles.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
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
		User other = (User) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (userProfiles == null) {
			if (other.userProfiles != null)
				return false;
		} else if (!userProfiles.equals(other.userProfiles))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", username=" + username + ", userProfiles=" + userProfiles + "]";
	}

}
