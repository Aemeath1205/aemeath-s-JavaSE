package utils;

import book.Book;
import com.bit.utils.FileUtils;
import constant.Constant;

import java.io.IOException;
import java.time.LocalDate;

public class AnalyzingBook {

    public void storeObject(Book[] books, String filename) throws IOException {
        int bookUseLen = 0;
        for(int index = 0; index < books.length; index++) {
            if (books[index] != null) {
                bookUseLen ++;
            }
        }
        StringBuilder josnArray =  new StringBuilder();
        for(int index = 0; index < books.length; index++) {
            if (books[index] != null) {
                josnArray.append(books[index].toJson());
                if(index != books.length-1){
                    josnArray.append("\n");
                }
            }
        }
        FileUtils.writeFile(josnArray.toString(), filename);
    }

    public Book[] loadObject(String filename) throws IOException{
        String josnArray = FileUtils.readFile(filename);
        if(josnArray == null||josnArray.equals("")){
            System.out.println("图书馆现在是空的");
            return null;
        }
        String[] josnArr = josnArray.split("\n");
        Book[] books = new Book[josnArr.length];
        for(int index = 0; index < josnArr.length; index++){
            Book book = parseBook(josnArr[index]);
            books[index] = book;
        }
        return books;
    }

    private Book parseBook(String json){
        if(json == null){
            return null;
        }
        String[] josnArr = json.split(",");
        int bookId = Integer.parseInt(josnArr[0]);
        String title = josnArr[1];
        String author = josnArr[2];
        String category = josnArr[3];
        int publishYear = Integer.parseInt(josnArr[4]);
        boolean isBorrowed = Boolean.parseBoolean(josnArr[5]);
        int borrowCount = Integer.parseInt(josnArr[6]);
        LocalDate shelfDate = LocalDate.parse(josnArr[7]);
        if(title != null && author != null && category != null && shelfDate != null){
            Book book = new Book(title,author,category,publishYear,shelfDate);
            book.setBookId(bookId);
            book.setBorrowed(isBorrowed);
            book.setBorrowCount(borrowCount);
            return book;
        }
        return null;
    }
    public static void main1(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("java", "gaobo", "编程", 1994, LocalDate.of(2023, 9, 24));
        books[1] = new Book("mysql", "lisi", "编程", 1999, LocalDate.of(2024, 2, 10));
        books[2] = new Book("php", "gaobo", "编程", 2020, LocalDate.of(2023, 9, 23));
        books[3] = new Book("西游记", "吴承恩", "小说", 2024, LocalDate.of(2023, 9, 23));

        AnalyzingBook analyzingBook = new AnalyzingBook();

        try {
            analyzingBook.storeObject(books,(Constant.ALL_BOOK_FILE_NAME));

            Book[] ret = analyzingBook.loadObject(Constant.ALL_BOOK_FILE_NAME);

            for (int i = 0; i < ret.length; i++) {
                System.out.println(ret[i]);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
