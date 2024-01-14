package openclosedprinciple.violation;

import common.data.SuperHero;

import java.util.List;

public class Attacker {

    public void attackWithSuperHeroes(List<SuperHero> superHeroes) {
        for (int i = 0; i < superHeroes.size(); i++) {
            SuperHero superHero = superHeroes.get(i);
            switch (superHero) {
                case CAPTAIN_AMERICA:
                    superHero.attackWithCaptAmerica();
                    break;
                case BAT_MAN:
                    superHero.attackWithBatMan();
                    break;
                case SPIDER_MAN:
                    superHero.attackWithSpiderMan();
                    break;
            }
        }
    }

}
