package com.routesrunner.backend.service;

import com.routesrunner.backend.model.Route;
import com.routesrunner.backend.model.RouteDTO;
import com.routesrunner.backend.repository.RouteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RouteService {

    private final RouteRepository routeRepository;
    private final IdService idService;

    public RouteService (RouteRepository routeRepository, IdService idService) {
        this.routeRepository = routeRepository;
        this.idService = idService;
    }


    public List<Route> getAllRoutesInRepo() {
        return routeRepository.findAll();
    }

    public Route addANewRoute(RouteDTO routeDTO) {
        Route newRoute = Route.builder()
                .id(idService.generateId())
                .routeName(routeDTO.getRouteName())
                .hashtags(routeDTO.getHashtags())
                .imageThumbnail(routeDTO.getImageThumbnail())
                .build();

        routeRepository.save(newRoute);
        return newRoute;
    }
}
