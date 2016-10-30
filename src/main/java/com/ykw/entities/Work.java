package com.ykw.entities;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Version;

@Entity
public class Work {
	String id;
	String name;
	String type;
	String status;

	@Column(name = "CREATION_TS", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP", insertable = false, updatable = false)
	Calendar createDate;
	@Version
	@Column(name = "UPDATE_TS")
	Calendar updateDate;

}
