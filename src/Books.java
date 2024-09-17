public class Books {
        //Static variable
        static int totalNoOfBooks;

        // Non static variable
        String isbn;
        String author;
        String title;
        boolean isBorrowed;

        // Constructor Chaining
        static{
            totalNoOfBooks = 0;
        }
        {
            totalNoOfBooks++;      // Object initializer
        }

        // Parameterized Constructor
        Books(String author, String title, String isbn){
            this.isbn = isbn;
            this.title = title;
            this.author = author;

        }

        // Parameterized Constructor
        Books(String isbn){     // isbn dena jaruri hai baki sab by default set kar denge
           this("Unknown","Unknown", isbn);
        }

        static int getTotalNoOfBooks(){
            return totalNoOfBooks;
        }

        void borrowBook(){
            if (isBorrowed){
                System.out.println("Book is already borrowed.");
            }
            else {
                this.isBorrowed = true;
                System.out.println("Enjoy "+this.title);    // exact title print hoga
            }
        }

        void returnBook(){
            if (isBorrowed){
                this.isBorrowed = false;
                System.out.println("Thanks for returning book.");
            }
            else {
                System.out.println("Book is already in library.");
            }
        }

    public static void main(String[] args) {
        Books designOfThings = new Books("Author", "Design with book", "1");
        Books myBook = new Books("2");
        //Condition checks
        System.out.println(Books.getTotalNoOfBooks());
        designOfThings.borrowBook();
        myBook.borrowBook();
        designOfThings.borrowBook();
        designOfThings.returnBook();
        designOfThings.returnBook();
    }
}
