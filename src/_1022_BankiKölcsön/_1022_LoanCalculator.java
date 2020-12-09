package _1022_BankiKölcsön;

public class _1022_LoanCalculator {

    private static final int MAX_VALUE_VIP = 50000000;
    private static final int MAX_VALUE_NONVIP = 20000000;
    private static final int MIN_VALUE_COVERAGE_AMOUNT_VIP = 3000000;
    private static final int MIN_VALUE_COVERAGE_AMOUNT_NONVIP = 500000;
    private static final int MIN_VALUE_SUCCESSOR_AMOUNT_VIP = 20000000;
    private static final int MIN_VALUE_SUCCESSOR_AMOUNT_NONVIP = 3000000;
    private static int amount;
    private static final double MIN_FEE_FOR_12_MONTHS = amount * 0.5;
    private static final double COVERAGE_PERC_VIP =0.7;
    private static final double COVERAGE_PERC_NONVIP =0.8;


    private int maxValue;
    private int coverageLimit;
    private int successorLimit;
    private double monthlyPercentageGrowth;
    private double yearPerc;
    private double coveragePerc;

    public void isVIP(boolean isVIP) {
        if (isVIP) {
            maxValue = MAX_VALUE_VIP;
        } else {
            maxValue = MAX_VALUE_NONVIP;
        }
    }

    public boolean isCoverageNeedsVIP(int amount) {
        if (amount > MIN_VALUE_COVERAGE_AMOUNT_VIP) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isCoverageNeedsNONVIP(int amount) {
        if (amount > MIN_VALUE_COVERAGE_AMOUNT_NONVIP) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isSuccessorNeedsVIP(int amount) {
        if (amount > MIN_VALUE_SUCCESSOR_AMOUNT_VIP) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isSuccessorNeedsNONVIP(int amount) {
        if (amount > MIN_VALUE_SUCCESSOR_AMOUNT_NONVIP) {
            return true;
        } else {
            return false;
        }
    }

    public _1022_LoanResponse calculate( _1022_LoanRequest request){
        _1022_LoanResponse loanResponse = new _1022_LoanResponse();
        isVIP(request.isVip());
        if(request.getAmount()<=maxValue && request.getPeriod()>=12 && request.getPeriod()<=60){
            loanResponse.setGranted(true);
            loanResponse.setNeedsCoverage(request.getAmount()>= loanResponse.getCoverageAmount());
            if(loanResponse.isNeedsCoverage()){
                loanResponse.setCoverageAmount((int)(request.getAmount()*coveragePerc));
            }
            loanResponse.setNeedsSuccessor(request.getAmount()>successorLimit);
            int extraMonths= request.getPeriod()-12;
            double interest = yearPerc+(extraMonths*monthlyPercentageGrowth);
            loanResponse.setMonthlyFee((int)(request.getAmount()*interest/request.getPeriod()));
        } else {
            loanResponse.setGranted(false);
        }
        return loanResponse;
    }




}






