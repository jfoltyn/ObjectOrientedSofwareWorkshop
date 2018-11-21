package com.jfoltyn.robots;

public abstract class RobotPrototype {

    String module;

    public abstract RobotPrototype copy();

    public String produceModule() {
        return module;
    }
}
