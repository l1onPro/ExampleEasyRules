package rules;

import model.Dog;
import model.TypeLengths;
import org.jeasy.rules.annotation.Action;
import org.jeasy.rules.annotation.Condition;
import org.jeasy.rules.annotation.Fact;
import org.jeasy.rules.annotation.Rule;

@Rule(name = "EnglishBulldogRule", description = "Если собака короткошерстная, ростом менее 50см, с коротким хвостом, то порода - английский бульдог.", priority = 2)
public class EnglishBulldogRule {

    @Condition
    public boolean isEnglishBulldog(@Fact("dog")Dog dog) {
        return dog.getTypeHair() == TypeLengths.shortType
                && dog.getHeight() <= 50
                && dog.getTypeTail() == TypeLengths.shortType;
    }

    @Action
    public void printEnglishBulldog(@Fact("dog")Dog dog) {
        System.out.println("собака №" + dog.getId() + ", порода - английский бульдог");
    }
}
