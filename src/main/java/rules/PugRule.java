package rules;

import model.Dog;
import model.TypeLengths;
import org.jeasy.rules.annotation.Action;
import org.jeasy.rules.annotation.Condition;
import org.jeasy.rules.annotation.Fact;
import org.jeasy.rules.annotation.Rule;

@Rule(name = "PugRule", description = "Если собака короткошерстная, ростом менее 50 см, " +
        "с длинным хвостом, короткими ушами и с коротким телом, то порода – мопс.", priority = 2)
public class PugRule {

    @Condition
    public boolean isPugRule(@Fact("dog") Dog dog) {
        return dog.getTypeHair() == TypeLengths.shortType
                && dog.getHeight() <= 50
                && dog.getTypeTail() == TypeLengths.longType
                && dog.getTypeBody() == TypeLengths.shortType
                && dog.getTypeEars() == TypeLengths.longType;
    }

    @Action
    public void printPugRule(@Fact("dog")Dog dog) {
        System.out.println("собака №" + dog.getId() + ",порода - мопс");
    }
}