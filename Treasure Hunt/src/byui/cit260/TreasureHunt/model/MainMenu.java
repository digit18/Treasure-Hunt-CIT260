/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TreasureHunt.model;

import java.io.Serializable;
import java.util.Objects;

 /**
 *
 * @author us16548
 */
public class MainMenu implements Serializable{
    
    private String newGame;
    private String saveGame;
    private String loadGame;

    public MainMenu(String newGame, String saveGame, String loadGame) {
        this.newGame = newGame;
        this.saveGame = saveGame;
        this.loadGame = loadGame;
    }
    
    
   

    public String getNewGame() {
        return newGame;
    }

    public String getSaveGame() {
        return saveGame;
    }

    public String getLoadGame() {
        return loadGame;
    }

    public void setNewGame(String newGame) {
        this.newGame = newGame;
    }

    public void setSaveGame(String saveGame) {
        this.saveGame = saveGame;
    }

    public void setLoadGame(String loadGame) {
        this.loadGame = loadGame;
    }

    @Override
    public String toString() {
        return "MainMenu{" + "newGame=" + newGame + ", saveGame=" + saveGame + ", loadGame=" + loadGame + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.newGame);
        hash = 29 * hash + Objects.hashCode(this.saveGame);
        hash = 29 * hash + Objects.hashCode(this.loadGame);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MainMenu other = (MainMenu) obj;
        if (!Objects.equals(this.newGame, other.newGame)) {
            return false;
        }
        if (!Objects.equals(this.saveGame, other.saveGame)) {
            return false;
        }
        if (!Objects.equals(this.loadGame, other.loadGame)) {
            return false;
        }
        return true;
    }
    
    
    
}
