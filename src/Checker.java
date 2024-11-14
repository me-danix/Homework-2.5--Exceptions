public interface Checker {

    void checkLogin(String login) throws WrongLoginException;

    void checkPassword(String password) throws WrongPasswordException;

    void checkPassword(String password, String confirmPassword) throws WrongPasswordException;

}
