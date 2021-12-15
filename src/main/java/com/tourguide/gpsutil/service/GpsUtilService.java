package com.tourguide.gpsutil.service;

import gpsUtil.GpsUtil;
import gpsUtil.location.Attraction;
import gpsUtil.location.VisitedLocation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.UUID;

@Service
public class GpsUtilService {

    private Logger logger = LogManager.getLogger(GpsUtilService.class);
    GpsUtil gpsUtil = new GpsUtil();

    public List<Attraction> getAttractions() {

        logger.debug("Attractions received!");

        return gpsUtil.getAttractions();
    }

    public VisitedLocation getUserLocation (@RequestParam UUID userUuid) {

        logger.debug("User's location received!");

        return gpsUtil.getUserLocation(userUuid);
    }
}
