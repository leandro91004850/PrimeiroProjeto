package br.com.leandro.primeiroprojeto;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.TextView;

        import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sortearNumero(View view){
        TextView textoResultado = (TextView) findViewById(R.id.textoResultado);
            int numero = new Random().nextInt(11);
            int somando12 = numero + 12;
        textoResultado.setText("O número selecionado é: "+ numero+ "\n e a soma mais 12 é " + somando12);
    }

}
