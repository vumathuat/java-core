package authority;

import java.util.ArrayList;
import java.util.List;

public class AuthorityDAO {
    public List<Authority> getAuthorities() {
        List<Authority> authority_list = new ArrayList<>();

        authority_list.add(new Authority("Le Long Vu", "Admin"));
        authority_list.add(new Authority("Bui Minh Duc", "User"));
        authority_list.add(new Authority("Nguyen Duc Vinh", "Developer"));
        authority_list.add(new Authority("Le Long Vu", "Developer"));
        authority_list.add(new Authority("Le Long Vu", "User"));
        authority_list.add(new Authority("Nguyen Duc Vinh", "User"));

        return authority_list;
    }
}
