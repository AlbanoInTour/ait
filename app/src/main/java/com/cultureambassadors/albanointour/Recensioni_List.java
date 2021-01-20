package com.cultureambassadors.albanointour;

import android.os.Bundle;

import java.util.ArrayList;

public class Recensioni_List {
    private static final ArrayList<Recensione> Recensioni = new ArrayList<>();
    private static Recensioni_List Recens_list;

    private Recensioni_List(){

        Recensioni.add(new Recensione ("Duomo di Albano", "Marco", "...",4));
        Recensioni.add(new Recensione ("Duomo di Albano", "Edoardo", "...",5));
        Recensioni.add(new Recensione ("Duomo di Albano", "Riccardo", "...",4));
        Recensioni.add(new Recensione ("Convento dei Frati Cappuccini e Chiesa di S. Francesco", "Roberto", "...",3));
        Recensioni.add(new Recensione ("Convento dei Frati Cappuccini e Chiesa di S. Francesco", "Filippo", "...",5));
        Recensioni.add(new Recensione ("Convento dei Frati Cappuccini e Chiesa di S. Francesco", "Stefano", "...",2));
        Recensioni.add(new Recensione ("Convento e Chiesa di S. Paolo", "Ludovica", "...",5));
        Recensioni.add(new Recensione ("Convento e Chiesa di S. Paolo", "Francesca", "...",5));
        Recensioni.add(new Recensione ("Convento e Chiesa di S. Paolo", "Giuseppe", "...",4));
        Recensioni.add(new Recensione ("Chiesa della Stella e Cimitero del Colera", "Antonio", "...",2));
        Recensioni.add(new Recensione ("Chiesa della Stella e Cimitero del Colera", "Egidio", "...",5));
        Recensioni.add(new Recensione ("Chiesa di S. Maria della Rotonda", "Emanuele", "...",4));
        Recensioni.add(new Recensione ("Chiesa di S. Pietro", "Simona", "...",3));
        Recensioni.add(new Recensione ("Chiesa di S. Pietro", "Pietro", "...",4));
        Recensioni.add(new Recensione ("Chiesa di S. Pietro", "Prova", "...",4));
        Recensioni.add(new Recensione ("Tomba degli Orazi e Curiazi", "Chiara", "...",5));
        Recensioni.add(new Recensione ("Tomba degli Orazi e Curiazi", "Francesco", "...",3));
        Recensioni.add(new Recensione ("Tomba degli Orazi e Curiazi", "Paolo", "...",4));
        Recensioni.add(new Recensione ("Tomba degli Orazi e Curiazi", "Gianluca", "...",5));
        Recensioni.add(new Recensione ("Catacombe di S. Senatore", "Elena", "...",3));
        Recensioni.add(new Recensione ("I Cisternoni", "Sofia", "...",4));
        Recensioni.add(new Recensione ("I Cisternoni", "Rachele", "...",5));
        Recensioni.add(new Recensione ("I Cisternoni", "Daniele", "...",5));
        Recensioni.add(new Recensione ("Accampamento della Seconda Legione Partica (Castra Albana)", "Pierfrancesco", "Prova",1));
        Recensioni.add(new Recensione ("Anfiteatro Severiano", "Silvio", "...",4));
        Recensioni.add(new Recensione ("Anfiteatro Severiano", "Alice", "...",4));
        Recensioni.add(new Recensione ("Anfiteatro Severiano", "Leonardo", "...",4));
        Recensioni.add(new Recensione ("Terme di Cellomaio", "Silvia", "...",5));
        Recensioni.add(new Recensione ("Terme di Cellomaio", "Daniela", "...",4));
        Recensioni.add(new Recensione ("Villa di Pompeo Magno", "Luna", "...",5));
        Recensioni.add(new Recensione ("Villa di Pompeo Magno", "Riccardo", "...",3));
        Recensioni.add(new Recensione ("Villa romana ai Cavallacci", "Vincenzo", "...",4));
        Recensioni.add(new Recensione ("Villa romana ai Cavallacci", "Vittorio", "...",2));
        Recensioni.add(new Recensione ("Porta Pretoria e Porta Principalis Sinistra", "Roberto", "...",4));
        Recensioni.add(new Recensione ("Porta Pretoria e Porta Principalis Sinistra", "Alessandro", "...",5));
        Recensioni.add(new Recensione ("Porta Pretoria e Porta Principalis Sinistra", "Nicola", "...",3));
        Recensioni.add(new Recensione ("Museo archeologico di Albano", "Lorenzo", "...",1));
        Recensioni.add(new Recensione ("Museo archeologico di Albano", "Teresa", "...",2));
        Recensioni.add(new Recensione ("Museo della Seconda Legione Partica", "Vanessa", "...",3));
        Recensioni.add(new Recensione ("Museo della Seconda Legione Partica", "Maria", "...",5));
        Recensioni.add(new Recensione ("Museo della Seconda Legione Partica", "Giorgio", "...",3));
        Recensioni.add(new Recensione ("Palazzo Savelli", "Giorgia", "...",5));
        Recensioni.add(new Recensione ("Palazzo Savelli", "Matteo", "...",5));
        Recensioni.add(new Recensione ("Villa Doria - Pamphili", "Elena", "...",4));
        Recensioni.add(new Recensione ("Villa Doria - Pamphili", "Daniele", "...",5));
        Recensioni.add(new Recensione ("Villa Doria - Pamphili", "Asia", "...",4));
        Recensioni.add(new Recensione ("Villa Doria - Pamphili", "Samuele", "...",2));
        Recensioni.add(new Recensione ("Bajocco Festival", "Christian", "...",4));
        Recensioni.add(new Recensione ("Bajocco Festival", "Annalisa", "...",5));
        Recensioni.add(new Recensione ("Bajocco Festival", "Demetrio", "...",4));
        Recensioni.add(new Recensione ("Albano Musica Festival", "Clarissa", "...",3));
        Recensioni.add(new Recensione ("Albano Musica Festival", "Natalia", "...",4));
        Recensioni.add(new Recensione ("Albano Musica Festival", "Flavia", "...",3));
        Recensioni.add(new Recensione ("Albano Musica Festival", "Rodolfo", "...",4));




    }
    public static ArrayList<Recensioni_List.Recensione> getList()
    {
        if (Recens_list == null)
            Recens_list = new Recensioni_List();
        return Recensioni;
    }
    public class Recensione
    {
        public final String nome, recensione, bc; //TODO rimetterli private
        public final float voto;

        public Recensione(String bc, String nome, String recensione, float voto)
        {
            this.bc=bc;
            this.nome=nome;
            this.recensione=recensione;
            this.voto=voto;
        }


        public String getLuogo()
        {
            return bc;
        }

        public String getRecensione(){
            return recensione;
        }


        public float get_voto(){return voto;}

        public String getNome(){
            return nome;
        }
    }














}
