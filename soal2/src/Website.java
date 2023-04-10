public class Website extends Account{
    private static int index=0;
    private static String[] usernames = new String[99];
    private static String[] passwords = new String[99];

    public Website(){
        super("","");
    }
    public Website(String username, String password){
        super(username,password);
        this.usernames[index]=username;
        this.passwords[index]=password;
        index++;
        System.out.println("Akun berhasil ditambahkan!");
    }
    public Account addAccount(String username,String password){
        for(int i=0;i<index;i++){
            if(usernames[i].equals(username)){
                System.out.println("Mohon maaf username telah digunakan");
                return null;
            }

        }
        return new Website(username, password);
    }
    public void login(String username,String password){
        for(int i=0;i<index;i++){
            if (usernames[i].equals(username) && passwords[i].equals(password)){
                System.out.println("Login Berhasil!");
            }
            else{
                System.out.println("Akun tidak ditemukan");
            }
        }
    }
    public static String encrypt(String input) {
        StringBuilder encrypted = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            int factor = (int) Math.pow(-1, i); // rumus faktor (-1)^i
            int encryptedChar = (int) c + (6 * factor); // rumus enkripsi
            encrypted.append((char) encryptedChar); // menambahkan karakter terenkripsi ke stringbuilder
        }
        return encrypted.toString();
    }

    @Override
    public String toString() {
        return "Nama : " + getUsername() + "\n"
                + "Password : " + encrypt(getPassword());
    }
}