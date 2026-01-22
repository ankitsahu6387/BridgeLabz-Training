import java.util.*;

public class BankingSystem {

    // AccountNumber -> Balance
    private Map<Integer, Integer> accountMap = new HashMap<>();

    // Withdrawal requests
    private Queue<Integer> withdrawalQueue = new LinkedList<>();

    // Add account
    public void addAccount(int accountNumber, int balance) {
        accountMap.put(accountNumber, balance);
    }

    // Request withdrawal
    public void requestWithdrawal(int accountNumber) {
        withdrawalQueue.add(accountNumber);
    }

    // Process withdrawals
    public void processWithdrawals(int amount) {

        while (!withdrawalQueue.isEmpty()) {
            int acc = withdrawalQueue.poll();
            int balance = accountMap.get(acc);

            if (balance >= amount) {
                accountMap.put(acc, balance - amount);
                System.out.println("Withdrawal successful for Account " + acc);
            } else {
                System.out.println("Insufficient balance for Account " + acc);
            }
        }
    }

    // Display customers sorted by balance
    public void displaySortedByBalance() {

        TreeMap<Integer, List<Integer>> sorted = new TreeMap<>();

        for (Map.Entry<Integer, Integer> entry : accountMap.entrySet()) {
            sorted.putIfAbsent(entry.getValue(), new ArrayList<>());
            sorted.get(entry.getValue()).add(entry.getKey());
        }

        System.out.println("Accounts Sorted by Balance:");
        sorted.forEach((bal, accs) ->
                System.out.println("Balance " + bal + " -> Accounts " + accs));
    }
}
