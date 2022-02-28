package uz.elmurodov.trelloetm.enums;

public enum UserStateType {
    ACTIVE("ACTIVE"),
    INACTIVE("INACTIVE"),
    BLOCKED("BLOCKED");

    public String code;

    UserStateType(String code) {
        this.code = code;
    }
}
