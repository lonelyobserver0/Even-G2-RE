package com.microsoft.cognitiveservices.speech;

import com.stub.StubApp;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class PhonemeLevelTimingResult extends TimingResult {
    private double accuracyScore;
    private List<NBestPhoneme> nbestPhonemes;
    private String phoneme;

    public PhonemeLevelTimingResult(JSONObject jSONObject) {
        super(jSONObject);
        this.phoneme = jSONObject.optString(StubApp.getString2(15733));
        JSONObject optJSONObject = jSONObject.optJSONObject(StubApp.getString2(15742));
        if (optJSONObject != null) {
            this.accuracyScore = optJSONObject.optDouble(StubApp.getString2(15743));
        }
        JSONArray optJSONArray = jSONObject.optJSONArray(StubApp.getString2(15744));
        if (optJSONArray != null) {
            this.nbestPhonemes = new ArrayList();
            for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                this.nbestPhonemes.add(new NBestPhoneme(optJSONArray.optJSONObject(i3)));
            }
        }
    }

    public double getAccuracyScore() {
        return this.accuracyScore;
    }

    public List<NBestPhoneme> getNBestPhonemes() {
        return this.nbestPhonemes;
    }

    public String getPhoneme() {
        return this.phoneme;
    }
}
