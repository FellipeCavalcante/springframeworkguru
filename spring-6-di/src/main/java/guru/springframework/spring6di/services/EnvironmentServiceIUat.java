package guru.springframework.spring6di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("uat")
@Service
public class EnvironmentServiceIUat implements EnvironmentService {
    @Override
    public String getEnv() {
        return "uat";
    }
}