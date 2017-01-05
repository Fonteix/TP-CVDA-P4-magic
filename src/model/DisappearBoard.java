package model;

/**
 *
 * @author EtiX42
 */
public class DisappearBoard extends Effect {
     /**
     * Cet effet permet de réinitialiser le jeu
     *
     * @param line
     * @param column
     * @param game
     */
    
    @Override
    public void playEffect(int line, int column, Game game) {

        for (int i = 0; i < 10; i++) {
            
               for (int j = 0; j < 10; j++) {
                   game.getBoard().getTileIJ(i,j).setStatus(-1);
               }
             
        }
        
    }
}




