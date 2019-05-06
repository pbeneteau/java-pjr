import java.util.Comparator;

public class MedianeCompare implements Comparator<Eleve> {

    @Override
    public int compare(Eleve o1, Eleve o2) {
        if (o1.getMediane() < o2.getMediane()) return -1;
        if (o1.getMediane() < o2.getMediane()) return 1;
        else return 0;
    }
}
