package dtos;

import java.time.LocalDateTime;
public class Movement {
    private LocalDateTime time;
    private long amount;

    public Movement(LocalDateTime time, long amount) {
        this.time = time;
        this.amount = amount;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }
}