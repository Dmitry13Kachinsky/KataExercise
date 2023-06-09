public interface BankWorker {
static String lawProblems = ("Судим");
static String badCredit = ("Ранее кинул с кредитами");
default boolean checkClientForCredit(BankClient bankClient) throws Exception {
    if (bankClient.toString().equals(lawProblems)) {
        throw new Exception("PROBLEMS WITH LAW");
    } else if (bankClient.toString().equals(badCredit)) {
        throw new Exception("BAD CREDIT HISTORY");
    } else {
        return true;
    }

}
}

