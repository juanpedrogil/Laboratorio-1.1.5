package com.debug.prueba.aplicacion.juanpedrog.laboratorio_115;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    String[][] datos={{"Resumed","En este estado se realiza toda la configuracion lógica de la aplicación, se" +
            "inician los hilos, se instancian algunas variables y otras rutinas que el " +
            "programador necesite."},
            {"Started","En este estado la aplicacion es llamada pasea primer plano y sea visible e " +
                    "interactiva por el usuario."},
            {"Paused","Entra a este estado cuando el usuario deja esa actividad pero no necesariamete" +
                    "esta se destruye. Se guarda el estado en el que se encuentra y se detiene su" +
                    "ejecución. Este activity se encontrara en pausa y estara esperando a reanudarse" +
                    "en breve."},
            {"Stopped","Al entrar a este estado la activity ya no es ni sera visible para el usuario, por" +
                    "lo que se liberaran los recursos que esta halla ocupado."},
            {"Inactive","En este estado la actividad es removida de la pila de tareas, es decir que es " +
                    "destriuda de la ejecución y no se puede volver a accesar a menos que se vuelva a" +
                    "crear."}};

    Context contexto;
    ListView lista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lista=findViewById(R.id.lista);
        contexto=this;
        lista.setAdapter(new Formato(datos,contexto));

    }
}
