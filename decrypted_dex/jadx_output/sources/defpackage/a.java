package defpackage;

import com.stub.StubApp;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f9225a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f9226b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a[] f9227c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f9228d;

    static {
        a aVar = new a(StubApp.getString2(1315), 0);
        f9225a = aVar;
        a aVar2 = new a(StubApp.getString2(1958), 1);
        f9226b = aVar2;
        a[] aVarArr = {aVar, aVar2};
        f9227c = aVarArr;
        f9228d = EnumEntriesKt.enumEntries(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f9227c.clone();
    }
}
