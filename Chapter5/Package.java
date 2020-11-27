public class Package {
    private float weight;
    private char shippingMethod;
    protected float shippingCost;

    public Package(float weight, char shippingMethod){
        this.weight = weight;
        if (shippingMethod == 'a' || shippingMethod == 't' || shippingMethod == 'm') {
            this.shippingMethod = shippingMethod;
            calculateCost();
        }
    }

    
    public void calculateCost() {
        switch (this.shippingMethod) {
            case 'a':
                if (this.weight >=1 && this.weight <= 8) this.shippingCost = 2.0f;
                else if(this.weight >=9 && this.weight <= 16) this.shippingCost = 3.0f;
                else if(this.weight>=17) this.shippingCost = 4.50f;            
            break;
        
            case 't':

                if (this.weight >=1 && this.weight <= 8) this.shippingCost = 1.5f;
                else if(this.weight >=9 && this.weight <= 16) this.shippingCost = 2.35f;
                else if(this.weight>=17) this.shippingCost = 3.25f;   
            break;
            
            case 'm':
            
                if (this.weight >=1 && this.weight <= 8) this.shippingCost = 0.5f;
                else if(this.weight >=9 && this.weight <= 16) this.shippingCost = 1.5f;
                else if(this.weight>=17) this.shippingCost = 2.15f; 
            break;
        
            default:
                break;
        }
    }

    public void display(){
        System.out.println("\nWeight: " + this.weight + "\nShipping Method: " 
        + (this.shippingMethod == 'a' ? "Air" : this.shippingMethod == 't' ? "Truck" : 
        this.shippingMethod == 'm' ? "Mail" : "") + "\nShipping Cost: " + this.shippingCost);
    }
}