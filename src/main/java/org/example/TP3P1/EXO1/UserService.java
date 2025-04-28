package org.example.TP3P1.EXO1;

public class UserService {
    private final UserRepository userRepository;

    /**
     * Constructeur avec injection de dépendance
     * @param userRepository le repository à utiliser
     */
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * Récupère un utilisateur par son ID
     * @param id l'identifiant de l'utilisateur
     * @return l'utilisateur correspondant à l'ID
     * @throws IllegalArgumentException si l'utilisateur n'est pas trouvé
     */
    public User getUserById(long id) {
        User user = userRepository.findUserById(id);
        if (user == null) {
            throw new IllegalArgumentException("User not found with id: " + id);
        }
        return user;
    }
}