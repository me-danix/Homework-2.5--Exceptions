public class ValidationService {

    private static final Checker loopChecker = new LoopChecker();
    private ValidationService () {
    }

    public static void check (String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        loopChecker.checkLogin(login);
        loopChecker.checkPassword(password);
        loopChecker.checkPassword(password, confirmPassword);
    }
}
