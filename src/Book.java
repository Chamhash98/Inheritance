public class Book {
int qty;
public void printbooks(){
    int com = 4000;
    int crt = 7000;
    int prntqty = com + crt;
    System.out.println("Printed : " + prntqty);
}
}
class Press extends Book{
    public void display(){
        System.out.println("Books Printed Qty : "+ qty);
    }
}
class TestI{
    public static void main(String[] args) {
        Press p= new Press();
        p.qty = 14000;
        p.display();
        p.printbooks();
    }
}