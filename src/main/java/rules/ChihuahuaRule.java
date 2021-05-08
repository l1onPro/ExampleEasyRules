package rules;

import model.Dog;
import model.TypeLengths;
import org.jeasy.rules.annotation.Action;
import org.jeasy.rules.annotation.Condition;
import org.jeasy.rules.annotation.Fact;
import org.jeasy.rules.annotation.Rule;


@Rule(name = "ChihuahuaRule", description = "Если собака короткошерстная, ростом менее 50 см, " +
        "с длинным хвостом, короткими ушами и с длинным телом, то порода – чихуахуа.", priority = 2)
public class ChihuahuaRule {

    @Condition
    public boolean isChihuahuaRule(@Fact("dog") Dog dog) {
        return dog.getTypeHair() == TypeLengths.shortType
                && dog.getHeight() <= 50
                && dog.getTypeTail() == TypeLengths.longType
                && dog.getTypeEars() == TypeLengths.shortType
                && dog.getTypeBody() == TypeLengths.longType;
    }

    @Action
    public void printChihuahuaRule(@Fact("dog")Dog dog) {
        System.out.println("собака №" + dog.getId() + ",порода - чихуахуа");
    }
}