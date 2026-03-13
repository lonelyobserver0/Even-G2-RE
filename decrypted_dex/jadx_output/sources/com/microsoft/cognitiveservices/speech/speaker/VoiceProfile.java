package com.microsoft.cognitiveservices.speech.speaker;

import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.microsoft.cognitiveservices.speech.util.IntRef;
import com.microsoft.cognitiveservices.speech.util.SafeHandle;
import com.microsoft.cognitiveservices.speech.util.SafeHandleType;
import com.microsoft.cognitiveservices.speech.util.StringRef;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class VoiceProfile implements AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public SafeHandle f12626a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f12627b = false;

    public VoiceProfile(long j) {
        this.f12626a = null;
        Contracts.throwIfNull(j, StubApp.getString2(16055));
        this.f12626a = new SafeHandle(j, SafeHandleType.VoiceProfile);
    }

    private final native long createVoiceProfileFromIdAndType(String str, int i3, IntRef intRef);

    private final native long getId(SafeHandle safeHandle, StringRef stringRef);

    private final native long getType(SafeHandle safeHandle, IntRef intRef);

    @Override // java.lang.AutoCloseable
    public void close() {
        if (this.f12627b) {
            return;
        }
        SafeHandle safeHandle = this.f12626a;
        if (safeHandle != null) {
            safeHandle.close();
            this.f12626a = null;
        }
        this.f12627b = true;
    }

    public String getId() {
        StringRef stringRef = new StringRef("");
        Contracts.throwIfFail(getId(this.f12626a, stringRef));
        return stringRef.getValue();
    }

    public SafeHandle getImpl() {
        return this.f12626a;
    }

    public VoiceProfileType getType() {
        Contracts.throwIfFail(getType(this.f12626a, new IntRef(0L)));
        return VoiceProfileType.values()[((int) r0.getValue()) - 1];
    }

    public VoiceProfile(String str, VoiceProfileType voiceProfileType) {
        this.f12626a = null;
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(createVoiceProfileFromIdAndType(str, voiceProfileType.getValue(), intRef));
        this.f12626a = new SafeHandle(intRef.getValue(), SafeHandleType.VoiceProfile);
    }
}
