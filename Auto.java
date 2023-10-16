package Java;

public class Auto {

    private String model;
    private String brand;
    private String licensePlate;
    private int displacement ;

    public String getModel(){
        return model;
    }
    public String getBrand() {
        return brand;
    }

    public String getLicensePlate(){
        return  licensePlate;
    }
    public int getDisplacement() {
        return displacement;
    }
    public void setDisplacement(int displacement){
        this.displacement = displacement;
    }



    public Auto (String model, String brand, String licensePlate){
        this.model = model;
        this.brand = brand;
        this.licensePlate = licensePlate;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "displacement=" + displacement +
                ", brand='" + brand + '\'' +
                ", licensePlate='" + licensePlate + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
