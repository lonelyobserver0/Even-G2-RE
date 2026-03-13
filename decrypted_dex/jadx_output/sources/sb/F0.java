package sb;

import com.stub.StubApp;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import l4.C1221y;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class F0 {

    /* renamed from: b, reason: collision with root package name */
    public static final C1221y f20855b;

    /* renamed from: c, reason: collision with root package name */
    public static final F0 f20856c;

    /* renamed from: d, reason: collision with root package name */
    public static final F0 f20857d;

    /* renamed from: e, reason: collision with root package name */
    public static final F0 f20858e;

    /* renamed from: f, reason: collision with root package name */
    public static final F0 f20859f;

    /* renamed from: g, reason: collision with root package name */
    public static final F0 f20860g;

    /* renamed from: h, reason: collision with root package name */
    public static final F0 f20861h;
    public static final F0 j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ F0[] f20862k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f20863l;

    /* renamed from: a, reason: collision with root package name */
    public final int f20864a;

    static {
        F0 f02 = new F0(StubApp.getString2(23165), 0, 0);
        f20856c = f02;
        F0 f03 = new F0(StubApp.getString2(23166), 1, 1);
        f20857d = f03;
        F0 f04 = new F0(StubApp.getString2(23167), 2, 2);
        f20858e = f04;
        F0 f05 = new F0(StubApp.getString2(5761), 3, 3);
        f20859f = f05;
        F0 f06 = new F0(StubApp.getString2(23168), 4, 4);
        f20860g = f06;
        F0 f07 = new F0(StubApp.getString2(23169), 5, 5);
        f20861h = f07;
        F0 f08 = new F0(StubApp.getString2(343), 6, 6);
        j = f08;
        F0[] f0Arr = {f02, f03, f04, f05, f06, f07, f08};
        f20862k = f0Arr;
        f20863l = EnumEntriesKt.enumEntries(f0Arr);
        f20855b = new C1221y(25);
    }

    public F0(String str, int i3, int i10) {
        this.f20864a = i10;
    }

    public static F0 valueOf(String str) {
        return (F0) Enum.valueOf(F0.class, str);
    }

    public static F0[] values() {
        return (F0[]) f20862k.clone();
    }
}
