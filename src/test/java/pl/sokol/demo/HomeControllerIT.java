package pl.sokol.demo;

import org.junit.Before;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class HomeControllerIT {
    private MockMvc mockMvc;

    @Before
    public void setUp(){
        mockMvc = MockMvcBuilders
                .standaloneSetup(new HomeController())
                .build();
    }


    @Test
    public void shouldReturn200() throws Exception{
        mockMvc.perform(get("/")
                .contentType("applicaltion/json"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello world!"));
    }
}
