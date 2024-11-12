package org.example.task7;

import java.util.ArrayList;
import java.util.List;

public class Document {
    private List<String> sections = new ArrayList<>();

    public void addSection(String section) {
        sections.add(section);
    }

    @Override
    public String toString() {
        StringBuilder documentContent = new StringBuilder();
        for (String section : sections) {
            documentContent.append(section).append("\n");
        }
        return documentContent.toString();
    }
}
