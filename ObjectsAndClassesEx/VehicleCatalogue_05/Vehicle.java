package VehicleCatalogue_05;

public class Vehicle {

    private String type;
    private String model;
    private String color;
    private int hp;


    // конструктор:
    public Vehicle(String type, String model, String color, int hp) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.hp = hp;
    }
    public String getModel() {
        return this.model;
    }
    public String getType() {
        return this.type;
    }
    public int getHp() {
        return this.hp;
    }

    @Override
    public String toString() {
        String typeVeh = type.equals("car") ? "Car" : "Truck";
        return "Type: " + typeVeh + "\n" +
                "Model: " +  model + "\n" +
                "Color: " + color + "\n" +
                "Horsepower: " + hp;
    }

   /* @Override
    public String toString() {
       String formattedType = "";
        if (this.type.equals("car")) {
            formattedType = "Car";
        } else if (this.type.equals("truck")) {
            formattedType = "Truck";
    }
        return String.format("Type: %s%nModel: %s%nColor: %s%nHorsepower: %d",
                this.type, this.model, this.color, this.hp);
    } */
}
