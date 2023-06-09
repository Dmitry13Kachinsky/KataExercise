
public class myClass {


    public static void main(String[] args) throws Exception {
    BankClient client1 = new BankClient("Судим");
    BankWorker employee = new BankEmployee();
    System.out.println(getCreditForClient(employee, client1));

}
public static boolean getCreditForClient(BankWorker bankWorker, BankClient bankClient) throws Exception {

        return bankWorker.checkClientForCredit(bankClient);
}
}



