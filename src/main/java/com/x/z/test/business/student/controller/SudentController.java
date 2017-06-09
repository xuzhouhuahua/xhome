 /*
 * Copyright (c) 2017,TravelSky. 
 * All Rights Reserved.
 * TravelSky CONFIDENTIAL
 * 
 */
 
package com.x.z.test.business.student.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.x.z.test.business.student.entity.Sudent;
import com.x.z.test.business.student.service.SudentService;

/**
 * @description: aaa <br/>
 * @date: 2017年6月7日 下午10:33 <br/>
 * @author xuzhou <br/>
 * 
 *
 */
@Controller         
@RequestMapping("sudent")
public class SudentController{

	@Resource
	private SudentService sudentService;
	
	private void testb(){
		System.out.println();
	}
	/**
	 * @description: 
	 * @return
	 */
	@RequestMapping(value = "addSudent" , method = RequestMethod.GET)
	public String initAddSudent(){
		testb();
		//test
		return null;
	}
	
	/**
	 * @description: add
	 * @param sudent
	 * @return
	 */
	@RequestMapping(value = "addSudent" , method = RequestMethod.POST)
	public String addSudent(Sudent sudent){
		sudentService.addSudent(sudent);
		return null;
	}
	
	/**
	 * @description: select list
	 * @param sudent
	 * @return
	 */
	@RequestMapping(value = "getSudentList" , method = RequestMethod.GET)
	public String getSudentList(Sudent sudent,Model model){
		model.addAttribute("sudentList",sudentService.getSudentList(sudent));
		
		return null;
	}

}
