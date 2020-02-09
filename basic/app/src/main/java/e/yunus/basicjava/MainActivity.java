package e.yunus.basicjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
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
        EditText nameField = (EditText) findViewById(R.id.et_name);
        String name = nameField.getText().toString();

        CheckBox whippedCreamCheckBox = (CheckBox) findViewById(R.id.whipped_cream_checkbox);
        boolean haswhippedCream = whippedCreamCheckBox.isChecked();

        CheckBox whippedChocolateCheckBox= (CheckBox) findViewById(R.id.whipped_cream_checkbox);
        boolean hasChocolate = whippedChocolateCheckBox.isChecked();

        int price = calculationPrice(haswhippedCream,hasChocolate ); //memanggik calculation
        String princeMessage = createOrderSummary(price, haswhippedCream, hasChocolate, name); //memanggil crateOrderSummary

        displayMessage(princeMessage);
    }


    private int calculationPrice(boolean addWhippedCream, boolean addChocolate) {
        //prince of 1 cup of coffee
        int basePrice = 5;
        if (addWhippedCream){
            basePrice = basePrice + 1;
        }
        if (addChocolate){
            basePrice = basePrice + 2 ;
        }
        return quantity * basePrice;
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
