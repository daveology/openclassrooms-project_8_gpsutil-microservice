package com.tourguide.gpsutil.service;

import gpsUtil.location.Attraction;
import gpsUtil.location.VisitedLocation;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class TestGpsUtilService {

    @Autowired
    GpsUtilService gpsUtilService;

    @Test
    public void shouldGetAttractions() {

        List<Attraction> attractions = gpsUtilService.getAttractions();

        assertEquals(26, attractions.size());
    }

    @Test
    public void shouldUserLocation() {

        VisitedLocation visitedLocation = gpsUtilService.getUserLocation(UUID.randomUUID());

        assertEquals(true, !visitedLocation.equals(null));
    }
}
