package entities;

public class Product {

    private  String name;
    private double price;
    private int quantity;

    // CONSTRUTOR CRIADO PARA OBRIGAR A INSERÇÃO DE VALORES NAS VAREIAVEIS
    // A PALAVRA THIS É UTILIZADA PARA ACESSAR OS ATRIBUTOS DO OBJETO
    // AQUI ESTAMOS COPIANDO NAS VARIAVEIS LOCAIS DO CONSTRUTOR O ATRIBUTOS DO OBJETO ACIMA

    public Product(){ // CONSTRUTOR PADRÃO

    }

    public Product(String name, double price, int quantity) {
        this.name = name;   // CONSTRUTOR COM 3 ATRIBUTOS DO OBJETO
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price) {
        this.name = name;  // CONSTRUTOR COM 2 ATRIBUTOS DO OBJETO
        this.price = price;
    }

    // GETTERS (ACESSAR) AND SETTERS (ALTERAR)

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }




    // MÉTODOS DA CLASSE

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    // overhide do método toString (alteramos o método a nossa maneira)
    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}
