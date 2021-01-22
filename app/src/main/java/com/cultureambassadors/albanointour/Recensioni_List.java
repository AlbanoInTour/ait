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
        Recensioni.add(new Recensione ("Tomba degli Orazi e Curiazi", "Chiara", "In assoluto il monumento più sorprendente sul percorso dell' appia antica dopo la tomba di Cecilia metella. Un gioiello dimenticato! Le ricostruzioni fantasiose delle stampe di piranesi sull' appia ai tempi dei romani di sicuro si ispirano a questo.",5));
        Recensioni.add(new Recensione ("Tomba degli Orazi e Curiazi", "Francesco", "Difficile visitarlo. Tenuto svogliatamente\n" +
                "Nascosto dalla troppa vegetazione non ci si accorge di averlo alle spalle. Tristezza.",2));
        Recensioni.add(new Recensione ("Tomba degli Orazi e Curiazi", "Gianluca", "Questo sito è la testimonianza di un episodio della storia romana che tutti abbiamo studiato alle scuole elementari e medie. Roma e Alba Longa in guerra e minacciati dagli Etruschi, per evitare perdite di uomini ed inutili spargimenti di sangue decidono di far combattere tre uomini per fazione e vengono scelte tre gemelli per parte, figli di due sorelle e dunque cugini tra loro. Prevarrà un unico Orazio che darà la vittoria a Roma.",5));
        Recensioni.add(new Recensione ("Catacombe di S. Senatore", "Elena", "Uno spettacolo sotterraneo meraviglioso.da visitare se passi ad albano laziale.non perdetevi questo sito misto tra architettura e natura.",5));
        Recensioni.add(new Recensione ("I Cisternoni", "Sofia", "Sito storico e archeologico che potrebbe essere valorizzato di più,interessante la struttura e la sua storia per la capacità dei nostri antichi costruttori romani.",4));
        Recensioni.add(new Recensione ("I Cisternoni", "Rachele", "Qualcosa di stupefacente.. una cattedrale sotterranea grazie all 'abnegazione del Signor Angelo Chiodio",5));
        Recensioni.add(new Recensione ("I Cisternoni", "Daniele", "Enorme cisterna romana ben conservata, si accede con visita guidata facendo il biglietto cumulativo, con varie possibilità di scelta, presso la biglietteria del museo di Albano.",5));
        Recensioni.add(new Recensione ("Accampamento della Seconda Legione Partica (Castra Albana)", "Pierfrancesco", "...",1));
        Recensioni.add(new Recensione ("Anfiteatro Severiano", "Silvio", "L'anfiteatro, sito nella parte alta di Albano Laziale e donato dall'imperatore Caracalla alla III legione Partica, è un bellissimo esempio di architettura ludica romana. Da visitare",4));
        Recensioni.add(new Recensione ("Anfiteatro Severiano", "Alice", "E' uno dei più grandi del Lazio e anche il più sconosciuto. Notevoli gli sforzi per tenerlo fruibile, anche se con un po' di difficoltà.",4));
        Recensioni.add(new Recensione ("Anfiteatro Severiano", "Leonardo", "Consiglio di visitarlo quando è prevista una manifestazione con la II Legione Parthica Severiana fondata da Settimio Severo.\n" +
                "Descrizione del luogo approssimata del custode.",4));
        Recensioni.add(new Recensione ("Terme di Cellomaio", "Silvia", "Il complesso termale di Cellomaio fu costruito dall'imperatore Caracalla. Consiglio la visita!",5));
        Recensioni.add(new Recensione ("Terme di Cellomaio", "Daniela", "Molto molto belle, consigliato.",4));
        Recensioni.add(new Recensione ("Villa di Pompeo Magno", "Luna", "Villa Doria ad Albano, qui ci sono i resti dell'antica villa di Pompeo Magno, si passeggia tra i resti della villa sparsi quà e là, colonne mura grotte e abbeveratoi, un posto da vedere!",5));
        Recensioni.add(new Recensione ("Villa di Pompeo Magno", "Riccardo", "Molto degrado, gente ha lasciato bottiglie e sporcizia. Non c'è controllo da parte dei Beni Culturali. Peccato.",3));
        Recensioni.add(new Recensione ("Villa romana ai Cavallacci", "Vincenzo", "Potrebbe essere un patrimonio bellissimo ma è tendenzialmente lasciato all'incuria tra le erbe alte. È possibile \"visitarla\" solo da dietro un'inferriata.",3));
        Recensioni.add(new Recensione ("Villa romana ai Cavallacci", "Vittorio", "Ormai lasciato lì senza che nessuno si occupi. Però bel posto!",3));
        Recensioni.add(new Recensione ("Porta Pretoria e Porta Principalis Sinistra", "Roberto", "Come in un'ampolla di vetro, un piccolo viaggio nel tempo in mezzo alla cittadina, per un vero pezzo di storia romana. Mentre passeggi all'improvviso  ti trovi le rovine al tuo fianco, quasi le puoi toccare. La notte, poi, l'illuminazione crea un'atmosfera particolare. Va bene una passeggiata nella cittadina più antica della città roma.",5));
        Recensioni.add(new Recensione ("Porta Pretoria e Porta Principalis Sinistra", "Alessandro", "Imponente ingresso al castrum di Albano che poteva considerarsi una vera e propria città militare, passaggio obbligato tra Roma ed il Sud d'Italia.",5));
        Recensioni.add(new Recensione ("Porta Pretoria e Porta Principalis Sinistra", "Nicola", "Come sono andato a Natale, il quartiere ha approfittato del posto per rendere un presepe quasi a grandezza naturale. La verità che le luci e l'accessibilità del luogo valgono la pena visitarlo di notte.\n" +
                "Attenzione! È difficile vederlo perché è circondato da case.",3));
        Recensioni.add(new Recensione ("Museo archeologico di Albano", "Lorenzo", "...",1));
        Recensioni.add(new Recensione ("Museo archeologico di Albano", "Teresa", "...",2));
        Recensioni.add(new Recensione ("Museo della Seconda Legione Partica", "Vanessa", "...",3));
        Recensioni.add(new Recensione ("Museo della Seconda Legione Partica", "Maria", "...",5));
        Recensioni.add(new Recensione ("Museo della Seconda Legione Partica", "Giorgio", "...",3));
        Recensioni.add(new Recensione ("Palazzo Savelli", "Giorgia", "...",5));
        Recensioni.add(new Recensione ("Palazzo Savelli", "Matteo", "...",5));
        Recensioni.add(new Recensione ("Villa Doria - Pamphili", "Elena", "...",4));
        Recensioni.add(new Recensione ("Villa Doria - Pamphili", "Daniele", "Sapete quando dovete liberare corpo e mente da tutto e tutti? Ecco, concedetevi una pausa dallo stress quotidiano, fatevi una corsa, una passeggiata nel verde. Villa Doria é quel luogo magico in città dove puoi scaricare la mente e recuperare le energie, in solitudine o con gli affetti.",5));
        Recensioni.add(new Recensione ("Villa Doria - Pamphili", "Asia", "Villa comunale situata nel centro del comune di albano Laziale. In passato era tenuta meglio, e dunque negli ultimi anni il suo aspetto è peggiorato radicalmente ma ciò non dipende ovviamente dal luogo stesso bensì dalla gestione e dal mantenimento. Ci sono svariate panchine, molti alberi secolari, aiuole, prati ed una struttura che offre diversi servizi quali la ristorazione e l'attività fisica",4));
        Recensioni.add(new Recensione ("Villa Doria - Pamphili", "Samuele", "Parco grande ma non molto curato, con oscure presenze specialmente durante la notte in inverno, per essere il parco di una città come Albano non è un granché, molto meglio i parchi che si trovano nella città di Frascati, come l'ombrellino e villa torlonia che oggettivamente danno una pista a Villa Doria, così come la città di Frascati è superiore a quella di Albano",2));
        Recensioni.add(new Recensione ("Bajocco Festival", "Christian", "Evento molto carino, per passare una bella serata!",4));
        Recensioni.add(new Recensione ("Bajocco Festival", "Demetrio", "Evento ben curato e strutturato, piacevole e carino, consigliato!",4));
        Recensioni.add(new Recensione ("Albano Musica Festival", "Clarissa", "...",3));
        Recensioni.add(new Recensione ("Albano Musica Festival", "Natalia", "Nato nel 1991 con il bicentenario della morte di Mozart, per diffondere la musica da camera e sinfonica. Molto bello.",4));
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
