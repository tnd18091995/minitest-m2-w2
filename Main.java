package Minitest;

public class Main {
    public static void main(String[] args) {
        Book fb1 = new FictionBook("01", "Tsunami", 12000, "Jin", "Vien Tuong 1");
        Book fb2 = new FictionBook("02", "Zombie", 35000, "Tom", "Vien Tuong 2");
        Book fb3 = new FictionBook("03", "Galaxy", 25000, "Ric", "Vien Tuong 3");
        Book fb4 = new FictionBook("04", "Star War", 45000, "PAT", "Vien Tuong 4");
        Book fb5 = new FictionBook("05", "Out Planet", 55000, "Vic", "Vien Tuong 5");
        Book pb6 = new ProgrammingBook("06", "Java", 30000, "PT", "Java", "1");
        Book pb7 = new ProgrammingBook("07", "C++", 50000, "JS", "C++", "2");
        Book pb8 = new ProgrammingBook("08", "JS", 50000, "JOHN", "JS", "3");
        Book pb9 = new ProgrammingBook("09", "PYT", 70000, "Tim", "PYT", "4");
        Book pb10 = new ProgrammingBook("10", "Java", 80000, "Ken", "Java", "5");
        Book[] books = {fb1, fb2, fb3, fb4, fb5, pb6, pb7, pb8, pb9, pb10};
        double total = 0;
        for (Book book : books) {
            total += book.getPrice();
        }
        System.out.println("Total Price: " + total);
        int countjava = 0;
        for (Book book : books) {
           if(book instanceof ProgrammingBook){
               ProgrammingBook programmingBook = (ProgrammingBook) book;
               if("Java".equals(programmingBook.getLanguage())){
                   countjava++;
               }
           }
        }
        System.out.println("Tong ProgrammingBook co ngon ngu Java la: "+countjava);
        int countcategory = 0;
        for (Book book : books) {
            if(book instanceof FictionBook){
                FictionBook fictionBook = (FictionBook) book;
                if("Vien Tuong 1".equals(fictionBook.getCategory())){
                    countcategory++;
                }
            }
        }
        System.out.println("Tong category Vien Tuong 1 la: "+countcategory);
        int countprice = 0;
        for (Book book : books) {
            if(book instanceof FictionBook){
                FictionBook fictionBook = (FictionBook) book;
                if(fictionBook.getPrice() < 30000){
                    countprice++;
                }
            }
        }
        System.out.println("So sach fictionbool co gia nho hon 30000 la: "+countprice);
    }
}
