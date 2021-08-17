package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import java.util.Stack;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    EditText v1;
    EditText v2;
    EditText bEmpilhar;


    Stack<Integer> pilha = new Stack<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void empilhar(View view) {
        v1 = (EditText) findViewById(R.id.valor1);
        int num = Integer.parseInt(v1.getText().toString());
        pilha.push(num);
        st();
    }

    public void desempilhar(View view){
        pilha.pop();
        st();
    }

    public void somar(View view){
        int a = (Integer) pilha.pop();
        int b = (Integer) pilha.pop();
        pilha.push(a + b);
        st();
    }

    public void subtrair(View view){
        int c = pilha.pop();
        int d = pilha.pop();
        pilha.push(c - d);
        st();
    }

    public void multiplicar(View view){
        int e = (Integer) pilha.pop();
        int f = (Integer) pilha.pop();
        pilha.push(e * f);
        st();
    }

    public void dividir(View view){
        int g = (Integer) pilha.pop();
        int h = (Integer) pilha.pop();
        pilha.push(g / h);
        st();
    }

    public void st(){
        TextView v2 = (TextView)findViewById(R.id.result);
        v2.setText(pilha.toString());
    }
}

