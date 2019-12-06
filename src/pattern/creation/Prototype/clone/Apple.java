package pattern.creation.Prototype.clone;

/**
 * @author: haibin li
 * @date: 2019/11/27
 * @description:
 */
public class Apple implements Cloneable{

    private Integer price;

    private String name;

    private String color;

    private Integer size;

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Apple)) {
            return false;
        }

        Apple apple = (Apple) o;

        if (getPrice() != null ? !getPrice().equals(apple.getPrice()) : apple.getPrice() != null) {
            return false;
        }
        if (getName() != null ? !getName().equals(apple.getName()) : apple.getName() != null) {
            return false;
        }
        if (getColor() != null ? !getColor().equals(apple.getColor()) : apple.getColor() != null) {
            return false;
        }
        return getSize() != null ? getSize().equals(apple.getSize()) : apple.getSize() == null;
    }

    @Override
    public int hashCode() {
        int result = getPrice() != null ? getPrice().hashCode() : 0;
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (getColor() != null ? getColor().hashCode() : 0);
        result = 31 * result + (getSize() != null ? getSize().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size +
                '}';
    }
}
