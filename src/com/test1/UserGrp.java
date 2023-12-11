package com.test1;

public class UserGrp {
	private Integer id;
	private String userGrpName;
	private boolean isActive;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public UserGrp() {

	}

	public UserGrp(Integer id, String userGrpName, boolean isActive, String creationDate, String modifiedDate,
			String entityState) {
		super();
		this.id = id;
		this.userGrpName = userGrpName;
		this.isActive = isActive;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserGrpName() {
		return userGrpName;
	}

	public void setUserGrpName(String userGrpName) {
		this.userGrpName = userGrpName;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
