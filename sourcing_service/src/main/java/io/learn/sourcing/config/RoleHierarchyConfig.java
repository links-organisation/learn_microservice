package io.learn.sourcing.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.hierarchicalroles.RoleHierarchy;
import org.springframework.security.access.hierarchicalroles.RoleHierarchyImpl;

@Configuration
public class RoleHierarchyConfig {

    @Bean
    public RoleHierarchy roleHierarchy() {
        RoleHierarchyImpl roleHierarchy = new RoleHierarchyImpl();

        // Définir la hiérarchie ici
        String hierarchy = """
                ADMIN_SUDO > ADMIN
                ADMIN > USER_PARTNER
                ADMIN > ADMIN_SUDO_POOLS
                ADMIN > MANAGER_TRANSACTIONS
                ADMIN > MANAGER_COMMANDS
                ADMIN_SUDO_POOLS > ADMIN_POOLS
                ADMIN_POOLS > SERVICE_CLIENT
                ADMIN_POOLS > BUSINESS_NEEDS_ANALYST
                USER_PARTNER > USER_STANDARD""";

        roleHierarchy.setHierarchy(hierarchy);
        return roleHierarchy;
    }
}
