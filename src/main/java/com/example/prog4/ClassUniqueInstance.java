package com.example.prog4;

public class ClassUniqueInstance {
    private static final ClassUniqueInstance INSTANCE = new ClassUniqueInstance();
    private int click;

    private ClassUniqueInstance() {
        // Constructeur privé pour empêcher l'instanciation directe de la classe.
    }

    public static ClassUniqueInstance getInstance() {
        return INSTANCE;
    }

    public int getClick() {
        return click;
    }

    public void setClick(int click) {
        this.click = click;
    }
}
