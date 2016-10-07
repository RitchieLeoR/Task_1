package com.example.raveria.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.InputType;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View.OnTouchListener;
import android.view.View.OnFocusChangeListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.lang.Object;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, View.OnFocusChangeListener {

    EditText etIncome;
    EditText etOutcome;
    TextView tvBalance;

    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btn0;
    Button btnClear;
    Button btnDelete;

    String SET_VAL;
    String SET_FOC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

        // find the elements
        etIncome = (EditText) findViewById(R.id.etIncome);
        etOutcome = (EditText) findViewById(R.id.etOutcome);



        etIncome.setInputType(InputType.TYPE_NULL);
        etOutcome.setInputType(InputType.TYPE_NULL);

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btn0 = (Button) findViewById(R.id.btn0);

        btnClear = (Button) findViewById(R.id.btnClear);
        btnDelete = (Button) findViewById(R.id.btnDelete);



        tvBalance = (TextView) findViewById(R.id.tvBalance);


        // set a listener
//        btn1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                etIncome.setText(etIncome.getText()+"1");
//            }
//        });
//
//        btn2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                etIncome.setText(etIncome.getText()+"2");
//            }
//        });
//
//        btn3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                etIncome.setText(etIncome.getText()+"3");
//            }
//        });
//
//        btn4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                etIncome.setText(etIncome.getText()+"4");
//            }
//        });
//
//        btn5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                etIncome.setText(etIncome.getText()+"5");
//            }
//        });
//
//        btn6.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                etIncome.setText(etIncome.getText()+"6");
//            }
//        });
//
//        btn7.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                etIncome.setText(etIncome.getText()+"7");
//            }
//        });
//
//        btn8.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                etIncome.setText(etIncome.getText()+"8");
//            }
//        });
//
//        btn9.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                etIncome.setText(etIncome.getText()+"9");
//            }
//        });
//
//        btn0.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                etIncome.setText(etIncome.getText()+"0");
//            }
//        });

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn0.setOnClickListener(this);
        btnClear.setOnClickListener(this);
        btnDelete.setOnClickListener(this);
        etIncome.setOnFocusChangeListener(this);
        etOutcome.setOnFocusChangeListener(this);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);

        fab.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btn1:
                SET_VAL = "1";
                break;
            case R.id.btn2:
                SET_VAL = "2";
                break;
            case R.id.btn3:
                SET_VAL = "3";
                break;
            case R.id.btn4:
                SET_VAL = "4";
                break;
            case R.id.btn5:
                SET_VAL = "5";
                break;
            case R.id.btn6:
                SET_VAL = "6";
                break;
            case R.id.btn7:
                SET_VAL = "7";
                break;
            case R.id.btn8:
                SET_VAL = "8";
                break;
            case R.id.btn9:
                SET_VAL = "9";
                break;
            case R.id.btn0:
                SET_VAL = "0";
                break;
            case R.id.btnClear:
                if(SET_FOC.equals("income")){
                    etIncome.setText("");
                }
                else if(SET_FOC.equals("outcome")){
                    etOutcome.setText("");
                }
                break;
            case R.id.btnDelete:
                if(SET_FOC.equals("income")){
                    if(etIncome.length()>0)
                        etIncome.setText(etIncome.getText().toString().substring(0, etIncome.length()-1));
                }
                else if(SET_FOC.equals("outcome")){
                    if(etOutcome.length()>0)
                        etOutcome.setText(etOutcome.getText().toString().substring(0, etOutcome.length()-1));
                }
                break;
            case R.id.fab:
                if(!etIncome.getText().equals("") && !etOutcome.getText().equals("")) {
                    tvBalance.setText("Balance: " + (String.valueOf(Integer.valueOf(etIncome.getText().toString()) - Integer.valueOf(etOutcome.getText().toString()))));
                }
                break;
        }

        if(!SET_VAL.equals("")){
            if(SET_FOC.equals("income")){
                etIncome.setText(etIncome.getText()+SET_VAL);
            }
            else if(SET_FOC.equals("outcome")){
                etOutcome.setText(etOutcome.getText()+SET_VAL);
            }
        }
        // defines the button that has been clicked and performs the corresponding operation
        // write operation into oper, we will use it later for output

    }


    @Override
    public void onFocusChange(View v, boolean hasFocus) {

        switch (v.getId()) {
            case R.id.etIncome:
                SET_FOC = "income";
                break;
            case R.id.etOutcome:
                SET_FOC = "outcome";
                break;
        }
    }
}
