import javax.swing.JLabel;

public class Country
{
  // add private instance variables for the name, capital, language, and image file.
  private String name;
  private String capital;
  private String language;
  private String imageFileName;
  // add constructors
  public Country(){
    this.name =  "Germany";
    this.capital = "Berlin";
    this.language = "German";
    this.imageFileName = "Germany.jpg";
  }
  public Country (String countryName, String countryCapital, String countryPrimaryLanguage, String countryImageFileName){
    this.name = countryName;
    this.capital = countryCapital;
    this.language = countryPrimaryLanguage;
    this.imageFileName = countryImageFileName;
  }
  // Write accessor/get methods for each instance variable that returns it.
  public String getName(){
    return name;
  }
  public String getCapital(){
    return capital;
  }
  public String getLanguage(){
    return language;
  }
  public String getImageFileName(){
    return imageFileName;
  }
 
  // Write a toString() method that returns a concatenated String of 3 of the instance variables in a sentence like "..'s capital is .. and its primary language is ..."
 public String toString(){
  return this.name + "'s capital is " + this.capital + " and its primary language is " + this.language;
 }


  
}