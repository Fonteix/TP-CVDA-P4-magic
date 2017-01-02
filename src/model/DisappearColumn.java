/**
 * MagicP4
 * IUT Lyon 1 - 2016
 */
package model;


public class DisappearColumn extends Effect {
    
    /**
     * Cet effet fait disparaitre la colonne dans laquelle le joueur viens de cliquer
     *
     * @param line
     * @param column
     * @param game
     */
    
    @Override
    public void playEffect(int line, int column, Game game) {

        for (int i = 0; i < 10; i++) {
             game.getBoard().getTileIJ(i, column).setStatus(-1);
        }
        
    }

}



