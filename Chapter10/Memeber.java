package Chapter10;

import java.lang.reflect.Member;

public class Memeber {
    public String id;

    public Memeber(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member) {
            Memeber memeber = (Memeber) obj;

            if (id.equals(memeber.id)) {
                return true;
            }
        }
        return false;
    }
}