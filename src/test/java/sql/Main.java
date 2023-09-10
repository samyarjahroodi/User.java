package sql;

import model.User;
import repository.UserRepository;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        UserRepository userRepository = new UserRepository();
        User user = new User(null, "Samyar", "Jahroodi",
                "134567", "samyarjahroodi");
        userRepository.save(user);
    }
}
