package rules;

import model.Dog;
import model.Personality;
import model.TypeLengths;
import org.jeasy.rules.annotation.Action;
import org.jeasy.rules.annotation.Condition;
import org.jeasy.rules.annotation.Fact;
import org.jeasy.rules.annotation.Rule;

@Rule(name = "IrishSetterRule", description = "Если собака длинношерстная, ростом менее 50 см, " +
        "с недоброжелательным характером, то порода – ирландский сеттер.", priority = 2)
public class IrishSetterRule {

    @Condition
    public boolean isIrishSetterRule(@Fact("dog") Dog dog) {
        return dog.getTypeHair() == TypeLengths.longType
                && dog.getHeight() <= 50
                && dog.getPersonality() == Personality.unfriendly;
    }

    @Action
    public void printIrishSetterRule(@Fact("dog")Dog dog) {
        System.out.println("собака №" + dog.getId() + ",порода - кокер-спаниель");
    }
}