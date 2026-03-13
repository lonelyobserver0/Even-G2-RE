package com.microsoft.cognitiveservices.speech.dialog;

import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.microsoft.cognitiveservices.speech.util.IntRef;
import com.microsoft.cognitiveservices.speech.util.SafeHandle;
import com.microsoft.cognitiveservices.speech.util.SafeHandleType;
import com.microsoft.cognitiveservices.speech.util.StringRef;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class TurnStatusReceivedEventArgs {

    /* renamed from: a, reason: collision with root package name */
    public final SafeHandle f12580a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12581b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12582c;

    /* renamed from: d, reason: collision with root package name */
    public final int f12583d;

    public TurnStatusReceivedEventArgs(long j) {
        this.f12580a = null;
        this.f12581b = "";
        this.f12582c = "";
        this.f12583d = 404;
        Contracts.throwIfNull(j, StubApp.getString2(15897));
        SafeHandle safeHandle = new SafeHandle(j, SafeHandleType.TurnStatusReceivedEvent);
        this.f12580a = safeHandle;
        StringRef stringRef = new StringRef("");
        Contracts.throwIfFail(getInteractionId(safeHandle, stringRef));
        this.f12581b = stringRef.getValue();
        StringRef stringRef2 = new StringRef("");
        Contracts.throwIfFail(getConversationId(safeHandle, stringRef2));
        this.f12582c = stringRef2.getValue();
        IntRef intRef = new IntRef(0L);
        getStatusCode(safeHandle, intRef);
        this.f12583d = (int) intRef.getValue();
    }

    private final native long getConversationId(SafeHandle safeHandle, StringRef stringRef);

    private final native long getInteractionId(SafeHandle safeHandle, StringRef stringRef);

    private final native long getStatusCode(SafeHandle safeHandle, IntRef intRef);

    public String getConversationId() {
        return this.f12582c;
    }

    public String getInteractionId() {
        return this.f12581b;
    }

    public int getStatusCode() {
        return this.f12583d;
    }
}
