package rules;

import model.Colors;
import model.Dog;
import model.TypeLengths;
import org.jeasy.rules.annotation.Action;
import org.jeasy.rules.annotation.Condition;
import org.jeasy.rules.annotation.Fact;
import org.jeasy.rules.annotation.Rule;

import java.awt.*;

@Rule(name = "NewfoundlandRule", description = "Если собака длинношерстная, " +
        "ростом более 50 см и  70 см, не с рыжим и  не белоснежным окрасом,  то порода – ньюфаундленд.", priority = 2)
public class NewfoundlandRule {

    @Condition
    public boolean isNewfoundlandRule(@Fact("dog") Dog dog) {
        return dog.getTypeHair() == TypeLengths.longType
                && dog.getHeight() > 50
                && dog.getColorHair() != Colors.white
                && dog.getColorMarkings() != Colors.red;
    }

    @Action
    public void printNewfoundlandRule(@Fact("dog")Dog dog) {
        System.out.println("собака №" + dog.getId() + ",порода - ньюфаундленд");
    }
}