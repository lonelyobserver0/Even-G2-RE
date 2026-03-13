package f4;

import R3.InterfaceC0242k;
import S3.InterfaceC0278l;
import S3.S;
import T0.G;
import aa.C0398e;
import android.app.PendingIntent;
import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Window;
import com.google.android.gms.location.LocationAvailability;
import com.google.gson.Gson;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.HttpRequestError;
import com.mapbox.common.UploadOptions;
import com.stub.StubApp;
import h6.C1009a;
import i4.AbstractC1047k;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import l1.C1140c;
import l1.C1141d;
import l1.C1142e;
import l4.C1200n0;
import l4.F1;
import l4.J1;
import l4.P0;
import l4.U;
import m6.C1274b;
import m6.InterfaceC1273a;
import n.InterfaceC1351n;
import o0.C1406C;
import o0.C1431f;
import org.bouncycastle.asn1.x509.DisplayText;
import q0.C1503a;
import q0.C1504b;
import q1.C1505a;
import q4.InterfaceC1521b;
import r0.AbstractC1550k;
import r0.AbstractC1560u;
import r0.C1553n;
import r0.InterfaceC1542c;
import r5.C1571d;
import r5.C1572e;
import v0.C1803F;
import z8.C2016a;

/* renamed from: f4.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final /* synthetic */ class C0879c implements R3.n, InterfaceC1521b, InterfaceC0242k, q4.g, m.w, J1, U, Expected.Action, InterfaceC1273a, InterfaceC1351n, q4.f, q1.l {

    /* renamed from: a, reason: collision with root package name */
    public final Object f13742a;

    public /* synthetic */ C0879c(Object obj) {
        this.f13742a = obj;
    }

    @Override // l4.J1
    public void a(String str, String str2, Bundle bundle) {
        boolean isEmpty = TextUtils.isEmpty(str);
        P0 p02 = (P0) this.f13742a;
        if (!isEmpty) {
            p02.getClass();
            throw new IllegalStateException(StubApp.getString2(3565));
        }
        ((C1200n0) p02.f4728a).f16545l.getClass();
        p02.p(StubApp.getString2(3305), StubApp.getString2(11891), bundle, true, true, System.currentTimeMillis());
    }

    @Override // R3.n
    public void accept(Object obj, Object obj2) {
        R3.o oVar = new R3.o(new C0877a((q4.k) obj2));
        F f10 = (F) ((C0874B) obj).t();
        Parcel g10 = f10.g();
        g.b(g10, (PendingIntent) this.f13742a);
        g10.writeStrongBinder(oVar);
        f10.L(g10, 73);
    }

    @Override // m.w
    public void b(m.l lVar, boolean z2) {
        ((i.v) this.f13742a).r(lVar);
    }

    @Override // q4.g
    public void c() {
        try {
            S s10 = (S) ((InterfaceC0278l) this.f13742a);
            Parcel g10 = s10.g();
            try {
                s10.f10820f.transact(2, g10, null, 1);
            } finally {
                g10.recycle();
            }
        } catch (RemoteException unused) {
        }
    }

    @Override // l4.U
    public /* synthetic */ void d(String str, int i3, IOException iOException, byte[] bArr, Map map) {
        ((F1) this.f13742a).z(str, i3, iOException, bArr, map);
    }

    @Override // q4.InterfaceC1521b
    public /* synthetic */ Object e(q4.j jVar) {
        boolean isSuccessful = jVar.isSuccessful();
        q4.k kVar = (q4.k) this.f13742a;
        if (isSuccessful) {
            kVar.d((Location) jVar.getResult());
            return null;
        }
        Exception exception = jVar.getException();
        Objects.requireNonNull(exception);
        kVar.c(exception);
        return null;
    }

    @Override // m6.InterfaceC1273a
    public void f(List list) {
    }

    @Override // m6.InterfaceC1273a
    public void h(C1274b c1274b) {
        ((m6.h) this.f13742a).f17095b.f12260a.i();
        C0398e c0398e = ((m6.h) this.f13742a).f17102i;
        synchronized (c0398e) {
            if (c0398e.f9343a) {
                c0398e.r();
            }
        }
        ((m6.h) this.f13742a).j.post(new com.even.translate.a(15, this, c1274b));
    }

    @Override // q4.f
    public /* bridge */ /* synthetic */ void i(Object obj) {
        ((q4.g) this.f13742a).c();
    }

    public void j(int i3, boolean z2) {
        C0398e c0398e = (C0398e) this.f13742a;
        if (z2) {
            c0398e.c(i3);
        } else {
            c0398e.getClass();
        }
    }

    public void k(String name, String value) {
        CharSequence trim;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        ArrayList arrayList = (ArrayList) this.f13742a;
        arrayList.add(name);
        trim = StringsKt__StringsKt.trim((CharSequence) value);
        arrayList.add(trim.toString());
    }

    @Override // R3.InterfaceC0242k
    public /* synthetic */ void l(Object obj) {
        ((AbstractC1047k) obj).onLocationAvailability((LocationAvailability) this.f13742a);
    }

    @Override // m.w
    public boolean m(m.l lVar) {
        Window.Callback callback = ((i.v) this.f13742a).f14671m.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(108, lVar);
        return true;
    }

    @Override // q1.l
    public void n(byte[] bArr, int i3, int i10, q1.k kVar, InterfaceC1542c interfaceC1542c) {
        C1504b a3;
        C1553n c1553n = (C1553n) this.f13742a;
        c1553n.E(i3 + i10, bArr);
        c1553n.G(i3);
        ArrayList arrayList = new ArrayList();
        while (c1553n.a() > 0) {
            AbstractC1550k.b(StubApp.getString2(17449), c1553n.a() >= 8);
            int h2 = c1553n.h();
            if (c1553n.h() == 1987343459) {
                int i11 = h2 - 8;
                CharSequence charSequence = null;
                C1503a c1503a = null;
                while (i11 > 0) {
                    AbstractC1550k.b(StubApp.getString2(17450), i11 >= 8);
                    int h4 = c1553n.h();
                    int h5 = c1553n.h();
                    int i12 = h4 - 8;
                    byte[] bArr2 = c1553n.f20176a;
                    int i13 = c1553n.f20177b;
                    int i14 = AbstractC1560u.f20190a;
                    String str = new String(bArr2, i13, i12, StandardCharsets.UTF_8);
                    c1553n.H(i12);
                    i11 = (i11 - 8) - i12;
                    if (h5 == 1937011815) {
                        y1.g gVar = new y1.g();
                        y1.h.e(str, gVar);
                        c1503a = gVar.a();
                    } else if (h5 == 1885436268) {
                        charSequence = y1.h.f(null, str.trim(), Collections.EMPTY_LIST);
                    }
                }
                if (charSequence == null) {
                    charSequence = "";
                }
                if (c1503a != null) {
                    c1503a.f19809a = charSequence;
                    a3 = c1503a.a();
                } else {
                    Pattern pattern = y1.h.f23484a;
                    y1.g gVar2 = new y1.g();
                    gVar2.f23476c = charSequence;
                    a3 = gVar2.a().a();
                }
                arrayList.add(a3);
            } else {
                c1553n.H(h2 - 8);
            }
        }
        interfaceC1542c.accept(new C1505a(arrayList, -9223372036854775807L, -9223372036854775807L));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void o(int i3, int i10, T0.l lVar) {
        int i11;
        int i12;
        int i13;
        long j;
        int i14;
        int i15;
        int i16;
        int i17;
        C1141d c1141d = (C1141d) this.f13742a;
        SparseArray sparseArray = c1141d.f15817c;
        int i18 = 0;
        int i19 = 1;
        if (i3 != 161 && i3 != 163) {
            if (i3 == 165) {
                if (c1141d.f15795I != 2) {
                    return;
                }
                C1140c c1140c = (C1140c) sparseArray.get(c1141d.f15801O);
                if (c1141d.f15804R != 4 || !StubApp.getString2(17452).equals(c1140c.f15758b)) {
                    lVar.u(i10);
                    return;
                }
                C1553n c1553n = c1141d.f15831p;
                c1553n.D(i10);
                lVar.e(c1553n.f20176a, 0, i10, false);
                return;
            }
            if (i3 == 16877) {
                c1141d.d(i3);
                C1140c c1140c2 = c1141d.f15838w;
                int i20 = c1140c2.f15763g;
                if (i20 != 1685485123 && i20 != 1685480259) {
                    lVar.u(i10);
                    return;
                }
                byte[] bArr = new byte[i10];
                c1140c2.f15745O = bArr;
                lVar.e(bArr, 0, i10, false);
                return;
            }
            if (i3 == 16981) {
                c1141d.d(i3);
                byte[] bArr2 = new byte[i10];
                c1141d.f15838w.f15765i = bArr2;
                lVar.e(bArr2, 0, i10, false);
                return;
            }
            if (i3 == 18402) {
                byte[] bArr3 = new byte[i10];
                lVar.e(bArr3, 0, i10, false);
                c1141d.d(i3);
                c1141d.f15838w.j = new G(1, bArr3, 0, 0);
                return;
            }
            if (i3 == 21419) {
                C1553n c1553n2 = c1141d.f15826k;
                Arrays.fill(c1553n2.f20176a, (byte) 0);
                lVar.e(c1553n2.f20176a, 4 - i10, i10, false);
                c1553n2.G(0);
                c1141d.f15840y = (int) c1553n2.w();
                return;
            }
            if (i3 == 25506) {
                c1141d.d(i3);
                byte[] bArr4 = new byte[i10];
                c1141d.f15838w.f15766k = bArr4;
                lVar.e(bArr4, 0, i10, false);
                return;
            }
            if (i3 != 30322) {
                throw C1406C.a(StubApp.getString2(17451) + i3, null);
            }
            c1141d.d(i3);
            byte[] bArr5 = new byte[i10];
            c1141d.f15838w.f15778w = bArr5;
            lVar.e(bArr5, 0, i10, false);
            return;
        }
        int i21 = c1141d.f15795I;
        C1553n c1553n3 = c1141d.f15825i;
        if (i21 == 0) {
            C1142e c1142e = c1141d.f15815b;
            c1141d.f15801O = (int) c1142e.c(lVar, false, true, 8);
            c1141d.f15802P = c1142e.f15845c;
            c1141d.f15797K = -9223372036854775807L;
            c1141d.f15795I = 1;
            c1553n3.D(0);
        }
        C1140c c1140c3 = (C1140c) sparseArray.get(c1141d.f15801O);
        if (c1140c3 == null) {
            lVar.u(i10 - c1141d.f15802P);
            c1141d.f15795I = 0;
            return;
        }
        c1140c3.f15755Y.getClass();
        if (c1141d.f15795I == 1) {
            c1141d.j(lVar, 3);
            int i22 = (c1553n3.f20176a[2] & 6) >> 1;
            int i23 = 255;
            if (i22 == 0) {
                c1141d.f15799M = 1;
                int[] iArr = c1141d.f15800N;
                if (iArr == null) {
                    iArr = new int[1];
                } else if (iArr.length < 1) {
                    iArr = new int[Math.max(iArr.length * 2, 1)];
                }
                c1141d.f15800N = iArr;
                iArr[0] = (i10 - c1141d.f15802P) - 3;
            } else {
                c1141d.j(lVar, 4);
                int i24 = (c1553n3.f20176a[3] & 255) + 1;
                c1141d.f15799M = i24;
                int[] iArr2 = c1141d.f15800N;
                if (iArr2 == null) {
                    iArr2 = new int[i24];
                } else if (iArr2.length < i24) {
                    iArr2 = new int[Math.max(iArr2.length * 2, i24)];
                }
                c1141d.f15800N = iArr2;
                if (i22 == 2) {
                    int i25 = (i10 - c1141d.f15802P) - 4;
                    int i26 = c1141d.f15799M;
                    Arrays.fill(iArr2, 0, i26, i25 / i26);
                } else {
                    if (i22 != 1) {
                        if (i22 != 3) {
                            throw C1406C.a(StubApp.getString2(17455) + i22, null);
                        }
                        int i27 = 0;
                        int i28 = 0;
                        int i29 = 4;
                        while (true) {
                            int i30 = c1141d.f15799M - i19;
                            if (i27 >= i30) {
                                i12 = i18;
                                i11 = i19;
                                c1141d.f15800N[i30] = ((i10 - c1141d.f15802P) - i29) - i28;
                                break;
                            }
                            c1141d.f15800N[i27] = i18;
                            int i31 = i29 + 1;
                            c1141d.j(lVar, i31);
                            if (c1553n3.f20176a[i29] == 0) {
                                throw C1406C.a(StubApp.getString2(17454), null);
                            }
                            int i32 = i19;
                            int i33 = i18;
                            while (true) {
                                if (i33 >= 8) {
                                    i13 = i18;
                                    j = 0;
                                    i14 = i31;
                                    break;
                                }
                                int i34 = i32 << (7 - i33);
                                i13 = i18;
                                if ((c1553n3.f20176a[i29] & i34) != 0) {
                                    i14 = i31 + i33;
                                    c1141d.j(lVar, i14);
                                    j = c1553n3.f20176a[i29] & i23 & (~i34);
                                    while (i31 < i14) {
                                        j = (j << 8) | (c1553n3.f20176a[i31] & i23);
                                        i31++;
                                        i23 = 255;
                                    }
                                    if (i27 > 0) {
                                        j -= (1 << ((i33 * 7) + 6)) - 1;
                                    }
                                } else {
                                    i33++;
                                    i18 = i13;
                                    i23 = 255;
                                }
                            }
                            if (j < -2147483648L || j > 2147483647L) {
                                break;
                            }
                            int i35 = (int) j;
                            int[] iArr3 = c1141d.f15800N;
                            if (i27 != 0) {
                                i35 += iArr3[i27 - 1];
                            }
                            iArr3[i27] = i35;
                            i28 += i35;
                            i27++;
                            i29 = i14;
                            i19 = i32;
                            i18 = i13;
                            i23 = 255;
                        }
                        throw C1406C.a(StubApp.getString2(17453), null);
                    }
                    int i36 = 0;
                    int i37 = 0;
                    int i38 = 4;
                    while (true) {
                        i15 = c1141d.f15799M - 1;
                        if (i36 >= i15) {
                            break;
                        }
                        c1141d.f15800N[i36] = 0;
                        while (true) {
                            i16 = i38 + 1;
                            c1141d.j(lVar, i16);
                            int i39 = c1553n3.f20176a[i38] & 255;
                            int[] iArr4 = c1141d.f15800N;
                            i17 = iArr4[i36] + i39;
                            iArr4[i36] = i17;
                            if (i39 != 255) {
                                break;
                            } else {
                                i38 = i16;
                            }
                        }
                        i37 += i17;
                        i36++;
                        i38 = i16;
                    }
                    c1141d.f15800N[i15] = ((i10 - c1141d.f15802P) - i38) - i37;
                }
            }
            i12 = 0;
            i11 = 1;
            byte[] bArr6 = c1553n3.f20176a;
            c1141d.f15796J = c1141d.l((bArr6[i11] & UByte.MAX_VALUE) | (bArr6[i12] << 8)) + c1141d.f15790D;
            c1141d.f15803Q = (c1140c3.f15760d == 2 || (i3 == 163 && (c1553n3.f20176a[2] & ByteCompanionObject.MIN_VALUE) == 128)) ? i11 : i12;
            c1141d.f15795I = 2;
            c1141d.f15798L = i12;
        } else {
            i11 = 1;
        }
        if (i3 == 163) {
            while (true) {
                int i40 = c1141d.f15798L;
                if (i40 >= c1141d.f15799M) {
                    c1141d.f15795I = 0;
                    return;
                } else {
                    c1141d.e(c1140c3, c1141d.f15796J + ((c1141d.f15798L * c1140c3.f15761e) / 1000), c1141d.f15803Q, c1141d.m(lVar, c1140c3, c1141d.f15800N[i40], false), 0);
                    c1141d.f15798L++;
                }
            }
        } else {
            while (true) {
                int i41 = c1141d.f15798L;
                if (i41 >= c1141d.f15799M) {
                    return;
                }
                int[] iArr5 = c1141d.f15800N;
                boolean z2 = i11;
                iArr5[i41] = c1141d.m(lVar, c1140c3, iArr5[i41], z2);
                c1141d.f15798L += z2 ? 1 : 0;
            }
        }
    }

    @Override // q1.l
    public int p() {
        return 2;
    }

    public wc.s q() {
        Object[] array = ((ArrayList) this.f13742a).toArray(new String[0]);
        if (array != null) {
            return new wc.s((String[]) array);
        }
        throw new NullPointerException(StubApp.getString2(11601));
    }

    public String r(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            C1571d c1571d = (C1571d) this.f13742a;
            C1572e c1572e = new C1572e(stringWriter, c1571d.f20349a, c1571d.f20350b, c1571d.f20351c, c1571d.f20352d);
            c1572e.g(obj);
            c1572e.i();
            c1572e.f20354b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    @Override // com.mapbox.bindgen.Expected.Action
    public void run(Object obj) {
        HttpRequestError error = (HttpRequestError) obj;
        Intrinsics.checkNotNullParameter(error, "error");
        Gson gson = j8.d.f15378b;
        c7.f.f(StubApp.getString2(6616) + ((UploadOptions) this.f13742a).getFilePath() + StubApp.getString2(17456) + error);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008e A[LOOP:0: B:11:0x0088->B:13:0x008e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object s(java.util.List r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof m8.x
            if (r0 == 0) goto L13
            r0 = r7
            m8.x r0 = (m8.x) r0
            int r1 = r0.f17262d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17262d = r1
            goto L18
        L13:
            m8.x r0 = new m8.x
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f17260b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f17262d
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L2b
            java.util.List r6 = r0.f17259a
            kotlin.ResultKt.throwOnFailure(r7)
            goto L6f
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r7 = 275(0x113, float:3.85E-43)
            java.lang.String r7 = com.stub.StubApp.getString2(r7)
            r6.<init>(r7)
            throw r6
        L38:
            kotlin.ResultKt.throwOnFailure(r7)
            boolean r7 = r6.isEmpty()
            if (r7 != 0) goto Lac
            r0.f17259a = r6
            r0.f17262d = r3
            java.lang.Object r7 = r5.f13742a
            m8.v r7 = (m8.v) r7
            java.lang.Object r2 = r7.f17253b
            u8.i r2 = (u8.i) r2
            if (r2 != 0) goto L6b
            Qb.k r2 = new Qb.k
            kotlin.coroutines.Continuation r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r0)
            r2.<init>(r3, r4)
            r2.s()
            r7.f17254c = r2
            java.lang.Object r7 = r2.r()
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r7 != r2) goto L6c
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r0)
            goto L6c
        L6b:
            r7 = r2
        L6c:
            if (r7 != r1) goto L6f
            return r1
        L6f:
            u8.i r7 = (u8.i) r7
            java.lang.Object r0 = kotlin.collections.CollectionsKt.first(r6)
            com.mapbox.navigation.base.route.g r0 = (com.mapbox.navigation.base.route.g) r0
            java.util.List r6 = kotlin.collections.CollectionsKt.drop(r6, r3)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = kotlin.collections.CollectionsKt.f(r6)
            r1.<init>(r2)
            java.util.Iterator r6 = r6.iterator()
        L88:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto La4
            java.lang.Object r2 = r6.next()
            com.mapbox.navigation.base.route.g r2 = (com.mapbox.navigation.base.route.g) r2
            java.util.LinkedHashMap r3 = r7.f21471b
            java.lang.String r4 = r2.f12506i
            java.lang.Object r3 = r3.get(r4)
            kotlin.Pair r2 = kotlin.TuplesKt.to(r2, r3)
            r1.add(r2)
            goto L88
        La4:
            m8.w r6 = new m8.w
            u8.h r7 = r7.f21470a
            r6.<init>(r0, r7, r1)
            return r6
        Lac:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r7 = 17457(0x4431, float:2.4462E-41)
            java.lang.String r7 = com.stub.StubApp.getString2(r7)
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.C0879c.s(java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public void t(int i3, long j) {
        C1141d c1141d = (C1141d) this.f13742a;
        c1141d.getClass();
        String string2 = StubApp.getString2(17458);
        if (i3 == 20529) {
            if (j == 0) {
                return;
            }
            throw C1406C.a(StubApp.getString2(17465) + j + string2, null);
        }
        if (i3 == 20530) {
            if (j == 1) {
                return;
            }
            throw C1406C.a(StubApp.getString2(17464) + j + string2, null);
        }
        switch (i3) {
            case 131:
                c1141d.d(i3);
                c1141d.f15838w.f15760d = (int) j;
                return;
            case 136:
                c1141d.d(i3);
                c1141d.f15838w.f15753W = j == 1;
                return;
            case 155:
                c1141d.f15797K = c1141d.l(j);
                return;
            case 159:
                c1141d.d(i3);
                c1141d.f15838w.f15746P = (int) j;
                return;
            case 176:
                c1141d.d(i3);
                c1141d.f15838w.f15768m = (int) j;
                return;
            case 179:
                c1141d.a(i3);
                c1141d.f15791E.c(c1141d.l(j));
                return;
            case 186:
                c1141d.d(i3);
                c1141d.f15838w.f15769n = (int) j;
                return;
            case 215:
                c1141d.d(i3);
                c1141d.f15838w.f15759c = (int) j;
                return;
            case 231:
                c1141d.f15790D = c1141d.l(j);
                return;
            case 238:
                c1141d.f15804R = (int) j;
                return;
            case 241:
                if (c1141d.f15793G) {
                    return;
                }
                c1141d.a(i3);
                c1141d.f15792F.c(j);
                c1141d.f15793G = true;
                return;
            case 251:
                c1141d.f15805S = true;
                return;
            case 16871:
                c1141d.d(i3);
                c1141d.f15838w.f15763g = (int) j;
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                throw C1406C.a(StubApp.getString2(17463) + j + string2, null);
            case 17029:
                if (j < 1 || j > 2) {
                    throw C1406C.a(StubApp.getString2(17462) + j + string2, null);
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                throw C1406C.a(StubApp.getString2(17461) + j + string2, null);
            case 18401:
                if (j == 5) {
                    return;
                }
                throw C1406C.a(StubApp.getString2(17460) + j + string2, null);
            case 18408:
                if (j == 1) {
                    return;
                }
                throw C1406C.a(StubApp.getString2(17459) + j + string2, null);
            case 21420:
                c1141d.f15841z = j + c1141d.f15834s;
                return;
            case 21432:
                int i10 = (int) j;
                c1141d.d(i3);
                if (i10 == 0) {
                    c1141d.f15838w.f15779x = 0;
                    return;
                }
                if (i10 == 1) {
                    c1141d.f15838w.f15779x = 2;
                    return;
                } else if (i10 == 3) {
                    c1141d.f15838w.f15779x = 1;
                    return;
                } else {
                    if (i10 != 15) {
                        return;
                    }
                    c1141d.f15838w.f15779x = 3;
                    return;
                }
            case 21680:
                c1141d.d(i3);
                c1141d.f15838w.f15771p = (int) j;
                return;
            case 21682:
                c1141d.d(i3);
                c1141d.f15838w.f15773r = (int) j;
                return;
            case 21690:
                c1141d.d(i3);
                c1141d.f15838w.f15772q = (int) j;
                return;
            case 21930:
                c1141d.d(i3);
                c1141d.f15838w.f15752V = j == 1;
                return;
            case 21938:
                c1141d.d(i3);
                C1140c c1140c = c1141d.f15838w;
                c1140c.f15780y = true;
                c1140c.f15770o = (int) j;
                return;
            case 21998:
                c1141d.d(i3);
                c1141d.f15838w.f15762f = (int) j;
                return;
            case 22186:
                c1141d.d(i3);
                c1141d.f15838w.f15749S = j;
                return;
            case 22203:
                c1141d.d(i3);
                c1141d.f15838w.f15750T = j;
                return;
            case 25188:
                c1141d.d(i3);
                c1141d.f15838w.f15747Q = (int) j;
                return;
            case 30114:
                c1141d.f15806T = j;
                return;
            case 30321:
                c1141d.d(i3);
                int i11 = (int) j;
                if (i11 == 0) {
                    c1141d.f15838w.f15774s = 0;
                    return;
                }
                if (i11 == 1) {
                    c1141d.f15838w.f15774s = 1;
                    return;
                } else if (i11 == 2) {
                    c1141d.f15838w.f15774s = 2;
                    return;
                } else {
                    if (i11 != 3) {
                        return;
                    }
                    c1141d.f15838w.f15774s = 3;
                    return;
                }
            case 2352003:
                c1141d.d(i3);
                c1141d.f15838w.f15761e = (int) j;
                return;
            case 2807729:
                c1141d.f15835t = j;
                return;
            default:
                switch (i3) {
                    case 21945:
                        c1141d.d(i3);
                        int i12 = (int) j;
                        if (i12 == 1) {
                            c1141d.f15838w.f15732B = 2;
                            return;
                        } else {
                            if (i12 != 2) {
                                return;
                            }
                            c1141d.f15838w.f15732B = 1;
                            return;
                        }
                    case 21946:
                        c1141d.d(i3);
                        int g10 = C1431f.g((int) j);
                        if (g10 != -1) {
                            c1141d.f15838w.f15731A = g10;
                            return;
                        }
                        return;
                    case 21947:
                        c1141d.d(i3);
                        c1141d.f15838w.f15780y = true;
                        int f10 = C1431f.f((int) j);
                        if (f10 != -1) {
                            c1141d.f15838w.f15781z = f10;
                            return;
                        }
                        return;
                    case 21948:
                        c1141d.d(i3);
                        c1141d.f15838w.f15733C = (int) j;
                        return;
                    case 21949:
                        c1141d.d(i3);
                        c1141d.f15838w.f15734D = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    public void u(String name) {
        boolean equals;
        Intrinsics.checkNotNullParameter(name, "name");
        int i3 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.f13742a;
            if (i3 >= arrayList.size()) {
                return;
            }
            equals = StringsKt__StringsJVMKt.equals(name, (String) arrayList.get(i3), true);
            if (equals) {
                arrayList.remove(i3);
                arrayList.remove(i3);
                i3 -= 2;
            }
            i3 += 2;
        }
    }

    public void v(long j, int i3, long j3) {
        C1141d c1141d = (C1141d) this.f13742a;
        AbstractC1550k.h(c1141d.f15820d0);
        if (i3 == 160) {
            c1141d.f15805S = false;
            c1141d.f15806T = 0L;
            return;
        }
        if (i3 != 174) {
            if (i3 == 187) {
                c1141d.f15793G = false;
                return;
            }
            if (i3 == 19899) {
                c1141d.f15840y = -1;
                c1141d.f15841z = -1L;
                return;
            }
            if (i3 == 20533) {
                c1141d.d(i3);
                c1141d.f15838w.f15764h = true;
                return;
            }
            if (i3 == 21968) {
                c1141d.d(i3);
                c1141d.f15838w.f15780y = true;
                return;
            }
            if (i3 == 408125543) {
                long j10 = c1141d.f15834s;
                if (j10 != -1 && j10 != j) {
                    throw C1406C.a(StubApp.getString2(17466), null);
                }
                c1141d.f15834s = j;
                c1141d.f15833r = j3;
                return;
            }
            if (i3 == 475249515) {
                c1141d.f15791E = new E0.x(8, false);
                c1141d.f15792F = new E0.x(8, false);
                return;
            } else {
                if (i3 == 524531317 && !c1141d.f15839x) {
                    if (c1141d.f15819d && c1141d.f15788B != -1) {
                        c1141d.f15787A = true;
                        return;
                    } else {
                        c1141d.f15820d0.D(new T0.t(c1141d.f15837v));
                        c1141d.f15839x = true;
                        return;
                    }
                }
                return;
            }
        }
        C1140c c1140c = new C1140c();
        c1140c.f15768m = -1;
        c1140c.f15769n = -1;
        c1140c.f15770o = -1;
        c1140c.f15771p = -1;
        c1140c.f15772q = -1;
        c1140c.f15773r = 0;
        c1140c.f15774s = -1;
        c1140c.f15775t = 0.0f;
        c1140c.f15776u = 0.0f;
        c1140c.f15777v = 0.0f;
        c1140c.f15778w = null;
        c1140c.f15779x = -1;
        c1140c.f15780y = false;
        c1140c.f15781z = -1;
        c1140c.f15731A = -1;
        c1140c.f15732B = -1;
        c1140c.f15733C = 1000;
        c1140c.f15734D = DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE;
        c1140c.f15735E = -1.0f;
        c1140c.f15736F = -1.0f;
        c1140c.f15737G = -1.0f;
        c1140c.f15738H = -1.0f;
        c1140c.f15739I = -1.0f;
        c1140c.f15740J = -1.0f;
        c1140c.f15741K = -1.0f;
        c1140c.f15742L = -1.0f;
        c1140c.f15743M = -1.0f;
        c1140c.f15744N = -1.0f;
        c1140c.f15746P = 1;
        c1140c.f15747Q = -1;
        c1140c.f15748R = 8000;
        c1140c.f15749S = 0L;
        c1140c.f15750T = 0L;
        c1140c.f15753W = true;
        c1140c.f15754X = StubApp.getString2(6956);
        c1141d.f15838w = c1140c;
    }

    public C0879c(P0 p02) {
        Objects.requireNonNull(p02);
        this.f13742a = p02;
    }

    public C0879c(m8.v routesProgressDataProvider) {
        Intrinsics.checkNotNullParameter(routesProgressDataProvider, "routesProgressDataProvider");
        this.f13742a = routesProgressDataProvider;
    }

    public C0879c(C1803F congestionRangeGroup) {
        C2016a aheadDistanceCalculator = new C2016a();
        Intrinsics.checkNotNullParameter(congestionRangeGroup, "congestionRangeGroup");
        Intrinsics.checkNotNullParameter(aheadDistanceCalculator, "aheadDistanceCalculator");
        this.f13742a = congestionRangeGroup;
        new E9.q(this, 3);
    }

    public C0879c(int i3) {
        switch (i3) {
            case 17:
                this.f13742a = new C0398e(10, false);
                break;
            case 21:
                this.f13742a = new ConcurrentHashMap();
                break;
            case 22:
                this.f13742a = new ArrayList(20);
                break;
            case 25:
                this.f13742a = new C1553n();
                break;
            default:
                this.f13742a = C1009a.f14464e;
                break;
        }
    }

    public C0879c(UUID uuid, int i3, byte[] bArr) {
        this.f13742a = uuid;
    }
}
