package br.com.felipebertanha.financask.ui.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import br.com.felipebertanha.financask.R
import br.com.felipebertanha.financask.ui.adapter.ListaTransacoesAdapter
import kotlinx.android.synthetic.main.activity_lista_transacoes.*

class ListaTransacoesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?): Unit {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_transacoes)

        val lista = listOf("Comida R$ 20,50", "Economia - R$ 100,00")

        val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, lista)

        lista_transacoes_listview.adapter = ListaTransacoesAdapter(this, lista)
    }

}