package rules;

import model.Dog;
import model.TypeLengths;
import org.jeasy.rules.annotation.Action;
import org.jeasy.rules.annotation.Condition;
import org.jeasy.rules.annotation.Fact;
import org.jeasy.rules.annotation.Rule;


@Rule(name = "HoundRule", description = "Если собака короткошерстная, ростом менее 50 см, с длинным хвостом, длинными ушами, то порода – гончая.", priority = 2)
public class HoundRule {

    @Condition
    public boolean isHoundRule(@Fact("dog") Dog dog) {
        return dog.getTypeHair() == TypeLengths.shortType
                && dog.getHeight() <= 50
                && dog.getTypeTail() == TypeLengths.longType
                && dog.getTypeEars() == TypeLengths.longType;
    }

    @Action
    public void printHoundRule(@Fact("dog")Dog dog) {
        System.out.println("собака №" + dog.getId() + ",порода - гончая");
    }
}