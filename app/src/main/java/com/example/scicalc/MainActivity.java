package com.example.scicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView textIp1;
    private TextView textIp2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn0 = findViewById(R.id.btn0);
        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);
        Button btn4 = findViewById(R.id.btn4);
        Button btn5 = findViewById(R.id.btn5);
        Button btn6 = findViewById(R.id.btn6);
        Button btn7 = findViewById(R.id.btn7);
        Button btn8 = findViewById(R.id.btn8);
        Button btn9 = findViewById(R.id.btn9);
        Button btnDot = findViewById(R.id.btnDot);
        Button btnPi = findViewById(R.id.btnPi);
        Button btnEq = findViewById(R.id.btnEq);
        Button btnPlus = findViewById(R.id.btnPlus);
        Button btnMinus = findViewById(R.id.btnMinus);
        Button btnMul = findViewById(R.id.btnMul);
        Button btnDivide = findViewById(R.id.btnDivide);
        Button btnSin = findViewById(R.id.btnSin);
        Button btnCos = findViewById(R.id.btnCos);
        Button btnTan = findViewById(R.id.btnTan);
        Button btnLog = findViewById(R.id.btnLog);
        Button btns9 = findViewById(R.id.btns9);
        Button btns0 = findViewById(R.id.btns0);
        Button btnPow = findViewById(R.id.btnPow);
        Button btnRoot = findViewById(R.id.btnRoot);
        Button btnClear = findViewById(R.id.btnClear);
        Button btnAc = findViewById(R.id.btnAc);
        textIp1 = findViewById(R.id.textIp1);
        textIp2 = findViewById(R.id.textIp2);


        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textIp1.setText(textIp1.getText().toString() + "0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textIp1.setText(textIp1.getText().toString() + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textIp1.setText(textIp1.getText().toString() + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textIp1.setText(textIp1.getText().toString() + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textIp1.setText(textIp1.getText().toString() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textIp1.setText(textIp1.getText().toString() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textIp1.setText(textIp1.getText().toString() + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textIp1.setText(textIp1.getText().toString() + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textIp1.setText(textIp1.getText().toString() + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textIp1.setText(textIp1.getText().toString() + "9");
            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textIp1.setText(textIp1.getText().toString() + ".");
            }
        });
        btnAc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textIp1.setText("");
                textIp2.setText("");

            }
        });
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textIp1.setText(textIp1.getText().toString() + "+");
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textIp1.setText(textIp1.getText().toString() + "/");
            }
        });
        btns9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textIp1.setText(textIp1.getText().toString() + "(");
            }
        });
        btns0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textIp1.setText(textIp1.getText().toString() + ")");
            }
        });
        btnPi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textIp1.setText(textIp1.getText().toString() + "3.142");
                textIp2.setText(btnPi.getText().toString());
            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = textIp1.getText().toString();
                if (!str.substring(str.length() - 1).equals("-")) {
                    textIp1.setText(textIp1.getText().toString() + "-");
                }
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = textIp1.getText().toString();
                if (!str.substring(str.length() - 1).equals("*")) {
                    textIp1.setText(textIp1.getText().toString() + "*");
                }
            }
        });
        btnRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textIp1.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter a valid number..", Toast.LENGTH_SHORT).show();
                } else {
                    String str = textIp1.getText().toString();
                    double r = Math.sqrt(Double.parseDouble(str));
                    String result = String.valueOf(r);
                    textIp1.setText(result);
                }
            }
        });
        btnSin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textIp1.setText(textIp1.getText().toString() + "sin");
            }
        });
        btnCos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textIp1.setText(textIp1.getText().toString() + "cos");
            }
        });
        btnTan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textIp1.setText(textIp1.getText().toString() + "tan");
            }
        });
        btnLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textIp1.setText(textIp1.getText().toString() + "log");
            }
        });

        btnEq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = textIp1.getText().toString();
                double result = evaluate(str);
                String r = String.valueOf(result);
                textIp1.setText(r);
                textIp2.setText(str);
            }

            private double evaluate(String str) {

                return new Object() {
                    int pos = -1;
                    int ch;

                    void nextChar() {
                        ch = (++pos < str.length()) ? str.charAt(pos) : -1;
                    }

                    boolean eat(int charToEat) {
                        while (ch == ' ') nextChar();
                        if (ch == charToEat) {
                            nextChar();
                            return true;
                        }
                        return false;
                    }

                    double parse() {
                        nextChar();
                        double x = parseExpression();
                        if (pos < str.length()) {
                            throw new RuntimeException("Unexpected: " + (char) ch);
                        }
                        return x;
                    }

                    double parseExpression() {
                        double x = parseTerm();
                        while (true) {
                            if (eat('+')) x += parseTerm();
                            else if (eat('-')) x -= parseTerm();
                            else return x;
                        }
                    }

                    double parseTerm() {
                        double x = parseFactor();
                        while (true) {
                            if (eat('*')) x *= parseFactor();
                            else if (eat('/')) x /= parseFactor();
                            else return x;
                        }
                    }

                    double parseFactor() {
                        if (eat('+')) return parseFactor();
                        if (eat('-')) return -parseFactor();

                        double x;
                        int startPos = pos;
                        if (eat('(')) {
                            x = parseExpression();
                            eat(')');
                        } else if ((ch >= '0' && ch <= '9') || ch == '.') {
                            while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                            x = Double.parseDouble(str.substring(startPos, pos));
                        } else if (ch >= 'a' && ch <= 'z') {
                            while (ch >= 'a' && ch <= 'z') nextChar();
                            String func = str.substring(startPos, pos);
                            x = parseFactor();
                            if (func.equals("sqrt")) x = Math.sqrt(x);
                            else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                            else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                            else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                            else if (func.equals("log")) x = Math.log10(x);
                            else throw new RuntimeException("Unknown function: " + func);
                        } else {
                            throw new RuntimeException("Unexpected: " + (char) ch);
                        }

                        if (eat('^')) x = Math.pow(x, parseFactor());
                        return x;
                    }
                }.parse();
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = textIp1.getText().toString();
                if (!str.isEmpty()) {
                    str = str.substring(0, str.length() - 1);
                    textIp1.setText(str);
                }
            }
        });

        btnPow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textIp1.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter a valid number..", Toast.LENGTH_SHORT).show();
                } else {
                    double d = Double.parseDouble(textIp1.getText().toString());
                    double square = d * d;
                    textIp1.setText(String.valueOf(square));
                    textIp2.setText(d + "²");
                }
            }
        });


    }
}