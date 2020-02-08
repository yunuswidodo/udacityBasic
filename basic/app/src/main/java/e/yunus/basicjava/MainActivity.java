package e.yunus.basicjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    int quantity = 2;
    boolean chexkbox  = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void increment(View view){

        quantity = quantity + 1;
        displayQuatity(quantity);
    }
     public void decrement(View view){
        quantity = quantity - 1;
        displayQuatity(quantity);
     }

    public void submitOrder(View view) {
        TextView nameCustamor = (TextView) findViewById(R.id.et_name);
        CheckBox whippedCreamCheckBox = (CheckBox) findViewById(R.id.whipped_cream_checkbox);
        CheckBox whippedChocolateCheckBox= (CheckBox) findViewById(R.id.whipped_cream_checkbox);
        String name = String.valueOf(nameCustamor.getText()); //kalao ngambil string pakai valueof
        boolean haswhippedCreamCheckBox = whippedCreamCheckBox.isChecked();
        boolean haswhippedChocolateBox = whippedChocolateCheckBox.isChecked();
        int price = calculationPrice();
        String princeMessage = createOrderSummary(price, haswhippedCreamCheckBox, haswhippedChocolateBox, name); //memanggil crateOrderSummary
//        displayPrice(quantity * 2);
        displayMessage(princeMessage);
    }


    private int calculationPrice() {
//        int price = quantity * 5;
//        return price;   //asal
//menjadi dibaah ini
        return quantity * 5;
    }



    private String createOrderSummary(int price, boolean addWhippedCream, boolean addWhipedChocolate, String name){
        String princeMessage = name;
        princeMessage += "\nadd whipped cream? " + addWhippedCream;
        princeMessage += "\nadd whipped chocolate? " + addWhipedChocolate;
        princeMessage += "\nQuantity : " + quantity;   //artinya princemassage =  princemassage
        princeMessage += "\nTotal $ "  + price;
        princeMessage =  princeMessage + "\nthank you!" ;
        return princeMessage;
    }


    private void displayQuatity(int number) {
        TextView quantityTextView = findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
//    private void displayPrice(int number){
//        TextView princeTextView = findViewById(R.id.price_text_view);
//        //defauld number adalah local coding tanpa dikasih parameter
//        princeTextView.setText(NumberFormat.getCurrencyInstance(Locale.US).format(number));
//    }
    private void  displayMessage(String  message){
        TextView orderSummaryTextView = findViewById(R.id.order_summary_text_view);
        orderSummaryTextView.setText(message);
    }
}
