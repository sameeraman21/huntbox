package com.simplifiedsf.production;

import com.simplifiedsf.production.debug.TerminalDebug;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductionApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductionApplication.class, args);
		TerminalDebug terminalDebug = new TerminalDebug();
		terminalDebug.setDebug(false);
		terminalDebug.print("yes");
	}

}
