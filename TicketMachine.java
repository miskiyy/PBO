public class TicketMachine {
    // The price of a ticket from this machine.
    private int price;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;

    /**
     * Create a machine that issues tickets of the given price.
     * Note that the price must be greater than zero, and there
     * are no checks to ensure this.
     */
    public TicketMachine(int cost) {
        price = cost;
        balance = 0;
        total = 0;
    }

    /**
     * Return the price of a ticket.
     */
    public int getPrice() {
        return price;
    }

    /**
     * Return the amount of money already inserted for the next ticket.
     */
    public int getBalance() {
        return balance;
    }

    /**
     * Receive an amount of money from a customer.
     */
    public void insertMoney(int amount) {
        if (amount > 0) {
            balance = balance + amount;
        } else {
            System.out.println("Use a positive amount rather than: " + amount);
        }
    }

    /**
     * Print a ticket.
     * Update the total collected and reduce the balance to zero.
     */
    public void printTicket() {
        if (balance >= price) {
            // Simulate the printing of a ticket.
            System.out.println("##################");
            System.out.println("# The BlueJ Line");
            System.out.println("# Ticket");
            System.out.println("# " + price + " cents.");
            System.out.println("##################");
            System.out.println();

            // Update the total collected with the price.
            total = total + price;

            // Reduce the balance by the price.
            balance = balance - price;
        } else {
            System.out.println("You must insert at least: " + (price - balance) + " cents.");
        }
    }

    /**
     * Refund the current balance.
     */
    public int refundBalance() {
        int amountToRefund = balance;
        balance = 0;
        return amountToRefund;
    }
}
