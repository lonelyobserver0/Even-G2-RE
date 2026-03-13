package V2;

import com.stub.StubApp;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f7732a;

    /* renamed from: b, reason: collision with root package name */
    public static final g f7733b;

    /* renamed from: c, reason: collision with root package name */
    public static final g f7734c;

    /* renamed from: d, reason: collision with root package name */
    public static final g f7735d;

    /* renamed from: e, reason: collision with root package name */
    public static final g f7736e;

    /* renamed from: f, reason: collision with root package name */
    public static final g f7737f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ g[] f7738g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f7739h;

    static {
        g gVar = new g(StubApp.getString2(5276), 0);
        f7732a = gVar;
        g gVar2 = new g(StubApp.getString2(6503), 1);
        f7733b = gVar2;
        g gVar3 = new g(StubApp.getString2(5273), 2);
        f7734c = gVar3;
        g gVar4 = new g(StubApp.getString2(2400), 3);
        f7735d = gVar4;
        g gVar5 = new g(StubApp.getString2(6504), 4);
        f7736e = gVar5;
        g gVar6 = new g(StubApp.getString2(3789), 5);
        f7737f = gVar6;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6};
        f7738g = gVarArr;
        f7739h = EnumEntriesKt.enumEntries(gVarArr);
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f7738g.clone();
    }
}
