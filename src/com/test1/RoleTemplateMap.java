package com.test1;

public class RoleTemplateMap {
	private Integer roleId;
	private Integer activityId;
	private Integer templateId;
	private String accessType;
	private boolean isActive;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public RoleTemplateMap() {

	}

	public RoleTemplateMap(Integer roleId, Integer activityId, Integer templateId, String accessType, boolean isActive,
			String creationDate, String modifiedDate, String entityState) {
		super();
		this.roleId = roleId;
		this.activityId = activityId;
		this.templateId = templateId;
		this.accessType = accessType;
		this.isActive = isActive;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public Integer getActivityId() {
		return activityId;
	}

	public void setActivityId(Integer activityId) {
		this.activityId = activityId;
	}

	public Integer getTemplateId() {
		return templateId;
	}

	public void setTemplateId(Integer templateId) {
		this.templateId = templateId;
	}

	public String getAccessType() {
		return accessType;
	}

	public void setAccessType(String accessType) {
		this.accessType = accessType;
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
