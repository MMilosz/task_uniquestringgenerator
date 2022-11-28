package pl.mmilosz.uniquestringsgenerator.documents;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import pl.mmilosz.uniquestringsgenerator.documents.DocumentsController;

@SpringBootTest
@AutoConfigureMockMvc
public class DocumentsTest {

	@Autowired
	MockMvc mvc;
	
	@Autowired
	private DocumentsController controller;
	
	@DisplayName("Controller is not null")
	@Test
	void contextLoads() throws Exception {
//		assertThat(controller).isNotNull();
	}
	
	@DisplayName("Should return 200")
	@Test
	void shouldReturn200() throws Exception {
//		MvcResult result = mvc.perform(get("/v1/strings/"))
	}
	
}
