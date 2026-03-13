package com.microsoft.cognitiveservices.speech;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.mapbox.common.b;
import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.microsoft.cognitiveservices.speech.util.IntRef;
import com.microsoft.cognitiveservices.speech.util.SafeHandle;
import com.microsoft.cognitiveservices.speech.util.SafeHandleType;
import com.stub.StubApp;
import java.net.URI;
import p0.AbstractC1482f;
import x2.InterfaceC1906a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class SpeechConfig implements AutoCloseable {
    public static Class<?> speechConfigClass;
    private boolean disposed;
    private PropertyCollection propertyHandle;
    private SafeHandle speechConfigHandle;
    private InterfaceC1906a tokenCredential;

    static {
        boolean equals = System.getProperty(StubApp.getString2(15900)).equals(StubApp.getString2(15901));
        try {
            try {
                Class.forName(StubApp.getString2("15902")).getMethod("loadNativeBinding", new Class[0]).invoke(null, new Object[0]);
            } catch (Throwable th) {
                if (!equals) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            if (!equals) {
                String i3 = AbstractC1482f.i(StubApp.getString2(15905), th2.getClass().getCanonicalName(), StubApp.getString2(994), th2.getMessage());
                System.err.println(i3);
                throw new UnsupportedOperationException(i3);
            }
            System.loadLibrary(StubApp.getString2(15903));
            System.loadLibrary(StubApp.getString2(15904));
        }
        setTempDirectory(System.getProperty(StubApp.getString2(15716)));
        speechConfigClass = SpeechConfig.class;
    }

    public SpeechConfig(long j) {
        this.speechConfigHandle = null;
        this.propertyHandle = null;
        this.disposed = false;
        Contracts.throwIfNull(j, StubApp.getString2(15661));
        this.speechConfigHandle = new SafeHandle(j, SafeHandleType.SpeechConfig);
        IntRef intRef = new IntRef(0L);
        PropertyCollection c10 = b.c(getPropertyBag(this.speechConfigHandle, intRef), intRef);
        this.propertyHandle = c10;
        c10.setProperty(StubApp.getString2(15906), StubApp.getString2(15907));
    }

    private static final native long fromAuthorizationToken(IntRef intRef, String str, String str2);

    public static SpeechConfig fromAuthorizationToken(String str, String str2) {
        Contracts.throwIfNullOrWhitespace(str, StubApp.getString2(15908));
        Contracts.throwIfNullOrWhitespace(str2, StubApp.getString2(2051));
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(fromAuthorizationToken(intRef, str, str2));
        return new SpeechConfig(intRef.getValue());
    }

    private static final native long fromEndpoint(IntRef intRef, String str, String str2);

    public static SpeechConfig fromEndpoint(URI uri) {
        Contracts.throwIfNull(uri, StubApp.getString2(15909));
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(fromEndpoint(intRef, uri.toString(), null));
        return new SpeechConfig(intRef.getValue());
    }

    private static final native long fromHost(IntRef intRef, String str, String str2);

    public static SpeechConfig fromHost(URI uri) {
        Contracts.throwIfNull(uri, StubApp.getString2(5873));
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(fromHost(intRef, uri.toString(), null));
        return new SpeechConfig(intRef.getValue());
    }

    private static final native long fromSubscription(IntRef intRef, String str, String str2);

    public static SpeechConfig fromSubscription(String str, String str2) {
        Contracts.throwIfIllegalSubscriptionKey(str, StubApp.getString2(15910));
        Contracts.throwIfNullOrWhitespace(str2, StubApp.getString2(2051));
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(fromSubscription(intRef, str, str2));
        return new SpeechConfig(intRef.getValue());
    }

    private final native long getPropertyBag(SafeHandle safeHandle, IntRef intRef);

    private final native long setAudioOutputFormat(SafeHandle safeHandle, int i3);

    private final native long setProfanity(SafeHandle safeHandle, int i3);

    private final native long setServiceProperty(SafeHandle safeHandle, String str, String str2, int i3);

    private static final native void setTempDirectory(String str);

    @Override // java.lang.AutoCloseable
    public void close() {
        if (this.disposed) {
            return;
        }
        PropertyCollection propertyCollection = this.propertyHandle;
        if (propertyCollection != null) {
            propertyCollection.close();
            this.propertyHandle = null;
        }
        SafeHandle safeHandle = this.speechConfigHandle;
        if (safeHandle != null) {
            safeHandle.close();
            this.speechConfigHandle = null;
        }
        this.disposed = true;
    }

    public void enableAudioLogging() {
        this.propertyHandle.setProperty(PropertyId.SpeechServiceConnection_EnableAudioLogging, StubApp.getString2(6547));
    }

    public void enableDictation() {
        this.propertyHandle.setProperty(PropertyId.SpeechServiceConnection_RecoMode, StubApp.getString2(15912));
    }

    public String getAuthorizationToken() {
        return this.propertyHandle.getProperty(PropertyId.SpeechServiceAuthorization_Token);
    }

    public String getEndpointId() {
        return this.propertyHandle.getProperty(PropertyId.SpeechServiceConnection_EndpointId);
    }

    public SafeHandle getImpl() {
        return this.speechConfigHandle;
    }

    public OutputFormat getOutputFormat() {
        return this.propertyHandle.getProperty(PropertyId.SpeechServiceResponse_RequestDetailedResultTrueFalse).equals(StubApp.getString2(6547)) ? OutputFormat.Detailed : OutputFormat.Simple;
    }

    public String getProperty(PropertyId propertyId) {
        return this.propertyHandle.getProperty(propertyId);
    }

    public String getSpeechRecognitionLanguage() {
        return this.propertyHandle.getProperty(PropertyId.SpeechServiceConnection_RecoLanguage);
    }

    public String getSpeechSynthesisLanguage() {
        return this.propertyHandle.getProperty(PropertyId.SpeechServiceConnection_SynthLanguage);
    }

    public String getSpeechSynthesisOutputFormat() {
        return this.propertyHandle.getProperty(PropertyId.SpeechServiceConnection_SynthOutputFormat);
    }

    public String getSpeechSynthesisVoiceName() {
        return this.propertyHandle.getProperty(PropertyId.SpeechServiceConnection_SynthVoice);
    }

    public InterfaceC1906a getTokenCredential() {
        return null;
    }

    public void requestWordLevelTimestamps() {
        this.propertyHandle.setProperty(PropertyId.SpeechServiceResponse_RequestWordLevelTimestamps, StubApp.getString2(6547));
    }

    public void setAuthorizationToken(String str) {
        Contracts.throwIfNullOrWhitespace(str, StubApp.getString2(1061));
        this.propertyHandle.setProperty(PropertyId.SpeechServiceAuthorization_Token, str);
    }

    public void setEndpointId(String str) {
        Contracts.throwIfNullOrWhitespace(str, StubApp.getString2(1061));
        this.propertyHandle.setProperty(PropertyId.SpeechServiceConnection_EndpointId, str);
    }

    public void setOutputFormat(OutputFormat outputFormat) {
        this.propertyHandle.setProperty(PropertyId.SpeechServiceResponse_RequestDetailedResultTrueFalse, outputFormat == OutputFormat.Detailed ? StubApp.getString2(6547) : StubApp.getString2(9372));
    }

    public void setProfanity(ProfanityOption profanityOption) {
        Contracts.throwIfFail(setProfanity(this.speechConfigHandle, profanityOption.getValue()));
    }

    public void setProperty(PropertyId propertyId, String str) {
        this.propertyHandle.setProperty(propertyId, str);
    }

    public void setProxy(String str, int i3, String str2, String str3) {
        Contracts.throwIfNullOrWhitespace(str, StubApp.getString2(15913));
        Contracts.throwIfNull(str2, StubApp.getString2(15914));
        Contracts.throwIfNull(str3, StubApp.getString2(15915));
        if (i3 <= 0) {
            throw new IllegalArgumentException(StubApp.getString2(15916));
        }
        this.propertyHandle.setProperty(PropertyId.SpeechServiceConnection_ProxyHostName, str);
        this.propertyHandle.setProperty(PropertyId.SpeechServiceConnection_ProxyPort, Integer.toString(i3));
        if (str2 != "") {
            this.propertyHandle.setProperty(PropertyId.SpeechServiceConnection_ProxyUserName, str2);
        }
        if (str3 != "") {
            this.propertyHandle.setProperty(PropertyId.SpeechServiceConnection_ProxyPassword, str3);
        }
    }

    public void setServiceProperty(String str, String str2, ServicePropertyChannel servicePropertyChannel) {
        Contracts.throwIfNullOrWhitespace(str, StubApp.getString2(ModuleDescriptor.MODULE_VERSION));
        Contracts.throwIfNullOrWhitespace(str2, StubApp.getString2(1061));
        Contracts.throwIfFail(setServiceProperty(this.speechConfigHandle, str, str2, servicePropertyChannel.getValue()));
    }

    public void setSpeechRecognitionLanguage(String str) {
        Contracts.throwIfNullOrWhitespace(str, StubApp.getString2(1061));
        this.propertyHandle.setProperty(PropertyId.SpeechServiceConnection_RecoLanguage, str);
    }

    public void setSpeechSynthesisLanguage(String str) {
        Contracts.throwIfNullOrWhitespace(str, StubApp.getString2(1061));
        this.propertyHandle.setProperty(PropertyId.SpeechServiceConnection_SynthLanguage, str);
    }

    public void setSpeechSynthesisOutputFormat(SpeechSynthesisOutputFormat speechSynthesisOutputFormat) {
        Contracts.throwIfFail(setAudioOutputFormat(this.speechConfigHandle, speechSynthesisOutputFormat.getValue()));
    }

    public void setSpeechSynthesisVoiceName(String str) {
        Contracts.throwIfNullOrWhitespace(str, StubApp.getString2(1061));
        this.propertyHandle.setProperty(PropertyId.SpeechServiceConnection_SynthVoice, str);
    }

    public static SpeechConfig fromEndpoint(URI uri, String str) {
        Contracts.throwIfNull(uri, StubApp.getString2(15909));
        if (str == null) {
            throw new NullPointerException(StubApp.getString2(15910));
        }
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(fromEndpoint(intRef, uri.toString(), str));
        return new SpeechConfig(intRef.getValue());
    }

    public static SpeechConfig fromHost(URI uri, String str) {
        Contracts.throwIfNull(uri, StubApp.getString2(5873));
        if (str == null) {
            throw new NullPointerException(StubApp.getString2(15910));
        }
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(fromHost(intRef, uri.toString(), str));
        return new SpeechConfig(intRef.getValue());
    }

    public String getProperty(String str) {
        return this.propertyHandle.getProperty(str);
    }

    public void setProperty(String str, String str2) {
        Contracts.throwIfNullOrWhitespace(str, StubApp.getString2(ModuleDescriptor.MODULE_VERSION));
        this.propertyHandle.setProperty(str, str2);
    }

    public static SpeechConfig fromEndpoint(URI uri, InterfaceC1906a interfaceC1906a) {
        Contracts.throwIfNull(uri, StubApp.getString2(15909));
        Contracts.throwIfNull(interfaceC1906a, StubApp.getString2(15911));
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(fromEndpoint(intRef, uri.toString(), null));
        return new SpeechConfig(intRef.getValue(), interfaceC1906a);
    }

    public SpeechConfig(long j, InterfaceC1906a interfaceC1906a) {
        this(j);
    }
}
