package com.jfoltyn.robots;

import java.util.HashMap;
import java.util.Set;

public class RobotsCreatorAndGod {

    private static HashMap<String, RobotPrototype> moduleTypeToRobot = new HashMap<>();

    static {
        moduleTypeToRobot.put("A", new RobotA());
        moduleTypeToRobot.put("B", new RobotB());
        moduleTypeToRobot.put("C", new RobotC());
        moduleTypeToRobot.put("D", new RobotD());
    }

    public static RobotPrototype bornANewRobot(String moduleType){
        if(moduleTypeToRobot.containsKey(moduleType)){
            return moduleTypeToRobot.get(moduleType).copy();
        } else {
            throw new IllegalStateException("RobotsGod didnt planned such robot!");
        }
    }
}
