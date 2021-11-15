/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package APP1;

import static java.time.zone.ZoneRulesProvider.refresh;
import java.util.Observable;
import java.util.Observer;
import static kotlinx.html.Gen_consumer_tagsKt.label;

/**
 *
 * @author Familia
 */
public class OPCION extends Observable{
    
    @Override
    public void addObserver(Observer o){
    super.addObserver(o);
    refresh();
    }
    
    private void refresh(){
    setChanged();
    notifyObservers();
    }
}
