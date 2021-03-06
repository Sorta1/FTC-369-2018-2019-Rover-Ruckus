package org.firstinspires.ftc;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import static org.firstinspires.ftc.Constants.*;

@Autonomous(name="Left Red Autonomous", group="K9bot")
public class CraterAuto extends AutonomousBase {

    public CraterAuto() {
        super(true);
    }

    @Override
    public void runOpModeImpl() {
        double fastness = 0.2; //make this value BIG
        deployBot();
        helper.drive(fastness, FOOT_SQRT_2);
        Position place = Position.LEFT;
        switch(place) {
            case LEFT:
                helper.rotate(-45, fastness, false);
                helper.drive(fastness, 24);
                //helper.diaganolDrive(fastness, 2, 'l');
                helper.rotate(-45, fastness, false);
                helper.drive(fastness, FOOT_SQRT_2);
                helper.rotate(-45, fastness, false);
                helper.drive(fastness, 60);
                break;
            case MIDDLE:
                helper.drive(fastness, FOOT_SQRT_2);
                helper.drive(-fastness, FOOT_SQRT_2);
                helper.rotate(-90, fastness, false);
                helper.drive(fastness, 3*FOOT_SQRT_2);
                helper.rotate(-45, fastness, false);
                helper.drive(fastness, 36);
                break;
            case RIGHT:
                helper.rotate(45, fastness, false);
                helper.drive(fastness, 24);
                helper.drive(-fastness, 24);
                helper.rotate(-135, fastness, false);
                helper.drive(fastness, 3 *FOOT_SQRT_2);
                helper.rotate(-45, fastness, false);
                break;
        }
        dropTrophy();
        helper.drive(-fastness, 8);
    }
}
