package bitcamp.java89.ems;
import java.util.Scanner;

public class BookController {
  Book[] books = new Book[100];
  int length = 0;
  Scanner keyScan;


  public BookController(Scanner keyScan) {
    this.keyScan = keyScan;
  }

  public void doAdd() {
    while (length < this.books.length) {
      Book book = new Book();

      System.out.print("책 이름 : ");
      book.title = keyScan.nextLine();
      System.out.print("ISBN코드 : ");
      book.isbn = keyScan.nextLine();
      System.out.print("저자 : ");
      book.writer = keyScan.nextLine();
      System.out.print("출판사 : ");
      book.publisher = keyScan.nextLine();
      System.out.print("가격 : (예:39800) ");
      book.price = Integer.parseInt(keyScan.nextLine());
      System.out.print("출판년도 :(예:2014) ");
      book.firstYear = Integer.parseInt(keyScan.nextLine());
      System.out.print("DVD 포함 여부 :(y/n) ");
      book.dvd = (keyScan.nextLine().equals("y")) ? true : false;

      this.books[length++] = book;

      System.out.printf("게속 입력하시겠습니까?(y/n) ");
      if (!keyScan.nextLine().equals("y")) {
        break;
      }
    }
  }

  public void doView() {
    System.out.print("책 제목을 입력하세요 : ");
    String bookName = keyScan.nextLine();

    for(int i = 0; i < this.length; i++) {
      if (bookName.equals(this.books[i].title)) {
        System.out.printf("책 이름 : %s\n", this.books[i].title);
        System.out.printf("ISBN코드 : %s\n", this.books[i].isbn);
        System.out.printf("저자 : %s\n", this.books[i].writer);
        System.out.printf("출판사 : %s\n", this.books[i].publisher);
        System.out.printf("가격 : %d\n", this.books[i].price);
        System.out.printf("출판년도 : %d\n", this.books[i].firstYear);
        System.out.printf("DVD 포함 여부 : %s\n", (this.books[i].dvd) ? "yes" : "no");
        return;
      }
    }
    System.out.printf("일치하는 책이 없습니다.\n");
  }

  public void doList() {
    for (int i = 0; i < this.length; i++) {

      System.out.printf("%s, %s, %s, %s, %d, %d, %s\n",
        this.books[i].title,
        this.books[i].isbn,
        this.books[i].writer,
        this.books[i].publisher,
        this.books[i].price,
        this.books[i].firstYear,
        ((this.books[i].dvd)?"yes":"no"));
    }
  }

  public void doDelete() {
    System.out.print("책 제목을 입력하세요 : ");
    String bookName = keyScan.nextLine().toLowerCase();

    for(int i = 0; i < this.length; i++) {
      if (this.books[i].title.toLowerCase().equals(bookName)) {
        for (int x = i + 1; x < this.length; x++, i++) {
          this.books[i] = this.books[x];
        }
        this.books[--length] = null;

        System.out.printf("%s 책 정보를 삭제하였습니다.\n", bookName);
        return;
      }
    }
    System.out.printf("%s 책 정보가 업습니다.\n", bookName);
  }

  public void doUpdate() {
    System.out.print("수정할 책 제목을 입력하세요 : ");
    String bookName = keyScan.nextLine().toLowerCase();
    for (int i = 0; i < this.length; i++) {
      if (this.books[i].title.toLowerCase().equals(bookName)) {
        Book book = new Book();

        System.out.print("책 이름 : ");
        book.title = keyScan.nextLine();
        System.out.print("ISBN코드 : ");
        book.isbn = keyScan.nextLine();
        System.out.print("저자 : ");
        book.writer = keyScan.nextLine();
        System.out.print("출판사 : ");
        book.publisher = keyScan.nextLine();
        System.out.print("가격 : (예:39800) ");
        book.price = Integer.parseInt(keyScan.nextLine());
        System.out.print("출판년도 :(예:2014) ");
        book.firstYear = Integer.parseInt(keyScan.nextLine());
        System.out.print("DVD 포함 여부 :(y/n) ");
        book.dvd = (keyScan.nextLine().equals("y")) ? true : false;

        System.out.print("저장하시겟습니까?(y/n)? ");
        if (keyScan.nextLine().toLowerCase().equals("y")) {
          this.books[i] = book;
          System.out.println("저장완료");
        }  else {
          System.out.println("변경 취소");
        }
        return;
      }
    }
  }
}
