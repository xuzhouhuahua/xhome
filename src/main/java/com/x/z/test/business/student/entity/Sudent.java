 /*
 * Copyright (c) 2017,TravelSky. 
 * All Rights Reserved.
 * TravelSky CONFIDENTIAL
 * 
 */
 
package com.x.z.test.business.student.entity;

/**
 * @description: aaa <br/>
 * @date: 2017年6月7日 下午10:33 <br/>
 * @author xuzhou <br/>
 * 
 *
 */
public class Sudent {

	private Integer id;	

	private String name;	

	/**
	 * 
	 * 描述 getters
	 * @return
	 *
	 */
	public Integer getId(){
		return id;
	}
	/**
	 * 
	 * 描述 setters
	 * @param id
	 *
	 */
	public void setId(Integer id){
		this.id = id;
	}

	/**
	 * 
	 * 描述 getters
	 * @return
	 *
	 */
	public String getName(){
		return name;
	}
	/**
	 * 
	 * 描述 setters
	 * @param name
	 *
	 */
	public void setName(String name){
		this.name = name;
	}

	@Override
	public String toString() {
		return new StringBuilder()
			.append("Sudent [")
			.append("id=").append(id).append(", ")
		    .append("name=").append(name)
		    .append("]").toString();
	}
}
