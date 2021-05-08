package rules;

import model.Dog;
import model.TypeLengths;
import org.jeasy.rules.annotation.Action;
import org.jeasy.rules.annotation.Condition;
import org.jeasy.rules.annotation.Fact;
import org.jeasy.rules.annotation.Rule;

@Rule(name = "GrandVendeeGriffonRule", description = "Если собака длинношерстная, " +
        "ростом более 50 см, но менее 70 см, с короткими ушами, то порода – колли.", priority = 2)
public class GrandVendeeGriffonRule {

    @Condition
    public boolean isGrandVendeeGriffonRule(@Fact("dog") Dog dog) {
        return dog.getTypeHair() == TypeLengths.longType
                && dog.getHeight() > 50 && dog.getHeight() <= 70
                && dog.getTypeEars() == TypeLengths.shortType;
    }

    @Action
    public void printGrandVendeeGriffonRule(@Fact("dog")Dog dog) {
        System.out.println("собака №" + dog.getId() + ",порода - колли");
    }
}