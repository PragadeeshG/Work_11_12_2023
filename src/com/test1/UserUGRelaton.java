package com.test1;

public class UserUGRelaton {
	private Integer userGrpId;
	private String userId;
	private boolean isActive;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public UserUGRelaton() {

	}

	public UserUGRelaton(Integer userGrpId, String userId, boolean isActive, String creationDate, String modifiedDate,
			String entityState) {
		super();
		this.userGrpId = userGrpId;
		this.userId = userId;
		this.isActive = isActive;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getUserGrpId() {
		return userGrpId;
	}

	public void setUserGrpId(Integer userGrpId) {
		this.userGrpId = userGrpId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
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
