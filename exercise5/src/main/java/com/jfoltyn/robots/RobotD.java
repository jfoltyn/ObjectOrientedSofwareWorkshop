package com.jfoltyn.robots;

public class RobotD extends RobotPrototype {

    public RobotD(){
        this.module = "D";
    }

    @Override
    public RobotPrototype copy() {
        return new RobotD();
    }
}
