package com.campus.shuttle.model;

import java.sql.Timestamp;

public class TripLog {
    private int logId;
    private int shuttleId;
    private int routeId;
    private int passengersBoarded;
    private Timestamp tripTime;

    public TripLog() {}

    public TripLog(int shuttleId, int routeId, int passengersBoarded) {
        this.shuttleId = shuttleId;
        this.routeId = routeId;
        this.passengersBoarded = passengersBoarded;
    }

    // Getters and Setters
    public int getLogId() { return logId; }
    public void setLogId(int logId) { this.logId = logId; }

    public int getShuttleId() { return shuttleId; }
    public void setShuttleId(int shuttleId) { this.shuttleId = shuttleId; }

    public int getRouteId() { return routeId; }
    public void setRouteId(int routeId) { this.routeId = routeId; }

    public int getPassengersBoarded() { return passengersBoarded; }
    public void setPassengersBoarded(int passengersBoarded) { this.passengersBoarded = passengersBoarded; }

    public Timestamp getTripTime() { return tripTime; }
    public void setTripTime(Timestamp tripTime) { this.tripTime = tripTime; }
}