package com.oops.daythree.employeepromotionsystem;

public enum Level {

	JUNIOR, MID, SENIOR, LEAD;

    public Level getNextLevel() {
        switch (this) {
            case JUNIOR: return MID;
            case MID: return SENIOR;
            case SENIOR: return LEAD;
            case LEAD: return null; // No promotion after Lead
            default: return null;
        }
    }

}
