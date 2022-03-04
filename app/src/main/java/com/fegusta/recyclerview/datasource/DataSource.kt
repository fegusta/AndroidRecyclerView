package com.fegusta.recyclerview.datasource

import com.fegusta.recyclerview.model.Jogo
import java.util.*

class DataSource {

    companion object {

        fun getJogos() : ArrayList<Jogo>{
            var jogos = ArrayList<Jogo>()

            jogos.add(Jogo(100,"Residente Evil",5,"PS4"))
            jogos.add(Jogo(200,"Zombie Army",4,"PC"))

            return jogos

        }
    }

}