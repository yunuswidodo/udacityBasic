package e.yunus.basicjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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
        if (quantity == 100){
            Toast.makeText(this, "you cannot have than 100 coffee", Toast.LENGTH_SHORT).show();
            return;
        }
        displayQuatity(quantity);
    }
     public void decrement(View view){
        if (quantity == 1){
            Toast.makeText(this, "you cannot have less than 1 coffe ", Toast.LENGTH_SHORT).show();
            return;
        }
        quantity = quantity - 1;
        displayQuatity(quantity);
     }

    public void submitOrder(View view) {
        EditText nameField = (EditText) findViewById(R.id.et_name);
        String name = nameField.getText().toString();

        CheckBox whippedCreamCheckBox = (CheckBox) findViewById(R.id.whipped_cream_checkbox);
        boolean haswhippedCream = whippedCreamCheckBox.isChecked();

        CheckBox ChocolateCheckBox = (CheckBox) findViewById(R.id.whipped_chocolate_checkbox);
        boolean hasChocolate = ChocolateCheckBox.isChecked();

        int price = calculationPrice(haswhippedCream,hasChocolate ); //memanggik calculation
        String princeMessage = createOrderSummary(name, haswhippedCream, hasChocolate, price); //memanggil crateOrderSummary

        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_SUBJECT, "just java order" + name);
        intent.putExtra(Intent.EXTRA_TEXT, princeMessage);

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

       // displayMessage(princeMessage); display order

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


    private String createOrderSummary(String name, boolean addWhippedCream, boolean addWhipedChocolate, int price){
        String princeMessage = getString(R.string.order_summary_name, name);
        princeMessage += "\nadd whipped cream? " + addWhippedCream;
        princeMessage += "\nadd whipped chocolate? " + addWhipedChocolate;
        princeMessage += "\nQuantity : " + quantity;   //artinya princemassage =  princemassage
        princeMessage += "\nTotal $ "  + price;
        princeMessage =  princeMessage + getString(R.string.thank_you) ;
        return princeMessage;
    }


    private void displayQuatity(int number) {
        TextView quantityTextView = findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

//    private void  displayMessage(String  message){  untuk display order
//        TextView orderSummaryTextView = findViewById(R.id.order_summary_text_view);
//        orderSummaryTextView.setText(message);
//    }
}
