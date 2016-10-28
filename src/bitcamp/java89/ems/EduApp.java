package bitcamp.java89.ems;
import java.util.Scanner;

public class EduApp {
  static Scanner keyScan = new Scanner(System.in);

  public static void main(String[] args) {
    BookController bookController = new BookController(keyScan);


    System.out.println("비트캠프 관리시스템에 오신걸 환영합니다.");

    loop:
    while (true) {
      System.out.print("명령> ");
      String command = keyScan.nextLine().toLowerCase();

      switch (command) {
        case "add": bookController.doAdd(); break;
        case "list": bookController.doList(); break;
        case "view": bookController.doView(); break;
        case "delete": bookController.doDelete(); break;
        case "update": bookController.doUpdate(); break;
        case "quit":
          System.out.println("Good Bye~");
          break loop;
        default:
          System.out.println("지원하지 않는 명령입니다.");
          System.out.println("add, list, view, quit");
      }
    }
  }






}
