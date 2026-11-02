package com.campus.shuttle.mapper;

import com.campus.shuttle.model.Route;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RouteRowMapper implements RowMapper<Route> {
    @Override
    public Route mapRow(ResultSet rs, int rowNum) throws SQLException {
        Route route = new Route();
        route.setRouteId(rs.getInt("route_id"));
        route.setRouteName(rs.getString("route_name"));
        route.setStartLocation(rs.getString("start_location"));
        route.setEndLocation(rs.getString("end_location"));
        return route;
    }
}
