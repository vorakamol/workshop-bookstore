package solid;

class Main {
    public static void main(String[] args) {
        TransferMoneyProcess thaiAccount = new ThailandBankAccount();
        thaiAccount.transferMoney(null, 100);
        TransferMoneyProcess interAccount = new InternationalBankAccount();
        interAccount.transferMoney(null, 100);
    }
}

public interface TransferMoneyProcess {
    void transferMoney(TransferMoneyProcess targetAccount, int amount);
}

class ThailandBankAccount implements TransferMoneyProcess {
    public void transferMoney(TransferMoneyProcess targetAccount, int amount) {
        System.out.println("Transfer money to Thailand.");
    }
}

class InternationalBankAccount implements TransferMoneyProcess {
    public void transferMoney(TransferMoneyProcess targetAccount, int amount) {
        System.out.println("Transfer money to International.");
    }
}