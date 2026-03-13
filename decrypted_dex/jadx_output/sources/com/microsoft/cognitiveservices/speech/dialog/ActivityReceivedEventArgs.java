package com.microsoft.cognitiveservices.speech.dialog;

import com.microsoft.cognitiveservices.speech.audio.PullAudioOutputStream;
import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.microsoft.cognitiveservices.speech.util.IntRef;
import com.microsoft.cognitiveservices.speech.util.SafeHandle;
import com.microsoft.cognitiveservices.speech.util.SafeHandleType;
import com.microsoft.cognitiveservices.speech.util.StringRef;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class ActivityReceivedEventArgs {

    /* renamed from: a, reason: collision with root package name */
    public final SafeHandle f12572a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12573b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f12574c;

    public ActivityReceivedEventArgs(long j) {
        this.f12572a = null;
        this.f12573b = "";
        this.f12574c = false;
        Contracts.throwIfNull(j, StubApp.getString2(15897));
        SafeHandle safeHandle = new SafeHandle(j, SafeHandleType.ActivityReceivedEvent);
        this.f12572a = safeHandle;
        StringRef stringRef = new StringRef("");
        Contracts.throwIfFail(getActivity(safeHandle, stringRef));
        this.f12573b = stringRef.getValue();
        this.f12574c = hasAudio(safeHandle);
    }

    private final native long getActivity(SafeHandle safeHandle, StringRef stringRef);

    private final native long getAudio(SafeHandle safeHandle, IntRef intRef);

    private final native boolean hasAudio(SafeHandle safeHandle);

    public String getActivity() {
        return this.f12573b;
    }

    public PullAudioOutputStream getAudio() {
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(getAudio(this.f12572a, intRef));
        return new PullAudioOutputStream(intRef);
    }

    public boolean hasAudio() {
        return this.f12574c;
    }
}
