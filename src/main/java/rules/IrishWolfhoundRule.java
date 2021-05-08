package rules;

import model.Colors;
import model.Dog;
import model.TypeLengths;
import org.jeasy.rules.annotation.Action;
import org.jeasy.rules.annotation.Condition;
import org.jeasy.rules.annotation.Fact;
import org.jeasy.rules.annotation.Rule;

@Rule(name = "IrishWolfhoundRule", description = "Если собака длинношерстная, " +
        "ростом более 50 см и  70 см, с белоснежным окрасом,  то порода – ирландский волкодав.", priority = 2)
public class IrishWolfhoundRule {

    @Condition
    public boolean isIrishWolfhoundRule(@Fact("dog") Dog dog) {
        return dog.getTypeHair() == TypeLengths.longType
                && dog.getHeight() > 50
                && dog.getColorHair() == Colors.white;
    }

    @Action
    public void printIrishWolfhoundRule(@Fact("dog")Dog dog) {
        System.out.println("собака №" + dog.getId() + ",порода - ирландский волкодав");
    }
}