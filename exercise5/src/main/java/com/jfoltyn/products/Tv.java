package com.jfoltyn.products;

import com.jfoltyn.robots.RobotPrototype;
import com.jfoltyn.robots.RobotsCreatorAndGod;

public class Tv  extends Product{
    public Tv(){
        RobotPrototype robotA = RobotsCreatorAndGod.bornANewRobot("A");
        RobotPrototype robotB = RobotsCreatorAndGod.bornANewRobot("B");
        RobotPrototype robotC = RobotsCreatorAndGod.bornANewRobot("C");

        this.modules.add(robotA.produceModule());
        this.modules.add(robotA.produceModule());
        this.modules.add(robotA.produceModule());

        this.modules.add(robotB.produceModule());
        this.modules.add(robotB.produceModule());

        this.modules.add(robotC.produceModule());
    }
}
