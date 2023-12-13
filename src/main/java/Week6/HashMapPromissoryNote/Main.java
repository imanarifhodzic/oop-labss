package Week6.HashMapPromissoryNote;

import java.util.HashMap;

class PromissoryNote {
    private String toWhom;
    private double value;

    HashMap<String, Double> debts = new HashMap<>();

    public PromissoryNote() {
    }

    public void setLoan(String toWhom, double value) {
        this.toWhom = toWhom;
        this.value = value;
        debts.put(this.toWhom, this.value);
    }

    public double howMuchIsTheDebt(String whose) {
        if (!debts.containsKey(whose)) {
            return 0;
        } else {
            return debts.get(whose);
        }
    }
}


public class Main {
    public static void main(String[] args) {
        PromissoryNote mattisNote = new PromissoryNote();
        mattisNote.setLoan("Arto", 51.5);
        mattisNote.setLoan("Mikael", 30);


        System.out.println(mattisNote.howMuchIsTheDebt("Arto"));
        System.out.println(mattisNote.howMuchIsTheDebt("Joel"));
    }

}
