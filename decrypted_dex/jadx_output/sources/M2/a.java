package M2;

import com.stub.StubApp;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import u5.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final d f4512a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a[] f4513b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f4514c;

    static {
        a[] aVarArr = {new a(StubApp.getString2(3490), 0)};
        f4513b = aVarArr;
        f4514c = EnumEntriesKt.enumEntries(aVarArr);
        f4512a = new d(13);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f4513b.clone();
    }
}
