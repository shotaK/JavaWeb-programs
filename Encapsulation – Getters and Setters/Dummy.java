package com.javaweb;

class Dummy
{
    private String name;
    private boolean active;


    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public Class<? extends Dummy> getClannName() {
        return this.getClass();
    }


}
