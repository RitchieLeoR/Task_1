package com.example.raveria.myapplication;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
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
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.lang.reflect.Method;

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

    int curs;

    Animation shake;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

        // find the elements
        etIncome = (EditText) findViewById(R.id.etIncome);
        etOutcome = (EditText) findViewById(R.id.etOutcome);



//        etIncome.setInputType(InputType.TYPE_NULL);
//        etOutcome.setInputType(InputType.TYPE_NULL);

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

        shake = AnimationUtils.loadAnimation(this, R.anim.shake);



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

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            etIncome.setShowSoftInputOnFocus(false);
            etOutcome.setShowSoftInputOnFocus(false);
        } else {
            try {
                final Method method = EditText.class.getMethod(
                        "setShowSoftInputOnFocus"
                        , new Class[]{boolean.class});
                method.setAccessible(true);
                method.invoke(etIncome, false);
                method.invoke(etOutcome, false);
            } catch (Exception e) {
                // ignore
            }
        }

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
                addInput(SET_VAL);
                break;
            case R.id.btn2:
                SET_VAL = "2";
                addInput(SET_VAL);
                break;
            case R.id.btn3:
                SET_VAL = "3";
                addInput(SET_VAL);
                break;
            case R.id.btn4:
                SET_VAL = "4";
                addInput(SET_VAL);
                break;
            case R.id.btn5:
                SET_VAL = "5";
                addInput(SET_VAL);
                break;
            case R.id.btn6:
                SET_VAL = "6";
                addInput(SET_VAL);
                break;
            case R.id.btn7:
                SET_VAL = "7";
                addInput(SET_VAL);
                break;
            case R.id.btn8:
                SET_VAL = "8";
                addInput(SET_VAL);
                break;
            case R.id.btn9:
                SET_VAL = "9";
                addInput(SET_VAL);
                break;
            case R.id.btn0:
                SET_VAL = "0";
                addInput(SET_VAL);
                break;
            case R.id.btnClear:
                if(SET_FOC.equals("income")){
                    etIncome.setText("");
                    curs = etIncome.getSelectionStart();
                }
                else if(SET_FOC.equals("outcome")){
                    etOutcome.setText("");
                    curs = etOutcome.getSelectionStart();
                }
                break;
            case R.id.btnDelete:
                if(SET_FOC.equals("income")){
                    curs = etIncome.getSelectionStart();
                    if(etIncome.length()>0) {
                        etIncome.getText().delete(curs-1, curs);
                    }
                }
                else if(SET_FOC.equals("outcome")){
                    curs = etOutcome.getSelectionStart();
                    if(etOutcome.length()>0)
                        etOutcome.getText().delete(curs-1, curs);
                }
                break;
            case R.id.fab:
                curs = etIncome.getSelectionStart();
                v.startAnimation(shake);
                if(!etIncome.getText().toString().isEmpty() && !etOutcome.getText().toString().isEmpty()) {
                    tvBalance.setText(getString(R.string.bal) + ": " + (String.valueOf(Integer.valueOf(etIncome.getText().toString()) - Integer.valueOf(etOutcome.getText().toString()))));
                }
                break;
        }


        // defines the button that has been clicked and performs the corresponding operation
        // write operation into oper, we will use it later for output

    }

    public void addInput(String input) {
        if(!SET_VAL.equals("")){
            if(SET_FOC.equals("income")){
                curs = etIncome.getSelectionStart();
                etIncome.getText().insert(curs, SET_VAL);
                curs++;
                etIncome.setSelection(curs);
            }
            else if(SET_FOC.equals("outcome")){
                curs = etOutcome.getSelectionStart();
                etOutcome.getText().insert(curs, SET_VAL);
                curs++;
                etOutcome.setSelection(curs);
            }
        }
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
