package com.campus.shuttle.dao;

import com.campus.shuttle.model.TripLog;
import java.util.List;

public interface TripLogDao {
    int insertTripLog(TripLog tripLog);
    List<TripLog> findTripsByShuttleId(int shuttleId);
}