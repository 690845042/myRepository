package manage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import manage.service.TestService;
import pojo.TbBrand;

@RestController
@RequestMapping("/brand")
public class TestController {
	

	@Autowired
	private TestService service;
	@RequestMapping("/findAll")
	public List<TbBrand> findAll(){
		
		System.out.println("1222222222222222222222222222222222222");
		return service.findAll();
	}
 }
