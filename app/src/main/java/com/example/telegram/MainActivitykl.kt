package com.example.telegram

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.navigation.NavigationView

class MainActivitykl : AppCompatActivity() {

    private lateinit var drawerLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Configurar el DrawerLayout y el Toolbar
        drawerLayout = findViewById(R.id.drawer_layout)
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.title = "TELEGRAM"

        // Configurar el ícono Home en el Toolbar para abrir el Drawer
        supportActionBar?.setHomeAsUpIndicator(R.drawable.icon_opcions)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        // Configurar el NavigationView
        val navigationView: NavigationView = findViewById(R.id.nav_view)
        navigationView.setNavigationItemSelectedListener { item ->
            onNavigationItemSelected(item)
        }

        // Configurar el RecyclerView de chats
        val recyclerViewChats: RecyclerView = findViewById(R.id.recyclerViewChats)
        recyclerViewChats.layoutManager = LinearLayoutManager(this)

        val chatList = mutableListOf<Chat>(
            Chat(R.drawable.kim, "Kimberly Mendoza", "¡Hola! ¿Cómo estás?", "18/01/2025"),
            Chat(R.drawable.kenneth, "Kenneth Rodriguez", "¿Confirma ese deber?", "11/01/2025"),
            Chat(R.drawable.ale, "Alexander Maigua", "Confirmame si vas al evento", "09/01/2025"),
            Chat(R.drawable.dayi, "Dayana Castro", "¿Tienes el archivo?", "05/01/2025"),
            Chat(R.drawable.tony, "Anthony Dominguez", "Revisa el documento que te envié", "03/01/2025"),
            Chat(R.drawable.jule, "Julexy Mosquera", "¿Te gustaría salir este fin de semana?", "03/01/2025"),
            Chat(R.drawable.fabre, "Fabre Vera", "Revisa mi correo por favor", "03/01/2025"),
            Chat(R.drawable.silvi, "Silvana Espinoza", "¿Nos vemos mañana a las 10?", "03/01/2025"),
            Chat(R.drawable.adonis, "Adonis Gurumendi", "Ya te envié el informe, revisalo", "03/01/2025"),
            Chat(R.drawable.jordy, "Jordy Lucas", "¿Como hiciste el deber ?", "01/01/2025"),
            Chat(R.drawable.wil, "Wilmer Zambrano", "Revisa mi SGA", "31/12/2024"),
            Chat(R.drawable.luiggy, "Luiggy Herbas", "¿Ayudame con el deber, por fa?", "20/12/2024")
        )

        val chatAdapter = ChatAdapter(chatList)
        recyclerViewChats.adapter = chatAdapter // Asocia el adaptador al RecyclerView
    }

    // Inflar el menú de opciones en el Toolbar
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu2, menu) // Asegúrate de inflar tu menú XML
        return true
    }

    // Manejo de la selección de ítems del menú de navegación
    private fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            // Manejar las acciones de los ítems del menú aquí
        }
        drawerLayout.closeDrawer(GravityCompat.START) // Cierra el Drawer cuando se selecciona un ítem
        return true
    }

    // Manejo de la selección de ítems del Toolbar
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                drawerLayout.openDrawer(GravityCompat.START)
                return true
            }
            R.id.action_search -> {
                // Acción para el ícono de búsqueda
                Toast.makeText(this, "Acción de búsqueda", Toast.LENGTH_SHORT).show()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    private fun showSearchDialog() {
        // Aquí puedes implementar el código para mostrar el diálogo de búsqueda
    }
}


