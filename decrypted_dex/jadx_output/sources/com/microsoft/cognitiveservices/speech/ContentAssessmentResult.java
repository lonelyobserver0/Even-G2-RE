package com.microsoft.cognitiveservices.speech;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class ContentAssessmentResult {
    private double grammarScore;
    private double topicScore;
    private double vocabularyScore;

    public ContentAssessmentResult(PropertyCollection propertyCollection) {
        this.grammarScore = Double.parseDouble(propertyCollection.getProperty(StubApp.getString2(15699)));
        this.vocabularyScore = Double.parseDouble(propertyCollection.getProperty(StubApp.getString2(15700)));
        this.topicScore = Double.parseDouble(propertyCollection.getProperty(StubApp.getString2(15701)));
    }

    public Double getGrammarScore() {
        return Double.valueOf(this.grammarScore);
    }

    public Double getTopicScore() {
        return Double.valueOf(this.topicScore);
    }

    public Double getVocabularyScore() {
        return Double.valueOf(this.vocabularyScore);
    }
}
