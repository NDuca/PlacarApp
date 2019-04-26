package br.com.fiap.placarapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_placar.*

class PlacarActivity : AppCompatActivity() {

    private var goalCasa = 0
    private var goalVisitante = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_placar)


        tvTimeCasa.text = intent.getStringExtra("TIME_CASA")
        tvTimeVisitante.text = intent.getStringExtra("TIME_VISITANTE")

        tvPlacarCasa.text = "$goalCasa"
        tvPlacarVisitante.text = "$goalVisitante"

        btGoalCasa.setOnClickListener{
            goalCasa++
            tvPlacarCasa.text = "$goalCasa"


        }
        btGoalVisitante.setOnClickListener{
            goalVisitante++
            tvPlacarVisitante.text = "$goalVisitante"

        }


    }
}
