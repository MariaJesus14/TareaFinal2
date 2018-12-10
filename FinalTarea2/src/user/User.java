
package user;



/**
 *
 * @author Jerry Rivera 
 * @author Maria Rodriguez
 * @author Roibin Elizondo
 */

public class User {
    public static String username;
    private String password;

    public User() {
        this(" ","");
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
/**
 *getUsername metodo que obtiene el  nombre de usuario
 * @param no recibe parametros
 * @return el nombre de usuario 
 * 
 */ 
    public String getUsername() {
        return username;
    }
 /**
 *setUsername metodo que asigna el nombre de usuario
 * @param recibe el nombre de usuario
 * @return es void por lo tanto no retorna
 * 
 */ 
    public void setUsername(String username) {
        this.username = username;
    }
/**
 *getPassword metodo que obtiene la contraseña
 * @param no recibe parametros
 * @return la contraseña
 * 
 */ 
    public String getPassword() {
        return password;
    }
 /**
 *setPassword metodo que asigna la contraseña
 * @param recibe la contraseña
 * @return es void por lo tanto no retorna
 * 
 */ 
    public void setPassword(String password) {
        this.password = password;
    }
    public String toFileString() {
        return username + "-" + password;

    }
    
}
