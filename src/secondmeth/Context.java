package secondmeth;

public class Context {
    // The contained state.
    private State state = null; // secondmeth.State attribute
    // Creates a new secondmeth.Context with the specified state.
    public Context(State state) {this.state = state;}

    // Creates a new secondmeth.Context with the default state.
    public Context() {this.state = new RedState();}
    // Returns the state.
    public State getState() {return state;}
    // Sets the state.
    public void setState(State state) {this.state = state;}

    /**
     * The push() method performs different actions depending
     * on the state of the object. Using the secondmeth.State pattern,
     * we delegate this behavior to our contained state object.
     */
    public void push() {state.handlePush(this);}
    /**
     * The pull() method performs different actions depending
     * on the state of the object. Using the secondmeth.State pattern,
     * we delegate this behavior to our contained state object.
     */
    public void pull() {state.handlePull(this);}

}//end class secondmeth.Context


