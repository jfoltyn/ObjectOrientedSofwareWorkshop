package com.jfoltyn.robots;

public class RobotB extends RobotPrototype {

    public RobotB(){
        this.module = "B";
    }

    @Override
    public RobotPrototype copy() {
        return new RobotB();
    }
}
