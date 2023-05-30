package expert.os.performance;

import jakarta.enterprise.inject.se.SeContainer;
import jakarta.enterprise.inject.se.SeContainerInitializer;
import jakarta.nosql.document.DocumentTemplate;

import java.util.Optional;

public class App {

    public static void main(String[] args) {

        try (SeContainer container = SeContainerInitializer.newInstance().initialize()) {
            DocumentTemplate template = container.select(DocumentTemplate.class).get();

            Player player = new Player("otavio", "Otavio Santana");

            template.insert(player);

            Optional<Player> otavio = template.find(Player.class, "otavio");
            System.out.println("the entity " + otavio);
        }
    }
}
