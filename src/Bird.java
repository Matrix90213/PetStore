public class Bird extends Animal {
    private String legs;
    private String typeOfMouth;
    private String noseColor;

    public Bird() {

    }
    public Bird(String species, String name, char sex) {
        super(species, name, sex);
    }
    public Bird(String species, String name, char sex, String legs, String typeOfMouth, String noseColor) {
        super(species, name, sex);
        this.legs = legs;
        this.typeOfMouth = typeOfMouth;
        this.noseColor = noseColor;
    }

    public String getLegs() {
        return legs;
    }
    public void setLegs(String legs) {
        this.legs = legs;
    }
    public String getTypeOfMouth() {
        return typeOfMouth;
    }
    public void setTypeOfMouth(String typeOfMouth) {
        this.typeOfMouth = typeOfMouth;
    }
    public String getNoseColor() {
        return noseColor;
    }
    public void setNoseColor(String noseColor) {
        this.noseColor = noseColor;
    }
    public String toString() {//Creando un metodo que ya existe, por lo tanto es Sobrecarga un metodo
        return "\n==========Datos del Pajaro==========\n" +
                "Su nombre es: " + this.getName() + "\n" +
                "Su especie es: " + this.getSpecies() + "\n" +
                "Su sexo es: " + this.getSex() + "\n" +
                "Tiene : " + this.getLegs() + " patas\n" +
                "Su tipo de pico es: " + this.getTypeOfMouth() + "\n" +
                "Su color de nariz es : " + this.getNoseColor() + "\n";
    }
}