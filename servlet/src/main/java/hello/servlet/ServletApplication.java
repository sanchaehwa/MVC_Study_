package hello.servlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
/*Springboot는 서블릿을 직접 등록해서 사용할 수 있도록 : @ServletComponentScan
Springboot는 Tomcat 서버 내장하고 있어서 서버 설치가 따로 필요하지않음.* */
@ServletComponentScan
@SpringBootApplication
public class ServletApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServletApplication.class, args);
	}

}
