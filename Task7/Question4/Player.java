package Task7.Question4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Player {
    private Integer id;
    private String playerName;
    private List<Token> tokens;

    public Player(Integer id, String playerName) {
        this.id = id;
        this.playerName = playerName;
        this.tokens = Arrays.asList(new Token(), new Token(), new Token());
    }

    public List<Token> reset() {
        Collections.fill(tokens, new Token());
        return this.tokens;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public List<Token> getToken() {
        return tokens;
    }

    public void setTokenById(int tokenId, boolean val) {
        Token token = tokens.get(tokenId);
        token.setActive(val);
    }
}
