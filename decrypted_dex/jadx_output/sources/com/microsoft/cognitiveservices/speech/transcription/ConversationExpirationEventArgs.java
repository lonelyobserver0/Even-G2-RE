package com.microsoft.cognitiveservices.speech.transcription;

import Xa.h;
import com.microsoft.cognitiveservices.speech.SessionEventArgs;
import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.microsoft.cognitiveservices.speech.util.IntRef;
import com.microsoft.cognitiveservices.speech.util.SafeHandle;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class ConversationExpirationEventArgs extends SessionEventArgs {

    /* renamed from: a, reason: collision with root package name */
    public final long f12666a;

    public ConversationExpirationEventArgs(long j) {
        super(j);
        Contracts.throwIfNull(this.eventHandle, StubApp.getString2(15697));
        IntRef intRef = new IntRef(0L);
        this.f12666a = getExpiration(this.eventHandle, intRef);
        Contracts.throwIfFail(intRef.getValue());
        super.close();
    }

    private final native long getExpiration(SafeHandle safeHandle, IntRef intRef);

    public long getExpirationTime() {
        return this.f12666a;
    }

    @Override // com.microsoft.cognitiveservices.speech.SessionEventArgs
    public String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(15865));
        sb2.append(getSessionId());
        sb2.append(StubApp.getString2(16071));
        return h.q(sb2, this.f12666a, StubApp.getString2(1));
    }
}
