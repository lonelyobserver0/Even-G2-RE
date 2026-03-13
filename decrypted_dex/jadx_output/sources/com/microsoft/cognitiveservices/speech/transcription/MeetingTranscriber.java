package com.microsoft.cognitiveservices.speech.transcription;

import K9.b;
import L9.q;
import L9.r;
import com.microsoft.cognitiveservices.speech.OutputFormat;
import com.microsoft.cognitiveservices.speech.PropertyCollection;
import com.microsoft.cognitiveservices.speech.PropertyId;
import com.microsoft.cognitiveservices.speech.Recognizer;
import com.microsoft.cognitiveservices.speech.audio.AudioConfig;
import com.microsoft.cognitiveservices.speech.util.AsyncThreadService;
import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.microsoft.cognitiveservices.speech.util.EventHandlerImpl;
import com.microsoft.cognitiveservices.speech.util.IntRef;
import com.microsoft.cognitiveservices.speech.util.SafeHandle;
import com.stub.StubApp;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Future;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class MeetingTranscriber extends Recognizer {

    /* renamed from: b, reason: collision with root package name */
    public static final Set f12695b = Collections.synchronizedSet(new HashSet());

    /* renamed from: a, reason: collision with root package name */
    public PropertyCollection f12696a;
    public final EventHandlerImpl<MeetingTranscriptionCanceledEventArgs> canceled;
    public final EventHandlerImpl<MeetingTranscriptionEventArgs> transcribed;
    public final EventHandlerImpl<MeetingTranscriptionEventArgs> transcribing;

    public MeetingTranscriber() {
        super(null, null);
        this.transcribing = new EventHandlerImpl<>(this.eventCounter);
        this.transcribed = new EventHandlerImpl<>(this.eventCounter);
        this.canceled = new EventHandlerImpl<>(this.eventCounter);
        this.f12696a = null;
        Contracts.throwIfNull(super.getImpl(), StubApp.getString2(15749));
        Contracts.throwIfFail(createMeetingTranscriberFromConfig(super.getImpl(), null));
        e();
    }

    private void canceledEventCallback(long j) {
        try {
            Contracts.throwIfNull(this, StubApp.getString2("15732"));
            if (this.disposed) {
                return;
            }
            MeetingTranscriptionCanceledEventArgs meetingTranscriptionCanceledEventArgs = new MeetingTranscriptionCanceledEventArgs(j);
            EventHandlerImpl<MeetingTranscriptionCanceledEventArgs> eventHandlerImpl = this.canceled;
            if (eventHandlerImpl != null) {
                eventHandlerImpl.fireEvent(this, meetingTranscriptionCanceledEventArgs);
            }
        } catch (Exception unused) {
        }
    }

    private final native long createMeetingTranscriberFromConfig(SafeHandle safeHandle, SafeHandle safeHandle2);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long joinMeeting(SafeHandle safeHandle, SafeHandle safeHandle2);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long leaveMeeting(SafeHandle safeHandle);

    private void recognizedEventCallback(long j) {
        try {
            Contracts.throwIfNull(this, StubApp.getString2("15732"));
            if (this.disposed) {
                return;
            }
            MeetingTranscriptionEventArgs meetingTranscriptionEventArgs = new MeetingTranscriptionEventArgs(j, 0);
            EventHandlerImpl<MeetingTranscriptionEventArgs> eventHandlerImpl = this.transcribed;
            if (eventHandlerImpl != null) {
                eventHandlerImpl.fireEvent(this, meetingTranscriptionEventArgs);
            }
        } catch (Exception unused) {
        }
    }

    private void recognizingEventCallback(long j) {
        try {
            Contracts.throwIfNull(this, StubApp.getString2("15732"));
            if (this.disposed) {
                return;
            }
            MeetingTranscriptionEventArgs meetingTranscriptionEventArgs = new MeetingTranscriptionEventArgs(j, 0);
            EventHandlerImpl<MeetingTranscriptionEventArgs> eventHandlerImpl = this.transcribing;
            if (eventHandlerImpl != null) {
                eventHandlerImpl.fireEvent(this, meetingTranscriptionEventArgs);
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.microsoft.cognitiveservices.speech.Recognizer
    public void dispose(boolean z2) {
        if (!this.disposed && z2) {
            PropertyCollection propertyCollection = this.f12696a;
            if (propertyCollection != null) {
                propertyCollection.close();
                this.f12696a = null;
            }
            f12695b.remove(this);
            super.dispose(z2);
        }
    }

    public final void e() {
        this.transcribing.updateNotificationOnConnected(new q(this, this, 2));
        this.transcribed.updateNotificationOnConnected(new q(this, this, 3));
        this.canceled.updateNotificationOnConnected(new q(this, this, 4));
        this.sessionStarted.updateNotificationOnConnected(new q(this, this, 5));
        this.sessionStopped.updateNotificationOnConnected(new q(this, this, 6));
        this.speechStartDetected.updateNotificationOnConnected(new q(this, this, 0));
        this.speechEndDetected.updateNotificationOnConnected(new q(this, this, 1));
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(getPropertyBagFromRecognizerHandle(getImpl(), intRef));
        this.f12696a = new PropertyCollection(intRef);
    }

    public OutputFormat getOutputFormat() {
        return this.f12696a.getProperty(PropertyId.SpeechServiceResponse_RequestDetailedResultTrueFalse).equals(StubApp.getString2(6547)) ? OutputFormat.Detailed : OutputFormat.Simple;
    }

    public PropertyCollection getProperties() {
        return this.f12696a;
    }

    public String getSpeechRecognitionLanguage() {
        return this.f12696a.getProperty(PropertyId.SpeechServiceConnection_RecoLanguage);
    }

    public Future<Void> joinMeetingAsync(Meeting meeting) {
        return AsyncThreadService.submit(new b(this, this, meeting, 2));
    }

    public Future<Void> leaveMeetingAsync() {
        return AsyncThreadService.submit(new r(this, this, 0));
    }

    public Future<Void> startTranscribingAsync() {
        return AsyncThreadService.submit(new r(this, this, 1));
    }

    public Future<Void> stopTranscribingAsync() {
        return AsyncThreadService.submit(new r(this, this, 2));
    }

    public MeetingTranscriber(AudioConfig audioConfig) {
        super(audioConfig, null);
        this.transcribing = new EventHandlerImpl<>(this.eventCounter);
        this.transcribed = new EventHandlerImpl<>(this.eventCounter);
        this.canceled = new EventHandlerImpl<>(this.eventCounter);
        this.f12696a = null;
        Contracts.throwIfFail(audioConfig == null ? createMeetingTranscriberFromConfig(super.getImpl(), null) : createMeetingTranscriberFromConfig(super.getImpl(), audioConfig.getImpl()));
        e();
    }
}
