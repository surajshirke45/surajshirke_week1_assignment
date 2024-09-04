package Week2_Assignments;

class task2 {
    private double balance;

    
    task2(double initialBalance) {
        balance = initialBalance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

        void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    
    void displayBalance() {
        System.out.println("Account Balance: $" + balance);
    }

    public static void main(String[] args) {
        
        task2 account = new task2(1000.0);

        account.deposit(500.0);
        account.withdraw(200.0);
        account.displayBalance();
    }
}

