package lesson4_LopVaDoiTuongTrongJava;

import java.time.Instant;

public class StopWatch {
    private Instant startTime;
    private Instant endTime;

    public StopWatch() {
        startTime = Instant.now();
    }

    public Instant getStartTime() {
        return startTime;
    }

    public Instant getEndTime() {
        return endTime;
    }

    public void start() {
        startTime = Instant.now();
    }

    public void stop() {
        endTime = Instant.now();
    }

    public long getElapsedTime() {
        if (endTime != null) {
            return endTime.toEpochMilli() - startTime.toEpochMilli();
        } else {
            return Instant.now().toEpochMilli() - startTime.toEpochMilli();
        }
    }
}