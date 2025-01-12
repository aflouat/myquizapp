package fr.tmsconsult.myquiz.services.interfaces;

import fr.tmsconsult.myquiz.dto.JwtResponse;
import fr.tmsconsult.myquiz.dto.LoginRequest;
import fr.tmsconsult.myquiz.dto.SignupRequest;
import fr.tmsconsult.myquiz.dto.UserCredentialUpdateRequest;
import fr.tmsconsult.myquiz.entities.User;

public interface IUserService {
    public void register(SignupRequest signupRequest);

    public JwtResponse authenticate(LoginRequest loginRequest);

    public JwtResponse getConnectedUserJwtResponse();

    public User findUserByIdentifier(String identifier);

    public User getConnectedUser();

    public void updateUser(UserCredentialUpdateRequest userCredentialUpdateRequest);

}

