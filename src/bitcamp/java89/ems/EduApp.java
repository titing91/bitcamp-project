package bitcamp.java89.ems;
import java.util.Scanner;

public class EduApp {
  public static void main(String[] args) {
    System.out.println("비트캠프 관리시스템에 오신걸 환영합니다.");

    Scanner keyScan = new Scanner(System.in);

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

    System.out.printf("제목 : %s\n",book1.title);
    System.out.printf("ISBN코드 : %s\n",book1.isbn);
    System.out.printf("저자 : %s\n",book1.writer);
    System.out.printf("출판사 : %s\n",book1.publisher);
    System.out.printf("가격 : %s\n",book1.price);
    System.out.printf("초판년도 : %s\n",book1.firstYear);
    System.out.printf("DVD 포함여부 : %s\n",book1.dvd);

  }
}
