package v0;

import T0.AbstractC0311b;
import T0.C0318i;
import T0.InterfaceC0319j;
import android.content.Context;
import android.location.Geocoder;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import com.stub.StubApp;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.List;
import java.util.Locale;
import o0.AbstractC1405B;
import o0.C1437l;
import o0.C1438m;
import r0.AbstractC1550k;
import r0.AbstractC1560u;
import r0.C1553n;
import r0.C1558s;
import y2.InterfaceC1967a;
import z1.C1994F;

/* renamed from: v0.F, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1803F implements InterfaceC0319j {

    /* renamed from: a, reason: collision with root package name */
    public Object f21581a;

    /* renamed from: b, reason: collision with root package name */
    public Object f21582b;

    public /* synthetic */ C1803F(Object obj, Object obj2) {
        this.f21581a = obj;
        this.f21582b = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0057 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0052 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static v0.C1803F a(android.content.Context r5) {
        /*
            r0 = 23610(0x5c3a, float:3.3085E-41)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch: java.nio.channels.OverlappingFileLockException -> L37 java.lang.Error -> L3b java.io.IOException -> L3d
            java.io.File r5 = r5.getFilesDir()     // Catch: java.nio.channels.OverlappingFileLockException -> L37 java.lang.Error -> L3b java.io.IOException -> L3d
            r2.<init>(r5, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L37 java.lang.Error -> L3b java.io.IOException -> L3d
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch: java.nio.channels.OverlappingFileLockException -> L37 java.lang.Error -> L3b java.io.IOException -> L3d
            java.lang.String r0 = "1273"
            java.lang.String r0 = com.stub.StubApp.getString2(r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L37 java.lang.Error -> L3b java.io.IOException -> L3d
            r5.<init>(r2, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L37 java.lang.Error -> L3b java.io.IOException -> L3d
            java.nio.channels.FileChannel r5 = r5.getChannel()     // Catch: java.nio.channels.OverlappingFileLockException -> L37 java.lang.Error -> L3b java.io.IOException -> L3d
            java.nio.channels.FileLock r0 = r5.lock()     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L33 java.io.IOException -> L35
            v0.F r2 = new v0.F     // Catch: java.nio.channels.OverlappingFileLockException -> L2a java.lang.Error -> L2c java.io.IOException -> L2e
            r2.<init>(r5, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L2a java.lang.Error -> L2c java.io.IOException -> L2e
            return r2
        L2a:
            r2 = move-exception
            goto L3f
        L2c:
            r2 = move-exception
            goto L3f
        L2e:
            r2 = move-exception
            goto L3f
        L30:
            r2 = move-exception
        L31:
            r0 = r1
            goto L3f
        L33:
            r2 = move-exception
            goto L31
        L35:
            r2 = move-exception
            goto L31
        L37:
            r2 = move-exception
        L38:
            r5 = r1
            r0 = r5
            goto L3f
        L3b:
            r2 = move-exception
            goto L38
        L3d:
            r2 = move-exception
            goto L38
        L3f:
            r3 = 23611(0x5c3b, float:3.3086E-41)
            java.lang.String r3 = com.stub.StubApp.getString2(r3)
            r4 = 23612(0x5c3c, float:3.3087E-41)
            java.lang.String r4 = com.stub.StubApp.getString2(r4)
            android.util.Log.e(r3, r4, r2)
            if (r0 == 0) goto L55
            r0.release()     // Catch: java.io.IOException -> L55
        L55:
            if (r5 == 0) goto L5a
            r5.close()     // Catch: java.io.IOException -> L5a
        L5a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.C1803F.a(android.content.Context):v0.F");
    }

    @Override // T0.InterfaceC0319j
    public C0318i b(T0.l lVar, long j) {
        long j3 = lVar.f7030d;
        int min = (int) Math.min(20000L, lVar.f7029c - j3);
        C1553n c1553n = (C1553n) this.f21582b;
        c1553n.D(min);
        lVar.i(c1553n.f20176a, 0, min, false);
        int i3 = -1;
        int i10 = -1;
        long j10 = -9223372036854775807L;
        while (c1553n.a() >= 4) {
            if (Y0.b.a(c1553n.f20177b, c1553n.f20176a) != 442) {
                c1553n.H(1);
            } else {
                c1553n.H(4);
                long c10 = z1.y.c(c1553n);
                if (c10 != -9223372036854775807L) {
                    long b2 = ((C1558s) this.f21581a).b(c10);
                    if (b2 > j) {
                        return j10 == -9223372036854775807L ? new C0318i(b2, -1, j3) : new C0318i(-9223372036854775807L, 0, j3 + i10);
                    }
                    if (b2 + 100000 > j) {
                        return new C0318i(-9223372036854775807L, 0, j3 + c1553n.f20177b);
                    }
                    j10 = b2;
                    i10 = c1553n.f20177b;
                }
                int i11 = c1553n.f20178c;
                if (c1553n.a() >= 10) {
                    c1553n.H(9);
                    int u2 = c1553n.u() & 7;
                    if (c1553n.a() >= u2) {
                        c1553n.H(u2);
                        if (c1553n.a() >= 4) {
                            if (Y0.b.a(c1553n.f20177b, c1553n.f20176a) == 443) {
                                c1553n.H(4);
                                int A4 = c1553n.A();
                                if (c1553n.a() < A4) {
                                    c1553n.G(i11);
                                } else {
                                    c1553n.H(A4);
                                }
                            }
                            while (true) {
                                if (c1553n.a() < 4) {
                                    break;
                                }
                                int a3 = Y0.b.a(c1553n.f20177b, c1553n.f20176a);
                                if (a3 == 442 || a3 == 441 || (a3 >>> 8) != 1) {
                                    break;
                                }
                                c1553n.H(4);
                                if (c1553n.a() < 2) {
                                    c1553n.G(i11);
                                    break;
                                }
                                c1553n.G(Math.min(c1553n.f20178c, c1553n.f20177b + c1553n.A()));
                            }
                        } else {
                            c1553n.G(i11);
                        }
                    } else {
                        c1553n.G(i11);
                    }
                } else {
                    c1553n.G(i11);
                }
                i3 = c1553n.f20177b;
            }
        }
        return j10 != -9223372036854775807L ? new C0318i(j10, -2, j3 + i3) : C0318i.f7017d;
    }

    public void c() {
        this.f21581a = null;
        this.f21582b = null;
    }

    public void d(long j, C1553n c1553n) {
        if (c1553n.a() < 9) {
            return;
        }
        int h2 = c1553n.h();
        int h4 = c1553n.h();
        int u2 = c1553n.u();
        if (h2 == 434 && h4 == 1195456820 && u2 == 3) {
            AbstractC0311b.g(j, c1553n, (T0.H[]) this.f21582b);
        }
    }

    @Override // T0.InterfaceC0319j
    public void e() {
        byte[] bArr = AbstractC1560u.f20195f;
        C1553n c1553n = (C1553n) this.f21582b;
        c1553n.getClass();
        c1553n.E(bArr.length, bArr);
    }

    public void f(T0.q qVar, C1994F c1994f) {
        int i3 = 0;
        while (true) {
            T0.H[] hArr = (T0.H[]) this.f21582b;
            if (i3 >= hArr.length) {
                return;
            }
            c1994f.a();
            c1994f.b();
            T0.H w10 = qVar.w(c1994f.f23754d, 3);
            C1438m c1438m = (C1438m) ((List) this.f21581a).get(i3);
            String str = c1438m.f18216n;
            AbstractC1550k.b(StubApp.getString2(23151) + str, StubApp.getString2(467).equals(str) || StubApp.getString2(503).equals(str));
            C1437l c1437l = new C1437l();
            c1994f.b();
            c1437l.f18166a = c1994f.f23755e;
            c1437l.f18177m = AbstractC1405B.m(str);
            c1437l.f18170e = c1438m.f18208e;
            c1437l.f18169d = c1438m.f18207d;
            c1437l.f18161G = c1438m.f18198H;
            c1437l.f18180p = c1438m.f18219q;
            E1.a.w(c1437l, w10);
            hArr[i3] = w10;
            i3++;
        }
    }

    public void g(C1811f c1811f) {
        synchronized (c1811f) {
        }
        Handler handler = (Handler) this.f21581a;
        if (handler != null) {
            handler.post(new com.even.translate.a(22, this, c1811f));
        }
    }

    public void h(String str, InterfaceC1967a interfaceC1967a) {
        Locale locale = (Locale) this.f21582b;
        Context context = (Context) this.f21581a;
        Geocoder geocoder = locale != null ? new Geocoder(context, locale) : new Geocoder(context);
        if (Build.VERSION.SDK_INT >= 33) {
            geocoder.getFromLocationName(str, 5, new y2.b(interfaceC1967a, 0));
            return;
        }
        try {
            interfaceC1967a.onGeocode(geocoder.getFromLocationName(str, 5));
        } catch (IOException e10) {
            interfaceC1967a.onError(e10.getMessage());
        }
    }

    public void i() {
        try {
            ((FileLock) this.f21582b).release();
            ((FileChannel) this.f21581a).close();
        } catch (IOException e10) {
            Log.e(StubApp.getString2(23611), StubApp.getString2(23613), e10);
        }
    }

    public C1803F(List list) {
        this.f21581a = list;
        this.f21582b = new T0.H[list.size()];
    }
}
