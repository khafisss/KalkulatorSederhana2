package id.ac.uai.anif.khafiz97.calculatorsederhana;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import org.mozilla.javascript.Scriptable;


public class MainActivity extends AppCompatActivity {
    Button btnClear, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0;
    TextView calcProses, calcResult;
    String Process;
    Boolean bracket;
    Button btnKali, btnKurang, btnTambah, btnBagi, btnDesimal, btnBack, btnBracket, btnEqual, btnPersen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bracket = false;

        btnClear = (Button) findViewById(R.id.btn_delete);
        calcProses = (TextView) findViewById(R.id.calc_proses);
        calcResult = (TextView) findViewById(R.id.calc_result);


        calcProses.setText("");
        calcResult.setText("");


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

        btnBracket = (Button) findViewById(R.id.btn_small_bracket);
        btnEqual = (Button) findViewById(R.id.btn_equal);
        btnPersen = (Button) findViewById(R.id.btn_percentage);

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcProses.setText("");
                calcResult.setText("");

            }
        });
        /************************
         * Button number onClick
         ************************/
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Process = calcProses.getText().toString();
                calcProses.setText(Process + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Process = calcProses.getText().toString();
                calcProses.setText(Process + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Process = calcProses.getText().toString();
                calcProses.setText(Process + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Process = calcProses.getText().toString();
                calcProses.setText(Process + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Process = calcProses.getText().toString();
                calcProses.setText(Process + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Process = calcProses.getText().toString();
                calcProses.setText(Process + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Process = calcProses.getText().toString();
                calcProses.setText(Process + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Process = calcProses.getText().toString();
                calcProses.setText(Process + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Process = calcProses.getText().toString();
                calcProses.setText(Process + "9");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Process = calcProses.getText().toString();
                calcProses.setText(Process + "0");
            }
        });

        /****************************************************
         * Operator Button on-Click
         ****************************************************/
        btnKali.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Process = calcProses.getText().toString();
                calcProses.setText(Process + "X");
            }
        });

        btnKurang.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Process = calcProses.getText().toString();
                calcProses.setText(Process + "-");
            }
        });

        btnTambah.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Process = calcProses.getText().toString();
                calcProses.setText(Process + "+");
            }
        });

        btnBagi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Process = calcProses.getText().toString();
                calcProses.setText(Process + "/");
            }
        });

        btnDesimal.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Process = calcProses.getText().toString();
                calcProses.setText(Process + ".");
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Process = calcProses.getText().toString();
                if(Process.length() > 0){
                    Process = Process.substring(0, Process.length()-1);
                    calcProses.setText(Process);
                }
            }
        });

        btnBracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(bracket){
                    Process = calcProses.getText().toString();
                    calcProses.setText(Process + ")");
                    bracket = false;
                }else{
                    Process = calcProses.getText().toString();
                    calcProses.setText(Process + "(");
                    bracket = true;
                }
            }
        });

        btnPersen.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Process = calcProses.getText().toString();
                calcProses.setText(Process + "%");
            }
        });



        /****************************************************
         * Equal Button on-Click
         ****************************************************/
        btnEqual.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
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

                calcResult.setText(result);
            }
        });

    }
}
