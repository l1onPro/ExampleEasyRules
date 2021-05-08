import model.Dog;
import model.TypeLengths;
import org.jeasy.rules.api.Facts;
import org.jeasy.rules.api.Rules;
import org.jeasy.rules.api.RulesEngine;
import org.jeasy.rules.core.DefaultRulesEngine;
import org.jeasy.rules.core.RulesEngineParameters;
import rules.EnglishBulldogRule;
import rules.HoundRule;

public class Main {
    public static void main(String[] args) {
        // create a rules engine
        RulesEngineParameters parameters = new RulesEngineParameters().skipOnFirstAppliedRule(true);
        RulesEngine fizzBuzzEngine = new DefaultRulesEngine(parameters);

        // create rules
        Rules rules = new Rules();
        rules.register(new EnglishBulldogRule());
        rules.register(new HoundRule());

        // fire rules
        Facts facts = new Facts();
        facts.put("dog", new Dog(0, TypeLengths.shortType, 20, TypeLengths.shortType));
        fizzBuzzEngine.fire(rules, facts);
        System.out.println();

        facts.put("dog", new Dog(1, TypeLengths.shortType, 51, TypeLengths.shortType));
        fizzBuzzEngine.fire(rules, facts);
        System.out.println();

        facts.put("dog", new Dog(2, TypeLengths.shortType, 20, TypeLengths.longType, TypeLengths.longType));
        fizzBuzzEngine.fire(rules, facts);
        System.out.println();

        facts.put("dog", new Dog(3, TypeLengths.shortType, 51, TypeLengths.longType, TypeLengths.longType));
        fizzBuzzEngine.fire(rules, facts);
        System.out.println();


    }
}


