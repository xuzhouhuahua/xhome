 /*
 * Copyright (c) 2017,TravelSky. 
 * All Rights Reserved.
 * TravelSky CONFIDENTIAL
 * 
 */
 
package com.x.z.test.business.student.service;

import java.util.List;
import com.x.z.test.business.student.entity.Sudent;

/**
 * @description: aaa <br/>
 * @date: 2017年6月7日 下午10:33 <br/>
 * @author xuzhou <br/>
 * 
 *
 */
public interface SudentService {
	
	void addSudent(Sudent sudent);

	List<Sudent> getSudentList(Sudent sudent);

}
