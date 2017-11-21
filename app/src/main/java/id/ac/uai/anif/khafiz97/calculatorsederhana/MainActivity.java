package id.ac.uai.anif.khafiz97.calculatorsederhana;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    Button btnClear, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0;

    String Process;
    TextView edt1,edt2;

    private  double akhir=0.0;
    float mValueOne, mValueTwo;
    Boolean bracket, mAdd, mSub, mMul, mDiv;
    Button btnKali, btnKurang, btnTambah, btnBagi, btnDesimal, btnBack, btnEqual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bracket = false;

        btnClear = (Button) findViewById(R.id.btn_delete);


        edt1 = (TextView) findViewById(R.id.edt1);
        edt2 = (TextView) findViewById(R.id.edt2);

        edt1.setText("");
        edt2.setText("");

        btn1 = (Button) findViewById(R.id.btn_1);
        btn2 = (Button) findViewById(R.id.btn_2);
        btn3 = (Button) findViewById(R.id.btn_3);
        btn4 = (Button) findViewById(R.id.btn_4);
        btn5 = (Button) findViewById(R.id.btn_5);
        btn6 = (Button) findViewById(R.id.btn_6);
        btn7 = (Button) findViewById(R.id.btn_7);
        btn8 = (Button) findViewById(R.id.btn_8);
        btn9 = (Button) findViewById(R.id.btn_9);
        btn0 = (Button) findViewById(R.id.btn_0);

        btnKali = (Button) findViewById(R.id.btn_multiply);
        btnKurang = (Button) findViewById(R.id.btn_min);
        btnTambah = (Button) findViewById(R.id.btn_plus);
        btnBagi = (Button) findViewById(R.id.btn_divide);
        btnDesimal = (Button) findViewById(R.id.btn_dot);
        btnBack = (Button) findViewById(R.id.btn_erase);
        btnEqual = (Button) findViewById(R.id.btn_equal);


        /************************
         * Button number onClick
         ************************/
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Process = edt1.getText().toString();
                edt1.setText(Process + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Process = edt1.getText().toString();
                edt1.setText(Process + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Process = edt1.getText().toString();
                edt1.setText(Process + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Process = edt1.getText().toString();
                edt1.setText(Process + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Process = edt1.getText().toString();
                edt1.setText(Process + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Process = edt1.getText().toString();
                edt1.setText(Process + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Process = edt1.getText().toString();
                edt1.setText(Process + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Process = edt1.getText().toString();
                edt1.setText(Process + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Process = edt1.getText().toString();
                edt1.setText(Process + "9");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Process = edt1.getText().toString();
                edt1.setText(Process + "0");
            }
        });

        /****************************************************
         * Operator Button on-Click
         ****************************************************/
        btnKali.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                    mValueOne = Float.parseFloat(edt1.getText() + "");
                    mMul = true;
                    Process = edt1.getText().toString();
                    edt1.setText(Process + "X");

            }
        });
        btnKurang.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                    mValueOne = Float.parseFloat(edt1.getText() + "");
                    mSub = true;
                    Process = edt1.getText().toString();
                    edt1.setText(Process + "-");

            }
        });

        btnTambah.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(edt1 == null){
                    edt1.setText("");
                }
                else{
                    mValueOne = Float.parseFloat(edt1.getText() + "");
                    mAdd = true;
                    Process = edt1.getText().toString();
                    edt1.setText(Process + "+");

                }
            }
        });

        btnBagi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                    mValueOne = Float.parseFloat(edt1.getText() + "");
                    mDiv = true;
                    Process = edt1.getText().toString();
                    edt1.setText(Process + "/");

            }

        });

        btnClear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                edt1.setText("");
            }
        });
        btnDesimal.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Process = edt1.getText().toString();
                edt1.setText(Process + ".");
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Process = edt1.getText().toString();
                if(Process.length() > 0){
                    Process = Process.substring(0, Process.length()-1);
                    edt1.setText(Process);
                }
            }
        });


        /****************************************************
         * Equal Button on-Click
         ****************************************************/
        btnEqual.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                mValueTwo = Float.parseFloat(edt1.getText() + "");
                if (mAdd == true){
                    akhir = mValueOne+mValueTwo;
                    String hasilakhir = String.valueOf(akhir);
                    edt2.setText(hasilakhir);
                    mAdd=false;
                }

                if (mSub == true){
                    akhir = mValueOne-mValueTwo;
                    String hasilakhir = String.valueOf(akhir);
                    edt2.setText(hasilakhir);
                    mSub=false;
                }

                if (mMul == true){
                    akhir = mValueOne*mValueTwo;
                    String hasilakhir = String.valueOf(akhir);
                    edt2.setText(hasilakhir);
                    mMul=false;
                }

                if (mDiv == true){
                    akhir = mValueOne/mValueTwo;
                    String hasilakhir = String.valueOf(akhir);
                    edt2.setText(hasilakhir);
                    mDiv=false;
                }

                /*
                Process = calcProses.getText().toString();


                Process = Process.replaceAll("X", "*");
                Process = Process.replaceAll("%", "/100");

                org.mozilla.javascript.Context rhino = org.mozilla.javascript.Context.enter();
                rhino.setOptimizationLevel(-1);
                String result = "";

                try{
                    Scriptable scope = rhino.initSafeStandardObjects();
                    result = rhino.evaluateString(scope,Process, "JavaScript", 1, null).toString();

                }catch (Exception e){
                    result = "Error";
                }
                */
            }
        });
    }
}
