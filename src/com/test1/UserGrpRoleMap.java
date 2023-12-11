package com.test1;

public class UserGrpRoleMap {
	private Integer userGrpId;
	private Integer roleId;
	private boolean isActive;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public UserGrpRoleMap() {
	}

	public UserGrpRoleMap(Integer userGrpId, Integer roleId, boolean isActive, String creationDate, String modifiedDate,
			String entityState) {
		super();
		this.userGrpId = userGrpId;
		this.roleId = roleId;
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

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
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
