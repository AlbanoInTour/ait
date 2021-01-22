package com.cultureambassadors.albanointour;

import android.os.Bundle;

import java.util.ArrayList;

public class Recensioni_List {
    private static final ArrayList<Recensione> Recensioni = new ArrayList<>();
    private static Recensioni_List Recens_list;

    private Recensioni_List(){

        Recensioni.add(new Recensione ("Duomo di Albano", "Marco", "Bellissima Cattedrale.\n" +
                "Meravigliose opere d'arte da, osservare con attenzione",4));
        Recensioni.add(new Recensione ("Duomo di Albano", "Edoardo", "Sotto ci sono le rovine di una basilica costruita dall' imperatore Costantino. La vecchia basilica aveva come protettore San Giovanni Battista.",5));
        Recensioni.add(new Recensione ("Duomo di Albano", "Riccardo", "...",4));
        Recensioni.add(new Recensione ("Convento dei Frati Cappuccini e Chiesa di S. Francesco", "Roberto", "Luogo di notevole importanza storica di Albano, bel parco, antistante parcheggio per chi s ' incammina a piedi sulla Francigena o sul bel sentiero che porta a Nemi.",3));
        Recensioni.add(new Recensione ("Convento dei Frati Cappuccini e Chiesa di S. Francesco", "Filippo", "Un luogo meraviglioso. Dove poter stare raccolti in preghiera o semplicemente in contemplazione del panorama, versante mare e versante lago. La calma la serenità la pace.",5));
        Recensioni.add(new Recensione ("Convento dei Frati Cappuccini e Chiesa di S. Francesco", "Stefano", "Bellissima posizione a atmosfera sublime. Purtroppo chiuso",2));
        Recensioni.add(new Recensione ("Convento e Chiesa di S. Paolo", "Ludovica", "Luogo semplice e di preghiera",5));
        Recensioni.add(new Recensione ("Convento e Chiesa di S. Paolo", "Francesca", "...",5));
        Recensioni.add(new Recensione ("Convento e Chiesa di S. Paolo", "Giuseppe", "...",4));
        Recensioni.add(new Recensione ("Chiesa della Stella e Cimitero del Colera", "Antonio", "Altissimi livelli, padre Teodoro poi...... Top. Sacerdote sempre disponibile e coinvolgente.",2));
        Recensioni.add(new Recensione ("Chiesa della Stella e Cimitero del Colera", "Egidio", "Convento dei Carmelitani, chiesa di S. Maria della Stella. Comunità parrocchiale molto accogliente",5));
        Recensioni.add(new Recensione ("Chiesa di S. Maria della Rotonda", "Emanuele", "Chiesa legata alla mia infanzia e chiesa legata alle nostre cerimonie",4));
        Recensioni.add(new Recensione ("Chiesa di S. Pietro", "Simona", "...",3));
        Recensioni.add(new Recensione ("Chiesa di S. Pietro", "Pietro", "...",4));
        Recensioni.add(new Recensione ("Chiesa di S. Pietro", "Prova", "...",4));
        Recensioni.add(new Recensione ("Tomba degli Orazi e Curiazi", "Chiara", "n assoluto il monumento più sorprendente sul percorso dell' appia antica dopo la tomba di Cecilia metella. Un gioiello dimenticato! Le ricostruzioni fantasiose delle stampe di piranesi sull' appia ai tempi dei romani di sicuro si ispirano a questo.",5));
        Recensioni.add(new Recensione ("Tomba degli Orazi e Curiazi", "Francesco", "Difficile visitarlo. Tenuto svogliatamente\n" +
                "Nascosto dalla troppa vegetazione non ci si accorge di averlo alle spalle. Tristezza.",2));
        Recensioni.add(new Recensione ("Tomba degli Orazi e Curiazi", "Gianluca", "Questo sito è la testimonianza di un episodio della storia romana che tutti abbiamo studiato alle scuole elementari e medie. Roma e Alba Longa in guerra e minacciati dagli Etruschi, per evitare perdite di uomini ed inutili spargimenti di sangue decidono di far combattere tre uomini per fazione e vengono scelte tre gemelli per parte, figli di due sorelle e dunque cugini tra loro. Prevarrà un unico Orazio che darà la vittoria a Roma.",5));
        Recensioni.add(new Recensione ("Catacombe di S. Senatore", "Elena", "Uno spettacolo sotterraneo meraviglioso.da visitare se passi ad albano laziale.non perdetevi questo sito misto tra architettura e natura.",3));
        Recensioni.add(new Recensione ("I Cisternoni", "Sofia", "Sito storico e archeologico che potrebbe essere valorizzato di più,interessante la struttura e la sua storia per la capacità dei nostri antichi costruttori romani.",4));
        Recensioni.add(new Recensione ("I Cisternoni", "Rachele", "Qualcosa di stupefacente.. una cattedrale sotterranea grazie all 'abnegazione del Signor Angelo Chiodio",5));
        Recensioni.add(new Recensione ("I Cisternoni", "Daniele", "Enorme cisterna romana ben conservata, si accede con visita guidata facendo il biglietto cumulativo, con varie possibilità di scelta, presso la biglietteria del museo di Albano.",5));
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
