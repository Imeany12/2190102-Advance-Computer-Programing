public class SimpleTransactionManager implements TransactionManager{
    private String[] wallets = new String[1000];
    private String[] transactions = new String[10000];    
    private int walletCount;
    private int transactionCount;

    public SimpleTransactionManager(String[] initialWallets) {
        // TODO Auto-generated constructor stub
        for (String wallet : initialWallets){
            wallets[walletCount] = wallet;
            walletCount++;
        }
        
    }

    @Override
    public boolean transferFunds(String senderWalletId, String receiverWalletId, double amount) {
        // TODO Auto-generated method stub
        if (!senderWalletId.equals("Wallet0")){
            double balance = getBalance(senderWalletId);
            if (balance < amount) {
                throw new IllegalArgumentException("Not enough balance in the source wallet.");
            }
        }
        if (!isValidWallet(receiverWalletId)){
            wallets[walletCount] = receiverWalletId;
            walletCount++;
        }
        transactions[transactionCount] = senderWalletId + "|" + receiverWalletId + "|" + amount;
        transactionCount++;
        return true;
    }

    @Override
    public double getBalance(String walletId) {
        if (!isValidWallet(walletId)) {
            throw new IllegalArgumentException("Sender wallet does not exist.");
        }
  
        double balance = 0.0;
        for (int i = 0; i < transactionCount; i++) {
            String[] parts = transactions[i].split("\\|");
            if (parts[0].equals(walletId)) {
                balance -= Double.parseDouble(parts[2]);
            }
            if (parts[1].equals(walletId)) {
                balance += Double.parseDouble(parts[2]);
            }
        }
  
        return balance;
    }
    @Override
    public boolean isValidWallet(String walletId) {
        // TODO Auto-generated method stub
        for (int i = 0; i < this.walletCount; i++) {
            if (wallets[i].equals(walletId)) {
                return true;
            }
        }

        // iterating this way will not cover the case where the wallet is empty
        // the previous code do not iterate when the array is empty

        // for (String wallet : wallets){
        //     if (wallet.equals(walletId)){
        //         return true;
        //     }
        // }


        return false;
    }

}
