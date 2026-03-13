package com.microsoft.cognitiveservices.speech.dialog;

import com.microsoft.cognitiveservices.speech.PropertyId;
import com.microsoft.cognitiveservices.speech.ServicePropertyChannel;
import com.microsoft.cognitiveservices.speech.SpeechConfig;
import com.microsoft.cognitiveservices.speech.util.SafeHandle;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class DialogServiceConfig extends SpeechConfig implements AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f12575a;

    static {
        try {
            Class.forName(SpeechConfig.class.getName());
        } catch (ClassNotFoundException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public DialogServiceConfig(long j) {
        super(j);
        this.f12575a = false;
    }

    @Override // com.microsoft.cognitiveservices.speech.SpeechConfig, java.lang.AutoCloseable
    public void close() {
        if (this.f12575a) {
            return;
        }
        super.close();
        this.f12575a = true;
    }

    @Override // com.microsoft.cognitiveservices.speech.SpeechConfig
    public SafeHandle getImpl() {
        return super.getImpl();
    }

    public String getLanguage() {
        return getSpeechRecognitionLanguage();
    }

    @Override // com.microsoft.cognitiveservices.speech.SpeechConfig
    public String getProperty(PropertyId propertyId) {
        return super.getProperty(propertyId);
    }

    public void setLanguage(String str) {
        setSpeechRecognitionLanguage(str);
    }

    @Override // com.microsoft.cognitiveservices.speech.SpeechConfig
    public void setProperty(PropertyId propertyId, String str) {
        super.setProperty(propertyId, str);
    }

    @Override // com.microsoft.cognitiveservices.speech.SpeechConfig
    public void setProxy(String str, int i3, String str2, String str3) {
        super.setProxy(str, i3, str2, str3);
    }

    @Override // com.microsoft.cognitiveservices.speech.SpeechConfig
    public void setServiceProperty(String str, String str2, ServicePropertyChannel servicePropertyChannel) {
        super.setServiceProperty(str, str2, servicePropertyChannel);
    }

    @Override // com.microsoft.cognitiveservices.speech.SpeechConfig
    public String getProperty(String str) {
        return super.getProperty(str);
    }

    @Override // com.microsoft.cognitiveservices.speech.SpeechConfig
    public void setProperty(String str, String str2) {
        super.setProperty(str, str2);
    }
}
