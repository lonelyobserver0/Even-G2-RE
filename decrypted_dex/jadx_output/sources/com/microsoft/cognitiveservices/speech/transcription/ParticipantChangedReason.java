package com.microsoft.cognitiveservices.speech.transcription;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public enum ParticipantChangedReason {
    JoinedConversation(0),
    LeftConversation(1),
    Updated(2);


    /* renamed from: a, reason: collision with root package name */
    public final int f12713a;

    ParticipantChangedReason(int i3) {
        this.f12713a = i3;
    }

    public int getValue() {
        return this.f12713a;
    }
}
