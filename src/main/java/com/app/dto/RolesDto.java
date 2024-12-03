package com.app.dto;

public class RolesDto {
 private int roleId;
 private Enum roleName;
 
 
public RolesDto(int roleId, Enum roleName) {
	super();
	this.roleId = roleId;
	this.roleName = roleName;
}

public int getRoleId() {
	return roleId;
}
public void setRoleId(int roleId) {
	this.roleId = roleId;
}
public Enum getRoleName() {
	return roleName;
}
public void setRoleName(Enum roleName) {
	this.roleName = roleName;
}
@Override
public String toString() {
	return "RolesDto [roleId=" + roleId + ", roleName=" + roleName + "]";
}
 
 
 
}
