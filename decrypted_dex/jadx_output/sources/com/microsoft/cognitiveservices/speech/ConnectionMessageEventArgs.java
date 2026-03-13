package com.microsoft.cognitiveservices.speech;

import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.microsoft.cognitiveservices.speech.util.IntRef;
import com.microsoft.cognitiveservices.speech.util.SafeHandle;
import com.microsoft.cognitiveservices.speech.util.SafeHandleType;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class ConnectionMessageEventArgs {
    private ConnectionMessage message;

    public ConnectionMessageEventArgs(long j) {
        Contracts.throwIfNull(j, StubApp.getString2(15696));
        SafeHandle safeHandle = new SafeHandle(j, SafeHandleType.ConnectionMessageEvent);
        Contracts.throwIfNull(safeHandle, StubApp.getString2(15697));
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(getConnectionMessage(safeHandle, intRef));
        this.message = new ConnectionMessage(intRef.getValue());
        safeHandle.close();
    }

    private final native long getConnectionMessage(SafeHandle safeHandle, IntRef intRef);

    public ConnectionMessage getMessage() {
        return this.message;
    }

    public String toString() {
        return StubApp.getString2(15698) + getMessage().toString();
    }
}
