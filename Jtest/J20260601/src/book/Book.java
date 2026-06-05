package book;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Book implements Comparable<Book> {
    private int bookId; //书id
    private String title; // 书名
    private String author; // 作者
    private String category; // 类别
    private int publishYear; // 出版年份
    private boolean isBorrowed; // 借阅状态
    private int borrowCount; // 借阅次数
    private LocalDate shelfDate; // 上架时间
    public Book(String title, String author, String category, int publishYear, LocalDate shelDate) {
        this.title = title;
        this.author = author;
        this.category = category;
        this.isBorrowed = false;
        this.borrowCount = 0;
        this.shelfDate = shelfDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public int getBorrowCount() {
        return borrowCount;
    }

    public void setBorrowCount(int borrowCount) {
        this.borrowCount = borrowCount;
    }

    public LocalDate getShelfDate() {
        return shelfDate;
    }

    public void setShelfDate(LocalDate shelfDate) {
        this.shelfDate = shelfDate;
    }

    @Override
    public int compareTo(Book o) {
        return o.bookId - this.bookId;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", category='" + category + '\'' +
                ", publishYear=" + publishYear +
                ", isBorrowed=" + isBorrowed +
                ", borrowCount=" + borrowCount +
                ", shelfDate=" + shelfDate +
                '}';
    }

    public String toJson() {
        StringBuilder json = new StringBuilder();
        json.append(bookId).append(",");
        json.append(title).append(",");
        json.append(author).append(",");
        json.append(category).append(",");
        json.append(publishYear).append(",");
        json.append(isBorrowed).append(",");
        json.append(borrowCount).append(",");
        json.append(shelfDate != null ?
                shelfDate.format(DateTimeFormatter.ISO_LOCAL_DATE) : "null");
        return json.toString();
    }
    Library library = new Library();


}
