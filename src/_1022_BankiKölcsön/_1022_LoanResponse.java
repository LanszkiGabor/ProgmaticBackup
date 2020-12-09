package _1022_BankiKölcsön;

import java.util.Scanner;

public class _1022_LoanResponse {

    private boolean isGranted;
    private boolean needsSuccessor;
    private boolean needsCoverage;
    private int coverageAmount;
    private int monthlyFee;


    public _1022_LoanResponse(){

    }

    public _1022_LoanResponse(boolean isGranted, boolean needsSuccessor, boolean needsCoverage, int coverageAmount, int monthlyFee){
        this.isGranted = isGranted;
        this.needsSuccessor = needsSuccessor;
        this.needsCoverage = needsCoverage;
        this.coverageAmount = coverageAmount;
        this.monthlyFee = monthlyFee;
    }

    public boolean isGranted() {
        return isGranted;
    }

    public boolean isNeedsSuccessor() {
        return needsSuccessor;
    }

    public boolean isNeedsCoverage() {
        return needsCoverage;
    }

    public int getCoverageAmount() {
        return coverageAmount;
    }

    public int getMonthlyFee() {
        return monthlyFee;
    }

    public void setGranted(boolean granted) {
        isGranted = granted;
    }

    public void setNeedsSuccessor(boolean needsSuccessor) {
        this.needsSuccessor = needsSuccessor;
    }

    public void setNeedsCoverage(boolean needsCoverage) {
        this.needsCoverage = needsCoverage;
    }

    public void setCoverageAmount(int coverageAmount) {
        this.coverageAmount = coverageAmount;
    }

    public void setMonthlyFee(int monthlyFee) {
        this.monthlyFee = monthlyFee;
    }
}
