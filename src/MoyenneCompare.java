import java.util.Comparator;


public class MoyenneCompare implements Comparator<Eleve> {

    @Override
    public int compare(Eleve o1, Eleve o2) {
        if (o1.getMoyenne() < o2.getMoyenne()) return -1;
        if (o1.getMoyenne() < o2.getMoyenne()) return 1;
        else return 0;
    }
}
