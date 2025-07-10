package day09.object;

// 객체 정보를 문자열로 바꾸는 roString() 메서드
public class ToStringEx {
    public static void main(String[] args) {
        Book book1= new Book(200, "어린왕자");

        System.out.println(book1);
        System.out.println(book1.toString());

        
    }
    
    
}

class Book{
        int bookNumber;
        String bookTilte;

        Book(int bookNumber, String bookTitle){
            this.bookNumber = bookNumber;
            this.bookTilte = bookTitle;
        }

        @Override
        public String toString(){
            return bookTilte + "," + bookNumber;
        }
    }