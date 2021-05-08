package model;

public class Dog {
    private long id;
    private TypeLengths typeHair;           //короткошерстая/длинношерстая
    private int height;                     //рост
    private TypeLengths typeTail;           //хвост
    private TypeLengths typeEars;           //уши
    private TypeLengths typeBody;           //тело
    private int weight;                     //вес
    private Personality personality;        //характер
    private Colors colorHair;               //окрас
    private Colors colorMarkings;           //отметины

    public Dog(long id) {
        this.id = id;
    }

    public static Builder newBuilder(long id) {
        return new Dog(id).new Builder();
    }

    public class Builder {

        private Builder(){

        }

        public Dog build() {
            return Dog.this;
        }

        public Builder setId(long id) {
            Dog.this.id = id;
            return this;
        }

        public Builder setPersonality(Personality personality) {
            Dog.this.personality = personality;
            return this;
        }

        public Builder setTypeHair(TypeLengths typeHair) {
            Dog.this.typeHair = typeHair;
            return this;
        }

        public Builder setHeight(int height) {
            Dog.this.height = height;
            return this;
        }

        public Builder setTypeTail(TypeLengths typeTail) {
            Dog.this.typeTail = typeTail;
            return this;
        }

        public Builder setTypeEars(TypeLengths typeEars) {
            Dog.this.typeEars = typeEars;
            return this;
        }

        public Builder setTypeBody(TypeLengths typeBody) {
            Dog.this.typeBody = typeBody;
            return this;
        }

        public Builder setWeight(int weight) {
            Dog.this.weight = weight;
            return this;
        }

        public Builder setColorHair(Colors colorHair) {
            Dog.this.colorHair = colorHair;
            return this;
        }

        public Builder setColorMarkings(Colors colorMarkings) {
            Dog.this.colorMarkings = colorMarkings;
            return this;
        }
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Colors getColorHair() {
        return colorHair;
    }

    public void setColorHair(Colors colorHair) {
        this.colorHair = colorHair;
    }

    public Colors getColorMarkings() {
        return colorMarkings;
    }

    public void setColorMarkings(Colors colorMarkings) {
        this.colorMarkings = colorMarkings;
    }

    public Personality getPersonality() {
        return personality;
    }

    public void setPersonality(Personality personality) {
        this.personality = personality;
    }

    public TypeLengths getTypeHair() {
        return typeHair;
    }

    public void setTypeHair(TypeLengths typeHair) {
        this.typeHair = typeHair;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public TypeLengths getTypeTail() {
        return typeTail;
    }

    public void setTypeTail(TypeLengths typeTail) {
        this.typeTail = typeTail;
    }

    public TypeLengths getTypeEars() {
        return typeEars;
    }

    public void setTypeEars(TypeLengths typeEars) {
        this.typeEars = typeEars;
    }

    public TypeLengths getTypeBody() {
        return typeBody;
    }

    public void setTypeBody(TypeLengths typeBody) {
        this.typeBody = typeBody;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
