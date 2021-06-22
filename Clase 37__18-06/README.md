# MODULO 3 | Desarrollo de Aplicaciones Móviles Android Java | Ignacio Cavallo

---

## Clase 37 | 18-06

 Empezamos con Android Ehhhh!!.:tada: :confetti_ball:

 Aprendimos varias cosas, como por ejemplo botones. El ejercicio es el siguiente:

 ```java
 public class MainActivity extends AppCompatActivity {
     private EditText n1, n2;
     private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1 = findViewById(R.id.num1);
        n2 = findViewById(R.id.num2);
        resultado = findViewById(R.id.textView4);
    }

    public void sumar(View v) {
        int valorUno = Integer.parseInt(n1.getText().toString());
        int valorDos = Integer.parseInt(n2.getText().toString());
        int suma = valorUno + valorDos;
        resultado.setText(Integer.toString(suma));
    }


}
 ```