package com.newhc.admin.entity.en;

import java.util.Date;

/**
 * ModelVideoCategory generated by MyEclipse Persistence Tools
 */

public class ModelVideoCategoryEn implements java.io.Serializable {

	// Fields

	private Integer id;

	private String name;

	private Integer type;

	private Integer volumnCount;

	private String remark;

	private Integer status;

	private String creator;

	private String updator;

	private Date createTime;

	private Date updateTime;

	// Constructors

	/** default constructor */
	public ModelVideoCategoryEn() {
	}

	/** minimal constructor */
	public ModelVideoCategoryEn(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public ModelVideoCategoryEn(Integer id, String name, Integer type,
			Integer volumnCount, String remark, Integer status, String creator,
			String updator, Date createTime, Date updateTime) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.volumnCount = volumnCount;
		this.remark = remark;
		this.status = status;
		this.creator = creator;
		this.updator = updator;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getVolumnCount() {
		return this.volumnCount;
	}

	public void setVolumnCount(Integer volumnCount) {
		this.volumnCount = volumnCount;
	}

	public String getRemark() {
			return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getCreator() {
		return this.creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getUpdator() {
		return this.updator;
	}

	public void setUpdator(String updator) {
		this.updator = updator;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}