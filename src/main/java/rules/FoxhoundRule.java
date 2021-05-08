package rules;

import model.Dog;
import model.TypeLengths;
import org.jeasy.rules.annotation.Action;
import org.jeasy.rules.annotation.Condition;
import org.jeasy.rules.annotation.Fact;
import org.jeasy.rules.annotation.Rule;

@Rule(name = "FoxhoundRule", description = "Если собака короткошерстная, ростом более 50 см, весит менее 50 кг, то порода – фоксхаунд.", priority = 2)
public class FoxhoundRule {

    @Condition
    public boolean isFoxhoundRule(@Fact("dog") Dog dog) {
        return dog.getTypeHair() == TypeLengths.shortType
                && dog.getHeight() > 50
                && dog.getWeight() <= 50;
    }

    @Action
    public void printFoxhoundRule(@Fact("dog")Dog dog) {
        System.out.println("собака №" + dog.getId() + ",порода - фоксхаунд");
    }
}
