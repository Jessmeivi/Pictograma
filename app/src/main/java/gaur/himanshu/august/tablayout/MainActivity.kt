package gaur.himanshu.august.tablayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import gaur.himanshu.august.tablayout.adapters.ViewPagerAdapter
import android.widget.ImageButton
import android.media.MediaPlayer
import android.view.View

class MainActivity : AppCompatActivity() {
    //personales
    private lateinit var mPyo: MediaPlayer
    private lateinit var mPportero: MediaPlayer
    private lateinit var mPjugador: MediaPlayer
    private lateinit var mPequipo: MediaPlayer
    private lateinit var mPentrenador: MediaPlayer
    private lateinit var mParbrito: MediaPlayer

    //sustantivos
    private lateinit var mSbalon: MediaPlayer
    private lateinit var mScampeon: MediaPlayer
    private lateinit var mScampo: MediaPlayer
    private lateinit var mScopa: MediaPlayer
    private lateinit var mSentrada: MediaPlayer
    private lateinit var mSfutbol: MediaPlayer
    private lateinit var mSgol: MediaPlayer
    private lateinit var mSpartido: MediaPlayer
    private lateinit var mSpenalty: MediaPlayer
    private lateinit var mSporteria: MediaPlayer
    private lateinit var mSpublico: MediaPlayer
    private lateinit var mStarjeta: MediaPlayer

    //verbos
    private lateinit var mVbajar: MediaPlayer
    private lateinit var mVcomprar: MediaPlayer
    private lateinit var mVdivertir: MediaPlayer
    private lateinit var mVempatar: MediaPlayer
    private lateinit var mVexpulsar: MediaPlayer
    private lateinit var mVfalta: MediaPlayer
    private lateinit var mVganar: MediaPlayer
    private lateinit var mVir: MediaPlayer
    private lateinit var mVmegusta: MediaPlayer
    private lateinit var mVnomegusta: MediaPlayer
    private lateinit var mVperder: MediaPlayer
    private lateinit var mVpitar: MediaPlayer
    private lateinit var mVquiero: MediaPlayer
    private lateinit var mVseacabo: MediaPlayer
    private lateinit var mVsubir: MediaPlayer
    private lateinit var mVvertele: MediaPlayer

    //cualidades
    private lateinit var mEaburrido: MediaPlayer
    private lateinit var mEcontento: MediaPlayer
    private lateinit var mEtriste: MediaPlayer

    //expresiones
    private lateinit var mBuenosdias: MediaPlayer
    private lateinit var mHola: MediaPlayer
    private lateinit var mPerdon: MediaPlayer
    private lateinit var mGenial: MediaPlayer
    private lateinit var mPorfavor: MediaPlayer
    private lateinit var mSeacabo: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //personales
        mPyo = MediaPlayer.create(this, R.raw.yo)
        mPyo.isLooping=false

        mPportero = MediaPlayer.create(this, R.raw.portero)
        mPportero.isLooping=false

        mPjugador = MediaPlayer.create(this, R.raw.jugador)
        mPjugador.isLooping=false

        mPequipo = MediaPlayer.create(this, R.raw.equipo)
        mPequipo.isLooping=false

        mPentrenador = MediaPlayer.create(this, R.raw.entrenador)
        mPentrenador.isLooping=false

        mParbrito = MediaPlayer.create(this, R.raw.arbitro)
        mParbrito.isLooping=false

        //sustantivos
        mSbalon = MediaPlayer.create(this, R.raw.balon)
        mSbalon.isLooping=false

        mScampeon = MediaPlayer.create(this, R.raw.campeon)
        mScampeon.isLooping=false

        mScampo = MediaPlayer.create(this, R.raw.campo)
        mScampo.isLooping=false

        mScopa = MediaPlayer.create(this, R.raw.copa)
        mScopa.isLooping=false

        mSentrada = MediaPlayer.create(this, R.raw.entrada)
        mSentrada.isLooping=false

        mSfutbol = MediaPlayer.create(this, R.raw.futbol)
        mSfutbol.isLooping=false

        mSgol = MediaPlayer.create(this, R.raw.gol)
        mSgol.isLooping=false

        mSpartido = MediaPlayer.create(this, R.raw.partido)
        mSpartido.isLooping=false

        mSpenalty = MediaPlayer.create(this, R.raw.penalty)
        mSpenalty.isLooping=false

        mSporteria = MediaPlayer.create(this, R.raw.porteria)
        mSporteria.isLooping=false

        mSpublico = MediaPlayer.create(this, R.raw.publico)
        mSpublico.isLooping=false

        mStarjeta = MediaPlayer.create(this, R.raw.tarjeta)
        mStarjeta.isLooping=false

        //verbos
        mVbajar = MediaPlayer.create(this, R.raw.bajar)
        mVbajar.isLooping=false

        mVcomprar = MediaPlayer.create(this, R.raw.comprar)
        mVcomprar.isLooping=false

        mVdivertir = MediaPlayer.create(this, R.raw.divertir)
        mVdivertir.isLooping=false

        mVempatar = MediaPlayer.create(this, R.raw.empatar)
        mVempatar.isLooping=false

        mVexpulsar = MediaPlayer.create(this, R.raw.expulsar)
        mVexpulsar.isLooping=false

        mVfalta = MediaPlayer.create(this, R.raw.falta)
        mVfalta.isLooping=false

        mVganar = MediaPlayer.create(this, R.raw.ganar)
        mVganar.isLooping=false

        mVir = MediaPlayer.create(this, R.raw.ir)
        mVir.isLooping=false

        mVmegusta = MediaPlayer.create(this, R.raw.megusta)
        mVmegusta.isLooping=false

        mVnomegusta = MediaPlayer.create(this, R.raw.nomegusta)
        mVnomegusta.isLooping=false

        mVperder = MediaPlayer.create(this, R.raw.perder)
        mVperder.isLooping=false

        mVpitar = MediaPlayer.create(this, R.raw.pitar)
        mVpitar.isLooping=false

        mVquiero = MediaPlayer.create(this, R.raw.quiero)
        mVquiero.isLooping=false

        mVseacabo = MediaPlayer.create(this, R.raw.seacabo)
        mVseacabo.isLooping=false

        mVsubir = MediaPlayer.create(this, R.raw.subir)
        mVsubir.isLooping=false

        mVvertele = MediaPlayer.create(this, R.raw.vertele)
        mVvertele.isLooping=false

        //cualidades
        mEaburrido = MediaPlayer.create(this, R.raw.aburrido)
        mEaburrido.isLooping=false

        mEcontento = MediaPlayer.create(this, R.raw.contento)
        mVsubir.isLooping=false

        mEtriste = MediaPlayer.create(this, R.raw.triste)
        mEtriste.isLooping=false

        //expresiones
        mBuenosdias = MediaPlayer.create(this, R.raw.buenosdias)
        mBuenosdias.isLooping=false

        mGenial = MediaPlayer.create(this, R.raw.genial)
        mGenial.isLooping=false

        mHola = MediaPlayer.create(this, R.raw.hola)
        mHola.isLooping=false

        mPerdon = MediaPlayer.create(this, R.raw.perdon)
        mPerdon.isLooping=false

        mPorfavor = MediaPlayer.create(this, R.raw.porfavor)
        mPorfavor.isLooping=false

        mSeacabo = MediaPlayer.create(this, R.raw.seacabo)
        mSeacabo.isLooping=false

        val tabLayout = findViewById<TabLayout>(R.id.tab_layout)
        val viewPager2 = findViewById<ViewPager2>(R.id.view_pager_2)
        val pyo = findViewById<ImageButton>(R.id.pyo)

        val adapter = ViewPagerAdapter(supportFragmentManager, lifecycle)

        viewPager2.adapter = adapter

        TabLayoutMediator(tabLayout, viewPager2) { tab, position ->
            when (position) {
                0 -> {
                    tab.text = "Personales"
                }
                1 -> {
                    tab.text = "Sustantivos"
                }
                2 -> {
                    tab.text = "Verbos"
                }
                3 -> {
                    tab.text = "Cualidades"
                }
                4 -> {
                    tab.text = "Expresiones"
                }
            }
        }.attach()
    }
    fun playEaburrido(v: View){
        mEaburrido.start();
    }
    fun playEcontento(v: View){
        mEcontento.start();
    }
    fun playEtriste(v: View){
        mEtriste.start();
    }
    fun playParbitro(v: View){
        mParbrito.start();
    }
    fun playPentrenador(v: View){
        mPentrenador.start();
    }
    fun playPequipo(v: View){
        mPequipo.start();
    }
    fun playPjugador(v: View){
        mPjugador.start();
    }
    fun playPportero(v: View){
        mPportero.start();
    }
    fun playPyo(v: View){
        mPyo.start();
    }
    fun playSbalon(v: View){
        mSbalon.start();
    }
    fun playScampeon(v: View){
        mScampeon.start();
    }
    fun playScampo(v: View){
        mScampo.start();
    }
    fun playScopa(v: View){
        mScopa.start();
    }
    fun playSentrada(v: View){
        mSentrada.start();
    }
    fun playSfutbol(v: View){
        mSfutbol.start();
    }
    fun playSgol(v: View){
        mSgol.start();
    }
    fun playSpartido(v: View){
        mSpartido.start();
    }
    fun playSpenalty(v: View){
        mSpenalty.start();
    }
    fun playSporteria(v: View){
        mSporteria.start();
    }
    fun playSpublico(v: View){
        mSpublico.start();
    }
    fun playStarjeta(v: View){
        mStarjeta.start();
    }
    fun playVbajar(v: View){
        mVbajar.start();
    }
    fun playVcomprar(v: View){
        mVcomprar.start();
    }
    fun playVdivertir(v: View){
        mVdivertir.start();
    }
    fun playVempatar(v: View){
        mVempatar.start();
    }
    fun playVexpulsar(v: View){
        mVexpulsar.start();
    }
    fun playVfalta(v: View){
        mVfalta.start();
    }
    fun playVganar(v: View){
        mVganar.start();
    }
    fun playVir(v: View){
        mVir.start();
    }
    fun playVmegusta(v: View){
        mVmegusta.start();
    }
    fun playVnomegusta(v: View){
        mVnomegusta.start();
    }
    fun playVperder(v: View){
        mVperder.start();
    }
    fun playVpitar(v: View){
        mVpitar.start();
    }
    fun playVquiero(v: View){
        mVquiero.start();
    }
    fun playVseacabo(v: View){
        mVseacabo.start();
    }
    fun playVsubir(v: View){
        mVsubir.start();
    }
    fun playBuenosdias(v: View){
        mBuenosdias.start();
    }
    fun playPerdon(v: View){
        mPerdon.start();
    }
    fun playPorfavor(v: View){
        mPorfavor.start();
    }
    fun playGenial(v: View){
        mGenial.start();
    }
    fun playSeacabo(v: View){
        mSeacabo.start();
    }
    fun playHola(v: View){
        mHola.start();
    }

}