package com.task1234;

public interface AccountOperations {

    void checkBalance();
    void transfer(BankAccount accountSending, double amount, BankAccount accoundRecieving) throws AccountOperationException;
    void pay();


}
