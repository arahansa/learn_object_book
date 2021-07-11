package com.arahansa.movie.chap02.ph02;

public class NoneDiscountPolicy extends DiscountPolicy{
    @Override
    protected Money getDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
