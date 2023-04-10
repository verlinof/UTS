public class Main {
    public static void main(String[] args) {
        Website website = new Website();
        Account a = website.addAccount("si madun","abcd");
        Account b = website.addAccount("si madun","abcd");
        System.out.println(a);
        System.out.println(b);
        website.login("si madun","g<i>");
        website.login("si madun", "abcd");
    }
}