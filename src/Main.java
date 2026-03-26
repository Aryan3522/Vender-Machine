import Users.User;
import machine.ProdsList;

void main() throws InterruptedException {
    int insertMoney;
    ProdsList list = new ProdsList("Lays", 20);
    User usr = new User();
    usr.selectProd("Lays");
    insertMoney = usr.insertMoney(100);

    System.out.println(list.toString());

    if(insertMoney > 0){
        System.out.println("Inserting Money");
        if(list.getProdName().equals(usr.getProdName())){
            System.out.println("Product Found");
            if(insertMoney > list.getProdPrice()){
                try{
                    System.out.println("Buying Product: " + list.getProdName());
                    usr.setMoney(usr.getMoney() - list.getProdPrice());
                    Thread.sleep(500);
                    System.out.println("Product bought successfully, Product name: " + list.getProdName());
                    System.out.println("Returning Money: " + usr.getMoney());
                }catch (InterruptedException e){
                    System.out.println("Task interrupted");
                    throw e;
                }
            }else {
                System.out.println("Not enough money");
            }
        }else {
            System.out.println("Product Not Found");
        }
    }else {
        System.out.println("Please Insert Money");
    }
}
