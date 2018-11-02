package com.deguzman.clarissehelaine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener, View.OnClickListener {

    Spinner s1,s2;
    Button b1,b2;
    TextView t1;
    String state[]=null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        s1=(Spinner)findViewById(R.id.spinner);
        s2=(Spinner)findViewById(R.id.spinner2);
        b1=(Button)findViewById(R.id.button);
        t1=(TextView)findViewById(R.id.textView);

        s1.setOnItemSelectedListener(this);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if(position==0)
        {
            state=new String[]{"EDSA", "Libertad", "Gil Puyat", "Vito Cruz", "Quirino", "Pedro Gil",
                    "UN Ave", "Central", "Carriedo", "Doroteo Jose", "Bambang", "Tayuman", "Blumentritt",
                    "Abad Santos", "R. Papa", "5th Ave", "Monumento"};
        }
        if(position==1)
        {
            state=new String[]{"Baclaran", "Libertad", "Gil Puyat", "Vito Cruz", "Quirino", "Pedro Gil",
                    "UN Ave", "Central", "Carriedo", "Doroteo Jose", "Bambang", "Tayuman", "Blumentritt",
                    "Abad Santos", "R. Papa", "5th Ave", "Monumento"};
        }
        if(position==2)
        {
            state=new String[]{"Baclaran", "EDSA", "Gil Puyat", "Vito Cruz", "Quirino", "Pedro Gil",
                    "UN Ave", "Central", "Carriedo", "Doroteo Jose", "Bambang", "Tayuman", "Blumentritt",
                    "Abad Santos", "R. Papa", "5th Ave", "Monumento"};
        }
        if(position==3)
        {
            state=new String[]{"Baclaran", "EDSA", "Libertad", "Vito Cruz", "Quirino", "Pedro Gil",
                    "UN Ave", "Central", "Carriedo", "Doroteo Jose", "Bambang", "Tayuman", "Blumentritt",
                    "Abad Santos", "R. Papa", "5th Ave", "Monumento"};
        }
        if(position==4)
        {
            state=new String[]{"Baclaran", "EDSA", "Libertad", "Gil Puyat", "Quirino", "Pedro Gil",
                    "UN Ave", "Central", "Carriedo", "Doroteo Jose", "Bambang", "Tayuman", "Blumentritt",
                    "Abad Santos", "R. Papa", "5th Ave", "Monumento"};
        }
        if(position==5)
        {
            state=new String[]{"Baclaran", "EDSA", "Libertad", "Gil Puyat", "Vito Cruz", "Pedro Gil",
                    "UN Ave", "Central", "Carriedo", "Doroteo Jose", "Bambang", "Tayuman", "Blumentritt",
                    "Abad Santos", "R. Papa", "5th Ave", "Monumento"};
        }
        if(position==6)
        {
            state=new String[]{"Baclaran", "EDSA", "Libertad", "Gil Puyat", "Vito Cruz", "Quirino",
                    "UN Ave", "Central", "Carriedo", "Doroteo Jose", "Bambang", "Tayuman", "Blumentritt",
                    "Abad Santos", "R. Papa", "5th Ave", "Monumento"};
        }
        if(position==7)
        {
            state=new String[]{"Baclaran", "EDSA", "Libertad", "Gil Puyat", "Vito Cruz", "Quirino",
                    "Pedro Gil", "Central", "Carriedo", "Doroteo Jose", "Bambang", "Tayuman", "Blumentritt",
                    "Abad Santos", "R. Papa", "5th Ave", "Monumento"};
        }
        if(position==8)
        {
            state=new String[]{"Baclaran", "EDSA", "Libertad", "Gil Puyat", "Vito Cruz", "Quirino",
                    "Pedro Gil", "UN Ave", "Carriedo", "Doroteo Jose", "Bambang", "Tayuman", "Blumentritt",
                    "Abad Santos", "R. Papa", "5th Ave", "Monumento"};
        }
        if(position==9)
        {
            state=new String[]{"Baclaran", "EDSA", "Libertad", "Gil Puyat", "Vito Cruz", "Quirino",
                    "Pedro Gil", "UN Ave", "Central", "Doroteo Jose", "Bambang", "Tayuman", "Blumentritt",
                    "Abad Santos", "R. Papa", "5th Ave", "Monumento"};
        }
        if(position==10)
        {
            state=new String[]{"Baclaran", "EDSA", "Libertad", "Gil Puyat", "Vito Cruz", "Quirino",
                    "Pedro Gil", "UN Ave", "Central", "Carriedo", "Bambang", "Tayuman", "Blumentritt",
                    "Abad Santos", "R. Papa", "5th Ave", "Monumento"};
        }
        if(position==11)
        {
            state=new String[]{"Baclaran", "EDSA", "Libertad", "Gil Puyat", "Vito Cruz", "Quirino",
                    "Pedro Gil", "UN Ave", "Central", "Carriedo", "Doroteo Jose", "Tayuman", "Blumentritt",
                    "Abad Santos", "R. Papa", "5th Ave", "Monumento"};
        }
        if(position==12)
        {
            state=new String[]{"Baclaran", "EDSA", "Libertad", "Gil Puyat", "Vito Cruz", "Quirino",
                    "Pedro Gil", "UN Ave", "Central", "Carriedo", "Doroteo Jose", "Bambang", "Blumentritt",
                    "Abad Santos", "R. Papa", "5th Ave", "Monumento"};
        }
        if(position==13)
        {
            state=new String[]{"Baclaran", "EDSA", "Libertad", "Gil Puyat", "Vito Cruz", "Quirino",
                    "Pedro Gil", "UN Ave", "Central", "Carriedo", "Doroteo Jose", "Bambang", "Tayuman",
                    "Abad Santos", "R. Papa", "5th Ave", "Monumento"};
        }
        if(position==14)
        {
            state=new String[]{"Baclaran", "EDSA", "Libertad", "Gil Puyat", "Vito Cruz", "Quirino",
                    "Pedro Gil", "UN Ave", "Central", "Carriedo", "Doroteo Jose", "Bambang", "Tayuman",
                    "Blumentritt", "R. Papa", "5th Ave", "Monumento"};
        }
        if(position==15)
        {
            state=new String[]{"Baclaran", "EDSA", "Libertad", "Gil Puyat", "Vito Cruz", "Quirino",
                    "Pedro Gil", "UN Ave", "Central", "Carriedo", "Doroteo Jose", "Bambang", "Tayuman",
                    "Blumentritt", "Abad Santos", "5th Ave", "Monumento"};
        }
        if(position==16)
        {
            state=new String[]{"Baclaran", "EDSA", "Libertad", "Gil Puyat", "Vito Cruz", "Quirino",
                    "Pedro Gil", "UN Ave", "Central", "Carriedo", "Doroteo Jose", "Bambang", "Tayuman",
                    "Blumentritt", "Abad Santos", "R Papa", "Monumento"};
        }
        if(position==17)
        {
            state=new String[]{"Baclaran", "EDSA", "Libertad", "Gil Puyat", "Vito Cruz", "Quirino",
                    "Pedro Gil", "UN Ave", "Central", "Carriedo", "Doroteo Jose", "Bambang", "Tayuman",
                    "Blumentritt", "Abad Santos", "R Papa", "5th Ave"};
        }


        ArrayAdapter<String> adt=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, state);
        s2.setAdapter(adt);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @Override
    public void onClick(View v) {
        String country=s1.getSelectedItem().toString();
        String state=s2.getSelectedItem().toString();

        switch (v.getId()) {

            case R.id.button:
                switch (country) {
                    case "Baclaran":
                        if(state=="EDSA" || state=="Libertad") {
                            t1.setText("P20");
                        }
                        if(state=="Gil Puyat" || state=="Vito Cruz") {
                            t1.setText("P15");
                        }
                }
                break;

            case R.id.button2:
                switch (country) {
                    case "Baclaran":
                        if(state=="EDSA" || state=="Libertad") {
                            t1.setText("P30");
                        }
                        if(state=="Gil Puyat" || state=="Vito Cruz") {
                            t1.setText("P35");
                        }
                }
                break;

            default:
                break;
        }
    }
}
