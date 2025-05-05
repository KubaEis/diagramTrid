import java.time.LocalDate;
import java.util.ArrayList;

public class EMail extends Dokument{
    private ArrayList<String> authors;
    private LocalDate date;
    private String subjekt;
    private ArrayList<String> to;

    public String getSubjekt() {
        return subjekt;
    }

    public ArrayList<String> getTo() {
        return to;
    }

    @Override
    public LocalDate getDate() {
        return super.getDate();
    }

    @Override
    public void addAuthor(String name) {
        super.addAuthor(name);
    }

    @Override
    public ArrayList<String> getAuthors() {
        return super.getAuthors();
    }
}
