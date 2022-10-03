package author;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AuthorDAO {
    public List<Author> getAuthors(){
        List<Author> author_list = new ArrayList<>();

        author_list.add(new Author("Le Long Vu", "12345678", "Vu", "Le", "longvule070402@gmail.com", LocalDate.of(2002, 4, 07), LocalDate.now()));
        author_list.add(new Author("Bui Minh Duc", "12345678", "Duc", "Bui", "buiminhduc@gmail.com", LocalDate.of(2002, 8, 03), LocalDate.now()));
        author_list.add(new Author("Nguyen Duc Vinh", "12345678", "Vinh", "Nguyen", "vinhnguyen@gmail.com", LocalDate.of(2002, 3, 13), LocalDate.now()));
        return author_list;
    }
}
