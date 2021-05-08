package rules;

import model.Dog;
import model.TypeLengths;
import org.jeasy.rules.annotation.Action;
import org.jeasy.rules.annotation.Condition;
import org.jeasy.rules.annotation.Fact;
import org.jeasy.rules.annotation.Rule;

@Rule(name = "GreatDaneRule", description = "Если собака короткошерстная, ростом более 50 см, весит более 50 кг, то порода – датский дог.", priority = 2)
public class GreatDaneRule {

    @Condition
    public boolean isGreatDaneRule(@Fact("dog") Dog dog) {
        return dog.getTypeHair() == TypeLengths.shortType
                && dog.getHeight() > 50
                && dog.getWeight() > 50;
    }

    @Action
    public void printGreatDaneRule(@Fact("dog")Dog dog) {
        System.out.println("собака №" + dog.getId() + ",порода - датский дог");
    }
}