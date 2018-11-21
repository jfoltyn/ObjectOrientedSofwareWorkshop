package com.jfoltyn.robots;

public class RobotA extends RobotPrototype {

    public RobotA(){
        this.module = "A";
    }

    @Override
    public RobotPrototype copy() {
        return new RobotA();
    }
}
