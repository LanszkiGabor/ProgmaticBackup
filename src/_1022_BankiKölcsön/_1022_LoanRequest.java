package _1022_BankiKölcsön;

public class _1022_LoanRequest {

    private boolean isVip;
    private int amount;
    private int period;

    public _1022_LoanRequest(boolean isVip, int amount, int period){
        this.isVip = isVip;
        this.amount = amount;
        this.period = period;
    }

    public boolean isVip() {
        return isVip;
    }

    public int getAmount() {
        return amount;
    }

    public int getPeriod() {
        return period;
    }

    public void setVip(boolean vip) {
        isVip = vip;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setPeriod(int period) {
        this.period = period;
    }
}
