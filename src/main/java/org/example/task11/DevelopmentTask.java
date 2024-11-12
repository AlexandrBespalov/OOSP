package org.example.task11;

public class DevelopmentTask extends Task {
    public DevelopmentTask(String title, String description, String priority) {
        super(title, description, priority);
    }

    @Override
    public String toString() {
        return "Development " + super.toString();
    }
}
