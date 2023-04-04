package Setup;

import java.util.ArrayList;
import java.util.List;

public class Monsters {
    List<Creations> monsters;

    public Monsters() {
        this.monsters = new ArrayList<>();
        addToList();
    }

    public Creations get(int n) {
        return monsters.get(n);
    }

    public int size() {
        return monsters.size();
    }

    private void addToList() {
        monsters.add(new Magmar());
        monsters.add(new Wataroo());
    }

    
}
