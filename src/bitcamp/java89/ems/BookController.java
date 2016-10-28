package bitcamp.java89.ems;
import java.util.Scanner;

public class BookController {
  Book[] books = new Book[100];
  int length = 0;
  Scanner keyScan;

  // 기본 생성자가 업기때문에 이 클래스를 사용하려면 반드시 스캐너를 줘야한다.
  // => 생성자는 객체를 사용하기전에 유효 상태로 만드는 것이다.
  public BookController(Scanner keyScan) {
    this.keyScan = keyScan;
  }

  void doList() {
    for (int i = 0; i < this.length; i++) {
      Book book1 = this.books[i];
      System.out.printf("제목 : %s\n",book1.title);
      System.out.printf("ISBN코드 : %s\n",book1.isbn);
      System.out.printf("저자 : %s\n",book1.writer);
      System.out.printf("출판사 : %s\n",book1.publisher);
      System.out.printf("가격 : %s\n",book1.price);
      System.out.printf("초판년도 : %s\n",book1.firstYear);
      System.out.printf("DVD 포함여부 : %s\n",((book1.dvd)?"yes" : "no"));
    }
  }

  void doAdd() {
    while (length < this.books.length) {
      Book book1 = new Book();

      System.out.print("제목? ");
      book1.title = this.keyScan.nextLine();

      System.out.print("ISBN코드? ");
      book1.isbn = this.keyScan.nextLine();

      System.out.print("저자? ");
      book1.writer = this.keyScan.nextLine();

      System.out.print("출판사? ");
      book1.publisher = this.keyScan.nextLine();

      System.out.print("가격?(예:39800) ");
      book1.price = Integer.parseInt(this.keyScan.nextLine());

      System.out.print("초판년도?(예:2015) ");
      book1.firstYear = Integer.parseInt(this.keyScan.nextLine());

      System.out.print("DVD 포함여부?(YES:y, NO:n) ");
      book1.dvd = (this.keyScan.nextLine().equals("y")) ? true : false;

      books[length++] = book1;

      System.out.print("게속 입력하시겠습니까(y/n)?");
      if (!this.keyScan.nextLine().equals("y"))
        break;
    }
  }

  public void doView() {
    System.out.println("조회할 책 이름은? ");
    String bookname = this.keyScan.nextLine().toLowerCase();
    for (int i = 0; i < length; i++) {
      if (this.books[i].title.toLowerCase().equals(bookname)) {
        System.out.printf("제목 : %s\n",this.books[i].title);
        System.out.printf("ISBN코드 : %s\n",this.books[i].isbn);
        System.out.printf("저자 : %s\n",this.books[i].writer);
        System.out.printf("출판사 : %s\n",this.books[i].publisher);
        System.out.printf("가격 : %s\n",this.books[i].price);
        System.out.printf("초판년도 : %s\n",this.books[i].firstYear);
        System.out.printf("DVD 포함여부 : %s\n",((this.books[i].dvd)?"yes" : "no"));
        break;
      }
    }
  }

  public void doDelete() {
    System.out.print("삭제할 책 제목은? ");
    String bookname = this.keyScan.nextLine().toLowerCase();

    for (int i = 0; i < this.length; i++) {
      if (this.books[i].title.toLowerCase().equals(bookname)) {
        for (int x = i + 1; x < this.length; x++, i++) {
          this.books[i] = this.books[x];
        }
        this.books[--length] = null;

        System.out.printf("%s 학생정보를 삭제하였습니다.\n", bookname);
        return;
      }
    }
    System.out.printf("%s 책이 없습니다.\n", bookname);
  }
}
