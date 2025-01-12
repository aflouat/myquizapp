package fr.tmsconsult.myquiz.services.interfaces;

 import fr.tmsconsult.myquiz.entities.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface IUserDetailsService extends UserDetailsService {
    UserDetails loadUserByUsername(String username);
    public boolean isUserExists(String email);
    public User loadUserByEmail(String email);
    public User loadUserByIdentifier(String identifier);

}
