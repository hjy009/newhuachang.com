package com.newhc.admin.action.user.view;

import java.util.Date;

public class ModelFactoryEnvironmentView {
	private Integer id;
	private String name;
	private String maxImage;
	private String minImage;
	private Integer status;
	private Integer sequence;
	private String creator;
	private String updator;
	private String createTime;
	private String updateTime;
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMaxImage() {
		return maxImage;
	}
	public void setMaxImage(String maxImage) {
		this.maxImage = maxImage;
	}
	public String getMinImage() {
		return minImage;
	}
	public void setMinImage(String minImage) {
		this.minImage = minImage;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSequence() {
		return sequence;
	}
	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	public String getUpdator() {
		return updator;
	}
	public void setUpdator(String updator) {
		this.updator = updator;
	}
	
	
}
