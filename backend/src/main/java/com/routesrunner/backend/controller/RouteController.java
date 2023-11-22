package com.routesrunner.backend.controller;

import com.routesrunner.backend.model.Route;
import com.routesrunner.backend.model.RouteDTO;
import com.routesrunner.backend.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/route")
public class RouteController {

    private final RouteService routeService;

    @Autowired
    public RouteController(RouteService routeService) {
        this.routeService = routeService;
    }

    @GetMapping
    public List<Route> getAllRoutesInRepo() {
        return routeService.getAllRoutesInRepo();
    }

    @PostMapping
    public Route addANewRoute(RouteDTO routeDTO) {
        return routeService.addANewRoute(routeDTO);
    }
}
