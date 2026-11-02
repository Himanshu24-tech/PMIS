package com.campus.shuttle.dao;

import com.campus.shuttle.mapper.TripLogRowMapper;
import com.campus.shuttle.model.TripLog;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;

@Repository
public class TripLogDaoImpl implements TripLogDao {

    private final JdbcTemplate jdbcTemplate;

    public TripLogDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insertTripLog(TripLog tripLog) {
        String sql = "INSERT INTO trip_logs (shuttle_id, route_id, passengers_boarded, trip_time) VALUES (?, ?, ?, ?)";
        return jdbcTemplate.update(
            sql,
            tripLog.getShuttleId(),
            tripLog.getRouteId(),
            tripLog.getPassengersBoarded(),
            Timestamp.from(Instant.now())
        );
    }

    @Override
    public List<TripLog> findTripsByShuttleId(int shuttleId) {
        String sql = "SELECT * FROM trip_logs WHERE shuttle_id = ? ORDER BY trip_time DESC";
        return jdbcTemplate.query(sql, new TripLogRowMapper(), shuttleId);
    }
}