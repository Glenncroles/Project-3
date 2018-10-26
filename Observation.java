
public class Observation extends AbstractObservation
{
    /**
     * The value to be observed.
     */
    protected double value; 
    
    /**
     * I truely dont know.
     */
    protected String stid;
    
    
    
    /**
     * Takes in a value and stid
     * 
     * @param value and stid
     */
    public Observation(double value, String stid)
    {
        this.value = value;
        this.stid = stid;
    }
    
    

    /**
     * generate getters and setters
     */

    public double getValue()
    {
        return value;
    }

    
    /**
     * isValid is a boolean that is true if the value is above -990 because the fails are from -999 to
     * -995 therfore will catch all of them
     * @return valid
     */
    
    public boolean isValid()
    {
        //
        if(value < -990)
        {
            valid = false;
        }
        else
        {
            valid = true;
        }
        return valid;
    }

    /**
     * gets the stid 
     * @return
     */
    public String getStid()
    {
        return stid;
    }
    
    /**
     * toString for some uknown reason
     */
    
    public String toString()
    {
        return " ";
    }



    
    
    
    
}
