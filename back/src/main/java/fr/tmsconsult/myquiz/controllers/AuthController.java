package fr.tmsconsult.myquiz.controllers;


import fr.tmsconsult.myquiz.dto.JwtResponse;
import fr.tmsconsult.myquiz.dto.LoginRequest;
import fr.tmsconsult.myquiz.dto.SignupRequest;
import fr.tmsconsult.myquiz.dto.UserCredentialUpdateRequest;
import fr.tmsconsult.myquiz.services.interfaces.IUserService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {
    private final IUserService userService;
    private final Logger logger = LoggerFactory.getLogger(AuthController.class);

    @PostMapping("/login")
    public ResponseEntity<?> authenticateUser( @RequestBody LoginRequest loginRequest) {
        JwtResponse jwtResponse;
        jwtResponse = userService.authenticate(loginRequest);
        return ResponseEntity.ok(jwtResponse);
    }

    @PostMapping("/register")
    public ResponseEntity<?> registerUser( @RequestBody SignupRequest signUpRequest) {
        userService.register(signUpRequest);
        return ResponseEntity.ok().build();
    }

    @GetMapping("me")
    public ResponseEntity<?> getConnectedUserInformation() {
        JwtResponse jwtResponse = userService.getConnectedUserJwtResponse();
        logger.debug("jwtResponse:"+jwtResponse);
        return ResponseEntity.ok(jwtResponse);
    }

    @PostMapping("/update")
    public ResponseEntity<?> updateUser( @RequestBody UserCredentialUpdateRequest userCredentialUpdateRequest) {
        userService.updateUser(userCredentialUpdateRequest);
        return ResponseEntity.ok().build();
    }
}