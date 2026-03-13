package com.even.translate.azure.translation;

import com.even.translate.azure.basic.Codec;
import com.stub.StubApp;
import i2.u;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\tHÆ\u0003J\t\u0010.\u001a\u00020\tHÆ\u0003J\t\u0010/\u001a\u00020\tHÆ\u0003J\t\u00100\u001a\u00020\rHÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010#J\u0010\u00102\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010#J\u0010\u00103\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010#J\u008c\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u00105J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020\tHÖ\u0001J\t\u0010:\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0014\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010$\u001a\u0004\b%\u0010#R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010$\u001a\u0004\b&\u0010#¨\u0006;"}, d2 = {"Lcom/even/translate/azure/translation/AzureTranslationConfiguration;", "", "apiKey", "", "region", "sourceLanguage", "targetLanguage", "sessionID", "sampleRate", "", "bitsPerSample", "channels", "codec", "Lcom/even/translate/azure/basic/Codec;", "initialSilenceTimeoutMs", "endSilenceTimeoutMs", "segmentationSilenceTimeoutMs", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILcom/even/translate/azure/basic/Codec;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getApiKey", "()Ljava/lang/String;", "getRegion", "getSourceLanguage", "setSourceLanguage", "(Ljava/lang/String;)V", "getTargetLanguage", "setTargetLanguage", "getSessionID", "getSampleRate", "()I", "getBitsPerSample", "getChannels", "getCodec", "()Lcom/even/translate/azure/basic/Codec;", "getInitialSilenceTimeoutMs", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getEndSilenceTimeoutMs", "getSegmentationSilenceTimeoutMs", "update", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILcom/even/translate/azure/basic/Codec;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/even/translate/azure/translation/AzureTranslationConfiguration;", "equals", "", "other", "hashCode", "toString", "translate_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* data */ class AzureTranslationConfiguration {
    private final String apiKey;
    private final int bitsPerSample;
    private final int channels;
    private final Codec codec;
    private final Integer endSilenceTimeoutMs;
    private final Integer initialSilenceTimeoutMs;
    private final String region;
    private final int sampleRate;
    private final Integer segmentationSilenceTimeoutMs;
    private final String sessionID;
    private String sourceLanguage;
    private String targetLanguage;

    public AzureTranslationConfiguration(String apiKey, String region, String sourceLanguage, String targetLanguage, String sessionID, int i3, int i10, int i11, Codec codec, Integer num, Integer num2, Integer num3) {
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(sourceLanguage, "sourceLanguage");
        Intrinsics.checkNotNullParameter(targetLanguage, "targetLanguage");
        Intrinsics.checkNotNullParameter(sessionID, "sessionID");
        Intrinsics.checkNotNullParameter(codec, "codec");
        this.apiKey = apiKey;
        this.region = region;
        this.sourceLanguage = sourceLanguage;
        this.targetLanguage = targetLanguage;
        this.sessionID = sessionID;
        this.sampleRate = i3;
        this.bitsPerSample = i10;
        this.channels = i11;
        this.codec = codec;
        this.initialSilenceTimeoutMs = num;
        this.endSilenceTimeoutMs = num2;
        this.segmentationSilenceTimeoutMs = num3;
    }

    public static /* synthetic */ AzureTranslationConfiguration copy$default(AzureTranslationConfiguration azureTranslationConfiguration, String str, String str2, String str3, String str4, String str5, int i3, int i10, int i11, Codec codec, Integer num, Integer num2, Integer num3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = azureTranslationConfiguration.apiKey;
        }
        if ((i12 & 2) != 0) {
            str2 = azureTranslationConfiguration.region;
        }
        if ((i12 & 4) != 0) {
            str3 = azureTranslationConfiguration.sourceLanguage;
        }
        if ((i12 & 8) != 0) {
            str4 = azureTranslationConfiguration.targetLanguage;
        }
        if ((i12 & 16) != 0) {
            str5 = azureTranslationConfiguration.sessionID;
        }
        if ((i12 & 32) != 0) {
            i3 = azureTranslationConfiguration.sampleRate;
        }
        if ((i12 & 64) != 0) {
            i10 = azureTranslationConfiguration.bitsPerSample;
        }
        if ((i12 & 128) != 0) {
            i11 = azureTranslationConfiguration.channels;
        }
        if ((i12 & 256) != 0) {
            codec = azureTranslationConfiguration.codec;
        }
        if ((i12 & 512) != 0) {
            num = azureTranslationConfiguration.initialSilenceTimeoutMs;
        }
        if ((i12 & 1024) != 0) {
            num2 = azureTranslationConfiguration.endSilenceTimeoutMs;
        }
        if ((i12 & 2048) != 0) {
            num3 = azureTranslationConfiguration.segmentationSilenceTimeoutMs;
        }
        Integer num4 = num2;
        Integer num5 = num3;
        Codec codec2 = codec;
        Integer num6 = num;
        int i13 = i10;
        int i14 = i11;
        String str6 = str5;
        int i15 = i3;
        return azureTranslationConfiguration.copy(str, str2, str3, str4, str6, i15, i13, i14, codec2, num6, num4, num5);
    }

    public static /* synthetic */ AzureTranslationConfiguration update$default(AzureTranslationConfiguration azureTranslationConfiguration, String str, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = null;
        }
        if ((i3 & 2) != 0) {
            str2 = null;
        }
        return azureTranslationConfiguration.update(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getApiKey() {
        return this.apiKey;
    }

    /* renamed from: component10, reason: from getter */
    public final Integer getInitialSilenceTimeoutMs() {
        return this.initialSilenceTimeoutMs;
    }

    /* renamed from: component11, reason: from getter */
    public final Integer getEndSilenceTimeoutMs() {
        return this.endSilenceTimeoutMs;
    }

    /* renamed from: component12, reason: from getter */
    public final Integer getSegmentationSilenceTimeoutMs() {
        return this.segmentationSilenceTimeoutMs;
    }

    /* renamed from: component2, reason: from getter */
    public final String getRegion() {
        return this.region;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSourceLanguage() {
        return this.sourceLanguage;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTargetLanguage() {
        return this.targetLanguage;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSessionID() {
        return this.sessionID;
    }

    /* renamed from: component6, reason: from getter */
    public final int getSampleRate() {
        return this.sampleRate;
    }

    /* renamed from: component7, reason: from getter */
    public final int getBitsPerSample() {
        return this.bitsPerSample;
    }

    /* renamed from: component8, reason: from getter */
    public final int getChannels() {
        return this.channels;
    }

    /* renamed from: component9, reason: from getter */
    public final Codec getCodec() {
        return this.codec;
    }

    public final AzureTranslationConfiguration copy(String apiKey, String region, String sourceLanguage, String targetLanguage, String sessionID, int sampleRate, int bitsPerSample, int channels, Codec codec, Integer initialSilenceTimeoutMs, Integer endSilenceTimeoutMs, Integer segmentationSilenceTimeoutMs) {
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(region, StubApp.getString2(2051));
        Intrinsics.checkNotNullParameter(sourceLanguage, StubApp.getString2(10046));
        Intrinsics.checkNotNullParameter(targetLanguage, StubApp.getString2(10047));
        Intrinsics.checkNotNullParameter(sessionID, StubApp.getString2(6304));
        Intrinsics.checkNotNullParameter(codec, StubApp.getString2(10048));
        return new AzureTranslationConfiguration(apiKey, region, sourceLanguage, targetLanguage, sessionID, sampleRate, bitsPerSample, channels, codec, initialSilenceTimeoutMs, endSilenceTimeoutMs, segmentationSilenceTimeoutMs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AzureTranslationConfiguration)) {
            return false;
        }
        AzureTranslationConfiguration azureTranslationConfiguration = (AzureTranslationConfiguration) other;
        return Intrinsics.areEqual(this.apiKey, azureTranslationConfiguration.apiKey) && Intrinsics.areEqual(this.region, azureTranslationConfiguration.region) && Intrinsics.areEqual(this.sourceLanguage, azureTranslationConfiguration.sourceLanguage) && Intrinsics.areEqual(this.targetLanguage, azureTranslationConfiguration.targetLanguage) && Intrinsics.areEqual(this.sessionID, azureTranslationConfiguration.sessionID) && this.sampleRate == azureTranslationConfiguration.sampleRate && this.bitsPerSample == azureTranslationConfiguration.bitsPerSample && this.channels == azureTranslationConfiguration.channels && this.codec == azureTranslationConfiguration.codec && Intrinsics.areEqual(this.initialSilenceTimeoutMs, azureTranslationConfiguration.initialSilenceTimeoutMs) && Intrinsics.areEqual(this.endSilenceTimeoutMs, azureTranslationConfiguration.endSilenceTimeoutMs) && Intrinsics.areEqual(this.segmentationSilenceTimeoutMs, azureTranslationConfiguration.segmentationSilenceTimeoutMs);
    }

    public final String getApiKey() {
        return this.apiKey;
    }

    public final int getBitsPerSample() {
        return this.bitsPerSample;
    }

    public final int getChannels() {
        return this.channels;
    }

    public final Codec getCodec() {
        return this.codec;
    }

    public final Integer getEndSilenceTimeoutMs() {
        return this.endSilenceTimeoutMs;
    }

    public final Integer getInitialSilenceTimeoutMs() {
        return this.initialSilenceTimeoutMs;
    }

    public final String getRegion() {
        return this.region;
    }

    public final int getSampleRate() {
        return this.sampleRate;
    }

    public final Integer getSegmentationSilenceTimeoutMs() {
        return this.segmentationSilenceTimeoutMs;
    }

    public final String getSessionID() {
        return this.sessionID;
    }

    public final String getSourceLanguage() {
        return this.sourceLanguage;
    }

    public final String getTargetLanguage() {
        return this.targetLanguage;
    }

    public int hashCode() {
        int hashCode = (this.codec.hashCode() + E1.a.e(this.channels, E1.a.e(this.bitsPerSample, E1.a.e(this.sampleRate, u.d(u.d(u.d(u.d(this.apiKey.hashCode() * 31, 31, this.region), 31, this.sourceLanguage), 31, this.targetLanguage), 31, this.sessionID), 31), 31), 31)) * 31;
        Integer num = this.initialSilenceTimeoutMs;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.endSilenceTimeoutMs;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.segmentationSilenceTimeoutMs;
        return hashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    public final void setSourceLanguage(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sourceLanguage = str;
    }

    public final void setTargetLanguage(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.targetLanguage = str;
    }

    public String toString() {
        String str = this.apiKey;
        String str2 = this.region;
        String str3 = this.sourceLanguage;
        String str4 = this.targetLanguage;
        String str5 = this.sessionID;
        int i3 = this.sampleRate;
        int i10 = this.bitsPerSample;
        int i11 = this.channels;
        Codec codec = this.codec;
        Integer num = this.initialSilenceTimeoutMs;
        Integer num2 = this.endSilenceTimeoutMs;
        Integer num3 = this.segmentationSilenceTimeoutMs;
        StringBuilder t3 = u.t(StubApp.getString2(10123), str, StubApp.getString2(2250), str2, StubApp.getString2(10124));
        E1.a.v(t3, str3, StubApp.getString2(10125), str4, StubApp.getString2(6817));
        t3.append(str5);
        t3.append(StubApp.getString2(6818));
        t3.append(i3);
        t3.append(StubApp.getString2(6819));
        t3.append(i10);
        t3.append(StubApp.getString2(6820));
        t3.append(i11);
        t3.append(StubApp.getString2(6821));
        t3.append(codec);
        t3.append(StubApp.getString2(10126));
        t3.append(num);
        t3.append(StubApp.getString2(10127));
        t3.append(num2);
        t3.append(StubApp.getString2(6822));
        t3.append(num3);
        t3.append(StubApp.getString2(74));
        return t3.toString();
    }

    public final AzureTranslationConfiguration update(String sourceLanguage, String targetLanguage) {
        return copy$default(this, null, null, sourceLanguage == null ? this.sourceLanguage : sourceLanguage, targetLanguage == null ? this.targetLanguage : targetLanguage, null, 0, 0, 0, null, null, null, null, 4083, null);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ AzureTranslationConfiguration(java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, int r21, int r22, int r23, com.even.translate.azure.basic.Codec r24, java.lang.Integer r25, java.lang.Integer r26, java.lang.Integer r27, int r28, kotlin.jvm.internal.DefaultConstructorMarker r29) {
        /*
            r15 = this;
            r0 = r28
            r1 = r0 & 32
            if (r1 == 0) goto La
            r1 = 16000(0x3e80, float:2.2421E-41)
            r8 = r1
            goto Lc
        La:
            r8 = r21
        Lc:
            r1 = r0 & 64
            if (r1 == 0) goto L14
            r1 = 16
            r9 = r1
            goto L16
        L14:
            r9 = r22
        L16:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L1d
            r1 = 1
            r10 = r1
            goto L1f
        L1d:
            r10 = r23
        L1f:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L27
            com.even.translate.azure.basic.Codec r1 = com.even.translate.azure.basic.Codec.PCM16
            r11 = r1
            goto L29
        L27:
            r11 = r24
        L29:
            r1 = r0 & 512(0x200, float:7.17E-43)
            r2 = 0
            if (r1 == 0) goto L30
            r12 = r2
            goto L32
        L30:
            r12 = r25
        L32:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L38
            r13 = r2
            goto L3a
        L38:
            r13 = r26
        L3a:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L4b
            r14 = r2
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r2 = r15
            goto L58
        L4b:
            r14 = r27
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
        L58:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.even.translate.azure.translation.AzureTranslationConfiguration.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, int, com.even.translate.azure.basic.Codec, java.lang.Integer, java.lang.Integer, java.lang.Integer, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
