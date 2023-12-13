package MidtermPractice.preparation;


interface payable {
    String makePayment();
}

class creditCard implements payable{

    private String cardNo;
    private int limit;

    public creditCard(String cardNo,int limit){
        this.cardNo=cardNo;
        this.limit=limit;
    }

    public String getCardNo(){
        return cardNo;
    }
    public int getLimit(){
        return limit;
    }
    public void setCardNo(String newString){
        this.cardNo=newString;
    }
    public void setLimit(int newLimit){
        this.limit=newLimit;
    }
    public int pay(){
        return 100;
    }
    @Override
    public String makePayment(){
        return "CD payment";
    }
}

class debitCard implements payable{
    private String cardNo;
    public debitCard(String cardNo){
        this.cardNo=cardNo;
    }
    public String getCardNo(){
        return cardNo;
    }
    public void setCardNo(String neCardNo){
        this.cardNo=neCardNo;
    }

    public int pay(){
        return 1000;
    }

    @Override
    public String makePayment(){
        return "DC payment";
    }
}

class Main{
    public static void main(String[] args) {
        creditCard cd=new creditCard("123",100);
        debitCard dc=new debitCard("234");
        System.out.println(cd.pay());
        System.out.println(cd.makePayment());
        System.out.println("-----------------------");
        System.out.println(dc.pay());
        System.out.println(dc.makePayment());
    }
}
