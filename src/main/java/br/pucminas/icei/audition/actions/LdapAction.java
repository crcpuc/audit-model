package br.pucminas.icei.audition.actions;

/**
 * @author Giovanni Silva.
 */
public enum LdapAction {
    CREATE,
    READ,
    UPDATE,
    DELETE,
    MOVE,
    CHANGE_PASSWORD,
    ENABLE,
    DISABLE,
    SEARCH;


    public static final String PREFIX = "ldap_";

    @Override
    public String toString(){
        return PREFIX + name().toLowerCase();
    }

}