package com.arahansa.movie.chap01.ph03;

public class Audience {
    private Bag bag;

    public Audience(Bag bag){
        this.bag = bag;
    }

    public Bag getBag(){
        return bag;
    }

    public Long buy(Ticket ticket){
        return bag.hold(ticket);
    }
}
