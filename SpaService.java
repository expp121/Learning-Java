/**
 * SpaService
 */
public class SpaService 
{
    private String serviceDescription;
    private float price;

    public SpaService()
    {
        serviceDescription="XXX";
        price=0;
    }
    
    public void setServiceDesctiption(String desc) 
    {
        serviceDescription=desc;
    }
    public String getServiceDescription() 
    {
        return serviceDescription;
    }

    public void setPrice(float price) 
    {
        this.price=price;
    }
    public float getPrice() 
    {
        return price;    
    }
}