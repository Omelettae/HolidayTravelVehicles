import java.util.Date;
import java.util.List;

public class Invoice {
    private String invoiceID;
    private Date date;
    private float tradeInAllowance;
    private float finalPrice;
    private float taxes;
    private float licenseFees;
    private String customerSignature;

    private Customer customer;
    private Salesperson salesperson;
    private Vehicle vehicle;
    private TradeInVehicle tradeInVehicle;
    private List<DealerInstalledOption> options;
}
