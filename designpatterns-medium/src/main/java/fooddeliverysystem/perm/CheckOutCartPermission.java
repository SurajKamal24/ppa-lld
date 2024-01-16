package fooddeliverysystem.perm;

import fooddeliverysystem.data.User;

public class CheckOutCartPermission implements Permission {

    private final User user;

    public CheckOutCartPermission(User user) {
        this.user = user;
    }

    @Override
    public boolean isPermitted() {
        return false;
    }
}
