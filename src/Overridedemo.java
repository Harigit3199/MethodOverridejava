class Phone
{
    String brand_model, features;
    double price;

    public void mobileCompany()
    {
        brand_model="Samsung s21";
        features="108 Megapixel";
        price=90000.99;
        System.out.println("Which model: "+brand_model);
        System.out.println("Main feature: "+ features);
        System.out.println("Price of the phone:"+price);
        System.out.println( );
    }
}
class iPhone extends Phone
{
    @Override
    public void mobileCompany() {

         brand_model="iPhone 13 pro max";
         features= "12 Megapixel with Slow motion HDR Camera";
         price=124000.99;

        System.out.println("Which model: "+ brand_model);
        System.out.println("Best feature: "+ features);
        System.out.println("Mobile price: "+ price+" RS");

        System.out.println(brand_model+ " has the best camera features with highest price");

    }
}
public class Overridedemo
{
    public static void main(String[] args)
    {
       
        Phone ios = new iPhone();
        ios.mobileCompany();


    }
}
