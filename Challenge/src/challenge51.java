public class challenge51 {

    static int totalBooks;//static variable

    String title;//non static variable or instance variable

    String author;

    String isbn;
    boolean isBorrowed;// if in case the same bbok is already borrow for which student is tring to borrow

    static{//static block---initaialise only one time when class get started
        totalBooks=0;
    }{
        totalBooks++;// normal block for again & again object when goes to initialise
    }
    //parametrized constuctor
    challenge51(String isbn,String title,String author){//challenge51 ki jagah ham book likh sakte but yaha par hamne class challenge51 define kiya hai siliye constructor challenge51 lenge book nhi lenge
        this.isbn=isbn;
        this.title=title;
        this.author=author;
    }
    //parametrized constuctor
    challenge51(String isbn){
        this(isbn,"Unknown","Unknown") ;
    }
    static int getTotalBooks(){
        return totalBooks;
    }


    public void borrowBooks(){
        if(isBorrowed){
            System.out.println("already borrowed,we don't allow it to be borrowed");
        }else{
            this.isBorrowed=true;
            System.out.println("you can borrowed : "+this.title);
        }
    }
    public void returnBooks(){
        if(isBorrowed){
            this.isBorrowed=false;//book wapas aa gyi hai
            System.out.println("hope you enjoyed,lease leave a  review");
        }else{
            System.out.println("this bbok is already in library");
        }
    }

    public static void main(String[] args) {
        System.out.println("Library");
        challenge51 designOfThings=new challenge51("1","design","author");
        challenge51 computer=new challenge51("2");
        designOfThings.borrowBooks();
        computer.borrowBooks();
        designOfThings.returnBooks();
        designOfThings.returnBooks();

    }
}
