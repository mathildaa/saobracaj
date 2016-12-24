package klase;

import java.util.Date;
import java.util.StringTokenizer;

/**
 * Created by Ivona on 12.12.2016..
 */

public class kazna_klasa {
    private String JMBG;
    private String opis;
    private Date datum;
    private Double iznos;
    private boolean placeno;
    private String brojtablice;

    public  kazna_klasa(){
    }

    public  kazna_klasa(String J, String brojTab, String o, Date d, Double i, boolean pl){
        JMBG = J;
        opis = o;
        datum = d;
        iznos = i;
        placeno = pl;
        brojtablice = brojTab;
    }

    public void setBrojtablice(String br){brojtablice = br;}
    public String getBrojtablice(){return brojtablice;}

    public void setPlaceno(boolean pl){placeno = pl;}
    public boolean getPlaceno(){return placeno;}

    public void setJMBG(String jmbg){
        JMBG = jmbg;
    }

    public String getJMBG(){
        return JMBG;
    }

    public  void setOpis(String o){
        opis = o;
    }

    public String getOpis(){
        return opis;
    }

    public void setDatum(Date d){
        datum = d;
    }

    public Date getDatum(){
        return datum;
    }

    public void setIznos(Double i){
        iznos = i;
    }
    public String getIznos(){
        return iznos.toString();
    }
    public Double getIznosDbl(){
        return iznos;
    }
}
