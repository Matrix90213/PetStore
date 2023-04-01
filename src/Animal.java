public class Animal {
    private String species;
    private String name;
    private char sex;

    public Animal() {
    }
    public Animal(String species, String name, char sex) {
        this.species = species;
        this.name = name;
        this.sex = sex;
    }
    public String getSpecies() {
        return species;
    }
    public void setSpecies(String species) {
        this.species = species;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public char getSex() {
        return sex;
    }
    public void setSex(char sex) {
        this.sex = sex;
    }
}

