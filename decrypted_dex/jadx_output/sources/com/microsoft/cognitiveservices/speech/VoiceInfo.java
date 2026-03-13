package com.microsoft.cognitiveservices.speech;

import com.mapbox.common.b;
import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.microsoft.cognitiveservices.speech.util.IntRef;
import com.microsoft.cognitiveservices.speech.util.SafeHandle;
import com.microsoft.cognitiveservices.speech.util.SafeHandleType;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class VoiceInfo implements AutoCloseable {
    private SynthesisVoiceGender gender;
    private String localName;
    private String locale;
    private String name;
    private PropertyCollection properties;
    private String shortName;
    private SynthesisVoiceStatus status;
    private List<String> styleList;
    private SafeHandle voiceInfoHandle;
    private String voicePath;
    private SynthesisVoiceType voiceType;

    public VoiceInfo(IntRef intRef) {
        this.voiceInfoHandle = null;
        Contracts.throwIfNull(intRef, StubApp.getString2(1890));
        SafeHandle safeHandle = new SafeHandle(intRef.getValue(), SafeHandleType.VoiceInfo);
        this.voiceInfoHandle = safeHandle;
        this.name = getName(safeHandle);
        this.locale = getLocale(this.voiceInfoHandle);
        this.shortName = getShortName(this.voiceInfoHandle);
        this.localName = getLocalName(this.voiceInfoHandle);
        Contracts.throwIfFail(getVoiceType(this.voiceInfoHandle, new IntRef(0L)));
        this.voiceType = SynthesisVoiceType.values()[((int) r6.getValue()) - 1];
        String styleListString = getStyleListString(this.voiceInfoHandle);
        this.styleList = styleListString.isEmpty() ? new ArrayList<>() : Arrays.asList(styleListString.split(StubApp.getString2(3048)));
        this.voicePath = getVoicePath(this.voiceInfoHandle);
        IntRef intRef2 = new IntRef(0L);
        PropertyCollection c10 = b.c(getPropertyBagFromResult(this.voiceInfoHandle, intRef2), intRef2);
        this.properties = c10;
        String property = c10.getProperty(StubApp.getString2(15987));
        this.gender = property.equals(StubApp.getString2(15976)) ? SynthesisVoiceGender.Female : property.equals(StubApp.getString2(15977)) ? SynthesisVoiceGender.Male : property.equals(StubApp.getString2(15978)) ? SynthesisVoiceGender.Neutral : SynthesisVoiceGender.Unknown;
        String property2 = this.properties.getProperty(StubApp.getString2(15988));
        this.status = property2.equals(StubApp.getString2(4695)) ? SynthesisVoiceStatus.GeneralAvailability : property2.equals(StubApp.getString2(15980)) ? SynthesisVoiceStatus.Preview : property2.equals(StubApp.getString2(15981)) ? SynthesisVoiceStatus.Deprecated : SynthesisVoiceStatus.Unknown;
    }

    private final native String getLocalName(SafeHandle safeHandle);

    private final native String getLocale(SafeHandle safeHandle);

    private final native String getName(SafeHandle safeHandle);

    private final native long getPropertyBagFromResult(SafeHandle safeHandle, IntRef intRef);

    private final native String getShortName(SafeHandle safeHandle);

    private final native String getStyleListString(SafeHandle safeHandle);

    private final native String getVoicePath(SafeHandle safeHandle);

    private final native long getVoiceType(SafeHandle safeHandle, IntRef intRef);

    @Override // java.lang.AutoCloseable
    public void close() {
        SafeHandle safeHandle = this.voiceInfoHandle;
        if (safeHandle != null) {
            safeHandle.close();
            this.voiceInfoHandle = null;
        }
        PropertyCollection propertyCollection = this.properties;
        if (propertyCollection != null) {
            propertyCollection.close();
            this.properties = null;
        }
    }

    public SynthesisVoiceGender getGender() {
        return this.gender;
    }

    public SafeHandle getImpl() {
        return this.voiceInfoHandle;
    }

    public String getLocalName() {
        return this.localName;
    }

    public String getLocale() {
        return this.locale;
    }

    public String getName() {
        return this.name;
    }

    public PropertyCollection getProperties() {
        return this.properties;
    }

    public String getShortName() {
        return this.shortName;
    }

    public SynthesisVoiceStatus getStatus() {
        return this.status;
    }

    public List<String> getStyleList() {
        return this.styleList;
    }

    public String getVoicePath() {
        return this.voicePath;
    }

    public SynthesisVoiceType getVoiceType() {
        return this.voiceType;
    }
}
