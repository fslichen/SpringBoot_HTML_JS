package evolution.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController// With @RestController, the response dto is converted to json automatically.
public class AnotherController {
	@PostMapping("/post")
	public Object post(@RequestBody AnyDto anyDto) {
		System.out.println(anyDto);
		return anyDto;
	}
}
