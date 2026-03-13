package androidx.lifecycle;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.n, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class EnumC0439n {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC0439n f9913a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC0439n f9914b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0439n f9915c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0439n f9916d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0439n f9917e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumC0439n[] f9918f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f9919g;

    static {
        EnumC0439n enumC0439n = new EnumC0439n("DESTROYED", 0);
        f9913a = enumC0439n;
        EnumC0439n enumC0439n2 = new EnumC0439n("INITIALIZED", 1);
        f9914b = enumC0439n2;
        EnumC0439n enumC0439n3 = new EnumC0439n("CREATED", 2);
        f9915c = enumC0439n3;
        EnumC0439n enumC0439n4 = new EnumC0439n("STARTED", 3);
        f9916d = enumC0439n4;
        EnumC0439n enumC0439n5 = new EnumC0439n("RESUMED", 4);
        f9917e = enumC0439n5;
        EnumC0439n[] enumC0439nArr = {enumC0439n, enumC0439n2, enumC0439n3, enumC0439n4, enumC0439n5};
        f9918f = enumC0439nArr;
        f9919g = EnumEntriesKt.enumEntries(enumC0439nArr);
    }

    public static EnumC0439n valueOf(String str) {
        return (EnumC0439n) Enum.valueOf(EnumC0439n.class, str);
    }

    public static EnumC0439n[] values() {
        return (EnumC0439n[]) f9918f.clone();
    }

    public final boolean a(EnumC0439n state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return compareTo(state) >= 0;
    }
}
