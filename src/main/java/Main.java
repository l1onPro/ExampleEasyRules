import model.Dog;
import model.Personality;
import model.TypeLengths;
import org.jeasy.rules.api.Facts;
import org.jeasy.rules.api.Rules;
import org.jeasy.rules.api.RulesEngine;
import org.jeasy.rules.core.DefaultRulesEngine;
import org.jeasy.rules.core.RulesEngineParameters;
import rules.*;

public class Main {
    public static void main(String[] args) {
        // create a rules engine
        RulesEngineParameters parameters = new RulesEngineParameters().skipOnFirstAppliedRule(true);
        RulesEngine fizzBuzzEngine = new DefaultRulesEngine(parameters);

        // create rules
        Rules rules = new Rules();
        rules.register(new EnglishBulldogRule());
        rules.register(new HoundRule());
        rules.register(new ChihuahuaRule());
        rules.register(new GreatDaneRule());
        rules.register(new FoxhoundRule());
        rules.register(new CockerSpanielRule());
        rules.register(new IrishSetterRule());
        rules.register(new GrandVendeeGriffonRule());
        rules.register(new KoliRule());


        //Example create god
        Dog dogExample = Dog.newBuilder(0)
                .setPersonality(Personality.friendly)
                .setTypeHair(TypeLengths.longType)
                .setHeight(59)
                .setTypeHair(TypeLengths.longType)
                .setTypeEars(TypeLengths.shortType)
                .setTypeBody(TypeLengths.longType)
                .setWeight(40)
                .build();

        Dog kolli = Dog.newBuilder(0)
                .setTypeHair(TypeLengths.longType)
                .setHeight(59)
                .setTypeEars(TypeLengths.shortType)
                .build();

        // fire rules
        Facts facts = new Facts();
        facts.put("dog", kolli);
        fizzBuzzEngine.fire(rules, facts);
        System.out.println();

    }
}


