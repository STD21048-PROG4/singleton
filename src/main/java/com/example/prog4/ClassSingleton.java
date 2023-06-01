package com.example.prog4;

public class ClassSingleton {
    private static ClassSingleton INSTANCE;
    private String description;

    private ClassSingleton() {
        // Constructeur privé pour empêcher l'instanciation directe de la classe.
    }

    public static ClassSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ClassSingleton();
        }

        return INSTANCE;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
