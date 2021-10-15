package com.example.tutorial;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView text1;
    TextView text2;
    Button zero;
    Button one;
    Button two;
    Button three;
    Button four;
    Button five;
    Button six;
    Button seven;
    Button eight;
    Button nine;
    Button btn_add;
    Button btn_sub;
    Button btn_mult;
    Button btn_div;
    Button equal;
    Button clear;
    Button btn_cos;
    Button btn_sin;
    Button btn_tan;

   Double[] num = new Double[3];
    boolean add = false;
    boolean sub = false;
    boolean mult = false;
    boolean div = false;
    Double res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1=findViewById(R.id.resultado);
        text1.setText("");
        text2=findViewById(R.id.Text2);
        text2.setText("");
        zero = (Button) findViewById(R.id.zero);
        zero.setOnClickListener(this);
        one = (Button) findViewById(R.id.one);
        one.setOnClickListener(this);
        two = (Button) findViewById(R.id.two);
        two.setOnClickListener(this);
        three = (Button) findViewById(R.id.three);
        three.setOnClickListener(this);
        four = (Button) findViewById(R.id.four);
        four.setOnClickListener(this);
        five = (Button) findViewById(R.id.five);
        five.setOnClickListener(this);
        six = (Button) findViewById(R.id.six);
        six.setOnClickListener(this);
        seven = (Button) findViewById(R.id.seven);
        seven.setOnClickListener(this);
        eight = (Button) findViewById(R.id.eight);
        eight.setOnClickListener(this);
        nine = (Button) findViewById(R.id.nine);
        nine.setOnClickListener(this);
        btn_add = (Button) findViewById(R.id.add);
        btn_add.setOnClickListener(this);
        btn_sub = (Button) findViewById(R.id.sub);
        btn_sub.setOnClickListener(this);
        btn_mult = (Button) findViewById(R.id.mult);
        btn_mult.setOnClickListener(this);
        btn_div = (Button) findViewById(R.id.div);
        btn_div.setOnClickListener(this);
        btn_cos = (Button) findViewById(R.id.cos);
        btn_cos.setOnClickListener(this);
        btn_sin = (Button) findViewById(R.id.sin);
        btn_sin.setOnClickListener(this);
        btn_tan = (Button) findViewById(R.id.tan);
        btn_tan.setOnClickListener(this);
        equal = (Button) findViewById(R.id.equal);
        equal.setOnClickListener(this);
        clear = (Button) findViewById(R.id.clear);
        clear.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int btn = v.getId();
        String x = text1.getText().toString();
        try{
            switch (btn){
                case R.id.zero:
                    text1.setText(x+"0");
                    break;
                case R.id.one:
                    text1.setText(x+"1");
                    break;
                case R.id.two:
                    text1.setText(x+"2");
                    break;
                case R.id.three:
                    text1.setText(x+"3");
                    break;
                case R.id.four:
                    text1.setText(x+"4");
                    break;
                case R.id.five:
                    text1.setText(x+"5");
                    break;
                case R.id.six:
                    text1.setText(x+"6");
                    break;
                case R.id.seven:
                    text1.setText(x+"7");
                    break;
                case R.id.eight:
                    text1.setText(x+"8");
                    break;
                case R.id.nine:
                    text1.setText(x+"9");
                    break;
                case R.id.clear:
                    text1.setText("");
                    text2.setText("");
                    break;
                case R.id.add:
                    add = true;
                    num[0]=Double.parseDouble(x);
                    text2.setText(String.valueOf(x+"+"));
                    text1.setText("");
                    break;
                case R.id.sub:
                    sub = true;
                    num[0]=Double.parseDouble(x);
                    text2.setText(String.valueOf(x+"-"));
                    text1.setText("");
                    break;
                case R.id.mult:
                    mult = true;
                    num[0]=Double.parseDouble(x);
                    text2.setText(String.valueOf(x+"*"));
                    text1.setText("");
                    break;
                case R.id.div:
                    div = true;
                    num[0]=Double.parseDouble(x);
                    text2.setText(String.valueOf(x+"/"));
                    text1.setText("");
                    break;
                case R.id.cos:
                    num[0]= Double.parseDouble(x);
                    text2.setText(String.valueOf("cos "+num[0]));
                    res = Math.cos(num[0]*Math.PI/180);
                    text1.setText(String.valueOf(res));
                    break;
                case R.id.sin:
                    num[0]= Double.parseDouble(x);
                    text2.setText(String.valueOf("sin "+num[0]));
                    res = Math.sin(num[0]*Math.PI/180);
                    text1.setText(String.valueOf(res));
                    break;
                case R.id.tan:
                    num[0]= Double.parseDouble(x);
                    text2.setText(String.valueOf("tan "+num[0]));
                    res = Math.tan(num[0]*Math.PI/180);
                    text1.setText(String.valueOf(res));
                    break;
                case R.id.equal:
                    num[1] = Double.parseDouble(x);
                    if(add == true){
                        text2.setText(String.valueOf(num[0]+"+"+num[1]));
                        res = num[0]+num[1];
                        text1.setText(String.valueOf(res));
                    }else if (sub == true){
                        text2.setText(String.valueOf(num[0]+"-"+num[1]));
                        res = num[0]-num[1];
                        text1.setText(String.valueOf(res));
                    }else if (mult == true){
                        text2.setText(String.valueOf(num[0]+"*"+num[1]));
                        res = num[0]*num[1];
                        text1.setText(String.valueOf(res));
                    }else if (div == true){
                        text2.setText(String.valueOf(num[0]+"/"+num[1]));
                        res = num[0]/num[1];
                        text1.setText(String.valueOf(res));
                    }
                    add = false;
                    sub = false;
                    mult = false;
                    div = false;
                    break;
            }
        }catch (Exception e){
            text1.setText("ERROR");
        }
    }
}