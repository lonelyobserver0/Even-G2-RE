package com.microsoft.cognitiveservices.speech.audio;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.mapbox.common.b;
import com.microsoft.cognitiveservices.speech.PropertyCollection;
import com.microsoft.cognitiveservices.speech.PropertyId;
import com.microsoft.cognitiveservices.speech.SpeechConfig;
import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.microsoft.cognitiveservices.speech.util.IntRef;
import com.microsoft.cognitiveservices.speech.util.SafeHandle;
import com.microsoft.cognitiveservices.speech.util.SafeHandleType;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class AudioConfig implements AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public SafeHandle f12544a;

    /* renamed from: b, reason: collision with root package name */
    public AudioInputStream f12545b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f12546c;

    /* renamed from: d, reason: collision with root package name */
    public PropertyCollection f12547d;

    static {
        try {
            Class.forName(SpeechConfig.class.getName());
        } catch (ClassNotFoundException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public AudioConfig(IntRef intRef) {
        this.f12544a = null;
        this.f12545b = null;
        this.f12546c = false;
        this.f12547d = null;
        Contracts.throwIfNull(intRef, StubApp.getString2(2448));
        this.f12544a = new SafeHandle(intRef.getValue(), SafeHandleType.AudioConfig);
        this.f12545b = null;
        IntRef intRef2 = new IntRef(0L);
        this.f12547d = b.c(getPropertyBag(this.f12544a, intRef2), intRef2);
    }

    private static final native long createAudioInputFromDefaultMicrophone(IntRef intRef, SafeHandle safeHandle);

    private static final native long createAudioInputFromMicrophoneInput(IntRef intRef, String str, SafeHandle safeHandle);

    private static final native long createAudioInputFromStream(IntRef intRef, SafeHandle safeHandle, SafeHandle safeHandle2);

    private static final native long createAudioInputFromWavFileName(IntRef intRef, String str, SafeHandle safeHandle);

    private static final native long createAudioOutputFromDefaultSpeaker(IntRef intRef);

    private static final native long createAudioOutputFromSpeakerOutput(IntRef intRef, String str);

    private static final native long createAudioOutputFromStream(IntRef intRef, SafeHandle safeHandle);

    private static final native long createAudioOutputFromWavFileName(IntRef intRef, String str);

    public static AudioConfig fromDefaultMicrophoneInput() {
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(createAudioInputFromDefaultMicrophone(intRef, null));
        return new AudioConfig(intRef);
    }

    public static AudioConfig fromDefaultSpeakerOutput() {
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(createAudioOutputFromDefaultSpeaker(intRef));
        return new AudioConfig(intRef);
    }

    public static AudioConfig fromMicrophoneInput(String str) {
        Contracts.throwIfNull(str, StubApp.getString2(15993));
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(createAudioInputFromMicrophoneInput(intRef, str, null));
        return new AudioConfig(intRef);
    }

    public static AudioConfig fromSpeakerOutput(String str) {
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(createAudioOutputFromSpeakerOutput(intRef, str));
        return new AudioConfig(intRef);
    }

    public static AudioConfig fromStreamInput(AudioInputStream audioInputStream) {
        Contracts.throwIfNull(audioInputStream, StubApp.getString2(15994));
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(createAudioInputFromStream(intRef, audioInputStream.getImpl(), null));
        return new AudioConfig(intRef, audioInputStream);
    }

    public static AudioConfig fromStreamOutput(AudioOutputStream audioOutputStream) {
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(createAudioOutputFromStream(intRef, audioOutputStream.getImpl()));
        return new AudioConfig(intRef);
    }

    public static AudioConfig fromWavFileInput(String str) {
        Contracts.throwIfNull(str, StubApp.getString2(4505));
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(createAudioInputFromWavFileName(intRef, str, null));
        return new AudioConfig(intRef);
    }

    public static AudioConfig fromWavFileOutput(String str) {
        Contracts.throwIfNull(str, StubApp.getString2(4505));
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(createAudioOutputFromWavFileName(intRef, str));
        return new AudioConfig(intRef);
    }

    private final native long getAudioProcessingOptions(SafeHandle safeHandle, IntRef intRef);

    private final native long getPropertyBag(SafeHandle safeHandle, IntRef intRef);

    @Override // java.lang.AutoCloseable
    public void close() {
        AudioInputStream audioInputStream = this.f12545b;
        if (audioInputStream != null && this.f12546c) {
            audioInputStream.close();
        }
        this.f12545b = null;
        PropertyCollection propertyCollection = this.f12547d;
        if (propertyCollection != null) {
            propertyCollection.close();
            this.f12547d = null;
        }
        SafeHandle safeHandle = this.f12544a;
        if (safeHandle != null) {
            safeHandle.close();
            this.f12544a = null;
        }
    }

    public AudioProcessingOptions getAudioProcessingOptions() {
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(getAudioProcessingOptions(this.f12544a, intRef));
        return new AudioProcessingOptions(intRef);
    }

    public SafeHandle getImpl() {
        return this.f12544a;
    }

    public void setProperty(PropertyId propertyId, String str) {
        this.f12547d.setProperty(propertyId, str);
    }

    public static AudioConfig fromDefaultMicrophoneInput(AudioProcessingOptions audioProcessingOptions) {
        Contracts.throwIfNull(audioProcessingOptions, StubApp.getString2(15992));
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(createAudioInputFromDefaultMicrophone(intRef, audioProcessingOptions.getImpl()));
        return new AudioConfig(intRef);
    }

    public static AudioConfig fromMicrophoneInput(String str, AudioProcessingOptions audioProcessingOptions) {
        Contracts.throwIfNull(str, StubApp.getString2(15993));
        Contracts.throwIfNull(audioProcessingOptions, StubApp.getString2(15992));
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(createAudioInputFromMicrophoneInput(intRef, str, audioProcessingOptions.getImpl()));
        return new AudioConfig(intRef);
    }

    public static AudioConfig fromStreamInput(AudioInputStream audioInputStream, AudioProcessingOptions audioProcessingOptions) {
        Contracts.throwIfNull(audioInputStream, StubApp.getString2(15994));
        Contracts.throwIfNull(audioProcessingOptions, StubApp.getString2(15992));
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(createAudioInputFromStream(intRef, audioInputStream.getImpl(), audioProcessingOptions.getImpl()));
        return new AudioConfig(intRef, audioInputStream);
    }

    public static AudioConfig fromWavFileInput(String str, AudioProcessingOptions audioProcessingOptions) {
        Contracts.throwIfNull(str, StubApp.getString2(4505));
        Contracts.throwIfNull(audioProcessingOptions, StubApp.getString2(15992));
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(createAudioInputFromWavFileName(intRef, str, audioProcessingOptions.getImpl()));
        return new AudioConfig(intRef);
    }

    public void setProperty(String str, String str2) {
        Contracts.throwIfNullOrWhitespace(str, StubApp.getString2(ModuleDescriptor.MODULE_VERSION));
        this.f12547d.setProperty(str, str2);
    }

    public static AudioConfig fromStreamInput(PullAudioInputStreamCallback pullAudioInputStreamCallback) {
        Contracts.throwIfNull(pullAudioInputStreamCallback, StubApp.getString2(696));
        PullAudioInputStream create = PullAudioInputStream.create(pullAudioInputStreamCallback);
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(createAudioInputFromStream(intRef, create.getImpl(), null));
        AudioConfig audioConfig = new AudioConfig(intRef, create);
        audioConfig.f12546c = true;
        return audioConfig;
    }

    public static AudioConfig fromStreamInput(PullAudioInputStreamCallback pullAudioInputStreamCallback, AudioProcessingOptions audioProcessingOptions) {
        Contracts.throwIfNull(pullAudioInputStreamCallback, StubApp.getString2(696));
        Contracts.throwIfNull(audioProcessingOptions, StubApp.getString2(15992));
        PullAudioInputStream create = PullAudioInputStream.create(pullAudioInputStreamCallback);
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(createAudioInputFromStream(intRef, create.getImpl(), audioProcessingOptions.getImpl()));
        AudioConfig audioConfig = new AudioConfig(intRef, create);
        audioConfig.f12546c = true;
        return audioConfig;
    }

    public AudioConfig(IntRef intRef, AudioInputStream audioInputStream) {
        this(intRef);
        this.f12545b = audioInputStream;
    }
}
