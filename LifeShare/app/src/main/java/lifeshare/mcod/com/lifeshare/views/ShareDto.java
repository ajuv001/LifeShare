package lifeshare.mcod.com.lifeshare.views;

/**
 * Created by aju.vidyadharan on 13-12-2016.
 */

public class ShareDto {
    String title;
    String time;
    String qty;
    int category;

    public ShareDto(String title, String time, String qty, int category, String receivedBy)
    {
        this.time = time;
        this.title = title;
        this.qty = qty;
        this.category = category;
        this.receivedBy = receivedBy;
    }

    public String getReceivedBy() {
        return receivedBy;
    }

    public void setReceivedBy(String receivedBy) {
        this.receivedBy = receivedBy;
    }

    String receivedBy;


    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }
}
