package io.neha.springbootquickstart.hello;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

	public String sayHello() {
		String x = "{\"status\":\"Hello World\"}";
		return (x);

	}

	public void getInformationById(Integer id) {
		System.out.println("Show info for "+ id);
	}

}
