package book;

import constant.Constant;
import utils.AnalyzingBook;

import java.io.IOException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Library {
    private Book[] books ;
    private int bookcount;
    public Library() {

    }
    private void loadAllBook() {
        try {
            AnalyzingBook analyzingBook = new AnalyzingBook();
            Book[] allBook = analyzingBook.loadObject(Constant.ALL_BOOK_FILE_NAME);
            books = new Book[Constant.CAPACITY];
            if (allBook == null) {
                bookcount = 0;
            } else {
                int allBookLen = allBook.length;
                if (allBookLen > books.length) {
                    books = new Book[allBookLen];
                }
                for (int i = 0; i < allBookLen; i++) {
                    books[i] = allBook[i];
                }
                bookcount = allBookLen;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private void storeBook() {
        try {
            AnalyzingBook analyzingBook = new AnalyzingBook();
            analyzingBook.storeObject(books,Constant.ALL_BOOK_FILE_NAME);
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void lookforbooks() {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        String bookname = scanner.nextLine();
        loadAllBook();
        for (int i = 0; i < bookcount; i++) {
            if((books[i].getTitle()).contains(bookname)){
                System.out.println("你要的书找到了！"+books[i].toString());
            }else{
                System.out.println("你要的书没有孩子");
            }
        }
    }

    public void loadallbooksname() {
        loadAllBook();
        System.out.println("library的loadallbooksname执行了");
        for(int i = 0; i < bookcount; i++){
            System.out.println(books[i].getTitle().toString());
            System.out.println("/n");
        }
    }
    public void loadallbooks() {
        loadAllBook();
        for(int i = 0; i < bookcount; i++){
            System.out.println(books[i].toString());
            System.out.println("/n");
        }
    }
    public void checkoneyearbooks() {
        loadAllBook();
        long currentTimestamp = System.currentTimeMillis();

        // 将当前时间戳转换为 LocalDate
        LocalDate currentDate = Instant.ofEpochMilli(currentTimestamp)
                .atZone(ZoneId.systemDefault())
                .toLocalDate();

        for(int i = 0; i < bookcount; i++){
            long hours =currentDate.until(books[i].getShelfDate(), ChronoUnit.HOURS);
            if(hours > 1)
            {
                removeBook(i);
            }
        }
    }

    public void removeBook(int index) {
        for (int a = index; a < books.length-1; a++) {
            books[a] = books[a+1];
            if(index == books.length-1){
                books[a] = null;
            }
        }
    }
    public void removeBook(String name) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        String bookname = scanner.nextLine();
        loadAllBook();
        for (int i = 0; i < bookcount; i++) {
            if((books[i].getTitle()).contains(bookname)){
                removeBook(i);
            }
        }
    }

    public void findborrowcount(String borrowcount){
        for (int i = 0; i < bookcount; i++) {
            if((books[i].getTitle()).contains(borrowcount)){
                System.out.println(books[i].getBorrowCount());
            }
        }
    }
    public void getgeneratebook() {
        int a = bookcount+1;
        while(a > bookcount) {
            System.out.println("你想知道前多少本最受欢迎的书？" + "不得超过" + bookcount);
            Scanner scanner = new Scanner(System.in);
            a = scanner.nextInt();
        }
        loadAllBook();
        Book[] book2 = new  Book[bookcount];
        int max;
        while(book2[a] == null){
            for(int i = 0; i < bookcount; i++){
                max = books[i].getBorrowCount();
                for(int j = 1; j < max; j++){
                    if(max < books[j].getBorrowCount()){
                        max = books[j].getBorrowCount();
                        book2[i] = books[j];
                        books[j].setBorrowCount(0);
                    }
                }
            }
        }
        for(int i = 0; i < a; i++){
            book2[i].toString();
        }
    }
    public void checkInventoryStatus(){
        loadAllBook();
        for(int i = 0; i < bookcount; i++){
            System.out.println(books[i].toString());
        }
    }
    public void borrowbook(String borrowcount){
        loadAllBook();
        for(int i = 0; i < bookcount; i++){
            if((books[i].getTitle()).contains(borrowcount)){
                books[i].setBorrowCount(books[i].getBorrowCount()+1);
                books[i].setBorrowed(true);
                System.out.println("ok,借书完成");
            }
        }
    }
    public void returnbook(){

        System.out.println("你要");
    }
}
