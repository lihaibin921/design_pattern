package pattern.creation.builder.house;

/**
 * @author: haibin li
 * @date: 2019/11/15
 * @description:
 */
public class Client {

    public static void main(String[] args){
        Director director = new Director();
        Building villa = director.direct(new VillaBuilder());
        System.out.println(villa);

        Building apartment = director.direct(new ApartmentBuilder());
        System.out.println(apartment);
    }

}
