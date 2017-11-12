//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 6 Program Challenges #6

// The "Temperature" class.
public class Temperature
{
    private double EthylFreezing = -173;
    private double EthylBoiling = 172;

    private double OxygenFreezing = -362;
    private double OxygenBoiling = -306;

    private double WaterFreezing = 32;
    private double WaterBoiling = 212;

    public boolean isEthylFreezing (double temperature)
    {
	if (temperature < EthylFreezing)
	    return true;
	else
	    return false;
    }


    public boolean isEthylBoiling (double temperature)
    {
	if (temperature > EthylBoiling)
	    return true;
	else
	    return false;
    }


    public boolean isOxygenFreezing (double temperature)
    {
	if (temperature < OxygenFreezing)
	    return true;
	else
	    return false;
    }


    public boolean isOxygenBoiling (double temperature)
    {
	if (temperature < OxygenBoiling)
	    return true;
	else
	    return false;
    }


    public boolean isWaterFreezing (double temperature)
    {
	if (temperature < WaterFreezing)
	    return true;
	else
	    return false;
    }


    public boolean isWaterBoiling (double temperature)
    {
	if (temperature < WaterBoiling)
	    return true;
	else
	    return false;
    }
}
