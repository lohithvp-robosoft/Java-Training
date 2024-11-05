//4. You are developing a simulation for a board game where each player starts with a set of tokens. Initially, all the tokens are active. As the game progresses, some tokens may become inactive. At the start of each round, you want to reset all tokens back to "active" without creating a new list.

package Task7.Question4;

public class Q4 {
    public static void main(String[] args) {
        Player p1 = new Player(1,"Rahul");

        System.out.println(p1.getToken());
        p1.setTokenById(2,false);
        System.out.println(p1.getToken());
        p1.setTokenById(1,false);
        System.out.println(p1.getToken());
        System.out.println(p1.reset());
        System.out.println(p1.getToken());

        p1.setTokenById(1,false);
        System.out.println(p1.getToken());
       // System.out.println(p1.getToken());
    }
}
