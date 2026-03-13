package com.microsoft.cognitiveservices.speech;

import com.mapbox.common.b;
import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.microsoft.cognitiveservices.speech.util.IntRef;
import com.microsoft.cognitiveservices.speech.util.SafeHandle;
import com.microsoft.cognitiveservices.speech.util.SafeHandleType;
import com.microsoft.cognitiveservices.speech.util.StringRef;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class SynthesisVoicesResult implements AutoCloseable {
    private String errorDetails;
    private PropertyCollection properties;
    private ResultReason reason;
    private SafeHandle resultHandle;
    private String resultId;
    private List<VoiceInfo> voices;

    public SynthesisVoicesResult(IntRef intRef) {
        this.resultHandle = null;
        Contracts.throwIfNull(intRef, StubApp.getString2(1890));
        this.resultHandle = new SafeHandle(intRef.getValue(), SafeHandleType.SynthesisResult);
        IntRef intRef2 = new IntRef(0L);
        Contracts.throwIfFail(getVoiceNumber(this.resultHandle, intRef2));
        int value = (int) intRef2.getValue();
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < value; i3++) {
            IntRef intRef3 = new IntRef(0L);
            Contracts.throwIfFail(getVoiceInfo(this.resultHandle, i3, intRef3));
            arrayList.add(new VoiceInfo(intRef3));
        }
        this.voices = Collections.unmodifiableList(arrayList);
        StringRef stringRef = new StringRef("");
        Contracts.throwIfFail(getResultId(this.resultHandle, stringRef));
        this.resultId = stringRef.getValue();
        Contracts.throwIfFail(getResultReason(this.resultHandle, intRef2));
        this.reason = ResultReason.values()[(int) intRef2.getValue()];
        IntRef intRef4 = new IntRef(0L);
        PropertyCollection c10 = b.c(getPropertyBagFromResult(this.resultHandle, intRef4), intRef4);
        this.properties = c10;
        this.errorDetails = c10.getProperty(PropertyId.CancellationDetails_ReasonDetailedText);
    }

    private final native long getPropertyBagFromResult(SafeHandle safeHandle, IntRef intRef);

    private final native long getResultId(SafeHandle safeHandle, StringRef stringRef);

    private final native long getResultReason(SafeHandle safeHandle, IntRef intRef);

    private final native long getVoiceInfo(SafeHandle safeHandle, int i3, IntRef intRef);

    private final native long getVoiceNumber(SafeHandle safeHandle, IntRef intRef);

    @Override // java.lang.AutoCloseable
    public void close() {
        SafeHandle safeHandle = this.resultHandle;
        if (safeHandle != null) {
            safeHandle.close();
            this.resultHandle = null;
        }
        PropertyCollection propertyCollection = this.properties;
        if (propertyCollection != null) {
            propertyCollection.close();
            this.properties = null;
        }
        List<VoiceInfo> list = this.voices;
        if (list != null) {
            Iterator<VoiceInfo> it = list.iterator();
            while (it.hasNext()) {
                it.next().close();
            }
            this.voices = null;
        }
    }

    public String getErrorDetails() {
        return this.errorDetails;
    }

    public SafeHandle getImpl() {
        return this.resultHandle;
    }

    public PropertyCollection getProperties() {
        return this.properties;
    }

    public ResultReason getReason() {
        return this.reason;
    }

    public String getResultId() {
        return this.resultId;
    }

    public List<VoiceInfo> getVoices() {
        return this.voices;
    }
}
