package com.example.myanimelibrary.domain.objects;

import java.util.ArrayList;

public class LibraryStack {

    private Library library;
    private ArrayList<Stack> stacks;

    public LibraryStack(Library library, ArrayList<Stack> categories) {
        this.library = library;
        this.stacks = categories;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    public ArrayList<Stack> getCategories() {
        return stacks;
    }

    public void setCategories(ArrayList<Stack> categories) {
        this.stacks = categories;
    }
}
