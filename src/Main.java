import Users.User;
import machine.ProdsList;

void main() throws InterruptedException {
    int insertMoney;
//    ProdsList list = new ProdsList("Lays", 20);
    ProdsList[] list = new ProdsList[10];
    User usr = new User();

    list[0] = new ProdsList("Lays", 100, 20);
    list[1] = new ProdsList("Fanta", 1, 80);
    list[2] = new ProdsList("Oreo", 10, 26);
    list[3] = new ProdsList("Fruit Bread", 0, 20);
    insertMoney = usr.insertMoney(100);

//    System.out.println(list.toString());

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the product name:");
    String prodName = sc.nextLine();
    System.out.println("Enter the quantity: ");
    int qty = sc.nextInt();

    ProdsList foundProduct = null;

    for (ProdsList p : list) {
        if (p != null && p.getProdName().equalsIgnoreCase(prodName)) {
            foundProduct = p;
            break;
        }
    }

    if (foundProduct != null) {
        System.out.println("Product Found");
        if (foundProduct.getQuantity() >= qty) {
            if (insertMoney > 0) {
                System.out.println("Inserting Money");
                if (insertMoney > (foundProduct.getProdPrice() * qty)) {
                    try {
                        System.out.println("Buying Product: " + foundProduct.getProdName());
                        usr.setMoney(usr.getMoney() - (foundProduct.getProdPrice() * qty));
                        Thread.sleep(500);
                        System.out.println("Product bought successfully, Product name: " + foundProduct.getProdName());
                        System.out.println("Returning Money: " + usr.getMoney());
                    } catch (InterruptedException e) {
                        System.out.println("Task interrupted");
                        throw e;
                    }
                } else {
                    System.out.println("Not enough money");
                }
            } else {
                System.out.println("Please Insert Money");
            }
        } else {
            System.out.println("Only " + foundProduct.getQuantity() + " products left!");
        }
    } else {
        System.out.println("Product Not Found");
    }

}
