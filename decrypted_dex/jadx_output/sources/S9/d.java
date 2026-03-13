package S9;

import com.stub.StubApp;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static final d f6614b;

    /* renamed from: c, reason: collision with root package name */
    public static final d f6615c;

    /* renamed from: d, reason: collision with root package name */
    public static final d f6616d;

    /* renamed from: e, reason: collision with root package name */
    public static final d f6617e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ d[] f6618f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f6619g;

    /* renamed from: a, reason: collision with root package name */
    public final int f6620a;

    static {
        d dVar = new d(StubApp.getString2(6030), 0, 0);
        f6614b = dVar;
        d dVar2 = new d(StubApp.getString2(6031), 1, 1);
        f6615c = dVar2;
        d dVar3 = new d(StubApp.getString2(6032), 2, 2);
        f6616d = dVar3;
        d dVar4 = new d(StubApp.getString2(6033), 3, 5);
        f6617e = dVar4;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4};
        f6618f = dVarArr;
        f6619g = EnumEntriesKt.enumEntries(dVarArr);
    }

    public d(String str, int i3, int i10) {
        this.f6620a = i10;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f6618f.clone();
    }

    public final i a() {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return i.j;
        }
        if (ordinal == 1) {
            return i.f6632k;
        }
        if (ordinal == 2) {
            return i.f6634m;
        }
        if (ordinal == 3) {
            return i.f6630h;
        }
        throw new NoWhenBranchMatchedException();
    }
}
