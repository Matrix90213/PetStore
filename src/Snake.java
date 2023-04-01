    public  class Snake extends Animal {
        private String scaleColor;
        private String scrollType;
        private String typeOfPoison;

        public Snake() {

        }
        public Snake(String species, String name, char sex) {
            super(species, name, sex);
        }
        public Snake(String species, String name, char sex, String scaleColor, String scrollType, String typeOfPoison) {
            super(species, name, sex);
            this.scaleColor = scaleColor;
            this.scrollType = scrollType;
            this.typeOfPoison = typeOfPoison;
        }

        public String getScaleColor() {
            return scaleColor;
        }
        public void setScaleColor(String scaleColor) {
            this.scaleColor = scaleColor;
        }
        public String getScrollType() {
            return scrollType;
        }
        public void setScrollType(String scrollType) {
            this.scrollType = scrollType;
        }
        public String getTypeOfPoison() {
            return typeOfPoison;
        }
        public void setTypeOfPoison(String typeOfPoison) {
            this.typeOfPoison = typeOfPoison;
        }
        public String toString() {//Creando un metodo que ya existe, por lo tanto es Sobrecarga un metodo
            return "\n==========Datos de la Serpiente==========\n" +
                    "Su nombre es: " + this.getName() + "\n" +
                    "Su especie es: " + this.getSpecies() + "\n" +
                    "Su sexo es: " + this.getSex() + "\n" +
                    "Su color de escama es: " + this.getScaleColor() + "\n" +
                    "Su tipo de desplazamiento es: " + this.getScrollType() + "\n" +
                    "Su tipo de veneno es: " + this.getTypeOfPoison() + "\n";
        }
    }

