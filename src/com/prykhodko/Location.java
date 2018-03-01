package com.prykhodko;

import java.util.HashMap;
import java.util.Map;

public class Location {

    private final int LOCATION_ID;
    private final String DESCROPTION;
    private final Map<String, Integer> EXITS;

    public Location(int LOCATION_ID, String DESCROPTION) {
        this.LOCATION_ID = LOCATION_ID;
        this.DESCROPTION = DESCROPTION;
        this.EXITS = new HashMap<String, Integer>();
        this.EXITS.put("Q", 0);
    }

    public int getLOCATION_ID() {
        return LOCATION_ID;
    }

    public String getDESCROPTION() {
        return DESCROPTION;
    }

    public Map<String, Integer> getExits(){
        return EXITS;
    }

    public void addExit(String direction, int location) {
        EXITS.put(direction, location);
    }
}
