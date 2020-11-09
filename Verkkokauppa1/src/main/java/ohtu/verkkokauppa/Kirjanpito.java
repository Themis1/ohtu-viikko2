package ohtu.verkkokauppa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
@Component
public class Kirjanpito implements KirjanpitoIF {

    public Kirjanpito kirjanpito;
    /*private static Kirjanpito instance;
  
    public static Kirjanpito getInstance() {
        if ( instance==null) {
            instance = new Kirjanpito();
        }
        
        return instance;
    }*/
    
    private ArrayList<String> tapahtumat;

    public Kirjanpito() {
        tapahtumat = new ArrayList<String>();
    }
    
    @Override
    public void lisaaTapahtuma(String tapahtuma) {
        tapahtumat.add(tapahtuma);
    }

    @Override
    public ArrayList<String> getTapahtumat() {
        return tapahtumat;
    }       
}
