package rules;

import model.Dog;
import model.Personality;
import model.TypeLengths;
import org.jeasy.rules.annotation.Action;
import org.jeasy.rules.annotation.Condition;
import org.jeasy.rules.annotation.Fact;
import org.jeasy.rules.annotation.Rule;

@Rule(name = "CockerSpanielRule", description = "Если собака длинношерстная, ростом менее 50 см, " +
        "с доброжелательным характером, то порода – кокер-спаниель.", priority = 2)
public class CockerSpanielRule {

    @Condition
    public boolean isCockerSpanielRule(@Fact("dog") Dog dog) {
        return dog.getTypeHair() == TypeLengths.longType
                && dog.getHeight() <= 50
                && dog.getPersonality() == Personality.friendly;
    }

    @Action
    public void printCockerSpanielRule(@Fact("dog")Dog dog) {
        System.out.println("собака №" + dog.getId() + ",порода - кокер-спаниель");
    }
}