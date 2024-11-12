package org.example.task11;

public class TestingTask extends Task {
    public TestingTask(String title, String description, String priority) {
        super(title, description, priority);
    }

    @Override
    public String toString() {
        return "Testing " + super.toString();
    }
}
