package io.flutter.plugin.editing;

import android.util.Log;
import com.stub.StubApp;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class TextEditingDelta {
    private static final String TAG = StubApp.getString2(18710);
    private int deltaEnd;
    private int deltaStart;
    private CharSequence deltaText;
    private int newComposingEnd;
    private int newComposingStart;
    private int newSelectionEnd;
    private int newSelectionStart;
    private CharSequence oldText;

    public TextEditingDelta(CharSequence charSequence, int i3, int i10, CharSequence charSequence2, int i11, int i12, int i13, int i14) {
        this.newSelectionStart = i11;
        this.newSelectionEnd = i12;
        this.newComposingStart = i13;
        this.newComposingEnd = i14;
        setDeltas(charSequence, charSequence2.toString(), i3, i10);
    }

    private void setDeltas(CharSequence charSequence, CharSequence charSequence2, int i3, int i10) {
        this.oldText = charSequence;
        this.deltaText = charSequence2;
        this.deltaStart = i3;
        this.deltaEnd = i10;
    }

    public int getDeltaEnd() {
        return this.deltaEnd;
    }

    public int getDeltaStart() {
        return this.deltaStart;
    }

    public CharSequence getDeltaText() {
        return this.deltaText;
    }

    public int getNewComposingEnd() {
        return this.newComposingEnd;
    }

    public int getNewComposingStart() {
        return this.newComposingStart;
    }

    public int getNewSelectionEnd() {
        return this.newSelectionEnd;
    }

    public int getNewSelectionStart() {
        return this.newSelectionStart;
    }

    public CharSequence getOldText() {
        return this.oldText;
    }

    public JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(StubApp.getString2("18705"), this.oldText.toString());
            jSONObject.put(StubApp.getString2("18706"), this.deltaText.toString());
            jSONObject.put(StubApp.getString2("18707"), this.deltaStart);
            jSONObject.put(StubApp.getString2("18708"), this.deltaEnd);
            jSONObject.put(StubApp.getString2("18005"), this.newSelectionStart);
            jSONObject.put(StubApp.getString2("18006"), this.newSelectionEnd);
            jSONObject.put(StubApp.getString2("18007"), this.newComposingStart);
            jSONObject.put(StubApp.getString2("18008"), this.newComposingEnd);
            return jSONObject;
        } catch (JSONException e10) {
            Log.e(StubApp.getString2(18710), StubApp.getString2(18709) + e10);
            return jSONObject;
        }
    }

    public TextEditingDelta(CharSequence charSequence, int i3, int i10, int i11, int i12) {
        this.newSelectionStart = i3;
        this.newSelectionEnd = i10;
        this.newComposingStart = i11;
        this.newComposingEnd = i12;
        setDeltas(charSequence, "", -1, -1);
    }
}
