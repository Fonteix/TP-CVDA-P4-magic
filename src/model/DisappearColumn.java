package model;

import static javafx.beans.binding.Bindings.isEmpty;
import static javafx.beans.binding.Bindings.isEmpty;

public class DisappearColumn extends Effect {

    @Override
    public void playEffect(int line, int column, Game game) {

        for (int i = 0; i < 10; i++) {
             game.getBoard().getTileIJ(i, column).setStatus(-1);
        }
        
    }

}



