public class Main {
    public static void main(String[] args) {
        //TODO 1: Declare and initialize variable for First Name
        String firstName = "Sandy";
        //TODO 1: Declare and initialize variable for Last Name
        String lastName = "Jones";
        //TODO 1: Declare and initialize variable for Movie Title
        String movieTitle = "The Source Code";
        //TODO 1: Declare and initialize variable for Number of tickets
        int ticketCount = 8;
        //TODO 1: Declare and initialize variable for Price per ticket
        double price = 10.57;
        //TODO 2: Calculate the total price based on number of tickets and price per ticket. Print the output of the total price
        double totalPrice = price * ticketCount;
        //TODO 3: Concatenate first name and last name into new variable username with no space in between
        // first and last name and convert them to lower case
        String fullName = (firstName + "" + lastName).toLowerCase();
        // TODO 4: Convert the movie title to upper case and assign to variable movieName
        String movieTitleCapitalized = movieTitle.toUpperCase();
        // TODO 5: Write multiple print statements to match your output as per the Final Expected Output
        System.out.println("Congratulations!! You have successfully booked the tickets");
        System.out.println();
        System.out.println("Username: "+fullName);
        System.out.println("Movie: "+movieTitleCapitalized);
        System.out.println("Number of Tickets: "+ticketCount);
        System.out.println("Price per ticket: $"+price);
        System.out.println("Total price of "+ticketCount+" tickets: $"+totalPrice);
        System.out.println();
        System.out.println("Thank you for choosing us for booking your movie tickets");
        System.out.println("Enjoy your movie!!!");
    }
}
