package com.example.demo.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.DeptDao;
import com.example.demo.vo.Dept;

@RestController
public class TestRestController {
	@Autowired
	DeptDao deptDao;
	
	@RequestMapping(value = "/testValue", method = RequestMethod.GET)
	public String getTestValue() {
		String TestValue = "레스트컨트롤러 테스트";
		return TestValue;
	}
	
	@RequestMapping("/main")
	public List<Dept> main(){
		return deptDao.selectList();
	}
}