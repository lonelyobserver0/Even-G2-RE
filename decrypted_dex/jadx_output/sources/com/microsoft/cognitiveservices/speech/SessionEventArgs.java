package com.microsoft.cognitiveservices.speech;

import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.microsoft.cognitiveservices.speech.util.SafeHandle;
import com.microsoft.cognitiveservices.speech.util.SafeHandleType;
import com.microsoft.cognitiveservices.speech.util.StringRef;
import com.stub.StubApp;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class SessionEventArgs {
    protected SafeHandle eventHandle;
    private String sessionId;
    private final int maxUUID = 36;
    private final int maxSessionID = 37;

    public SessionEventArgs(long j) {
        this.eventHandle = null;
        Contracts.throwIfNull(j, StubApp.getString2(15897));
        this.eventHandle = new SafeHandle(j, SafeHandleType.Event);
        storeEventData(false);
    }

    private final native long getSessionId(SafeHandle safeHandle, StringRef stringRef, int i3);

    private void storeEventData(boolean z2) {
        StringRef stringRef = new StringRef("");
        Contracts.throwIfFail(getSessionId(this.eventHandle, stringRef, 37));
        String value = stringRef.getValue();
        this.sessionId = value;
        Contracts.throwIfNull(value, StubApp.getString2(15707));
        if (z2) {
            close();
        }
    }

    public void close() {
        SafeHandle safeHandle = this.eventHandle;
        if (safeHandle != null) {
            safeHandle.close();
            this.eventHandle = null;
        }
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public String toString() {
        return AbstractC1482f.k(new StringBuilder(StubApp.getString2(15865)), this.sessionId, StubApp.getString2(1));
    }

    public SessionEventArgs(long j, boolean z2) {
        this.eventHandle = null;
        Contracts.throwIfNull(j, StubApp.getString2(15897));
        this.eventHandle = new SafeHandle(j, SafeHandleType.Event);
        storeEventData(z2);
    }
}
