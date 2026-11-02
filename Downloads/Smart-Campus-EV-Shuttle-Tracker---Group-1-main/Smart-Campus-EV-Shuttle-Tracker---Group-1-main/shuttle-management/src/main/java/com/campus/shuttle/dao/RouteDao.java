package com.campus.shuttle.dao;

import com.campus.shuttle.model.Route;
import java.util.List;

public interface RouteDao {
    List<Route> findAllRoutes();
    Route findRouteById(int routeId);
}