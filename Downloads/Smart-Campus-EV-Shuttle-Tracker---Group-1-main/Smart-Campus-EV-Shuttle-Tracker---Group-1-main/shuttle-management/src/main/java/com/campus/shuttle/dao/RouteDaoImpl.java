package com.campus.shuttle.dao;

import com.campus.shuttle.mapper.RouteRowMapper;
import com.campus.shuttle.model.Route;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class RouteDaoImpl implements RouteDao {

    private final JdbcTemplate jdbcTemplate;

    public RouteDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Route> findAllRoutes() {
        String sql = "SELECT * FROM routes";
        return jdbcTemplate.query(sql, new RouteRowMapper());
    }

    @Override
    public Route findRouteById(int routeId) {
        String sql = "SELECT * FROM routes WHERE route_id = ?";
        return jdbcTemplate.queryForObject(sql, new RouteRowMapper(), routeId);
    }
}