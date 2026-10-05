package GradedExercise2;

import java.util.Date;

public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private Date loanDate;

    // constructor no-argument
    public Loan() {
        annualInterestRate = 2.5;
        numberOfYears = 1;
        loanAmount = 1000;
        loanDate = new Date();
    }

    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        loanDate = new Date();
    }

    //Getters and Setters
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    // Setters..
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 1200;
        int numberOfPayment = numberOfYears * 12;
        return loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfPayment));

    }

    public double getTotalPayment() {
        return getMonthlyPayment() * numberOfYears * 12;

    }

    public static void main(String[] args){
        Loan loan1 = new Loan(5.0, 3, 5000);
        System.out.println("Annual Interest Rate: " + loan1.getAnnualInterestRate());
        System.out.println("Number of Years: " + loan1.getNumberOfYears());
        System.out.println("Loan Amount: " + loan1.getLoanAmount());
        System.out.println("Monthly Payment: " + loan1.getMonthlyPayment());
        System.out.println("Total Payment: " + loan1.getTotalPayment());
        System.out.println("Loan Date: " + loan1.getLoanDate());

    }
}
