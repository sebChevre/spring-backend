package ch.globaz.springbackend.application.api.web;

import ch.globaz.springbackend.application.dto.HelloWorldDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<HelloWorldDto> sayHello(){
		return new ResponseEntity<>(HelloWorldDto.sayHello("world"), HttpStatus.OK);
	}
}
