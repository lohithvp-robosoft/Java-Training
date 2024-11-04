//4. You are developing a simulation for a board game where each player starts with a set of tokens. Initially, all the tokens are active. As the game progresses, some tokens may become inactive. At the start of each round, you want to reset all tokens back to "active" without creating a new list.
//===============================================================

package Task7.Question4;

public class Token {
    private Boolean isActive;

    public Token() {
        this.isActive = true;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean isActive) {
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return isActive ? "ACTIVE" : "INACTIVE";
    }
}
