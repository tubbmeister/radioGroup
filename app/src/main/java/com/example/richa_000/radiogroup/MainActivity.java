package com.example.richa_000.radiogroup;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.view.View.OnClickListener;

import static com.example.richa_000.radiogroup.R.id.editText;
import static com.example.richa_000.radiogroup.R.id.radioGroup1;

public class MainActivity extends AppCompatActivity {


    public RadioGroup radioGroup;
    private RadioButton sound, vibration, silent, other;

    private Button button;
    private EditText editText1;
    private TextView textView, textView3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        radioGroup = (RadioGroup) findViewById(radioGroup1);
        textView = (TextView) findViewById(R.id.textView);
        textView3 = (TextView) findViewById(R.id.textView3);
        button = (Button) findViewById(R.id.button);
        editText1 = (EditText) findViewById(editText);


        radioGroup.setOnCheckedChangeListener(new OnCheckedChangeListener() {


            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                // find which radio button is selected

                if (checkedId == R.id.radioButton) {

                    Toast.makeText(getApplicationContext(), "choice: Silent",

                            Toast.LENGTH_SHORT).show();
                    String why = "SilenT";
                    textView.setText(why);

                } else if (checkedId == R.id.radioButton2) {

                    Toast.makeText(getApplicationContext(), "choice: Sound",

                            Toast.LENGTH_SHORT).show();
                    textView.setText("Sound");


                } else if (checkedId == R.id.radioButton3) {

                    Toast.makeText(getApplicationContext(), "choice: 3",

                            Toast.LENGTH_SHORT).show();
                    textView.setText("something");
                } else {

                    Toast.makeText(getApplicationContext(), "choice: Vibration",

                            Toast.LENGTH_SHORT).show();
                    textView.setText("Else");

                }

            }

        });
        sound = (RadioButton) findViewById(R.id.radioButton);
        vibration = (RadioButton) findViewById(R.id.radioButton2);
        silent = (RadioButton) findViewById(R.id.radioButton3);
        other = (RadioButton) findViewById(R.id.radioButton4);

        button.setOnClickListener(new OnClickListener() {


            @Override

            public void onClick(View v) {

                int selectedId = radioGroup.getCheckedRadioButtonId();

                //EditText editText = (EditText) findViewById(R.id.editText);
                String strUserName = editText1.getText().toString();
                if (strUserName.trim().equals("")) {
                    Toast.makeText(getApplicationContext(), "Enter data",

                            Toast.LENGTH_SHORT).show();
                    return;
                }

                // find which radioButton is checked by id

                if (selectedId == sound.getId()) {

                    textView.setText("You chose 'Sound' option");

                } else if (selectedId == vibration.getId()) {

                    textView.setText("You chose 'Vibration' option");

                } else if (selectedId == silent.getId()) {

                    textView.setText("You chose 'silent' option");

                } else {

                    textView.setText("You chose 'other' option");

                }

            }


        });


    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setTitle("Rich's Landing Calculator..")
                .setMessage("Are you sure you want to close this activity?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }

                })
                .setNegativeButton("No", null)
                .show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my_option_menu, menu);//Menu Resource, Menu
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.about:
                Intent intent1 = new Intent(this,Statistics.class);
                this.startActivity(intent1);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }


    }
}



