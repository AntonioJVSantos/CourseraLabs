public class Cofee {
    private int temperature;

    public Cofee(int temperature) throws TooHotException {
        this.setTemperature(temperature);
    }

    public Cofee() {
    }

    public void setTemperature(int temperature) throws TooHotException {
        if(temperature>120){
            throw new TooHotException("Coffee is too hot");            
        }
        else{
            this.temperature = temperature;
        }
        
    }

    public int getTemperature() {
        return temperature;
    }
    
    
}
