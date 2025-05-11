/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.tubanquito.entities;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 *
 * @author Technologyland
 */
public class BankAccount {
    
    private String product;
    @SerializedName("account-number")
    private int AccountNumber;
    private String currency;
    private List<AccountHolder> accountHolder;
    private List<Transactions> transactions;
    
}
