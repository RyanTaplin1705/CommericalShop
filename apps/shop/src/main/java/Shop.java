import java.util.Date;
import java.util.List;

public class Shop {

    public Date openingHour;
    public Date closingHour;
    public List<Till> tills;
    public List<Staff> staff;

    public Shop(Date openingTime, Date closingTime, List<Till> tills, List<Staff> staff) {
        this.openingHour = openingTime;
        this.closingHour = closingTime;
        this.tills = tills;
        this.staff = staff;
    }
}
