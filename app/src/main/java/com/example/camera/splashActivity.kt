package br.com.candida.estaohack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.camera.LoginActivity
import com.example.camera.R

class splashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        //Setando um tempo na tela de splash para a tela de login
        Handler().postDelayed({
            //Abrindo a tela de login
            startActivity(Intent(this@splashActivity,LoginActivity::class.java))
            //finalizando a splash
            finish()
        }, 3000)

    }
}
