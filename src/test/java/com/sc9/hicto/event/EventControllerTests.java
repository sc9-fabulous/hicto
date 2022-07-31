package com.sc9.hicto.event;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(EventController.class)
public class EventControllerTests {
	
	@Autowired
	private MockMvc mvc;
	
	@Test
	public void t1_get_statusOk() throws Exception {
		this.mvc.perform(get("/api/v1/event/1"))
		.andExpect(status().isOk());
	}
}
