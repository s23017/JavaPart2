package chapter9_1;

import java.time.LocalDate;

public class StudentMember extends Member{
    private LocalDate expireDate;

    public StudentMember(long id, String name, LocalDate expireDate) {
        super(id, name);
        this.expireDate = expireDate;
    }

    @Override
    protected int fee() {
        return 0;
    }

    public boolean isExpired() {
        LocalDate today = LocalDate.now();
        return today.isAfter(expireDate);
    }

    public LocalDate getExpireDate() {
        return expireDate;
    }
}
