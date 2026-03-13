package Y2;

import com.stub.StubApp;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f8730a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f8731b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a[] f8732c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f8733d;

    static {
        a aVar = new a(StubApp.getString2(7500), 0);
        f8730a = aVar;
        a aVar2 = new a(StubApp.getString2(7501), 1);
        f8731b = aVar2;
        a[] aVarArr = {aVar, aVar2};
        f8732c = aVarArr;
        f8733d = EnumEntriesKt.enumEntries(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f8732c.clone();
    }
}
