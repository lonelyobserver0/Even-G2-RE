package com.microsoft.cognitiveservices.speech.audio;

import android.content.Context;
import com.microsoft.cognitiveservices.speech.SpeechConfig;
import com.microsoft.cognitiveservices.speech.util.ContextHolder;
import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.microsoft.cognitiveservices.speech.util.IntRef;
import com.microsoft.cognitiveservices.speech.util.SafeHandle;
import com.microsoft.cognitiveservices.speech.util.SafeHandleType;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class AudioProcessingOptions implements AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public SafeHandle f12550a;

    static {
        try {
            Class.forName(SpeechConfig.class.getName());
        } catch (ClassNotFoundException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public AudioProcessingOptions(IntRef intRef) {
        this.f12550a = null;
        Contracts.throwIfNull(intRef, StubApp.getString2(15992));
        SafeHandle safeHandle = new SafeHandle(intRef.getValue(), SafeHandleType.AudioProcessingOptions);
        this.f12550a = safeHandle;
        Contracts.throwIfFail(extractAssets(safeHandle, ContextHolder.getInstance().getContext()));
    }

    private static final native long create(IntRef intRef, int i3);

    public static AudioProcessingOptions create(int i3) {
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(create(intRef, i3));
        return new AudioProcessingOptions(intRef);
    }

    private static final native long createFromMicrophoneArrayGeometry(IntRef intRef, int i3, MicrophoneArrayGeometry microphoneArrayGeometry, int i10);

    private static final native long createFromPresetMicrophoneArrayGeometry(IntRef intRef, int i3, int i10, int i11);

    private final native long extractAssets(SafeHandle safeHandle, Context context);

    private final native long getAudioProcessingFlags(SafeHandle safeHandle, IntRef intRef);

    private final native long getBeamformingEndAngle(SafeHandle safeHandle, IntRef intRef);

    private final native long getBeamformingStartAngle(SafeHandle safeHandle, IntRef intRef);

    private final native long getMicrophoneArrayType(SafeHandle safeHandle, IntRef intRef);

    private final native MicrophoneCoordinates[] getMicrophoneCoordinates(SafeHandle safeHandle, IntRef intRef);

    private final native long getPresetMicrophoneArrayGeometry(SafeHandle safeHandle, IntRef intRef);

    private final native long getSpeakerReferenceChannel(SafeHandle safeHandle, IntRef intRef);

    @Override // java.lang.AutoCloseable
    public void close() {
        SafeHandle safeHandle = this.f12550a;
        if (safeHandle != null) {
            safeHandle.close();
            this.f12550a = null;
        }
    }

    public int getAudioProcessingFlags() {
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(getAudioProcessingFlags(this.f12550a, intRef));
        return (int) intRef.getValue();
    }

    public int getBeamformingEndAngle() {
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(getBeamformingEndAngle(this.f12550a, intRef));
        return (int) intRef.getValue();
    }

    public int getBeamformingStartAngle() {
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(getBeamformingStartAngle(this.f12550a, intRef));
        return (int) intRef.getValue();
    }

    public SafeHandle getImpl() {
        return this.f12550a;
    }

    public MicrophoneArrayType getMicrophoneArrayType() {
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(getMicrophoneArrayType(this.f12550a, intRef));
        return MicrophoneArrayType.values()[(int) intRef.getValue()];
    }

    public MicrophoneCoordinates[] getMicrophoneCoordinates() {
        IntRef intRef = new IntRef(0L);
        MicrophoneCoordinates[] microphoneCoordinates = getMicrophoneCoordinates(this.f12550a, intRef);
        Contracts.throwIfFail(intRef.getValue());
        return microphoneCoordinates;
    }

    public PresetMicrophoneArrayGeometry getPresetMicrophoneArrayGeometry() {
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(getPresetMicrophoneArrayGeometry(this.f12550a, intRef));
        return PresetMicrophoneArrayGeometry.values()[(int) intRef.getValue()];
    }

    public SpeakerReferenceChannel getSpeakerReferenceChannel() {
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(getSpeakerReferenceChannel(this.f12550a, intRef));
        return SpeakerReferenceChannel.values()[(int) intRef.getValue()];
    }

    public static AudioProcessingOptions create(int i3, MicrophoneArrayGeometry microphoneArrayGeometry) {
        return create(i3, microphoneArrayGeometry, SpeakerReferenceChannel.None);
    }

    public static AudioProcessingOptions create(int i3, MicrophoneArrayGeometry microphoneArrayGeometry, SpeakerReferenceChannel speakerReferenceChannel) {
        Contracts.throwIfNull(microphoneArrayGeometry, StubApp.getString2(15995));
        Contracts.throwIfNull(speakerReferenceChannel, StubApp.getString2(15996));
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(createFromMicrophoneArrayGeometry(intRef, i3, microphoneArrayGeometry, speakerReferenceChannel.ordinal()));
        return new AudioProcessingOptions(intRef);
    }

    public static AudioProcessingOptions create(int i3, PresetMicrophoneArrayGeometry presetMicrophoneArrayGeometry) {
        return create(i3, presetMicrophoneArrayGeometry, SpeakerReferenceChannel.None);
    }

    public static AudioProcessingOptions create(int i3, PresetMicrophoneArrayGeometry presetMicrophoneArrayGeometry, SpeakerReferenceChannel speakerReferenceChannel) {
        Contracts.throwIfNull(presetMicrophoneArrayGeometry, StubApp.getString2(15995));
        Contracts.throwIfNull(speakerReferenceChannel, StubApp.getString2(15996));
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(createFromPresetMicrophoneArrayGeometry(intRef, i3, presetMicrophoneArrayGeometry.ordinal(), speakerReferenceChannel.ordinal()));
        return new AudioProcessingOptions(intRef);
    }
}
