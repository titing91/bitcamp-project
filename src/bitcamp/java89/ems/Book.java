package bitcamp.java89.ems;

public class Book {
  // 인스턴스 변수
  String title;  // 제목
  String isbn;   // ISBN 코드
  String writer; // 저자
  String publisher; // 출판사
  int price;    // 가격
  int firstYear; // 초판일
  boolean dvd;  // dvd 포함여부

  public Book() {}

  public Book(String title, String writer, int price) {
    this.title = title;
    this.writer = writer;
    this.price = price;
  }
}
