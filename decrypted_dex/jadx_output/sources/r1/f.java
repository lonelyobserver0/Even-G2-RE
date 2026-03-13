package r1;

import T0.J;
import a0.C0379a;
import android.text.SpannableStringBuilder;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.stub.StubApp;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.Typography;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.asn1.eac.EACTags;
import p0.AbstractC1482f;
import r0.AbstractC1540a;
import r0.AbstractC1550k;
import r0.C1553n;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class f extends h {

    /* renamed from: h, reason: collision with root package name */
    public final C1553n f20274h = new C1553n();

    /* renamed from: i, reason: collision with root package name */
    public final J f20275i = new J();
    public int j = -1;

    /* renamed from: k, reason: collision with root package name */
    public final int f20276k;

    /* renamed from: l, reason: collision with root package name */
    public final e[] f20277l;

    /* renamed from: m, reason: collision with root package name */
    public e f20278m;

    /* renamed from: n, reason: collision with root package name */
    public List f20279n;

    /* renamed from: o, reason: collision with root package name */
    public List f20280o;

    /* renamed from: p, reason: collision with root package name */
    public J f20281p;

    /* renamed from: q, reason: collision with root package name */
    public int f20282q;

    public f(int i3, List list) {
        this.f20276k = i3 == -1 ? 1 : i3;
        if (list != null) {
            byte[] bArr = AbstractC1540a.f20137a;
            if (list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
                byte b2 = ((byte[]) list.get(0))[0];
            }
        }
        this.f20277l = new e[8];
        for (int i10 = 0; i10 < 8; i10++) {
            this.f20277l[i10] = new e();
        }
        this.f20278m = this.f20277l[0];
    }

    @Override // r1.h
    public final C0379a f() {
        List list = this.f20279n;
        this.f20280o = list;
        list.getClass();
        return new C0379a(list, 23);
    }

    @Override // r1.h, u0.c
    public final void flush() {
        super.flush();
        this.f20279n = null;
        this.f20280o = null;
        this.f20282q = 0;
        this.f20278m = this.f20277l[0];
        l();
        this.f20281p = null;
    }

    @Override // r1.h
    public final void g(g gVar) {
        ByteBuffer byteBuffer = gVar.f21396e;
        byteBuffer.getClass();
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        C1553n c1553n = this.f20274h;
        c1553n.E(limit, array);
        while (c1553n.a() >= 3) {
            int u2 = c1553n.u();
            int i3 = u2 & 3;
            boolean z2 = (u2 & 4) == 4;
            byte u10 = (byte) c1553n.u();
            byte u11 = (byte) c1553n.u();
            if (i3 == 2 || i3 == 3) {
                if (z2) {
                    String string2 = StubApp.getString2(22658);
                    if (i3 == 3) {
                        j();
                        int i10 = (u10 & 192) >> 6;
                        int i11 = this.j;
                        if (i11 != -1 && i10 != (i11 + 1) % 4) {
                            l();
                            AbstractC1550k.w(string2, StubApp.getString2(22659) + this.j + StubApp.getString2(22660) + i10);
                        }
                        this.j = i10;
                        int i12 = u10 & 63;
                        if (i12 == 0) {
                            i12 = 64;
                        }
                        J j = new J(i10, i12);
                        this.f20281p = j;
                        j.f6952e = 1;
                        j.f6949b[0] = u11;
                    } else {
                        AbstractC1550k.c(i3 == 2);
                        J j3 = this.f20281p;
                        if (j3 == null) {
                            AbstractC1550k.k(string2, StubApp.getString2(22661));
                        } else {
                            byte[] bArr = j3.f6949b;
                            int i13 = j3.f6952e;
                            int i14 = i13 + 1;
                            j3.f6952e = i14;
                            bArr[i13] = u10;
                            j3.f6952e = i13 + 2;
                            bArr[i14] = u11;
                        }
                    }
                    J j10 = this.f20281p;
                    if (j10.f6952e == (j10.f6951d * 2) - 1) {
                        j();
                    }
                }
            }
        }
    }

    @Override // r1.h
    public final boolean i() {
        return this.f20279n != this.f20280o;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void j() {
        boolean z2;
        char c10;
        int i3;
        boolean z10;
        J j = this.f20281p;
        if (j == null) {
            return;
        }
        int i10 = j.f6952e;
        int i11 = 2;
        int i12 = (j.f6951d * 2) - 1;
        String string2 = StubApp.getString2(22658);
        if (i10 != i12) {
            AbstractC1550k.j(string2, StubApp.getString2(22662) + ((this.f20281p.f6951d * 2) - 1) + StubApp.getString2(22663) + this.f20281p.f6952e + StubApp.getString2(22664) + this.f20281p.f6950c + StubApp.getString2(22665));
        }
        J j3 = this.f20281p;
        byte[] bArr = j3.f6949b;
        int i13 = j3.f6952e;
        J j10 = this.f20275i;
        j10.o(i13, bArr);
        boolean z11 = false;
        while (true) {
            if (j10.b() > 0) {
                int i14 = 3;
                int i15 = j10.i(3);
                int i16 = j10.i(5);
                if (i15 == 7) {
                    j10.t(i11);
                    i15 = j10.i(6);
                    if (i15 < 7) {
                        AbstractC1482f.p(i15, StubApp.getString2(22666), string2);
                    }
                }
                if (i16 == 0) {
                    if (i15 != 0) {
                        AbstractC1550k.w(string2, StubApp.getString2(22667) + i15 + StubApp.getString2(22668));
                    }
                } else if (i15 != this.f20276k) {
                    j10.u(i16);
                } else {
                    int g10 = (i16 * 8) + j10.g();
                    while (j10.g() < g10) {
                        int i17 = j10.i(8);
                        if (i17 != 16) {
                            if (i17 <= 31) {
                                if (i17 != 0) {
                                    if (i17 == i14) {
                                        this.f20279n = k();
                                    } else if (i17 != 8) {
                                        switch (i17) {
                                            case 12:
                                                l();
                                                break;
                                            case 13:
                                                this.f20278m.a('\n');
                                                break;
                                            case 14:
                                                break;
                                            default:
                                                if (i17 < 17 || i17 > 23) {
                                                    if (i17 < 24 || i17 > 31) {
                                                        AbstractC1482f.p(i17, StubApp.getString2(22671), string2);
                                                        break;
                                                    } else {
                                                        AbstractC1550k.w(string2, StubApp.getString2(22670) + i17);
                                                        j10.t(16);
                                                        break;
                                                    }
                                                } else {
                                                    AbstractC1550k.w(string2, StubApp.getString2(22669) + i17);
                                                    j10.t(8);
                                                    break;
                                                }
                                        }
                                    } else {
                                        SpannableStringBuilder spannableStringBuilder = this.f20278m.f20255b;
                                        int length = spannableStringBuilder.length();
                                        if (length > 0) {
                                            spannableStringBuilder.delete(length - 1, length);
                                        }
                                    }
                                }
                                i3 = i11;
                            } else if (i17 <= 127) {
                                if (i17 == 127) {
                                    this.f20278m.a((char) 9835);
                                } else {
                                    this.f20278m.a((char) (i17 & 255));
                                }
                                i3 = i11;
                                z11 = true;
                            } else {
                                if (i17 <= 159) {
                                    e[] eVarArr = this.f20277l;
                                    switch (i17) {
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                            z10 = false;
                                            z2 = true;
                                            int i18 = i17 - 128;
                                            if (this.f20282q != i18) {
                                                this.f20282q = i18;
                                                this.f20278m = eVarArr[i18];
                                                break;
                                            }
                                            break;
                                        case 136:
                                            z2 = true;
                                            for (int i19 = 1; i19 <= 8; i19++) {
                                                if (j10.h()) {
                                                    e eVar = eVarArr[8 - i19];
                                                    eVar.f20254a.clear();
                                                    eVar.f20255b.clear();
                                                    eVar.f20267o = -1;
                                                    eVar.f20268p = -1;
                                                    eVar.f20269q = -1;
                                                    eVar.f20271s = -1;
                                                    eVar.f20273u = 0;
                                                }
                                            }
                                            z10 = false;
                                            break;
                                        case 137:
                                            for (int i20 = 1; i20 <= 8; i20++) {
                                                if (j10.h()) {
                                                    eVarArr[8 - i20].f20257d = true;
                                                }
                                            }
                                            z2 = true;
                                            z10 = false;
                                            break;
                                        case 138:
                                            for (int i21 = 1; i21 <= 8; i21++) {
                                                if (j10.h()) {
                                                    eVarArr[8 - i21].f20257d = false;
                                                }
                                            }
                                            z10 = false;
                                            z2 = true;
                                            break;
                                        case 139:
                                            for (int i22 = 1; i22 <= 8; i22++) {
                                                if (j10.h()) {
                                                    eVarArr[8 - i22].f20257d = !r3.f20257d;
                                                }
                                            }
                                            z10 = false;
                                            z2 = true;
                                            break;
                                        case 140:
                                            for (int i23 = 1; i23 <= 8; i23++) {
                                                if (j10.h()) {
                                                    eVarArr[8 - i23].d();
                                                }
                                            }
                                            z10 = false;
                                            z2 = true;
                                            break;
                                        case 141:
                                            j10.t(8);
                                            z10 = false;
                                            z2 = true;
                                            break;
                                        case 142:
                                            z10 = false;
                                            z2 = true;
                                            break;
                                        case 143:
                                            l();
                                            z10 = false;
                                            z2 = true;
                                            break;
                                        case 144:
                                            if (!this.f20278m.f20256c) {
                                                j10.t(16);
                                                z10 = false;
                                                i14 = 3;
                                                z2 = true;
                                                break;
                                            } else {
                                                j10.i(4);
                                                j10.i(2);
                                                j10.i(2);
                                                boolean h2 = j10.h();
                                                boolean h4 = j10.h();
                                                i14 = 3;
                                                j10.i(3);
                                                j10.i(3);
                                                this.f20278m.e(h2, h4);
                                                z10 = false;
                                                z2 = true;
                                            }
                                        case 145:
                                            if (this.f20278m.f20256c) {
                                                int c11 = e.c(j10.i(2), j10.i(2), j10.i(2), j10.i(2));
                                                int c12 = e.c(j10.i(2), j10.i(2), j10.i(2), j10.i(2));
                                                j10.t(2);
                                                e.c(j10.i(2), j10.i(2), j10.i(2), 0);
                                                this.f20278m.f(c11, c12);
                                            } else {
                                                j10.t(24);
                                            }
                                            z10 = false;
                                            i14 = 3;
                                            z2 = true;
                                            break;
                                        case 146:
                                            if (this.f20278m.f20256c) {
                                                j10.t(4);
                                                int i24 = j10.i(4);
                                                j10.t(2);
                                                j10.i(6);
                                                e eVar2 = this.f20278m;
                                                if (eVar2.f20273u != i24) {
                                                    eVar2.a('\n');
                                                }
                                                eVar2.f20273u = i24;
                                            } else {
                                                j10.t(16);
                                            }
                                            z10 = false;
                                            i14 = 3;
                                            z2 = true;
                                            break;
                                        case 147:
                                        case 148:
                                        case 149:
                                        case 150:
                                        default:
                                            AbstractC1482f.p(i17, StubApp.getString2(22672), string2);
                                            z10 = false;
                                            z2 = true;
                                            break;
                                        case 151:
                                            if (this.f20278m.f20256c) {
                                                int c13 = e.c(j10.i(2), j10.i(2), j10.i(2), j10.i(2));
                                                j10.i(2);
                                                e.c(j10.i(2), j10.i(2), j10.i(2), 0);
                                                j10.h();
                                                j10.h();
                                                j10.i(2);
                                                j10.i(2);
                                                int i25 = j10.i(2);
                                                j10.t(8);
                                                e eVar3 = this.f20278m;
                                                eVar3.f20266n = c13;
                                                eVar3.f20263k = i25;
                                            } else {
                                                j10.t(32);
                                            }
                                            z10 = false;
                                            i14 = 3;
                                            z2 = true;
                                            break;
                                        case ModuleDescriptor.MODULE_VERSION /* 152 */:
                                        case 153:
                                        case 154:
                                        case 155:
                                        case 156:
                                        case 157:
                                        case 158:
                                        case 159:
                                            int i26 = i17 - 152;
                                            e eVar4 = eVarArr[i26];
                                            j10.t(i11);
                                            boolean h5 = j10.h();
                                            j10.t(i11);
                                            int i27 = j10.i(i14);
                                            boolean h9 = j10.h();
                                            int i28 = j10.i(7);
                                            int i29 = j10.i(8);
                                            int i30 = j10.i(4);
                                            int i31 = j10.i(4);
                                            j10.t(i11);
                                            j10.t(6);
                                            j10.t(i11);
                                            int i32 = j10.i(3);
                                            int i33 = j10.i(3);
                                            eVar4.f20256c = true;
                                            eVar4.f20257d = h5;
                                            eVar4.f20258e = i27;
                                            eVar4.f20259f = h9;
                                            eVar4.f20260g = i28;
                                            eVar4.f20261h = i29;
                                            eVar4.f20262i = i30;
                                            int i34 = i31 + 1;
                                            if (eVar4.j != i34) {
                                                eVar4.j = i34;
                                                while (true) {
                                                    ArrayList arrayList = eVar4.f20254a;
                                                    if (arrayList.size() >= eVar4.j || arrayList.size() >= 15) {
                                                        arrayList.remove(0);
                                                    }
                                                }
                                            }
                                            if (i32 != 0 && eVar4.f20264l != i32) {
                                                eVar4.f20264l = i32;
                                                int i35 = i32 - 1;
                                                int i36 = e.f20245B[i35];
                                                boolean z12 = e.f20244A[i35];
                                                int i37 = e.f20252y[i35];
                                                int i38 = e.f20253z[i35];
                                                int i39 = e.f20251x[i35];
                                                eVar4.f20266n = i36;
                                                eVar4.f20263k = i39;
                                            }
                                            if (i33 != 0 && eVar4.f20265m != i33) {
                                                eVar4.f20265m = i33;
                                                int i40 = i33 - 1;
                                                int i41 = e.f20247D[i40];
                                                int i42 = e.f20246C[i40];
                                                eVar4.e(false, false);
                                                eVar4.f(e.f20249v, e.f20248E[i40]);
                                            }
                                            if (this.f20282q != i26) {
                                                this.f20282q = i26;
                                                this.f20278m = eVarArr[i26];
                                            }
                                            z10 = false;
                                            i14 = 3;
                                            z2 = true;
                                            break;
                                    }
                                } else {
                                    z10 = false;
                                    z2 = true;
                                    if (i17 <= 255) {
                                        this.f20278m.a((char) (i17 & 255));
                                    } else {
                                        AbstractC1482f.p(i17, StubApp.getString2(22673), string2);
                                        i3 = 2;
                                        c10 = 7;
                                    }
                                }
                                z11 = z2;
                                i3 = 2;
                                c10 = 7;
                            }
                            z2 = true;
                            c10 = 7;
                        } else {
                            z2 = true;
                            int i43 = j10.i(8);
                            if (i43 <= 31) {
                                c10 = 7;
                                if (i43 > 7) {
                                    if (i43 <= 15) {
                                        j10.t(8);
                                    } else if (i43 <= 23) {
                                        j10.t(16);
                                    } else if (i43 <= 31) {
                                        j10.t(24);
                                    }
                                }
                            } else {
                                c10 = 7;
                                if (i43 <= 127) {
                                    if (i43 == 32) {
                                        this.f20278m.a(' ');
                                    } else if (i43 == 33) {
                                        this.f20278m.a(Typography.nbsp);
                                    } else if (i43 == 37) {
                                        this.f20278m.a(Typography.ellipsis);
                                    } else if (i43 == 42) {
                                        this.f20278m.a((char) 352);
                                    } else if (i43 == 44) {
                                        this.f20278m.a((char) 338);
                                    } else if (i43 == 63) {
                                        this.f20278m.a((char) 376);
                                    } else if (i43 == 57) {
                                        this.f20278m.a(Typography.tm);
                                    } else if (i43 == 58) {
                                        this.f20278m.a((char) 353);
                                    } else if (i43 == 60) {
                                        this.f20278m.a((char) 339);
                                    } else if (i43 != 61) {
                                        switch (i43) {
                                            case 48:
                                                this.f20278m.a((char) 9608);
                                                break;
                                            case 49:
                                                this.f20278m.a(Typography.leftSingleQuote);
                                                break;
                                            case 50:
                                                this.f20278m.a(Typography.rightSingleQuote);
                                                break;
                                            case EACTags.TRANSACTION_DATE /* 51 */:
                                                this.f20278m.a(Typography.leftDoubleQuote);
                                                break;
                                            case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                                                this.f20278m.a(Typography.rightDoubleQuote);
                                                break;
                                            case EACTags.SEX /* 53 */:
                                                this.f20278m.a(Typography.bullet);
                                                break;
                                            default:
                                                switch (i43) {
                                                    case 118:
                                                        this.f20278m.a((char) 8539);
                                                        break;
                                                    case 119:
                                                        this.f20278m.a((char) 8540);
                                                        break;
                                                    case 120:
                                                        this.f20278m.a((char) 8541);
                                                        break;
                                                    case 121:
                                                        this.f20278m.a((char) 8542);
                                                        break;
                                                    case 122:
                                                        this.f20278m.a((char) 9474);
                                                        break;
                                                    case 123:
                                                        this.f20278m.a((char) 9488);
                                                        break;
                                                    case 124:
                                                        this.f20278m.a((char) 9492);
                                                        break;
                                                    case 125:
                                                        this.f20278m.a((char) 9472);
                                                        break;
                                                    case 126:
                                                        this.f20278m.a((char) 9496);
                                                        break;
                                                    case CertificateBody.profileType /* 127 */:
                                                        this.f20278m.a((char) 9484);
                                                        break;
                                                    default:
                                                        AbstractC1482f.p(i43, StubApp.getString2(22674), string2);
                                                        break;
                                                }
                                        }
                                    } else {
                                        this.f20278m.a((char) 8480);
                                    }
                                    z11 = true;
                                } else if (i43 > 159) {
                                    i3 = 2;
                                    if (i43 <= 255) {
                                        if (i43 == 160) {
                                            this.f20278m.a((char) 13252);
                                        } else {
                                            AbstractC1482f.p(i43, StubApp.getString2(22675), string2);
                                            this.f20278m.a('_');
                                        }
                                        z11 = true;
                                    } else {
                                        AbstractC1482f.p(i43, StubApp.getString2(22676), string2);
                                    }
                                } else if (i43 <= 135) {
                                    j10.t(32);
                                } else if (i43 <= 143) {
                                    j10.t(40);
                                } else if (i43 <= 159) {
                                    i3 = 2;
                                    j10.t(2);
                                    j10.t(j10.i(6) * 8);
                                }
                            }
                            i3 = 2;
                        }
                        i11 = i3;
                    }
                }
            }
        }
        if (z11) {
            this.f20279n = k();
        }
        this.f20281p = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List k() {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.f.k():java.util.List");
    }

    public final void l() {
        for (int i3 = 0; i3 < 8; i3++) {
            this.f20277l[i3].d();
        }
    }
}
