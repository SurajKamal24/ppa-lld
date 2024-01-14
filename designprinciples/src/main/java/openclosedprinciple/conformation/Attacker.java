package openclosedprinciple.conformation;

import java.util.List;

public class Attacker {

    public void attackWithSuperHeroes(List<SuperHero> superHeroes) {
        for (int i = 0; i < superHeroes.size(); i++) {
            SuperHero superHero = superHeroes.get(i);
            superHero.attack();
        }
    }
}
