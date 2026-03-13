package com.microsoft.cognitiveservices.speech;

import com.stub.StubApp;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class WordLevelTimingResult extends TimingResult {
    private double accuracyScore;
    private String errorType;
    private List<PhonemeLevelTimingResult> phonemes;
    private List<SyllableLevelTimingResult> syllables;
    private String word;

    public WordLevelTimingResult(JSONObject jSONObject) {
        super(jSONObject);
        this.word = jSONObject.optString(StubApp.getString2(15752));
        JSONObject optJSONObject = jSONObject.optJSONObject(StubApp.getString2(15742));
        if (optJSONObject != null) {
            this.accuracyScore = optJSONObject.optDouble(StubApp.getString2(15743));
            this.errorType = optJSONObject.optString(StubApp.getString2(15989));
        }
        JSONArray optJSONArray = jSONObject.optJSONArray(StubApp.getString2(15990));
        if (optJSONArray != null) {
            this.phonemes = new ArrayList();
            for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                this.phonemes.add(new PhonemeLevelTimingResult(optJSONArray.optJSONObject(i3)));
            }
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray(StubApp.getString2(15991));
        if (optJSONArray2 != null) {
            this.syllables = new ArrayList();
            for (int i10 = 0; i10 < optJSONArray2.length(); i10++) {
                this.syllables.add(new SyllableLevelTimingResult(optJSONArray2.optJSONObject(i10)));
            }
        }
    }

    public double getAccuracyScore() {
        return this.accuracyScore;
    }

    public String getErrorType() {
        return this.errorType;
    }

    public List<PhonemeLevelTimingResult> getPhonemes() {
        return this.phonemes;
    }

    public List<SyllableLevelTimingResult> getSyllables() {
        return this.syllables;
    }

    public String getWord() {
        return this.word;
    }
}
