package C2;

import D5.C0043g;
import E0.w;
import H0.I;
import H0.InterfaceC0061d;
import H0.InterfaceC0062e;
import Kc.C0101h;
import Kc.C0104k;
import Kc.y;
import T0.InterfaceC0317h;
import W4.s;
import android.content.Context;
import android.graphics.Path;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import com.mapbox.geojson.Point;
import com.stub.StubApp;
import i0.InterfaceC1029b;
import java.io.File;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.UByte;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class i implements C0.p, w, E6.b, InterfaceC0061d, H1.c, K3.a, O1.b, InterfaceC0317h, W4.e, a4.c, a5.a, InterfaceC1029b {

    /* renamed from: a, reason: collision with root package name */
    public static i f1075a;

    /* renamed from: b, reason: collision with root package name */
    public static i f1076b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ i f1077c = new i();

    public static final String r(byte[] bArr, byte[][] bArr2, int i3) {
        int i10;
        boolean z2;
        int i11;
        int i12;
        int i13 = -1;
        byte[] bArr3 = PublicSuffixDatabase.f18654e;
        int length = bArr.length;
        int i14 = 0;
        while (i14 < length) {
            int i15 = (i14 + length) / 2;
            while (i15 > i13 && bArr[i15] != 10) {
                i15 += i13;
            }
            int i16 = i15 + 1;
            int i17 = 1;
            while (true) {
                i10 = i16 + i17;
                if (bArr[i10] == 10) {
                    break;
                }
                i17++;
            }
            int i18 = i10 - i16;
            int i19 = i3;
            boolean z10 = false;
            int i20 = 0;
            int i21 = 0;
            while (true) {
                if (z10) {
                    i11 = 46;
                    z2 = false;
                } else {
                    byte b2 = bArr2[i19][i20];
                    byte[] bArr4 = xc.b.f23179a;
                    int i22 = b2 & UByte.MAX_VALUE;
                    z2 = z10;
                    i11 = i22;
                }
                byte b10 = bArr[i16 + i21];
                byte[] bArr5 = xc.b.f23179a;
                i12 = i11 - (b10 & UByte.MAX_VALUE);
                if (i12 != 0) {
                    break;
                }
                i21++;
                i20++;
                if (i21 == i18) {
                    break;
                }
                if (bArr2[i19].length != i20) {
                    z10 = z2;
                } else {
                    if (i19 == bArr2.length - 1) {
                        break;
                    }
                    i19++;
                    z10 = true;
                    i20 = -1;
                }
            }
            if (i12 >= 0) {
                if (i12 <= 0) {
                    int i23 = i18 - i21;
                    int length2 = bArr2[i19].length - i20;
                    int length3 = bArr2.length;
                    for (int i24 = i19 + 1; i24 < length3; i24++) {
                        length2 += bArr2[i24].length;
                    }
                    if (length2 >= i23) {
                        if (length2 <= i23) {
                            Charset UTF_8 = StandardCharsets.UTF_8;
                            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
                            return new String(bArr, i16, i18, UTF_8);
                        }
                    }
                }
                i14 = i10 + 1;
                i13 = -1;
            }
            length = i15;
            i13 = -1;
        }
        return null;
    }

    public static final boolean s(y yVar) {
        boolean endsWith;
        y yVar2 = Lc.g.f4407e;
        endsWith = StringsKt__StringsJVMKt.endsWith(yVar.b(), ".class", true);
        return !endsWith;
    }

    public static ArrayList t(List protocols) {
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : protocols) {
            if (((wc.y) obj) != wc.y.f22485b) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.f(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((wc.y) it.next()).f22492a);
        }
        return arrayList2;
    }

    public static byte[] u(List protocols) {
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        C0101h c0101h = new C0101h();
        Iterator it = t(protocols).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            c0101h.Q(str.length());
            c0101h.W(str);
        }
        return c0101h.A(c0101h.f3819b);
    }

    public static y v(String str, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        C0104k c0104k = Lc.c.f4399a;
        Intrinsics.checkNotNullParameter(str, "<this>");
        C0101h c0101h = new C0101h();
        c0101h.W(str);
        return Lc.c.d(c0101h, z2);
    }

    public static y w(File file) {
        String str = y.f3858b;
        Intrinsics.checkNotNullParameter(file, "<this>");
        String file2 = file.toString();
        Intrinsics.checkNotNullExpressionValue(file2, "toString(...)");
        return v(file2, false);
    }

    public static Path x(float f10, float f11, float f12, float f13) {
        Path path = new Path();
        path.moveTo(f10, f11);
        path.lineTo(f12, f13);
        return path;
    }

    public static boolean y() {
        return Intrinsics.areEqual("Dalvik", System.getProperty(StubApp.getString2(1078)));
    }

    @Override // T0.InterfaceC0317h
    public long a(long j) {
        return j;
    }

    @Override // E0.w
    public MediaCodecInfo b(int i3) {
        return MediaCodecList.getCodecInfoAt(i3);
    }

    @Override // H1.c
    public void c(int i3, Serializable serializable) {
        String string2;
        switch (i3) {
            case 1:
                string2 = StubApp.getString2(1088);
                break;
            case 2:
                string2 = StubApp.getString2(1087);
                break;
            case 3:
                string2 = StubApp.getString2(1086);
                break;
            case 4:
                string2 = StubApp.getString2(1085);
                break;
            case 5:
                string2 = StubApp.getString2(1084);
                break;
            case 6:
                string2 = StubApp.getString2(1083);
                break;
            case 7:
                string2 = StubApp.getString2(1082);
                break;
            case 8:
                string2 = StubApp.getString2(1081);
                break;
            case 9:
            default:
                string2 = "";
                break;
            case 10:
                string2 = StubApp.getString2(1080);
                break;
            case 11:
                string2 = StubApp.getString2(1079);
                break;
        }
        String string22 = StubApp.getString2(1089);
        if (i3 == 6 || i3 == 7 || i3 == 8) {
            Log.e(string22, string2, (Throwable) serializable);
        } else {
            Log.d(string22, string2);
        }
    }

    @Override // a4.c
    public R0.d d(Context context, String str, a4.b bVar) {
        R0.d dVar = new R0.d();
        int j = bVar.j(context, str);
        dVar.f5935b = j;
        if (j != 0) {
            dVar.f5937d = -1;
            return dVar;
        }
        int c10 = bVar.c(context, str, true);
        dVar.f5936c = c10;
        if (c10 != 0) {
            dVar.f5937d = 1;
        }
        return dVar;
    }

    @Override // H0.InterfaceC0061d
    public InterfaceC0062e e(int i3) {
        I i10 = new I();
        i10.n(Oc.a.p(i3 * 2));
        return i10;
    }

    @Override // K3.a
    public long f() {
        return SystemClock.elapsedRealtime();
    }

    @Override // H1.c
    public void g() {
        Log.d(StubApp.getString2(1089), StubApp.getString2(1090));
    }

    @Override // W4.e
    public /* synthetic */ Object h(s sVar) {
        T4.a lambda$getComponents$0;
        lambda$getComponents$0 = AnalyticsConnectorRegistrar.lambda$getComponents$0(sVar);
        return lambda$getComponents$0;
    }

    @Override // E6.b
    public Object i(String str) {
        String[] split = str.split(StubApp.getString2(321));
        if (split.length == 2) {
            return Point.fromLngLat(Double.parseDouble(split[0]), Double.parseDouble(split[1]));
        }
        throw new RuntimeException(StubApp.getString2(1091));
    }

    @Override // E0.w
    public boolean j(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return StubApp.getString2(1092).equals(str) && StubApp.getString2(469).equals(str2);
    }

    @Override // C0.p
    public P0.q k(C0.l lVar, C0.i iVar) {
        return new C0.o(lVar, iVar);
    }

    @Override // E0.w
    public boolean l(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // a5.a
    public void m(Bundle bundle) {
        String string2 = StubApp.getString2(280);
        if (Log.isLoggable(string2, 3)) {
            Log.d(string2, StubApp.getString2(1093), null);
        }
    }

    @Override // E0.w
    public int n() {
        return MediaCodecList.getCodecCount();
    }

    @Override // C0.p
    public P0.q o() {
        return new C0.o(C0.l.f970n, null);
    }

    @Override // O1.b
    public O1.c p(O0.l configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return new P1.i((Context) configuration.f5143b, (String) configuration.f5144c, (J1.s) configuration.f5145d, configuration.f5142a);
    }

    @Override // E0.w
    public boolean q() {
        return false;
    }

    public List z(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (W4.b bVar : componentRegistrar.getComponents()) {
            String str = bVar.f8115a;
            if (str != null) {
                C0043g c0043g = new C0043g(9, str, bVar);
                bVar = new W4.b(str, bVar.f8116b, bVar.f8117c, bVar.f8118d, bVar.f8119e, c0043g, bVar.f8121g);
            }
            arrayList.add(bVar);
        }
        return arrayList;
    }
}
