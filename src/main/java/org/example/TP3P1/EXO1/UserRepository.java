package org.example.TP3P1.EXO1;

public interface UserRepository {
    /**
     * Trouve un utilisateur par son ID
     * @param id l'identifiant de l'utilisateur
     * @return l'utilisateur correspondant à l'ID ou null si non trouvé
     */
    User findUserById(long id);
}