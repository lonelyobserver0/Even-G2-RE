package com.microsoft.cognitiveservices.speech;

import com.mapbox.common.b;
import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.microsoft.cognitiveservices.speech.util.IntRef;
import com.microsoft.cognitiveservices.speech.util.SafeHandle;
import com.microsoft.cognitiveservices.speech.util.SafeHandleType;
import com.microsoft.cognitiveservices.speech.util.StringRef;
import com.stub.StubApp;
import java.math.BigInteger;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class RecognitionResult implements AutoCloseable {
    private int channel;
    private BigInteger duration;
    private BigInteger offset;
    private PropertyCollection properties;
    private ResultReason reason;
    private SafeHandle resultHandle;
    private String resultId;
    private String text;

    public RecognitionResult(long j) {
        this.resultHandle = null;
        this.properties = null;
        if (j != 0) {
            this.resultHandle = new SafeHandle(j, SafeHandleType.RecognitionResult);
            StringRef stringRef = new StringRef("");
            Contracts.throwIfFail(getResultId(this.resultHandle, stringRef));
            this.resultId = stringRef.getValue();
            IntRef intRef = new IntRef(0L);
            Contracts.throwIfFail(getResultReason(this.resultHandle, intRef));
            this.reason = ResultReason.values()[(int) intRef.getValue()];
            Contracts.throwIfFail(getResultText(this.resultHandle, stringRef));
            this.text = stringRef.getValue();
            this.duration = getResultDuration(this.resultHandle, intRef);
            Contracts.throwIfFail(intRef.getValue());
            this.offset = getResultOffset(this.resultHandle, intRef);
            Contracts.throwIfFail(intRef.getValue());
            this.channel = getResultChannel(this.resultHandle, intRef);
            Contracts.throwIfFail(intRef.getValue());
            IntRef intRef2 = new IntRef(0L);
            this.properties = b.c(getPropertyBagFromResult(this.resultHandle, intRef2), intRef2);
        }
    }

    private final native long getPropertyBagFromResult(SafeHandle safeHandle, IntRef intRef);

    private final native int getResultChannel(SafeHandle safeHandle, IntRef intRef);

    private final native BigInteger getResultDuration(SafeHandle safeHandle, IntRef intRef);

    private final native long getResultId(SafeHandle safeHandle, StringRef stringRef);

    private final native BigInteger getResultOffset(SafeHandle safeHandle, IntRef intRef);

    private final native long getResultReason(SafeHandle safeHandle, IntRef intRef);

    private final native long getResultText(SafeHandle safeHandle, StringRef stringRef);

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
    }

    public int getChannel() {
        return this.channel;
    }

    public BigInteger getDuration() {
        return this.duration;
    }

    public SafeHandle getImpl() {
        Contracts.throwIfNull(this.resultHandle, StubApp.getString2(1890));
        return this.resultHandle;
    }

    public BigInteger getOffset() {
        return this.offset;
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

    public String getText() {
        return this.text;
    }
}
