package com.example.demo;
import com.example.demo.game.GameRunner;
import com.example.demo.game.PackMan;
import com.example.demo.game.SuperContra;
import com.example.demo.game.SuperMario;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@RestController
public class DemoApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
//		GamingConsole game = new SuperMario();
//		SuperContra game = new SuperContra();
//		PackMan game = new PackMan();
//		GameRunner runner = new GameRunner(game);
		GameRunner runner = context.getBean(GameRunner.class);
		runner.run();
	}
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}
//	@GetMapping("/d")
//	public String emoji(@RequestParam(value = "name", defaultValue = ":)") String name) {
//		return String.format("Hello %s!", name); - while initilizing with :), it gives error why?
//	}
}