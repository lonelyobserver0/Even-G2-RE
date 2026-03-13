package E0;

import M4.F;
import M4.I;
import M4.Z;
import T0.J;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import com.stub.StubApp;
import java.util.List;
import java.util.Objects;
import o0.AbstractC1405B;
import o0.C1431f;
import o0.C1438m;
import r0.AbstractC1540a;
import r0.AbstractC1550k;
import r0.AbstractC1560u;
import v0.C1812g;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final String f1777a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1778b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1779c;

    /* renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f1780d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1781e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f1782f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f1783g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f1784h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f1785i;

    public p(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z2, boolean z10, boolean z11, boolean z12) {
        str.getClass();
        this.f1777a = str;
        this.f1778b = str2;
        this.f1779c = str3;
        this.f1780d = codecCapabilities;
        this.f1783g = z2;
        this.f1781e = z10;
        this.f1782f = z11;
        this.f1784h = z12;
        this.f1785i = AbstractC1405B.l(str2);
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i3, int i10, double d8) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(AbstractC1560u.f(i3, widthAlignment) * widthAlignment, AbstractC1560u.f(i10, heightAlignment) * heightAlignment);
        int i11 = point.x;
        int i12 = point.y;
        return (d8 == -1.0d || d8 < 1.0d) ? videoCapabilities.isSizeSupported(i11, i12) : videoCapabilities.areSizeAndRateSupported(i11, i12, Math.floor(d8));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if (com.stub.StubApp.getString2(1602).equals(r3) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        if (com.stub.StubApp.getString2(1604).equals(r9) == false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static E0.p h(java.lang.String r9, java.lang.String r10, java.lang.String r11, android.media.MediaCodecInfo.CodecCapabilities r12, boolean r13, boolean r14) {
        /*
            E0.p r0 = new E0.p
            r1 = 0
            r2 = 1
            if (r12 == 0) goto L52
            r3 = 1600(0x640, float:2.242E-42)
            java.lang.String r3 = com.stub.StubApp.getString2(r3)
            boolean r3 = r12.isFeatureSupported(r3)
            if (r3 == 0) goto L52
            int r3 = r0.AbstractC1560u.f20190a
            r4 = 22
            if (r3 > r4) goto L50
            java.lang.String r3 = r0.AbstractC1560u.f20193d
            r4 = 1601(0x641, float:2.243E-42)
            java.lang.String r4 = com.stub.StubApp.getString2(r4)
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L35
            r4 = 1602(0x642, float:2.245E-42)
            java.lang.String r4 = com.stub.StubApp.getString2(r4)
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L50
        L35:
            r3 = 1603(0x643, float:2.246E-42)
            java.lang.String r3 = com.stub.StubApp.getString2(r3)
            boolean r3 = r3.equals(r9)
            if (r3 != 0) goto L52
            r3 = 1604(0x644, float:2.248E-42)
            java.lang.String r3 = com.stub.StubApp.getString2(r3)
            boolean r3 = r3.equals(r9)
            if (r3 == 0) goto L50
            goto L52
        L50:
            r6 = r2
            goto L53
        L52:
            r6 = r1
        L53:
            if (r12 == 0) goto L60
            r3 = 1605(0x645, float:2.249E-42)
            java.lang.String r3 = com.stub.StubApp.getString2(r3)
            boolean r3 = r12.isFeatureSupported(r3)
        L60:
            if (r14 != 0) goto L74
            if (r12 == 0) goto L72
            r14 = 1092(0x444, float:1.53E-42)
            java.lang.String r14 = com.stub.StubApp.getString2(r14)
            boolean r14 = r12.isFeatureSupported(r14)
            if (r14 == 0) goto L72
            goto L74
        L72:
            r7 = r1
            goto L75
        L74:
            r7 = r2
        L75:
            int r14 = r0.AbstractC1560u.f20190a
            r3 = 35
            if (r14 < r3) goto L91
            if (r12 == 0) goto L91
            r14 = 1606(0x646, float:2.25E-42)
            java.lang.String r14 = com.stub.StubApp.getString2(r14)
            boolean r14 = r12.isFeatureSupported(r14)
            if (r14 == 0) goto L91
            r8 = r2
            r1 = r9
            r3 = r11
            r4 = r12
            r5 = r13
            r2 = r10
            goto L97
        L91:
            r8 = r1
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r1 = r9
        L97:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: E0.p.h(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean):E0.p");
    }

    public final C1812g b(C1438m c1438m, C1438m c1438m2) {
        C1438m c1438m3;
        C1438m c1438m4;
        String str = c1438m.f18216n;
        String str2 = c1438m2.f18216n;
        int i3 = AbstractC1560u.f20190a;
        int i10 = !Objects.equals(str, str2) ? 8 : 0;
        if (this.f1785i) {
            if (c1438m.f18226x != c1438m2.f18226x) {
                i10 |= 1024;
            }
            if (!this.f1781e && (c1438m.f18223u != c1438m2.f18223u || c1438m.f18224v != c1438m2.f18224v)) {
                i10 |= 512;
            }
            C1431f c1431f = c1438m.f18192B;
            boolean e10 = C1431f.e(c1431f);
            C1431f c1431f2 = c1438m2.f18192B;
            if ((!e10 || !C1431f.e(c1431f2)) && !Objects.equals(c1431f, c1431f2)) {
                i10 |= 2048;
            }
            if (AbstractC1560u.f20193d.startsWith(StubApp.getString2(1607)) && StubApp.getString2(1608).equals(this.f1777a) && !c1438m.b(c1438m2)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new C1812g(this.f1777a, c1438m, c1438m2, c1438m.b(c1438m2) ? 3 : 2, 0);
            }
            c1438m3 = c1438m;
            c1438m4 = c1438m2;
        } else {
            c1438m3 = c1438m;
            c1438m4 = c1438m2;
            if (c1438m3.f18193C != c1438m4.f18193C) {
                i10 |= 4096;
            }
            if (c1438m3.f18194D != c1438m4.f18194D) {
                i10 |= 8192;
            }
            if (c1438m3.f18195E != c1438m4.f18195E) {
                i10 |= 16384;
            }
            String str3 = this.f1778b;
            if (i10 == 0 && StubApp.getString2(468).equals(str3)) {
                Pair d8 = z.d(c1438m3);
                Pair d10 = z.d(c1438m4);
                if (d8 != null && d10 != null) {
                    int intValue = ((Integer) d8.first).intValue();
                    int intValue2 = ((Integer) d10.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new C1812g(this.f1777a, c1438m3, c1438m4, 3, 0);
                    }
                }
            }
            if (!c1438m3.b(c1438m4)) {
                i10 |= 32;
            }
            if (StubApp.getString2(1609).equals(str3)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new C1812g(this.f1777a, c1438m3, c1438m4, 1, 0);
            }
        }
        return new C1812g(this.f1777a, c1438m3, c1438m4, 0, i10);
    }

    public final boolean c(C1438m c1438m, boolean z2) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Pair pair;
        String str;
        Pair c10;
        int i3 = 4;
        int i10 = 3;
        Pair d8 = z.d(c1438m);
        String str2 = this.f1779c;
        String string2 = StubApp.getString2(1610);
        String str3 = c1438m.f18216n;
        if (str3 != null) {
            String string22 = StubApp.getString2(1611);
            if (str3.equals(string22)) {
                String m4 = AbstractC1405B.m(str2);
                if (m4.equals(string22)) {
                    return true;
                }
                if (m4.equals(string2)) {
                    List list = c1438m.f18219q;
                    int i11 = 0;
                    loop0: while (true) {
                        if (i11 >= list.size()) {
                            pair = null;
                            str = null;
                            break;
                        }
                        byte[] bArr = (byte[]) list.get(i11);
                        int length = bArr.length;
                        if (length > i10) {
                            boolean[] zArr = new boolean[i10];
                            F l9 = I.l();
                            int i12 = 0;
                            while (i12 < bArr.length) {
                                int b2 = s0.n.b(bArr, i12, bArr.length, zArr);
                                if (b2 != bArr.length) {
                                    l9.a(Integer.valueOf(b2));
                                }
                                i12 = b2 + 3;
                            }
                            Z g10 = l9.g();
                            for (int i13 = 0; i13 < g10.f4580d; i13++) {
                                if (((Integer) g10.get(i13)).intValue() + i10 < length) {
                                    J j = new J(bArr, ((Integer) g10.get(i13)).intValue() + i10, length);
                                    Z9.n d10 = s0.n.d(j);
                                    if (d10.f9136b == 33 && d10.f9137c == 0) {
                                        j.t(4);
                                        int i14 = j.i(3);
                                        j.s();
                                        pair = null;
                                        s0.g e10 = s0.n.e(j, true, i14, null);
                                        str = AbstractC1540a.b(e10.f20602a, e10.f20604c, e10.f20605d, e10.f20606e, e10.f20603b, e10.f20607f);
                                        break loop0;
                                    }
                                    i10 = 3;
                                }
                            }
                        }
                        i11++;
                    }
                    if (str == null) {
                        c10 = pair;
                    } else {
                        String trim = str.trim();
                        int i15 = AbstractC1560u.f20190a;
                        c10 = AbstractC1540a.c(str, trim.split(StubApp.getString2(1612), -1), c1438m.f18192B);
                    }
                    d8 = c10;
                }
            }
        }
        if (d8 == null) {
            return true;
        }
        int intValue = ((Integer) d8.first).intValue();
        int intValue2 = ((Integer) d8.second).intValue();
        boolean equals = StubApp.getString2(1613).equals(str3);
        String str4 = this.f1778b;
        if (equals) {
            if (StubApp.getString2(469).equals(str4)) {
                intValue = 8;
            } else if (string2.equals(str4)) {
                intValue = 2;
            }
            intValue2 = 0;
        }
        if (!this.f1785i && intValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f1780d;
        if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
        }
        if (AbstractC1560u.f20190a <= 23 && StubApp.getString2(1614).equals(str4) && codecProfileLevelArr.length == 0) {
            int intValue3 = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : videoCapabilities.getBitrateRange().getUpper().intValue();
            if (intValue3 >= 180000000) {
                i3 = 1024;
            } else if (intValue3 >= 120000000) {
                i3 = 512;
            } else if (intValue3 >= 60000000) {
                i3 = 256;
            } else if (intValue3 >= 30000000) {
                i3 = 128;
            } else if (intValue3 >= 18000000) {
                i3 = 64;
            } else if (intValue3 >= 12000000) {
                i3 = 32;
            } else if (intValue3 >= 7200000) {
                i3 = 16;
            } else if (intValue3 >= 3600000) {
                i3 = 8;
            } else if (intValue3 < 1800000) {
                i3 = intValue3 >= 800000 ? 2 : 1;
            }
            MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
            codecProfileLevel.profile = 1;
            codecProfileLevel.level = i3;
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArr) {
            if (codecProfileLevel2.profile == intValue && (codecProfileLevel2.level >= intValue2 || !z2)) {
                if (!string2.equals(str4) || 2 != intValue) {
                    return true;
                }
                String str5 = AbstractC1560u.f20191b;
                if (!StubApp.getString2(1615).equals(str5) && !StubApp.getString2(1616).equals(str5)) {
                    return true;
                }
            }
        }
        g(StubApp.getString2(1617) + c1438m.f18213k + StubApp.getString2(81) + str2);
        return false;
    }

    public final boolean d(C1438m c1438m) {
        int i3;
        String str = c1438m.f18216n;
        String str2 = this.f1778b;
        if (!(str2.equals(str) || str2.equals(z.b(c1438m))) || !c(c1438m, true)) {
            return false;
        }
        if (this.f1785i) {
            int i10 = c1438m.f18223u;
            if (i10 > 0 && (i3 = c1438m.f18224v) > 0) {
                return f(c1438m.f18225w, i10, i3);
            }
        } else {
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.f1780d;
            int i11 = c1438m.f18194D;
            if (i11 != -1) {
                if (codecCapabilities == null) {
                    g(StubApp.getString2(1618));
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    g(StubApp.getString2(1619));
                    return false;
                }
                if (!audioCapabilities.isSampleRateSupported(i11)) {
                    g(StubApp.getString2(1620) + i11);
                    return false;
                }
            }
            int i12 = c1438m.f18193C;
            if (i12 != -1) {
                if (codecCapabilities == null) {
                    g(StubApp.getString2(1621));
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities2 == null) {
                    g(StubApp.getString2(1622));
                    return false;
                }
                int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && ((AbstractC1560u.f20190a < 26 || maxInputChannelCount <= 0) && !StubApp.getString2(1623).equals(str2) && !StubApp.getString2(1624).equals(str2) && !StubApp.getString2(1625).equals(str2) && !StubApp.getString2(468).equals(str2) && !StubApp.getString2(1626).equals(str2) && !StubApp.getString2(1609).equals(str2) && !StubApp.getString2(76).equals(str2) && !StubApp.getString2(1627).equals(str2) && !StubApp.getString2(83).equals(str2) && !StubApp.getString2(84).equals(str2) && !StubApp.getString2(1628).equals(str2))) {
                    int i13 = StubApp.getString2(1629).equals(str2) ? 6 : StubApp.getString2(935).equals(str2) ? 16 : 30;
                    AbstractC1550k.w(StubApp.getString2(1633), StubApp.getString2(1630) + this.f1777a + StubApp.getString2(1631) + maxInputChannelCount + StubApp.getString2(1632) + i13 + StubApp.getString2(511));
                    maxInputChannelCount = i13;
                }
                if (maxInputChannelCount < i12) {
                    g(StubApp.getString2(1634) + i12);
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean e(C1438m c1438m) {
        if (this.f1785i) {
            return this.f1781e;
        }
        Pair d8 = z.d(c1438m);
        return d8 != null && ((Integer) d8.first).intValue() == 42;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
    
        r4 = r1.getSupportedPerformancePoints();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009d, code lost:
    
        if (r2 == false) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(double r12, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: E0.p.f(double, int, int):boolean");
    }

    public final void g(String str) {
        String string2 = StubApp.getString2(1644);
        String string22 = StubApp.getString2(1642);
        StringBuilder l9 = com.mapbox.common.b.l(string2, str, string22);
        l9.append(this.f1777a);
        l9.append(StubApp.getString2(81));
        l9.append(this.f1778b);
        l9.append(string22);
        l9.append(AbstractC1560u.f20194e);
        l9.append(StubApp.getString2(511));
        AbstractC1550k.j(StubApp.getString2(1633), l9.toString());
    }

    public final String toString() {
        return this.f1777a;
    }
}
