package org;

import java.util.Map;

public enum Role {
    ADMIN(Map.of(
            Permission.READ, "Admin can read All data",
            Permission.WRITE, "Admin can modify All data",
            Permission.DELETE, "Admin can delete All data"
    ), "An ADMIN can view and modify all data."),

    QA(Map.of(
            Permission.READ, "QA can view sensitive data"
    ), "A QA can view but not modify sensitive data."),

    USER(Map.of(
            Permission.READ, "User can only view specific data"
    ), "A USER can view only specific sections.");

    final Map<Permission, String> permissions;
    final String description;

    Role(Map<Permission, String> permissions, String description) {
        this.permissions = permissions;
        this.description = description;
    }
}
