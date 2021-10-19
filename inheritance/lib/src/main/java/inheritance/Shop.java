package inheritance;

public class Shop extends Place{

    public Shop(String name, String description, double price) {
        super(name, description, price);
    }

    @Override
    public String toString() {

        if(getReviewList().size() != 0){   return "Shop{" +
                "name='" + getName() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", numberOfDollarSigns=" + getPrice() + "$ "+
                '}' + getReviewList().toString() ;
        }else
        return "Shop{" +
                "name='" + getName() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", numberOfDollarSigns=" + getPrice() + "$ "+
                '}';
    }
}
