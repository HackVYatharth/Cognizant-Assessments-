public class AdapterPatternExample {
    public static void main(String[] args) {

        //Paytm
        Paytm paytm = new Paytm();
        PaymentProcessor paytmAdapter = new PaytmAdapter(paytm);
        paytmAdapter.processPayment(1080.0);

        //GooglePay
        GooglePay googlepay = new GooglePay();
        PaymentProcessor googlepayAdapter = new GooglePayAdapter(googlepay);
        googlepayAdapter.processPayment(10040.0);

        //PhonePe
        PhonePe phonepe = new PhonePe();
        PaymentProcessor phonepeAdapter = new PhonePeAdapter(phonepe);
        phonepeAdapter.processPayment(90000.0);



       
    }
}
