package t6;

import android.media.AudioDeviceInfo;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* renamed from: t6.d, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1737d {

    /* renamed from: a, reason: collision with root package name */
    public final String f21187a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21188b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21189c;

    /* renamed from: d, reason: collision with root package name */
    public final AudioDeviceInfo f21190d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f21191e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f21192f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f21193g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f21194h;

    /* renamed from: i, reason: collision with root package name */
    public final C2.a f21195i;
    public final boolean j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f21196k;

    /* renamed from: l, reason: collision with root package name */
    public final int f21197l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f21198m;

    /* renamed from: n, reason: collision with root package name */
    public final int f21199n;

    /* renamed from: o, reason: collision with root package name */
    public final Integer f21200o;

    /* renamed from: p, reason: collision with root package name */
    public final int f21201p;

    /* renamed from: q, reason: collision with root package name */
    public final EnumC1735b f21202q;

    /* renamed from: r, reason: collision with root package name */
    public final EnumC1734a f21203r;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public C1737d(String str, String encoder, int i3, int i10, int i11, AudioDeviceInfo audioDeviceInfo, boolean z2, boolean z10, boolean z11, boolean z12, C2.a aVar, boolean z13, boolean z14, int i12, boolean z15, int i13, int i14, Integer num) {
        EnumC1734a enumC1734a;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        this.f21187a = str;
        this.f21188b = i3;
        this.f21189c = i10;
        this.f21190d = audioDeviceInfo;
        this.f21191e = z2;
        this.f21192f = z10;
        this.f21193g = z11;
        this.f21194h = z12;
        this.f21195i = aVar;
        this.j = z13;
        this.f21196k = z14;
        this.f21197l = i12;
        this.f21198m = z15;
        this.f21199n = i13;
        this.f21200o = num;
        this.f21201p = RangesKt.coerceAtMost(2, RangesKt.coerceAtLeast(1, i11));
        this.f21202q = i14 != 0 ? i14 != 1 ? i14 != 2 ? EnumC1735b.f21177b : EnumC1735b.f21178c : EnumC1735b.f21177b : EnumC1735b.f21176a;
        switch (encoder.hashCode()) {
            case -1425339046:
                if (encoder.equals(StubApp.getString2(23486))) {
                    enumC1734a = EnumC1734a.f21167b;
                    break;
                }
                enumC1734a = EnumC1734a.f21166a;
                break;
            case -422529531:
                if (encoder.equals(StubApp.getString2(23485))) {
                    enumC1734a = EnumC1734a.f21172g;
                    break;
                }
                enumC1734a = EnumC1734a.f21166a;
                break;
            case 117484:
                if (encoder.equals(StubApp.getString2(23484))) {
                    enumC1734a = EnumC1734a.j;
                    break;
                }
                enumC1734a = EnumC1734a.f21166a;
                break;
            case 3145576:
                if (encoder.equals(StubApp.getString2(21505))) {
                    enumC1734a = EnumC1734a.f21171f;
                    break;
                }
                enumC1734a = EnumC1734a.f21166a;
                break;
            case 3418175:
                if (encoder.equals(StubApp.getString2(3207))) {
                    enumC1734a = EnumC1734a.f21173h;
                    break;
                }
                enumC1734a = EnumC1734a.f21166a;
                break;
            case 92568736:
                if (encoder.equals(StubApp.getString2(23483))) {
                    enumC1734a = EnumC1734a.f21168c;
                    break;
                }
                enumC1734a = EnumC1734a.f21166a;
                break;
            case 92568858:
                if (encoder.equals(StubApp.getString2(8298))) {
                    enumC1734a = EnumC1734a.f21166a;
                    break;
                }
                enumC1734a = EnumC1734a.f21166a;
                break;
            case 92940826:
                if (encoder.equals(StubApp.getString2(23482))) {
                    enumC1734a = EnumC1734a.f21169d;
                    break;
                }
                enumC1734a = EnumC1734a.f21166a;
                break;
            case 92941105:
                if (encoder.equals(StubApp.getString2(23481))) {
                    enumC1734a = EnumC1734a.f21170e;
                    break;
                }
                enumC1734a = EnumC1734a.f21166a;
                break;
            default:
                enumC1734a = EnumC1734a.f21166a;
                break;
        }
        this.f21203r = enumC1734a;
    }
}
