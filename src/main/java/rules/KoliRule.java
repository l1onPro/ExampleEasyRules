package rules;

import model.Dog;
import model.TypeLengths;
import org.jeasy.rules.annotation.Action;
import org.jeasy.rules.annotation.Condition;
import org.jeasy.rules.annotation.Fact;
import org.jeasy.rules.annotation.Rule;

@Rule(name = "KoliRule", description = "Если собака длинношерстная, " +
        "ростом более 50 см, но менее 70 см, с короткими ушами, то порода – колли.", priority = 2)
public class KoliRule {

    @Condition
    public boolean isKoliRule(@Fact("dog") Dog dog) {
        return dog.getTypeHair() == TypeLengths.longType
                && dog.getHeight() > 50 && dog.getHeight() <= 70
                && dog.getTypeEars() == TypeLengths.shortType;
    }

    @Action
    public void printKoliRule(@Fact("dog")Dog dog) {
        System.out.println("собака №" + dog.getId() + ",порода - колли");
    }
}