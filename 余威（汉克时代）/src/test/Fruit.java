package test;

/**
 * 创建作者 ：yw
 * 创建时间 2023/2/15 17:11
 * 项目名称 余威（汉克时代）
 */
public class Fruit {
    private String name; //水果名称
    private double price;//水果价格


    public Fruit() {
    }

    public Fruit(String name, double price) {
        this.name = name;
        this.price = price;
    }

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


    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
