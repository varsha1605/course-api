package io.neha.springbootquickstart.hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HelloController {

	private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

	@Autowired  // It is used to inject the bean
	private HelloService helloService;

	@RequestMapping(method = RequestMethod.GET, value = "/hello", produces = MediaType.APPLICATION_JSON_VALUE)
	public String sayHello() {
		return helloService.sayHello();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/hello/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public void getInformationById(@PathVariable int id, @RequestParam(value = "param1", required = false) String st) {
		helloService.getInformationById(id);
	}
}
