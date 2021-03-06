package com.fegusta.recyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.fegusta.recyclerview.R
import com.fegusta.recyclerview.model.Jogo
import java.util.*


class JogosAdapter(var listaJogos: ArrayList<Jogo>): RecyclerView.Adapter<JogosAdapter.JogoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JogoViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.layout_lista_jogos, parent, false)

        return JogoViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return listaJogos.size
    }

    override fun onBindViewHolder(holder: JogoViewHolder, position: Int) {
        val jogo = listaJogos[position]
        holder.bind(jogo)

    }

    class JogoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(jogo: Jogo) {
            itemView.findViewById<TextView>(R.id.textNomeDoJogo).text = jogo.nomeJogo
            itemView.findViewById<TextView>(R.id.textConsole).text = jogo.console
            itemView.findViewById<RatingBar>(R.id.notaJogo).rating = jogo.notaJogo
        }
    }

}
