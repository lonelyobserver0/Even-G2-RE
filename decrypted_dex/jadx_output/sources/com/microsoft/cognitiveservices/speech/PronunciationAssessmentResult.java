package com.microsoft.cognitiveservices.speech;

import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class PronunciationAssessmentResult {
    private double accuracyScore;
    private double completenessScore;
    private ContentAssessmentResult contentAssessmentResult;
    private double fluencyScore;
    private double pronunciationScore;
    private double prosodyScore;
    private List<WordLevelTimingResult> words;

    private PronunciationAssessmentResult(PropertyCollection propertyCollection) {
        String string2 = StubApp.getString2(15743);
        String string22 = StubApp.getString2(10085);
        this.accuracyScore = Double.parseDouble(propertyCollection.getProperty(string2, string22));
        this.pronunciationScore = Double.parseDouble(propertyCollection.getProperty(StubApp.getString2(15754), string22));
        this.completenessScore = Double.parseDouble(propertyCollection.getProperty(StubApp.getString2(15755), string22));
        this.fluencyScore = Double.parseDouble(propertyCollection.getProperty(StubApp.getString2(15756), string22));
        this.prosodyScore = Double.parseDouble(propertyCollection.getProperty(StubApp.getString2(15757), string22));
        if (!propertyCollection.getProperty(StubApp.getString2(15699)).isEmpty()) {
            this.contentAssessmentResult = new ContentAssessmentResult(propertyCollection);
        }
        String property = propertyCollection.getProperty(PropertyId.SpeechServiceResponse_JsonResult);
        if (property == null || property.isEmpty()) {
            return;
        }
        this.words = new ArrayList();
        try {
            JSONArray jSONArray = new JSONObject(property).getJSONArray(StubApp.getString2("15758")).getJSONObject(0).getJSONArray(StubApp.getString2("15759"));
            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                this.words.add(new WordLevelTimingResult(jSONArray.getJSONObject(i3)));
            }
        } catch (JSONException unused) {
        }
    }

    public static PronunciationAssessmentResult fromResult(SpeechRecognitionResult speechRecognitionResult) {
        Contracts.throwIfNull(speechRecognitionResult, StubApp.getString2(15665));
        if (speechRecognitionResult.getProperties().getProperty(StubApp.getString2(15743)).isEmpty() && speechRecognitionResult.getProperties().getProperty(StubApp.getString2(15699)).isEmpty()) {
            return null;
        }
        return new PronunciationAssessmentResult(speechRecognitionResult.getProperties());
    }

    public Double getAccuracyScore() {
        return Double.valueOf(this.accuracyScore);
    }

    public Double getCompletenessScore() {
        return Double.valueOf(this.completenessScore);
    }

    public ContentAssessmentResult getContentAssessmentResult() {
        return this.contentAssessmentResult;
    }

    public Double getFluencyScore() {
        return Double.valueOf(this.fluencyScore);
    }

    public Double getPronunciationScore() {
        return Double.valueOf(this.pronunciationScore);
    }

    public Double getProsodyScore() {
        double d8 = this.prosodyScore;
        if (d8 >= 0.0d) {
            return Double.valueOf(d8);
        }
        return null;
    }

    public List<WordLevelTimingResult> getWords() {
        return this.words;
    }
}
