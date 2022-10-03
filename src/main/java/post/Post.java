package post;

import java.time.LocalDate;

public class Post {
    private Integer id;
    private String author;
    private String title;
    private String description;
    private String content;
    private LocalDate date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", content='" + content + '\'' +
                ", date=" + date +
                '}';
    }

    public Post(Integer id, String author, String title, String description, String content, LocalDate date) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.description = description;
        this.content = content;
        this.date = date;
    }

    public Post() {
    }

}
