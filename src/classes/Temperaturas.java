package classes;

public class Temperaturas {
    String mes;
    String temp;
   


    public Temperaturas(String mes, String temp) {
        this.mes = mes;
        this.temp = temp;
    }
 

    @Override
    public String toString() {
        return "{" +
            " mes='" + getMes() + "'" +
            ", temp='" + getTemp() + "'" +
            "}";
    }
 


    public String getMes() {
        return this.mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getTemp() {
        return this.temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }
  
    

}
