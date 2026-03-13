package com.microsoft.cognitiveservices.speech.transcription;

import com.microsoft.cognitiveservices.speech.SessionEventArgs;
import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.microsoft.cognitiveservices.speech.util.IntRef;
import com.microsoft.cognitiveservices.speech.util.SafeHandle;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class ConversationParticipantsChangedEventArgs extends SessionEventArgs {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f12667a;

    /* renamed from: b, reason: collision with root package name */
    public final ParticipantChangedReason f12668b;

    public ConversationParticipantsChangedEventArgs(long j) {
        super(j);
        Contracts.throwIfNull(this.eventHandle, StubApp.getString2(15697));
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(getReason(this.eventHandle, intRef));
        this.f12668b = ParticipantChangedReason.values()[(int) intRef.getValue()];
        this.f12667a = new ArrayList();
        IntRef intRef2 = new IntRef(0L);
        SafeHandle safeHandle = this.eventHandle;
        int i3 = 0;
        while (true) {
            getParticipantAt(safeHandle, i3, intRef2);
            if (intRef2.getValue() == 0 || intRef2.getValue() == -1) {
                break;
            }
            this.f12667a.add(new Participant(intRef2.getValue()));
            intRef2 = new IntRef(0L);
            i3++;
            safeHandle = this.eventHandle;
        }
        super.close();
    }

    private final native long getParticipantAt(SafeHandle safeHandle, int i3, IntRef intRef);

    private final native long getReason(SafeHandle safeHandle, IntRef intRef);

    public List<Participant> getParticipants() {
        return this.f12667a;
    }

    public ParticipantChangedReason getReason() {
        return this.f12668b;
    }

    @Override // com.microsoft.cognitiveservices.speech.SessionEventArgs
    public String toString() {
        return StubApp.getString2(15708) + getSessionId() + StubApp.getString2(15710) + this.f12668b + StubApp.getString2(16072) + this.f12667a.size();
    }
}
