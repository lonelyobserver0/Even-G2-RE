package com.microsoft.cognitiveservices.speech;

import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.microsoft.cognitiveservices.speech.util.IntRef;
import com.microsoft.cognitiveservices.speech.util.SafeHandle;
import com.stub.StubApp;
import java.math.BigInteger;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class RecognitionEventArgs extends SessionEventArgs {
    public BigInteger offset;

    public RecognitionEventArgs(long j) {
        super(j);
        storeEventData(false);
    }

    private final native BigInteger getOffset(SafeHandle safeHandle, IntRef intRef);

    private void storeEventData(boolean z2) {
        Contracts.throwIfNull(this.eventHandle, StubApp.getString2(15697));
        IntRef intRef = new IntRef(0L);
        this.offset = getOffset(this.eventHandle, intRef);
        Contracts.throwIfFail(intRef.getValue());
        if (z2) {
            super.close();
        }
    }

    public final native long getRecognitionResult(SafeHandle safeHandle, IntRef intRef);

    @Override // com.microsoft.cognitiveservices.speech.SessionEventArgs
    public String toString() {
        return StubApp.getString2(15865) + getSessionId() + StubApp.getString2(15866) + this.offset.toString() + StubApp.getString2(1);
    }

    public RecognitionEventArgs(long j, boolean z2) {
        super(j);
        storeEventData(z2);
    }
}
