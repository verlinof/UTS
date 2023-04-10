public class Main {
    public static void main(String[] args) {
        new item(1000,"potion",'S',3);
        new item(5000,"sword",'A',1);
        new item(1000,"armor",'A',1);
        item.seeAllItem();
        //expected output
        //3 s potion worth: 3000
        //1 A sword worth: 5000
        //1 A armor worth: 10000
    }
}