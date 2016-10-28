package bitcamp.java89.ems;
import java.util.Scanner;

public class EduApp {
  public static void main(String[] args) {
    System.out.println("비트캠프 관리시스템에 오신걸 환영합니다.");

    Book[] books = new Book[100];
    int length = 0; // 레퍼런스 배열에 몇개에 책 정보를 저장했는지 개수를 지정한다
                    // 레퍼런스 배열에 몇 개의 Book 인스턴스가 들어있는지 그 개수를 보관한다.
    Scanner keyScan = new Scanner(System.in);


    while (length < books.length) {
      Book book1 = new Book();

      System.out.print("제목? ");
      book1.title = keyScan.nextLine();

      System.out.print("ISBN코드? ");
      book1.isbn = keyScan.nextLine();

      System.out.print("저자? ");
      book1.writer = keyScan.nextLine();

      System.out.print("출판사? ");
      book1.publisher = keyScan.nextLine();

      System.out.print("가격?(예:39800) ");
      book1.price = Integer.parseInt(keyScan.nextLine());

      System.out.print("초판년도?(예:2015) ");
      book1.firstYear = Integer.parseInt(keyScan.nextLine());

      System.out.print("DVD 포함여부?(YES:y, NO:n) ");
      book1.dvd = (keyScan.nextLine().equals("y")) ? true : false;

      books[length++] = book1;

      System.out.print("게속 입력하시겠습니까(y/n)?");
      if (!keyScan.nextLine().equals("y"))
        break;
    }
    printBookList(books, length);
  }

  static void printBookList(Book[] books, int length) {

    for (int i = 0; i < length; i++) {
      Book book1 = books[i];
      System.out.printf("제목 : %s\n",book1.title);
      System.out.printf("ISBN코드 : %s\n",book1.isbn);
      System.out.printf("저자 : %s\n",book1.writer);
      System.out.printf("출판사 : %s\n",book1.publisher);
      System.out.printf("가격 : %s\n",book1.price);
      System.out.printf("초판년도 : %s\n",book1.firstYear);
      System.out.printf("DVD 포함여부 : %s\n",((book1.dvd)?"yes" : "no"));
    }
  }
}
