package springbootStarter.hello;

import java.util.List;


import javax.ws.rs.Produces;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import springbootStarterHelper.Helper;
import springbootStarterModel.Entity;

@RestController
public class HelloController {
	
	Helper helper = new Helper();
	
	@Produces("application/json")
	@RequestMapping(value="/values", method=RequestMethod.GET)
	public List<Entity> values()
	{
		return helper.addStudent();
	}
	
	@RequestMapping("/hello")
	public String sayHi()
	{
		return "Hi";
	}

}
