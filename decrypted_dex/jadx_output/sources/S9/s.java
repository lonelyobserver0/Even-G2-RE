package S9;

import com.stub.StubApp;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class s {

    /* renamed from: b, reason: collision with root package name */
    public static final s f6665b;

    /* renamed from: c, reason: collision with root package name */
    public static final s f6666c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ s[] f6667d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f6668e;

    /* renamed from: a, reason: collision with root package name */
    public final String f6669a;

    static {
        s sVar = new s(StubApp.getString2(6074), 0, StubApp.getString2(6073));
        f6665b = sVar;
        s sVar2 = new s(StubApp.getString2(6076), 1, StubApp.getString2(6075));
        f6666c = sVar2;
        s[] sVarArr = {sVar, sVar2};
        f6667d = sVarArr;
        f6668e = EnumEntriesKt.enumEntries(sVarArr);
    }

    public s(String str, int i3, String str2) {
        this.f6669a = str2;
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f6667d.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f6669a;
    }
}
