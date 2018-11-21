package com.jfoltyn.robots;

public class RobotC extends RobotPrototype {

    public RobotC(){
        this.module = "C";
    }

    @Override
    public RobotPrototype copy() {
        return new RobotC();
    }
}
