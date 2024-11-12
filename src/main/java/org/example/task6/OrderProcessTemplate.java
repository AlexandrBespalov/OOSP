package org.example.task6;

public abstract class OrderProcessTemplate {
    public final void processOrder() {
        confirmOrder();
        packOrder();
        deliverOrder();
    }

    protected abstract void confirmOrder();
    protected abstract void packOrder();
    protected abstract void deliverOrder();
}
