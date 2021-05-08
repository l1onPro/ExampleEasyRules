package rules;

import model.Colors;
import model.Dog;
import model.TypeLengths;
import org.jeasy.rules.annotation.Action;
import org.jeasy.rules.annotation.Condition;
import org.jeasy.rules.annotation.Fact;
import org.jeasy.rules.annotation.Rule;

@Rule(name = "StBernardRule", description = "Если собака длинношерстная, " +
        "ростом более 50 см и  70 см, с рыжим окрасом и белыми отметинами, то порода – сенбернар.", priority = 2)
public class StBernardRule {

    @Condition
    public boolean isStBernardRule(@Fact("dog") Dog dog) {
        return dog.getTypeHair() == TypeLengths.longType
                && dog.getHeight() > 50
                && dog.getColorHair() == Colors.red
                && dog.getColorMarkings() == Colors.snow_white;
    }

    @Action
    public void printStBernardRule(@Fact("dog")Dog dog) {
        System.out.println("собака №" + dog.getId() + ",порода - сенбернар");
    }
}