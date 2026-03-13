package s1;

import Dc.B;
import M4.G;
import M4.I;
import M4.Z;
import T0.J;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.asn1.eac.CertificateBody;
import q0.C1504b;
import q1.C1505a;
import q1.k;
import q1.l;
import r0.AbstractC1550k;
import r0.AbstractC1560u;
import r0.C1553n;
import r0.InterfaceC1542c;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class h implements l {

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f20689h = {0, 7, 8, 15};
    public static final byte[] j = {0, 119, -120, -1};

    /* renamed from: k, reason: collision with root package name */
    public static final byte[] f20690k = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: a, reason: collision with root package name */
    public final Paint f20691a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f20692b;

    /* renamed from: c, reason: collision with root package name */
    public final Canvas f20693c;

    /* renamed from: d, reason: collision with root package name */
    public final b f20694d;

    /* renamed from: e, reason: collision with root package name */
    public final C1594a f20695e;

    /* renamed from: f, reason: collision with root package name */
    public final g f20696f;

    /* renamed from: g, reason: collision with root package name */
    public Bitmap f20697g;

    public h(List list) {
        C1553n c1553n = new C1553n((byte[]) list.get(0));
        int A4 = c1553n.A();
        int A5 = c1553n.A();
        Paint paint = new Paint();
        this.f20691a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f20692b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f20693c = new Canvas();
        this.f20694d = new b(719, 575, 0, 719, 0, 575);
        this.f20695e = new C1594a(0, new int[]{0, -1, -16777216, -8421505}, b(), c());
        this.f20696f = new g(A4, A5);
    }

    public static byte[] a(int i3, int i10, J j3) {
        byte[] bArr = new byte[i3];
        for (int i11 = 0; i11 < i3; i11++) {
            bArr[i11] = (byte) j3.i(i10);
        }
        return bArr;
    }

    public static int[] b() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i3 = 1; i3 < 16; i3++) {
            if (i3 < 8) {
                iArr[i3] = d(255, (i3 & 1) != 0 ? 255 : 0, (i3 & 2) != 0 ? 255 : 0, (i3 & 4) != 0 ? 255 : 0);
            } else {
                int i10 = i3 & 1;
                int i11 = CertificateBody.profileType;
                int i12 = i10 != 0 ? 127 : 0;
                int i13 = (i3 & 2) != 0 ? 127 : 0;
                if ((i3 & 4) == 0) {
                    i11 = 0;
                }
                iArr[i3] = d(255, i12, i13, i11);
            }
        }
        return iArr;
    }

    public static int[] c() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i3 = 0; i3 < 256; i3++) {
            if (i3 < 8) {
                iArr[i3] = d(63, (i3 & 1) != 0 ? 255 : 0, (i3 & 2) != 0 ? 255 : 0, (i3 & 4) == 0 ? 0 : 255);
            } else {
                int i10 = i3 & 136;
                if (i10 == 0) {
                    iArr[i3] = d(255, ((i3 & 1) != 0 ? 85 : 0) + ((i3 & 16) != 0 ? 170 : 0), ((i3 & 2) != 0 ? 85 : 0) + ((i3 & 32) != 0 ? 170 : 0), ((i3 & 4) == 0 ? 0 : 85) + ((i3 & 64) == 0 ? 0 : 170));
                } else if (i10 == 8) {
                    iArr[i3] = d(CertificateBody.profileType, ((i3 & 1) != 0 ? 85 : 0) + ((i3 & 16) != 0 ? 170 : 0), ((i3 & 2) != 0 ? 85 : 0) + ((i3 & 32) != 0 ? 170 : 0), ((i3 & 4) == 0 ? 0 : 85) + ((i3 & 64) == 0 ? 0 : 170));
                } else if (i10 == 128) {
                    iArr[i3] = d(255, ((i3 & 1) != 0 ? 43 : 0) + CertificateBody.profileType + ((i3 & 16) != 0 ? 85 : 0), ((i3 & 2) != 0 ? 43 : 0) + CertificateBody.profileType + ((i3 & 32) != 0 ? 85 : 0), ((i3 & 4) == 0 ? 0 : 43) + CertificateBody.profileType + ((i3 & 64) == 0 ? 0 : 85));
                } else if (i10 == 136) {
                    iArr[i3] = d(255, ((i3 & 1) != 0 ? 43 : 0) + ((i3 & 16) != 0 ? 85 : 0), ((i3 & 2) != 0 ? 43 : 0) + ((i3 & 32) != 0 ? 85 : 0), ((i3 & 4) == 0 ? 0 : 43) + ((i3 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int d(int i3, int i10, int i11, int i12) {
        return (i3 << 24) | (i10 << 16) | (i11 << 8) | i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01fe A[LOOP:3: B:87:0x0166->B:98:0x01fe, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01fa A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(byte[] r22, int[] r23, int r24, int r25, int r26, android.graphics.Paint r27, android.graphics.Canvas r28) {
        /*
            Method dump skipped, instructions count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.h.e(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    public static C1594a f(J j3, int i3) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = 8;
        int i16 = j3.i(8);
        j3.t(8);
        int i17 = 2;
        int i18 = i3 - 2;
        int i19 = 0;
        int[] iArr = {0, -1, -16777216, -8421505};
        int[] b2 = b();
        int[] c10 = c();
        while (i18 > 0) {
            int i20 = j3.i(i15);
            int i21 = j3.i(i15);
            int[] iArr2 = (i21 & 128) != 0 ? iArr : (i21 & 64) != 0 ? b2 : c10;
            if ((i21 & 1) != 0) {
                i13 = j3.i(i15);
                i14 = j3.i(i15);
                i10 = j3.i(i15);
                i12 = j3.i(i15);
                i11 = i18 - 6;
            } else {
                int i22 = j3.i(6) << i17;
                int i23 = j3.i(4) << 4;
                i10 = j3.i(4) << 4;
                i11 = i18 - 4;
                i12 = j3.i(i17) << 6;
                i13 = i22;
                i14 = i23;
            }
            if (i13 == 0) {
                i14 = i19;
                i10 = i14;
                i12 = 255;
            }
            double d8 = i13;
            double d10 = i14 - 128;
            double d11 = i10 - 128;
            iArr2[i20] = d((byte) (255 - (i12 & 255)), AbstractC1560u.i((int) ((1.402d * d10) + d8), 0, 255), AbstractC1560u.i((int) ((d8 - (0.34414d * d11)) - (d10 * 0.71414d)), 0, 255), AbstractC1560u.i((int) ((d11 * 1.772d) + d8), 0, 255));
            i18 = i11;
            i19 = 0;
            i16 = i16;
            c10 = c10;
            i15 = 8;
            i17 = 2;
        }
        return new C1594a(i16, iArr, b2, c10);
    }

    public static c h(J j3) {
        byte[] bArr;
        int i3 = j3.i(16);
        j3.t(4);
        int i10 = j3.i(2);
        boolean h2 = j3.h();
        j3.t(1);
        byte[] bArr2 = AbstractC1560u.f20195f;
        if (i10 == 1) {
            j3.t(j3.i(8) * 16);
        } else if (i10 == 0) {
            int i11 = j3.i(16);
            int i12 = j3.i(16);
            if (i11 > 0) {
                bArr2 = new byte[i11];
                j3.l(i11, bArr2);
            }
            if (i12 > 0) {
                bArr = new byte[i12];
                j3.l(i12, bArr);
                return new c(bArr2, bArr, i3, h2);
            }
        }
        bArr = bArr2;
        return new c(bArr2, bArr, i3, h2);
    }

    @Override // q1.l
    public final void n(byte[] bArr, int i3, int i10, k kVar, InterfaceC1542c interfaceC1542c) {
        g gVar;
        C1505a c1505a;
        int i11;
        char c10;
        char c11;
        char c12;
        int i12;
        int i13;
        g gVar2;
        Canvas canvas;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        e eVar;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23 = 8;
        boolean z2 = true;
        J j3 = new J(bArr, i3 + i10);
        j3.q(i3);
        while (true) {
            int b2 = j3.b();
            gVar = this.f20696f;
            if (b2 >= 48 && j3.i(i23) == 15) {
                int i24 = j3.i(i23);
                int i25 = j3.i(16);
                int i26 = j3.i(16);
                int f10 = j3.f() + i26;
                if (i26 * 8 > j3.b()) {
                    AbstractC1550k.w(StubApp.getString2(23034), StubApp.getString2(23035));
                    j3.t(j3.b());
                } else {
                    switch (i24) {
                        case 16:
                            if (i25 == gVar.f20680a) {
                                B b10 = gVar.f20688i;
                                j3.i(i23);
                                int i27 = j3.i(4);
                                int i28 = j3.i(2);
                                j3.t(2);
                                int i29 = i26 - 2;
                                SparseArray sparseArray = new SparseArray();
                                while (i29 > 0) {
                                    int i30 = j3.i(i23);
                                    j3.t(i23);
                                    i29 -= 6;
                                    sparseArray.put(i30, new d(j3.i(16), j3.i(16)));
                                    i23 = 8;
                                }
                                B b11 = new B();
                                b11.f1539a = i27;
                                b11.f1540b = i28;
                                b11.f1541c = sparseArray;
                                if (i28 == 0) {
                                    if (b10 != null && b10.f1539a != i27) {
                                        gVar.f20688i = b11;
                                        break;
                                    }
                                } else {
                                    gVar.f20688i = b11;
                                    gVar.f20682c.clear();
                                    gVar.f20683d.clear();
                                    gVar.f20684e.clear();
                                    break;
                                }
                            }
                            break;
                        case 17:
                            B b12 = gVar.f20688i;
                            if (i25 == gVar.f20680a && b12 != null) {
                                int i31 = j3.i(i23);
                                j3.t(4);
                                boolean h2 = j3.h();
                                j3.t(3);
                                int i32 = j3.i(16);
                                int i33 = j3.i(16);
                                j3.i(3);
                                int i34 = j3.i(3);
                                j3.t(2);
                                int i35 = j3.i(i23);
                                int i36 = j3.i(i23);
                                int i37 = j3.i(4);
                                int i38 = j3.i(2);
                                j3.t(2);
                                int i39 = i26 - 10;
                                SparseArray sparseArray2 = new SparseArray();
                                while (i39 > 0) {
                                    int i40 = j3.i(16);
                                    int i41 = j3.i(2);
                                    j3.i(2);
                                    int i42 = j3.i(12);
                                    j3.t(4);
                                    int i43 = j3.i(12);
                                    int i44 = i39 - 6;
                                    if (i41 == 1 || i41 == 2) {
                                        j3.i(i23);
                                        j3.i(i23);
                                        i39 -= 8;
                                    } else {
                                        i39 = i44;
                                    }
                                    sparseArray2.put(i40, new f(i42, i43));
                                }
                                e eVar2 = new e(i31, h2, i32, i33, i34, i35, i36, i37, i38, sparseArray2);
                                SparseArray sparseArray3 = gVar.f20682c;
                                if (b12.f1540b == 0 && (eVar = (e) sparseArray3.get(i31)) != null) {
                                    int i45 = 0;
                                    while (true) {
                                        SparseArray sparseArray4 = eVar.j;
                                        if (i45 < sparseArray4.size()) {
                                            eVar2.j.put(sparseArray4.keyAt(i45), (f) sparseArray4.valueAt(i45));
                                            i45++;
                                        }
                                    }
                                }
                                sparseArray3.put(eVar2.f20669a, eVar2);
                                break;
                            }
                            break;
                        case 18:
                            if (i25 != gVar.f20680a) {
                                if (i25 == gVar.f20681b) {
                                    C1594a f11 = f(j3, i26);
                                    gVar.f20685f.put(f11.f20653a, f11);
                                    break;
                                }
                            } else {
                                C1594a f12 = f(j3, i26);
                                gVar.f20683d.put(f12.f20653a, f12);
                                break;
                            }
                            break;
                        case 19:
                            if (i25 != gVar.f20680a) {
                                if (i25 == gVar.f20681b) {
                                    c h4 = h(j3);
                                    gVar.f20686g.put(h4.f20663a, h4);
                                    break;
                                }
                            } else {
                                c h5 = h(j3);
                                gVar.f20684e.put(h5.f20663a, h5);
                                break;
                            }
                            break;
                        case 20:
                            if (i25 == gVar.f20680a) {
                                j3.t(4);
                                boolean h9 = j3.h();
                                j3.t(3);
                                int i46 = j3.i(16);
                                int i47 = j3.i(16);
                                if (h9) {
                                    int i48 = j3.i(16);
                                    int i49 = j3.i(16);
                                    int i50 = j3.i(16);
                                    i19 = i49;
                                    i20 = j3.i(16);
                                    i22 = i50;
                                    i21 = i48;
                                } else {
                                    i19 = i46;
                                    i20 = i47;
                                    i21 = 0;
                                    i22 = 0;
                                }
                                gVar.f20687h = new b(i46, i47, i21, i19, i22, i20);
                                break;
                            }
                            break;
                    }
                    j3.u(f10 - j3.f());
                }
                i23 = 8;
            }
        }
        B b13 = gVar.f20688i;
        if (b13 == null) {
            G g10 = I.f4549b;
            c1505a = new C1505a(Z.f4578e, -9223372036854775807L, -9223372036854775807L);
        } else {
            b bVar = gVar.f20687h;
            if (bVar == null) {
                bVar = this.f20694d;
            }
            Bitmap bitmap = this.f20697g;
            Canvas canvas2 = this.f20693c;
            if (bitmap == null || bVar.f20657a + 1 != bitmap.getWidth() || bVar.f20658b + 1 != this.f20697g.getHeight()) {
                Bitmap createBitmap = Bitmap.createBitmap(bVar.f20657a + 1, bVar.f20658b + 1, Bitmap.Config.ARGB_8888);
                this.f20697g = createBitmap;
                canvas2.setBitmap(createBitmap);
            }
            ArrayList arrayList = new ArrayList();
            int i51 = 0;
            while (true) {
                SparseArray sparseArray5 = (SparseArray) b13.f1541c;
                if (i51 < sparseArray5.size()) {
                    canvas2.save();
                    d dVar = (d) sparseArray5.valueAt(i51);
                    e eVar3 = (e) gVar.f20682c.get(sparseArray5.keyAt(i51));
                    int i52 = dVar.f20667a + bVar.f20659c;
                    int i53 = dVar.f20668b + bVar.f20661e;
                    int min = Math.min(eVar3.f20671c + i52, bVar.f20660d);
                    int i54 = eVar3.f20672d;
                    int i55 = i53 + i54;
                    boolean z10 = z2;
                    canvas2.clipRect(i52, i53, min, Math.min(i55, bVar.f20662f));
                    SparseArray sparseArray6 = gVar.f20683d;
                    int i56 = eVar3.f20674f;
                    C1594a c1594a = (C1594a) sparseArray6.get(i56);
                    if (c1594a == null && (c1594a = (C1594a) gVar.f20685f.get(i56)) == null) {
                        c1594a = this.f20695e;
                    }
                    int i57 = 0;
                    while (true) {
                        SparseArray sparseArray7 = eVar3.j;
                        if (i57 < sparseArray7.size()) {
                            int keyAt = sparseArray7.keyAt(i57);
                            f fVar = (f) sparseArray7.valueAt(i57);
                            B b14 = b13;
                            c cVar = (c) gVar.f20684e.get(keyAt);
                            if (cVar == null) {
                                cVar = (c) gVar.f20686g.get(keyAt);
                            }
                            if (cVar != null) {
                                Paint paint = cVar.f20664b ? null : this.f20691a;
                                i13 = i51;
                                int i58 = fVar.f20678a + i52;
                                int i59 = fVar.f20679b + i53;
                                int i60 = i52;
                                int i61 = eVar3.f20673e;
                                canvas = canvas2;
                                i16 = i57;
                                i14 = i53;
                                int[] iArr = i61 == 3 ? c1594a.f20656d : i61 == 2 ? c1594a.f20655c : c1594a.f20654b;
                                i15 = i60;
                                gVar2 = gVar;
                                i18 = i55;
                                Paint paint2 = paint;
                                i17 = i54;
                                e(cVar.f20665c, iArr, i61, i58, i59, paint2, canvas);
                                e(cVar.f20666d, iArr, i61, i58, i59 + 1, paint2, canvas);
                            } else {
                                i13 = i51;
                                gVar2 = gVar;
                                canvas = canvas2;
                                i14 = i53;
                                i15 = i52;
                                i16 = i57;
                                i17 = i54;
                                i18 = i55;
                            }
                            i57 = i16 + 1;
                            i52 = i15;
                            i53 = i14;
                            i54 = i17;
                            i55 = i18;
                            canvas2 = canvas;
                            b13 = b14;
                            i51 = i13;
                            gVar = gVar2;
                        } else {
                            B b15 = b13;
                            int i62 = i51;
                            g gVar3 = gVar;
                            Canvas canvas3 = canvas2;
                            int i63 = i53;
                            int i64 = i52;
                            int i65 = i54;
                            int i66 = i55;
                            boolean z11 = eVar3.f20670b;
                            int i67 = eVar3.f20671c;
                            if (z11) {
                                int i68 = eVar3.f20673e;
                                if (i68 == 3) {
                                    i12 = c1594a.f20656d[eVar3.f20675g];
                                    c12 = 2;
                                } else {
                                    c12 = 2;
                                    i12 = i68 == 2 ? c1594a.f20655c[eVar3.f20676h] : c1594a.f20654b[eVar3.f20677i];
                                }
                                Paint paint3 = this.f20692b;
                                paint3.setColor(i12);
                                c10 = 3;
                                c11 = c12;
                                i11 = i67;
                                canvas2 = canvas3;
                                canvas2.drawRect(i64, i63, i64 + i67, i66, paint3);
                            } else {
                                i11 = i67;
                                canvas2 = canvas3;
                                c10 = 3;
                                c11 = 2;
                            }
                            Bitmap createBitmap2 = Bitmap.createBitmap(this.f20697g, i64, i63, i11, i65);
                            float f13 = bVar.f20657a;
                            float f14 = i64 / f13;
                            float f15 = i63;
                            float f16 = bVar.f20658b;
                            arrayList.add(new C1504b(null, null, null, createBitmap2, f15 / f16, 0, 0, f14, 0, Integer.MIN_VALUE, -3.4028235E38f, i11 / f13, i65 / f16, false, -16777216, Integer.MIN_VALUE, 0.0f));
                            canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
                            canvas2.restore();
                            i51 = i62 + 1;
                            z2 = z10;
                            b13 = b15;
                            gVar = gVar3;
                        }
                    }
                } else {
                    c1505a = new C1505a(arrayList, -9223372036854775807L, -9223372036854775807L);
                }
            }
        }
        interfaceC1542c.accept(c1505a);
    }

    @Override // q1.l
    public final int p() {
        return 2;
    }

    @Override // q1.l
    public final void reset() {
        g gVar = this.f20696f;
        gVar.f20682c.clear();
        gVar.f20683d.clear();
        gVar.f20684e.clear();
        gVar.f20685f.clear();
        gVar.f20686g.clear();
        gVar.f20687h = null;
        gVar.f20688i = null;
    }
}
