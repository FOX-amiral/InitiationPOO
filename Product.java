public class Product {
    private String name;
    private String description;
    private double price;

    public Customer(String fullname, String address) {
        this.fullname = fullname;
        this.address = address;
    }

    /**
     * Display a full description of the product
     */
    public void look() {
	System.out.println(String.format(name + " : " + price + "%n" + description));
    }

    /**
     * Add the product to a Bill
     * @param bill the concerned bill
     * @param quantity the quantity to add
     */
    public void buy(Bill bill, Integer quantity) {

    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
