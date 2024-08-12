package Entities;

import java.time.Instant;
import java.util.Objects;

public class Log {
    private String user;
    private Instant instant;

    public Log(String user, Instant instant) {
        this.user = user;
        this.instant = instant;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Instant getInstant() {
        return instant;
    }

    public void setInstant(Instant instant) {
        this.instant = instant;
    }

    public String toString() {
        return getUser() + " " + getInstant();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Log log = (Log) o;
        return Objects.equals(user, log.user);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(user);
    }
}
