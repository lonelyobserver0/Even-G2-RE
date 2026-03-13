package X2;

import com.stub.StubApp;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    public static final C2.i f8288b;

    /* renamed from: c, reason: collision with root package name */
    public static final j f8289c;

    /* renamed from: d, reason: collision with root package name */
    public static final j f8290d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ j[] f8291e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f8292f;

    /* renamed from: a, reason: collision with root package name */
    public final int f8293a;

    static {
        j jVar = new j(StubApp.getString2(7084), 0, 0);
        f8289c = jVar;
        j jVar2 = new j(StubApp.getString2(7085), 1, 1);
        f8290d = jVar2;
        j[] jVarArr = {jVar, jVar2};
        f8291e = jVarArr;
        f8292f = EnumEntriesKt.enumEntries(jVarArr);
        f8288b = new C2.i();
    }

    public j(String str, int i3, int i10) {
        this.f8293a = i10;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f8291e.clone();
    }
}
