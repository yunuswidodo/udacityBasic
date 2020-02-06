package e.yunus.basicjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    int quantity = 2;

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
        int price = calculationPrice();
        String princeMessage = "Total $ "  + price;
        princeMessage =  princeMessage + "\nthank you!" ;
        displayPrice(quantity * 5);
        displayMessage(princeMessage);


    }

    private int calculationPrice() {
        int price = quantity * 5;
        return price;
    }


    private void displayQuatity(int number) {
        TextView quantityTextView = findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
    private void displayPrice(int number){
        TextView princeTextView = findViewById(R.id.price_text_view);
        //defauld number adalah local coding tanpa dikasih parameter
        princeTextView.setText(NumberFormat.getCurrencyInstance(Locale.US).format(number));
    }
    private void  displayMessage(String  message){
        TextView stringTextView  = findViewById(R.id.string_text_view);
        stringTextView.setText(message);
    }
}
