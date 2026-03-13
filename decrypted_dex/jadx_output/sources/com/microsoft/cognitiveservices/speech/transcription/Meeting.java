package com.microsoft.cognitiveservices.speech.transcription;

import L9.c;
import L9.d;
import L9.l;
import L9.m;
import L9.o;
import L9.p;
import com.mapbox.common.b;
import com.microsoft.cognitiveservices.speech.PropertyCollection;
import com.microsoft.cognitiveservices.speech.PropertyId;
import com.microsoft.cognitiveservices.speech.SpeechConfig;
import com.microsoft.cognitiveservices.speech.util.AsyncThreadService;
import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.microsoft.cognitiveservices.speech.util.IntRef;
import com.microsoft.cognitiveservices.speech.util.SafeHandle;
import com.microsoft.cognitiveservices.speech.util.SafeHandleType;
import com.microsoft.cognitiveservices.speech.util.StringRef;
import com.stub.StubApp;
import java.util.concurrent.Future;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class Meeting implements AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public SafeHandle f12690a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f12691b = false;

    /* renamed from: c, reason: collision with root package name */
    public final Object f12692c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public int f12693d = 0;

    /* renamed from: e, reason: collision with root package name */
    public PropertyCollection f12694e;

    public Meeting(long j) {
        this.f12690a = new SafeHandle(j, SafeHandleType.Meeting);
        IntRef intRef = new IntRef(0L);
        this.f12694e = b.c(getPropertyBag(this.f12690a, intRef), intRef);
    }

    public static void F(Meeting meeting, Runnable runnable) {
        synchronized (meeting.f12692c) {
            meeting.f12693d++;
        }
        if (meeting.f12691b) {
            throw new IllegalStateException(Meeting.class.getName());
        }
        try {
            runnable.run();
            synchronized (meeting.f12692c) {
                meeting.f12693d--;
            }
        } catch (Throwable th) {
            synchronized (meeting.f12692c) {
                meeting.f12693d--;
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final native long addParticipant(SafeHandle safeHandle, SafeHandle safeHandle2);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long addParticipantByUser(SafeHandle safeHandle, SafeHandle safeHandle2);

    public static Future<Meeting> createMeetingAsync(SpeechConfig speechConfig) {
        Contracts.throwIfNull(speechConfig, StubApp.getString2(15923));
        AsyncThreadService.initialize();
        return AsyncThreadService.submit(new c(speechConfig, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long createMeetingFromConfig(IntRef intRef, SafeHandle safeHandle, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long deleteMeeting(SafeHandle safeHandle);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long endMeeting(SafeHandle safeHandle);

    private final native long getMeetingId(SafeHandle safeHandle, StringRef stringRef);

    private final native long getPropertyBag(SafeHandle safeHandle, IntRef intRef);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long lockMeeting(SafeHandle safeHandle);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long muteAll(SafeHandle safeHandle);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long muteParticipant(SafeHandle safeHandle, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long removeParticipant(SafeHandle safeHandle, SafeHandle safeHandle2);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long removeParticipantByUser(SafeHandle safeHandle, SafeHandle safeHandle2);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long removeParticipantByUserId(SafeHandle safeHandle, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long startMeeting(SafeHandle safeHandle);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long unlockMeeting(SafeHandle safeHandle);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long unmuteAll(SafeHandle safeHandle);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long unmuteParticipant(SafeHandle safeHandle, String str);

    public Future<Participant> addParticipantAsync(Participant participant) {
        return AsyncThreadService.submit(new o(this, participant, this, 0));
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        synchronized (this.f12692c) {
            try {
                if (this.f12693d != 0) {
                    throw new IllegalStateException(StubApp.getString2("15871"));
                }
                dispose(true);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Future<Void> deleteMeetingAsync() {
        return AsyncThreadService.submit(new l(this, this, 1));
    }

    public void dispose(boolean z2) {
        if (!this.f12691b && z2) {
            SafeHandle safeHandle = this.f12690a;
            if (safeHandle != null) {
                safeHandle.close();
                this.f12690a = null;
            }
            PropertyCollection propertyCollection = this.f12694e;
            if (propertyCollection != null) {
                propertyCollection.close();
                this.f12694e = null;
            }
            AsyncThreadService.shutdown();
            this.f12691b = true;
        }
    }

    public Future<Void> endMeetingAsync() {
        return AsyncThreadService.submit(new l(this, this, 6));
    }

    public String getAuthorizationToken() {
        return this.f12694e.getProperty(PropertyId.SpeechServiceAuthorization_Token);
    }

    public SafeHandle getImpl() {
        return this.f12690a;
    }

    public String getMeetingId() {
        StringRef stringRef = new StringRef("");
        Contracts.throwIfFail(getMeetingId(this.f12690a, stringRef));
        return stringRef.getValue();
    }

    public PropertyCollection getProperties() {
        return this.f12694e;
    }

    public Future<Void> lockMeetingAsync() {
        return AsyncThreadService.submit(new l(this, this, 2));
    }

    public Future<Void> muteAllParticipantsAsync() {
        return AsyncThreadService.submit(new l(this, this, 4));
    }

    public Future<Void> muteParticipantAsync(String str) {
        return AsyncThreadService.submit(new m(this, str, this, 0));
    }

    public Future<Void> removeParticipantAsync(Participant participant) {
        return AsyncThreadService.submit(new o(this, participant, this, 1));
    }

    public void setAuthorizationToken(String str) {
        Contracts.throwIfNullOrWhitespace(str, StubApp.getString2(1071));
        this.f12694e.setProperty(PropertyId.SpeechServiceAuthorization_Token, str);
    }

    public Future<Void> startMeetingAsync() {
        return AsyncThreadService.submit(new l(this, this, 0));
    }

    public Future<Void> unlockMeetingAsync() {
        return AsyncThreadService.submit(new l(this, this, 3));
    }

    public Future<Void> unmuteAllParticipantsAsync() {
        return AsyncThreadService.submit(new l(this, this, 5));
    }

    public Future<Void> unmuteParticipantAsync(String str) {
        return AsyncThreadService.submit(new m(this, str, this, 1));
    }

    public static Future<Meeting> createMeetingAsync(SpeechConfig speechConfig, String str) {
        Contracts.throwIfNull(speechConfig, StubApp.getString2(15923));
        Contracts.throwIfNull(str, StubApp.getString2(16079));
        AsyncThreadService.initialize();
        return AsyncThreadService.submit(new d(speechConfig, str, 1));
    }

    public Future<User> addParticipantAsync(User user) {
        return AsyncThreadService.submit(new p(this, user, this, 0));
    }

    public Future<Void> removeParticipantAsync(User user) {
        return AsyncThreadService.submit(new p(this, user, this, 1));
    }

    public Future<Participant> addParticipantAsync(String str) {
        return AsyncThreadService.submit(new m(this, str, this, 2));
    }

    public Future<Void> removeParticipantAsync(String str) {
        return AsyncThreadService.submit(new m(this, str, this, 3));
    }
}
