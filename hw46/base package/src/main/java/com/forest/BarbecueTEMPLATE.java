package com.forest;

public abstract class BarbecueTEMPLATE {
    public void RunningBarbecue(){
        cleanYard();
        buyForReasons();
        NotifyFriends();
        prepareDishes();
        cheeks();
    }
    public abstract void cleanYard();
    public abstract void buyForReasons();
    public abstract void NotifyFriends();
    public abstract void prepareDishes();
    public abstract void cheeks();
}
