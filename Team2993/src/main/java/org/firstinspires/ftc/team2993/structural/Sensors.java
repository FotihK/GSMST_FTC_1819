package org.firstinspires.ftc.team2993.structural;

import com.qualcomm.hardware.modernrobotics.ModernRoboticsI2cColorSensor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Sensors
{
    public ModernRoboticsI2cColorSensor color;
    private HardwareMap map;

    public Sensors(HardwareMap _map)
    {
        map = _map;
        init();
    }

    public void init()
    {
        color = (ModernRoboticsI2cColorSensor) map.colorSensor.get("color");
    }

    public int GetColor()
    {
        return color.red() - color.blue();
    }
}