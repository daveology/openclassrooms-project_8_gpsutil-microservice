package com.tourguide.gpsutil.controller;

import gpsUtil.GpsUtil;
import org.springframework.web.bind.annotation.RestController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@RestController
public class GpsUtilController {

    private Logger logger = LogManager.getLogger(GpsUtilController.class);
    GpsUtil gpsUtil = new GpsUtil();
    
    
}
