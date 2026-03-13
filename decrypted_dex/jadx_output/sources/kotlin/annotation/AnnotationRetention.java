package kotlin.annotation;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/annotation/AnnotationRetention;", "", "<init>", "(Ljava/lang/String;I)V", "SOURCE", "BINARY", "RUNTIME", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class AnnotationRetention {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AnnotationRetention[] $VALUES;
    public static final AnnotationRetention SOURCE = new AnnotationRetention("SOURCE", 0);
    public static final AnnotationRetention BINARY = new AnnotationRetention("BINARY", 1);
    public static final AnnotationRetention RUNTIME = new AnnotationRetention("RUNTIME", 2);

    private static final /* synthetic */ AnnotationRetention[] $values() {
        return new AnnotationRetention[]{SOURCE, BINARY, RUNTIME};
    }

    static {
        AnnotationRetention[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private AnnotationRetention(String str, int i3) {
    }

    public static EnumEntries<AnnotationRetention> getEntries() {
        return $ENTRIES;
    }

    public static AnnotationRetention valueOf(String str) {
        return (AnnotationRetention) Enum.valueOf(AnnotationRetention.class, str);
    }

    public static AnnotationRetention[] values() {
        return (AnnotationRetention[]) $VALUES.clone();
    }
}
