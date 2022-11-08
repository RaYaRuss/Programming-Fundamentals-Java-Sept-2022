package articles_02;

public class Article {

        private String title;
        private String content;
        private String author;

        //конструктор -> целта му е да създава нови обекти от съответния клас
    // alt + insert или  cmd + n -> за да си създадем конструктор

    public Article(String title, String content, String author) {
        // нов обект
        this.title = title;
        this.content = content;
        this.author = author;
    }
    // методи // setters v tozi sluchai
    public void edit (String newContent) {
        // съдържанието на обекта да се промени
        this.content = newContent;
    }
    public void changeAuthor (String newAuthor) {
        this.author = newAuthor;
    }
    public void rename (String newTitle) {
        this.title = newTitle;
    }
    // вгредн  метод toString
    @Override // пенаписва default method
    public String toString() {
        //return this.title + " - " + this.content + ": " + this.author;
        return String.format("%s - %s: %s", this.title, this.content, this.author);
        }
}
