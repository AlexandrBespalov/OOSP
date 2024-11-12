package org.example.task7;

public class DocumentBuilder {
    private Document document;

    public DocumentBuilder() {
        this.document = new Document();
    }

    public DocumentBuilder addTitle(String title) {
        document.addSection("=== " + title + " ===");
        return this;
    }

    public DocumentBuilder addSubtitle(String subtitle) {
        document.addSection("--- " + subtitle + " ---");
        return this;
    }

    public DocumentBuilder addParagraph(String paragraph) {
        document.addSection(paragraph);
        return this;
    }

    public DocumentBuilder addBulletPoint(String bulletPoint) {
        document.addSection("• " + bulletPoint);
        return this;
    }

    public Document build() {
        return document;
    }
}
