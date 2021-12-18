package com.tourguide.gpsutil.service;

import gpsUtil.GpsUtil;
import gpsUtil.location.Attraction;
import gpsUtil.location.VisitedLocation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class GpsUtilService {

    private Logger logger = LogManager.getLogger(GpsUtilService.class);
    GpsUtil gpsUtil = new GpsUtil();

    public List<Attraction> getAttractions() {

        logger.debug("(i) Attractions received!");

        return gpsUtil.getAttractions();
    }

    public VisitedLocation getUserLocation(UUID userUuid) {

        logger.debug("(i) User's location received!");

        VisitedLocation visitedLocation = gpsUtil.getUserLocation(userUuid);

        return visitedLocation;
    }
}

