import java.util.ArrayList;

public class ParcelManager {
    ArrayList <Parcel> parcelList = new ArrayList<>();

    public void addParcel(Parcel p) {
        parcelList.add(p);
        System.out.println("Parcel Added: " + p.getParcelID());
    }
    public void listParcels() {
        if (parcelList.isEmpty()) {
            System.out.println("NO PARCELS TO SHOW !");
        }else {
            for (Parcel p : parcelList) {
                System.out.println(p.getSummary());
            }
        }
    }

    
}
