package ch.globaz.springbackend.application.dto;

public class HelloWorldDto {

	private String hello;

	public static HelloWorldDto sayHello(String hello){
		return new HelloWorldDto(hello);
	}

	private HelloWorldDto(String hello){
		this.hello = hello;
	}

	public String getHello() {
		return hello;
	}
}
