package secondmeth;

import secondmeth.Context;

import java.awt.*;

public abstract class State {
    public abstract void handlePush(Context c);
    public abstract void handlePull(Context c);
    @SuppressWarnings("exports")
    public abstract Color getColor();
} // end class secondmeth.State
