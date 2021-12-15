package com.tourguide.gpsutil.controller;

import com.tourguide.gpsutil.service.GpsUtilService;
import gpsUtil.location.Attraction;
import gpsUtil.location.VisitedLocation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
public class GpsUtilController {

    @Autowired
    GpsUtilService gpsUtilService;

    @GetMapping(value="/attractions")
    public List<Attraction> getAttractions() {

        return gpsUtilService.getAttractions();
    }

    @GetMapping(value="/userLocation")
    public VisitedLocation getUserLocation (@RequestParam UUID userUuid) {

        return gpsUtilService.getUserLocation(userUuid);
    }
}
