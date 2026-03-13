package com.microsoft.cognitiveservices.speech;

import com.stub.StubApp;
import org.json.JSONObject;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class SyllableLevelTimingResult extends TimingResult {
    private double accuracyScore;
    private String grapheme;
    private String syllable;

    public SyllableLevelTimingResult(JSONObject jSONObject) {
        super(jSONObject);
        this.syllable = jSONObject.optString(StubApp.getString2(15974));
        this.grapheme = jSONObject.optString(StubApp.getString2(15975));
        JSONObject optJSONObject = jSONObject.optJSONObject(StubApp.getString2(15742));
        if (optJSONObject != null) {
            this.accuracyScore = optJSONObject.optDouble(StubApp.getString2(15743));
        }
    }

    public double getAccuracyScore() {
        return this.accuracyScore;
    }

    public String getGrapheme() {
        return this.grapheme;
    }

    public String getSyllable() {
        return this.syllable;
    }
}
