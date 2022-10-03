package post;

import author.Author;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PostDAO {
    public List<Post> getPosts(){
        List<Post> post_list = new ArrayList<>();

        post_list.add(new Post(1, "Le Long Vu", "Java Mastery", "How to learn Java", "IT", LocalDate.of(2022, 4, 12)));
        post_list.add(new Post(2, "Le Long Vu", "Python Mastery", "How to learn Python", "IT", LocalDate.of(2022, 4, 13)));
        post_list.add(new Post(3, "Le Long Vu", "JS Mastery", "How to learn JS", "IT", LocalDate.of(2022, 4, 14)));
        post_list.add(new Post(4, "Bui Minh Duc", "Business Mastery", "How to make money", "BUS", LocalDate.of(2022, 8, 3)));
        post_list.add(new Post(5, "Bui Minh Duc", "Web Development", "How to create responsive website", "IT", LocalDate.of(2022, 8, 4)));
        post_list.add(new Post(6, "Nguyen Duc Vinh", "VueJS Framework", "How to learn framework", "IT", LocalDate.of(2022, 3, 23)));
        post_list.add(new Post(7, "Nguyen Duc Vinh", "Media Communication", "Media plays an important role", "Media", LocalDate.of(2022, 3, 24)));
        post_list.add(new Post(8, "Nguyen Duc Vinh", ".Net Development", "How to master C#", "IT", LocalDate.of(2022, 3, 25)));
        post_list.add(new Post(9, "Nguyen Duc Vinh", "Digital Marketing Mastery", "How to reach everyone in social media?", "Media", LocalDate.of(2016, 7, 4)));
        post_list.add(new Post(10, "Nguyen Duc Vinh", "League of Legends Mastery", "How to reach Diamond I", "Gaming", LocalDate.of(2020, 1, 1)));

        return post_list;

    }
}
