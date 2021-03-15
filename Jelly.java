
package foop.jellysweetOOPExercise;


public class Jelly {
    
    //Instance variables
    private String manufacturer;
    private float price;
    private String flavour;
    private float noOfCalories;
    private String expiryDate;
    
    //Constructors
    
    //Constructor with five arguments
    public Jelly(String manufacturer, float price, String flavour, 
            float noOfCalories, String expiryDate){
        this.manufacturer = manufacturer;
        this.price = price;
        this.flavour = flavour;
        this.noOfCalories = noOfCalories;
        this.expiryDate = expiryDate;
    }//end constructor
    
    //Constructor with four arguments
    public Jelly(String manufacturer, float price, String flavour, 
            float noOfCalories){
        this(manufacturer,price,flavour,noOfCalories, "not specified");
    }//end constructor
    
    //Constructor with three arguments
    public Jelly(String manufacturer, float price, String flavour){
        this(manufacturer,price,flavour,0.0f, "not specified");
    }//end constructor
    
    //Constructor with two arguments
    public Jelly(String manufacturer, float price){
      this(manufacturer,price,"not specified",0.0f,"not specified");
    }//end constructor
    
    //Constructor with one argument
    public Jelly(String manufacturer){
      this(manufacturer,0.0f,"not specified",0.0f,"not specified");
    }//end constructor
    
    //Constructor with no arguments
    public Jelly(){
        this("not specified",0.0f,"not specified",0.0f,"not specified");
    }//end constructor
    
    //Setters and Getters for each instance variable
    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }//end setter Manufacturer
    public String getManufacturer(){
        return manufacturer;
    }//end getter Manufacturer
    public void setPrice(float price){
        this.price = price;
    }//end setter Price
    public float getPrice(){
        return price;
    }//end getter Price
    public void setFlavour(String flavour){
        this.flavour = flavour;
    }//end setter Flavour
    public String getFlavour(){
        return flavour;
    }//end getter Flavour
    public void setNoOfCalories(float noOfCalories){
        this.noOfCalories = noOfCalories;
    }//end setter NoOfCalories
    public float getNoOfCalories(){
        return noOfCalories;
    }//end getter Number Of Calories
    public void setExpiryDate(String expiryDate){
        this.expiryDate = expiryDate;
    }//end setter Expiry Date
    public String getExpiryDate(){
        return expiryDate;
    }//end getter Expiry Date
    
    //Methods
    
    //Prints the following String 
    public String setInstructions(){
        return "Leave Jelly to set in a cool environment for 1hr";
    }//end setInstructions method
    
    //Displays the following fields
    public String toString(){
        return "Manufacturer: " + manufacturer + "\n" + "Price: " + "€"+price + 
                "\n" + "Flavour: " + flavour + "\n" + "No. of Calories: " + 
                noOfCalories + "\n" + "Expiry Date: " + expiryDate;
    }//end toString method
    
}//end class
