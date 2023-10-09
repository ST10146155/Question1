package estateagent;

public interface iHouseAgent {
    public abstract class EstateAgent implements iEstateAgent {

    private String agentName;
    private double propertyPrice;

    public EstateAgent(String agentName, double propertyPrice) {
        this.agentName = agentName;
        this.propertyPrice = propertyPrice;
    }

    @Override
    public String getAgentName() {
        return agentName;
    }

    @Override
    public double getPropertyPrice() {
        return propertyPrice;
    }

    @Override
    public double getAgentCommission() {
        return propertyPrice * 0.2; // 20% commission
    }
}

// Interface iEstateAgent
public interface iEstateAgent {

    String getAgentName();
    double getPropertyPrice();
    double getAgentCommission();
}

// Subclass EstateAgentSales
public class EstateAgentSales extends EstateAgent {

    public EstateAgentSales(String agentName, double propertyPrice) {
        super(agentName, propertyPrice);
    }

    public void printPropertyReport() {
        System.out.println("Estate Agent Property Sale Commission Report");
        System.out.println("*************************************************");
        System.out.println("Estate Agent Name: " + getAgentName());
        System.out.println("Property Sale Price: " + getPropertyPrice());
        System.out.println("Estate Agent Commission: " + getAgentCommission());
    }
}
}
