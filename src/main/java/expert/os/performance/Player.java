package expert.os.performance;


import jakarta.nosql.Column;
import jakarta.nosql.Entity;
import jakarta.nosql.Id;

@Entity
public class Player {

    @Id
    private String nickname;

    @Column
    private String name;

    public Player(String nickname, String name) {
        this.nickname = nickname;
        this.name = name;
    }

    Player() {
    }
}
