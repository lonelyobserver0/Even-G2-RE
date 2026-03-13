package com.even.translate.azure.basic;

import com.stub.StubApp;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0012B!\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0013"}, d2 = {"Lcom/even/translate/azure/basic/Codec;", "", "bitsPerSample", "", "mimeType", "", "fileExtension", "<init>", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V", "getBitsPerSample", "()I", "getMimeType", "()Ljava/lang/String;", "getFileExtension", "PCM16", "PCM24", "PCM32", "AAC", "Companion", "translate_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class Codec {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Codec[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int bitsPerSample;
    private final String fileExtension;
    private final String mimeType;
    public static final Codec PCM16 = new Codec(StubApp.getString2(6505), 0, 16, StubApp.getString2(10120), StubApp.getString2(10121));
    public static final Codec PCM24 = new Codec(StubApp.getString2(6506), 1, 24, StubApp.getString2(10120), StubApp.getString2(10121));
    public static final Codec PCM32 = new Codec(StubApp.getString2(6507), 2, 32, StubApp.getString2(10120), StubApp.getString2(10121));
    public static final Codec AAC = new Codec(StubApp.getString2(3191), 3, 16, StubApp.getString2(10122), StubApp.getString2(10119));

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/even/translate/azure/basic/Codec$Companion;", "", "<init>", "()V", "fromString", "Lcom/even/translate/azure/basic/Codec;", "string", "", "translate_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Codec fromString(String string) {
            Intrinsics.checkNotNullParameter(string, "string");
            switch (string.hashCode()) {
                case 96323:
                    if (string.equals(StubApp.getString2(10119))) {
                        return Codec.AAC;
                    }
                    return null;
                case 106489983:
                    if (string.equals(StubApp.getString2(10118))) {
                        return Codec.PCM16;
                    }
                    return null;
                case 106490012:
                    if (string.equals(StubApp.getString2(10117))) {
                        return Codec.PCM24;
                    }
                    return null;
                case 106490041:
                    if (string.equals(StubApp.getString2(10116))) {
                        return Codec.PCM32;
                    }
                    return null;
                default:
                    return null;
            }
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ Codec[] $values() {
        return new Codec[]{PCM16, PCM24, PCM32, AAC};
    }

    static {
        Codec[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private Codec(String str, int i3, int i10, String str2, String str3) {
        this.bitsPerSample = i10;
        this.mimeType = str2;
        this.fileExtension = str3;
    }

    public static EnumEntries<Codec> getEntries() {
        return $ENTRIES;
    }

    public static Codec valueOf(String str) {
        return (Codec) Enum.valueOf(Codec.class, str);
    }

    public static Codec[] values() {
        return (Codec[]) $VALUES.clone();
    }

    public final int getBitsPerSample() {
        return this.bitsPerSample;
    }

    public final String getFileExtension() {
        return this.fileExtension;
    }

    public final String getMimeType() {
        return this.mimeType;
    }
}
