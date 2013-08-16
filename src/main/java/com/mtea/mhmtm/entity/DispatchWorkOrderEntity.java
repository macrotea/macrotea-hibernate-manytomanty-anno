/*
 * Copyright(C) 2013 Thunderfox ALL Rights Reserved
 */
package com.mtea.mhmtm.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author macrotea@qq.com
 * @version 1.0
 * @date 2013-8-12 下午20:17:23
 * @note
 */
@Entity
@Table(name="tb_dispatch_work_order")
public class DispatchWorkOrderEntity {

	@Id
	@GeneratedValue
	private Long id;

	/**
	 * 派工时间
	 */
	private Date dispatchTime;

	/**
	 * 备注
	 */
	private String remark;

	/**
	 * 工单处理用户
	 */
	private String orderHandleUser;

	/**
	 * 
	 */
	public DispatchWorkOrderEntity() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDispatchTime() {
		return dispatchTime;
	}

	public void setDispatchTime(Date dispatchTime) {
		this.dispatchTime = dispatchTime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getOrderHandleUser() {
		return orderHandleUser;
	}

	public void setOrderHandleUser(String orderHandleUser) {
		this.orderHandleUser = orderHandleUser;
	}

}
