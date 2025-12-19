// Transaction.java - Transaction model class
package banking.system;

import javafx.beans.property.SimpleStringProperty;

public class Transaction {
    private SimpleStringProperty date;
    private SimpleStringProperty description;
    private SimpleStringProperty type;
    private double amount;
    private double balance;
    
    public Transaction(String date, String description, String type, double amount, double balance) {
        this.date = new SimpleStringProperty(date);
        this.description = new SimpleStringProperty(description);
        this.type = new SimpleStringProperty(type);
        this.amount = amount;
        this.balance = balance;
    }
    
    public String getDate() {
        return date.get();
    }
    
    public SimpleStringProperty dateProperty() {
        return date;
    }
    
    public String getDescription() {
        return description.get();
    }
    
    public SimpleStringProperty descriptionProperty() {
        return description;
    }
    
    public String getType() {
        return type.get();
    }
    
    public SimpleStringProperty typeProperty() {
        return type;
    }
    
    public double getAmount() {
        return amount;
    }
    
    public String getAmountFormatted() {
        String prefix = type.get().equals("Deposit") ? "+$" : "-$";
        return String.format("%s%.2f", prefix, amount);
    }
    
    public SimpleStringProperty amountFormattedProperty() {
        return new SimpleStringProperty(getAmountFormatted());
    }
    
    public double getBalance() {
        return balance;
    }
    
    public String getBalanceFormatted() {
        return String.format("$%.2f", balance);
    }
    
    public SimpleStringProperty balanceFormattedProperty() {
        return new SimpleStringProperty(getBalanceFormatted());
    }
}