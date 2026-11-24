// Create a class Book with title, author, and price. Include methods to set details,
// display details, and apply discount on price. Test it using BookDemo class.

class Book {
    String title;
    String author;
    double price;

    void setDetails(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    void applyDiscount(double percentage) {
        price = price - (price * percentage / 100);
    }
}

class P4_7 {
    public static void main(String[] args) {
        Book b = new Book();

        b.setDetails("Java Programming", "James Gosling", 500);

        System.out.println("Book Details:");
        b.displayDetails();

        b.applyDiscount(10);

        System.out.println("\nAfter 10% Discount:");
        b.displayDetails();
    }
}