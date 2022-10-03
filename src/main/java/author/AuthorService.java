package author;

import post.Post;
import post.PostDAO;

import java.util.*;

@FunctionalInterface
interface AuthorPredicate {
    boolean test(Author a);
}

@FunctionalInterface
interface AuthorFunction {
    String apply(Post p);
}

public class AuthorService {
    public static void main(String[] args) {
        List<Author> author_list = new AuthorDAO().getAuthors();
        List<Post> post_list = new PostDAO().getPosts();

        System.out.println("Get author by name:");
        System.out.println(new AuthorService().findAuthorbyPredicate(author_list, a -> a.getUsername().equals("Le Long Vu")));
        System.out.println("Get author by posts:");
        System.out.println(new AuthorService().findAuthorByFunction(post_list, p -> p.getAuthor()));
        System.out.println("Group By Posts by Author:");
        System.out.println(new AuthorService().groupedByAuthor(post_list, p -> p.getAuthor()));
    }

    List<Author> findAuthorbyPredicate(List<Author> authors, AuthorPredicate predicate){
        List<Author> authorByPredicate = new ArrayList<>();
        for (Author a : authors){
            if(predicate.test(a)){
                authorByPredicate.add(a);
            }
        }
        return authorByPredicate;
    }

    Set<String> findAuthorByFunction(List<Post> posts, AuthorFunction function){
        Set<String> authorByFunction = new HashSet<>();
        for (Post p : posts){
                authorByFunction.add(function.apply(p));
        }
        return authorByFunction;
    };

    Map<String, List<Post>> groupedByAuthor(List<Post> posts, AuthorFunction function){
        Map<String, List<Post>> authorByFunction = new HashMap<String, List<Post>>();
        for (Post p : posts){
            if (authorByFunction.get(function.apply(p)) == null){
                List<Post> values = new ArrayList<>();
                values.add(p);
                authorByFunction.put(function.apply(p), values);
            } else{
                authorByFunction.get(function.apply(p)).add(p);
            }
        }

        return authorByFunction;
    }
}

