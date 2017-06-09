 /*
 * Copyright (c) 2017,TravelSky. 
 * All Rights Reserved.
 * TravelSky CONFIDENTIAL
 * 
 */
 
package com.x.z.test.business.student.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import com.x.z.test.business.student.entity.Sudent;
import com.x.z.test.business.student.dao.mapper.SudentMapper;
import com.x.z.test.business.student.service.SudentService;

/**
 * @description: aaa <br/>
 * @date: 2017年6月7日 下午10:33 <br/>
 * @author xuzhou <br/>
 * 
 *
 */
@Service
public class SudentServiceImpl implements SudentService{
	
	@Resource
	private SudentMapper sudentMapper;
	
	@Override
	public void addSudent(Sudent sudent){
		sudentMapper.addSudent(sudent);
	}
	
	@Override
	public List<Sudent> getSudentList(Sudent sudent){
		return sudentMapper.getSudentList(sudent);
	}

}
