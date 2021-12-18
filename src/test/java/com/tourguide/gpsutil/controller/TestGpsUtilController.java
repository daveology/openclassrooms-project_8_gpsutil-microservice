package com.tourguide.gpsutil.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import java.util.UUID;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class TestGpsUtilController {

    @Autowired
    private MockMvc mock;

    @Test
    public void shouldAccessAttractions() throws Exception {

        mock.perform(get("/attractions"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.size()", is(26)));
    }

    @Test
    public void shouldAccessUserLocation() throws Exception {

        mock.perform(get("/userLocation").param("userUuid", String.valueOf(UUID.randomUUID())))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("longitude")))
                .andExpect(content().string(containsString("latitude")));
    }
}
