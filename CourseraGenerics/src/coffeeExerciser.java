public class coffeeExerciser {
    public static void main(String[] args) {
        Cofee coffee = new Cofee();
        try{
            coffee.setTemperature(110);
        }catch(TooHotException e){
            System.out.println(e.getMessage());

        }finally{
            System.out.println("coffee is set to: "+coffee.getTemperature());
        }
    }
    
}
