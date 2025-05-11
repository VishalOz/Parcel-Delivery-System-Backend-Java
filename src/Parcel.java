public class Parcel {
    private String parcelID;
    private String sender;
    private String receiver;
    private String origin;
    private String destination;
    private double weight;
    private String type;
    private String status;
    private double cost;

    public Parcel (String parcelID, String sender, String receiver, String origin, String destination, double weight, String type, String status, double cost){
        this.parcelID = parcelID;
        this.sender = sender;
        this.receiver = receiver;
        this.origin = origin;
        this.destination = destination;
        this.weight = weight;
        this.type = type;
        this.status = status;
        this.cost = calculateCost();
    }
    public String getParcelID() {
        return parcelID;
    }
    public String getSummary() {
        return String.format(
                "ID: %s | Sender: %s | Receiver: %s | From: %s | To: %s | Status: %s | Cost: $%.2f | ETA: %s",
                parcelId, sender, receiver, origin, destination, status, cost, estimatedDelivery);
    }

}
