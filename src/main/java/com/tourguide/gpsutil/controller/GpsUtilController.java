package com.tourguide.gpsutil.controller;

import gpsUtil.GpsUtil;
import gpsUtil.location.Attraction;
import gpsUtil.location.VisitedLocation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.UUID;

@RestController
public class GpsUtilController {

    private Logger logger = LogManager.getLogger(GpsUtilController.class);
    GpsUtil gpsUtil = new GpsUtil();

    @GetMapping(value="/attractions")
    public List<Attraction> getAttractions() {

        logger.debug("Attractions received!");

        return gpsUtil.getAttractions();
    }

    public VisitedLocation getUserLocation (UUID userId) {

        logger.debug("User's location received!");

        return gpsUtil.getUserLocation(userId);
    }
}
