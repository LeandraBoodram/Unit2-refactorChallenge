public class TipCalculator {
    private double tipPercent;

    private double bill;

    private int people;

    private double tipPerPerson;

    private double tip;


    public TipCalculator(double tipPercent, double bill, int people){
        this.tipPercent = tipPercent;
        this.bill = bill;
        this.people = people;
        calculateTip();
    }

    private void calculateTip(){
        tip = tipPercent/ 100;
        tip = tip * bill;
    }

    public String getTip(){
        return String.format("(%.2f)", tip);
    }

    public String tipPerPerson(){
        tipPerPerson = (tip / people);
        return String.format("(%.2f)", tipPerPerson);
    }
    public String totalPerPerson(){
        double splitBill = bill / people;
        splitBill += tipPerPerson;
        return String.format("(%.2f)", splitBill);
    }

    public String totalBill(){
        double totalBill = bill + tip;
        return String.format("(%.2f)", totalBill);
    }

}
