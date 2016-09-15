package edu.orangecoastcollege.cs273.occars;

/**
 * Created by equach3 on 9/15/2016.
 */
public class Car {
    private double mDownPayment;
    private int mLoanTerm;
    private double mPrice;

    private final double TAX_RATE = 0.08;
    private final double INTEREST_RATE_THREE_YEARS = 0.0462;
    private final double INTEREST_RATE_FOUR_YEARS = 0.0416;
    private final double INTEREST_RATE_FIVE_YEARS = 0.0419;

    public Car() {
        mDownPayment = 0.0;
        mLoanTerm = 1;
        mPrice = 0.0;
    }

    public double calculateBorrowedAmount() {
        return mPrice - mDownPayment;
    }

    public double calculateInterestAmount() {
        double borrowedAmount = calculateBorrowedAmount();
        if (mLoanTerm == 3) return borrowedAmount * INTEREST_RATE_THREE_YEARS;
        else if (mLoanTerm == 4) return borrowedAmount * INTEREST_RATE_FOUR_YEARS;
        else if (mLoanTerm == 5) return borrowedAmount * INTEREST_RATE_FIVE_YEARS;
        else return 0.0;
    }

    public double calculateMonthlyPayment() {
        double interestAmount = calculateInterestAmount();
        if (mLoanTerm == 3) return interestAmount / 36;
        else if (mLoanTerm == 4) return interestAmount / 48;
        else if (mLoanTerm == 5) return interestAmount / 60;
        else return 0.0;
    }

    public double calculateTaxAmount() {
        return mPrice * TAX_RATE;
    }

    public double calculateTotalCost() {
        return calculateTaxAmount() + mPrice;
    }

    public double getDownPayment() {
        return mDownPayment;
    }

    public int getLoanTerm() {
        return mLoanTerm;
    }

    public double getPrice() {
        return mPrice;
    }

    public void setDownPayment(double d) {
        mDownPayment = d;
    }

    public void setLoanTerm(int i) {
        mLoanTerm = i;
    }

    public void setPrice(double d) {
        mPrice = d;
    }
}
