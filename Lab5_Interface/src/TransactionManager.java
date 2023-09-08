public interface TransactionManager {
    boolean transferFunds(String senderWalletId , String receiverWalletId , double amount);
    double getBalance(String walletId);
    boolean isValidWallet(String walletId);
    

    
}
