package V2;

import com.stub.StubApp;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f7740a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ h[] f7741b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f7742c;

    static {
        h hVar = new h(StubApp.getString2(6505), 0);
        f7740a = hVar;
        h[] hVarArr = {hVar, new h(StubApp.getString2(6506), 1), new h(StubApp.getString2(6507), 2), new h(StubApp.getString2(3191), 3)};
        f7741b = hVarArr;
        f7742c = EnumEntriesKt.enumEntries(hVarArr);
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f7741b.clone();
    }
}
