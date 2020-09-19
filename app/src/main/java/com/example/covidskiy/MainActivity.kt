package com.example.covidskiy

import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.os.Handler
import android.view.Menu
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.navigation.NavigationView
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.drawerlayout.widget.DrawerLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        val navView: NavigationView = findViewById(R.id.nav_view)
        val navController = findNavController(R.id.nav_host_fragment)
        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.nav_news, R.id.nav_graph, R.id.nav_about, R.id.nav_settings
            ), drawerLayout
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)


//        val handler = Handler()
//        handler.postDelayed(object : Runnable {
//            override fun run() {
//                    val mainLinearLayout = findViewById(R.id.constraintLayout) as LinearLayout
//                    val cardLinearLayout = LinearLayout(this@MainActivity)
//                    cardLinearLayout.orientation = LinearLayout.VERTICAL
//                    val params = RelativeLayout.LayoutParams(
//                        ViewGroup.LayoutParams.MATCH_PARENT,
//                        ViewGroup.LayoutParams.WRAP_CONTENT)
//                    params.setMargins(16,500,16,16)
//                    val cardView = CardView(this@MainActivity)
//                    cardView.radius = 15f
//                    cardView.setCardBackgroundColor(Color.parseColor("#009688"))
//                    cardView.setContentPadding(36,36,36,36)
//                    cardView.layoutParams = params
//                    cardView.cardElevation = 30f
//                    val quote = TextView(this@MainActivity)
//                    quote.text = "\"Какая-то крутая новость про ковид\"\n";
//                    quote.textSize = 24f
//                    quote.setTextColor(Color.WHITE)
//                    quote.setTypeface(Typeface.SANS_SERIF,Typeface.NORMAL)
//                    val name = TextView(this@MainActivity)
//                    name.text = "- Британские ученные (которые что-то выяснили)"
//                    name.textSize = 16f
//                    name.setTypeface(Typeface.MONOSPACE, Typeface.ITALIC)
//                    name.setTextColor(Color.parseColor("#E0F2F1"))
//                    cardLinearLayout.addView(quote)
//                    cardLinearLayout.addView(name)
//                    cardView.addView(cardLinearLayout)
//                    mainLinearLayout.addView(cardView)
//
//                handler.postDelayed(this, 1000)//1 sec delay
//            }
//        }, 0)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }
}