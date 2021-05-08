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

    public Dog(long id, TypeLengths typeHair, int height, TypeLengths typeTail) {
        this.id = id;
        this.typeHair = typeHair;
        this.height = height;
        this.typeTail = typeTail;
    }

    public Dog(long id, TypeLengths typeHair, int height, TypeLengths typeTail, TypeLengths typeEars) {
        this.id = id;
        this.typeHair = typeHair;
        this.height = height;
        this.typeTail = typeTail;
        this.typeEars = typeEars;
    }

    public Dog(long id, TypeLengths typeHair, int height, TypeLengths typeTail, TypeLengths typeEars, TypeLengths typeBody) {
        this.id = id;
        this.typeHair = typeHair;
        this.height = height;
        this.typeTail = typeTail;
        this.typeEars = typeEars;
        this.typeBody = typeBody;
    }

    public Dog(long id, TypeLengths typeHair, int height, int weight) {
        this.id = id;
        this.typeHair = typeHair;
        this.height = height;
        this.weight = weight;
    }

    public Dog(long id, TypeLengths typeHair, int height, Personality personality) {
        this.id = id;
        this.typeHair = typeHair;
        this.height = height;
        this.personality = personality;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
