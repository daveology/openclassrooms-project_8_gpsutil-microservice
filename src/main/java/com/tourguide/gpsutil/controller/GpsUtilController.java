package com.tourguide.gpsutil.controller;

import gpsUtil.GpsUtil;
import gpsUtil.location.Attraction;
import org.springframework.web.bind.annotation.RestController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

@RestController
public class GpsUtilController {

    private Logger logger = LogManager.getLogger(GpsUtilController.class);
    GpsUtil gpsUtil = new GpsUtil();

    public List<Attraction> getAttractions() {

        logger.debug("Attractions received!");

        return gpsUtil.getAttractions();
    }
}
