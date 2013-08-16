/*
 * Copyright(C) 2013 Thunderfox ALL Rights Reserved
 */
package com.mtea.mhmtm.entity;

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
@Table(name="tb_alarm_info")
public class AlarmInfoEntity {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String alarmContent;
	
	/**
	 * 
	 */
	public AlarmInfoEntity() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAlarmContent() {
		return alarmContent;
	}

	public void setAlarmContent(String alarmContent) {
		this.alarmContent = alarmContent;
	}

	@Override
	public String toString() {
		return "AlarmInfoEntity [id=" + id + ", alarmContent=" + alarmContent + "]";
	}

}
