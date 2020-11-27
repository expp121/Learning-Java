public class InsuredPackage extends Package {
    
    public InsuredPackage(float weight, char shippingMethod){
        super(weight, shippingMethod);
        if (super.shippingCost>=0f && super.shippingCost<= 1.0f)super.shippingCost += 2.45f;
        if (super.shippingCost>=1.01f && super.shippingCost<= 3.0f)super.shippingCost += 3.95f;
        if (super.shippingCost>=3.01f)super.shippingCost += 5.55f;
    }
}