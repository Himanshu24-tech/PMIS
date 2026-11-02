package com.campus.shuttle.mapper;

import com.campus.shuttle.model.TripLog;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TripLogRowMapper implements RowMapper<TripLog> {
    @Override
    public TripLog mapRow(ResultSet rs, int rowNum) throws SQLException {
        TripLog log = new TripLog();
        log.setLogId(rs.getInt("log_id"));
        log.setShuttleId(rs.getInt("shuttle_id"));
        log.setRouteId(rs.getInt("route_id"));
        log.setPassengersBoarded(rs.getInt("passengers_boarded"));
        log.setTripTime(rs.getTimestamp("trip_time"));
        return log;
    }
}