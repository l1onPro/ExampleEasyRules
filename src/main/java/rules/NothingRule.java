package rules;

import model.Dog;
import org.jeasy.rules.annotation.Action;
import org.jeasy.rules.annotation.Condition;
import org.jeasy.rules.annotation.Fact;
import org.jeasy.rules.annotation.Rule;

@Rule(name = "NewfoundlandRule", description = "Ничего не найдено для всех остальных случаев", priority = 3)
public class NothingRule {

    @Condition
    public boolean isNothingRule(@Fact("dog") Dog dog) {
        return true;
    }

    @Action
    public void printNothingRule(@Fact("dog")Dog dog) {
        System.out.println("собака №" + dog.getId() + ",порода - не определена");
    }
}