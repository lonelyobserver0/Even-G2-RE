package com.google.android.gms.internal.measurement;

import android.os.Build;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.jvm.internal.IntCompanionObject;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* renamed from: com.google.android.gms.internal.measurement.n1, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0653n1 extends AbstractC0639k2 {
    private static final C0653n1 zzat;
    private int zzA;
    private String zzB;
    private String zzC;
    private boolean zzD;
    private InterfaceC0669q2 zzE;
    private String zzF;
    private int zzG;
    private int zzH;
    private int zzI;
    private String zzJ;
    private long zzK;
    private long zzL;
    private String zzM;
    private String zzN;
    private int zzO;
    private String zzP;
    private C0658o1 zzQ;
    private InterfaceC0659o2 zzR;
    private long zzS;
    private long zzT;
    private String zzU;
    private String zzV;
    private int zzW;
    private boolean zzX;
    private String zzY;
    private boolean zzZ;
    private C0633j1 zzaa;
    private String zzab;
    private InterfaceC0669q2 zzac;
    private String zzad;
    private long zzae;
    private boolean zzaf;
    private String zzag;
    private boolean zzah;
    private String zzai;
    private int zzaj;
    private String zzak;
    private V0 zzal;
    private int zzam;
    private S0 zzan;
    private String zzao;
    private C0687u1 zzap;
    private long zzaq;
    private String zzar;
    private C0593b1 zzas;
    private int zzb;
    private int zzd;
    private int zze;
    private InterfaceC0669q2 zzf;
    private InterfaceC0669q2 zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private String zzm;
    private String zzn;
    private String zzo;
    private String zzp;
    private int zzq;
    private String zzr;
    private String zzs;
    private String zzt;
    private long zzu;
    private long zzv;
    private String zzw;
    private boolean zzx;
    private String zzy;
    private long zzz;

    static {
        C0653n1 c0653n1 = new C0653n1();
        zzat = c0653n1;
        AbstractC0639k2.m(C0653n1.class, c0653n1);
    }

    public C0653n1() {
        J2 j22 = J2.f11292e;
        this.zzf = j22;
        this.zzg = j22;
        this.zzm = "";
        this.zzn = "";
        this.zzo = "";
        this.zzp = "";
        this.zzr = "";
        this.zzs = "";
        this.zzt = "";
        this.zzw = "";
        this.zzy = "";
        this.zzB = "";
        this.zzC = "";
        this.zzE = j22;
        this.zzF = "";
        this.zzJ = "";
        this.zzM = "";
        this.zzN = "";
        this.zzP = "";
        this.zzR = C0644l2.f11607e;
        this.zzU = "";
        this.zzV = "";
        this.zzY = "";
        this.zzab = "";
        this.zzac = j22;
        this.zzad = "";
        this.zzag = "";
        this.zzai = "";
        this.zzak = "";
        this.zzao = "";
        this.zzar = "";
    }

    public static C0648m1 U() {
        return (C0648m1) zzat.h();
    }

    public static C0648m1 V(C0653n1 c0653n1) {
        AbstractC0634j2 h2 = zzat.h();
        h2.f(c0653n1);
        return (C0648m1) h2;
    }

    public final long A() {
        return this.zzz;
    }

    public final boolean A0() {
        return (this.zzd & PKIFailureInfo.unsupportedVersion) != 0;
    }

    public final /* synthetic */ void A1(boolean z2) {
        this.zzb |= PKIFailureInfo.unsupportedVersion;
        this.zzx = z2;
    }

    public final boolean B() {
        return (this.zzb & PKIFailureInfo.badCertTemplate) != 0;
    }

    public final String B0() {
        return this.zzag;
    }

    public final /* synthetic */ void B1() {
        this.zzb &= -131073;
        this.zzx = false;
    }

    public final int C() {
        return this.zzA;
    }

    public final boolean C0() {
        return (this.zzd & PKIFailureInfo.transactionIdInUse) != 0;
    }

    public final /* synthetic */ void C1(String str) {
        this.zzb |= PKIFailureInfo.transactionIdInUse;
        this.zzy = str;
    }

    public final String D() {
        return this.zzB;
    }

    public final boolean D0() {
        return this.zzah;
    }

    public final /* synthetic */ void D1() {
        this.zzb &= -262145;
        this.zzy = zzat.zzy;
    }

    public final String E() {
        return this.zzC;
    }

    public final boolean E0() {
        return (this.zzd & PKIFailureInfo.signerNotTrusted) != 0;
    }

    public final /* synthetic */ void E1(long j) {
        this.zzb |= PKIFailureInfo.signerNotTrusted;
        this.zzz = j;
    }

    public final boolean F() {
        return (this.zzb & 8388608) != 0;
    }

    public final String F0() {
        return this.zzai;
    }

    public final /* synthetic */ void F1(int i3) {
        this.zzb |= PKIFailureInfo.badCertTemplate;
        this.zzA = i3;
    }

    public final boolean G() {
        return this.zzD;
    }

    public final int G0() {
        return this.zzaj;
    }

    public final /* synthetic */ void G1(String str) {
        this.zzb |= PKIFailureInfo.badSenderNonce;
        this.zzB = str;
    }

    public final InterfaceC0669q2 H() {
        return this.zzE;
    }

    public final boolean H0() {
        return (this.zzd & 4194304) != 0;
    }

    public final /* synthetic */ void H1() {
        this.zzb &= -2097153;
        this.zzB = zzat.zzB;
    }

    public final String I() {
        return this.zzF;
    }

    public final V0 I0() {
        V0 v02 = this.zzal;
        return v02 == null ? V0.x() : v02;
    }

    public final /* synthetic */ void I1(String str) {
        str.getClass();
        this.zzb |= 4194304;
        this.zzC = str;
    }

    public final boolean J() {
        return (this.zzb & 33554432) != 0;
    }

    public final boolean J0() {
        return (this.zzd & 8388608) != 0;
    }

    public final /* synthetic */ void J1() {
        this.zzb |= 8388608;
        this.zzD = false;
    }

    public final int K() {
        return this.zzG;
    }

    public final int K0() {
        return this.zzam;
    }

    public final void K1(ArrayList arrayList) {
        InterfaceC0669q2 interfaceC0669q2 = this.zzE;
        if (!((W1) interfaceC0669q2).f11400a) {
            int size = interfaceC0669q2.size();
            this.zzE = interfaceC0669q2.A(size + size);
        }
        V1.c(arrayList, this.zzE);
    }

    public final boolean L() {
        return (this.zzb & PKIFailureInfo.duplicateCertReq) != 0;
    }

    public final boolean L0() {
        return (this.zzd & 16777216) != 0;
    }

    public final void L1() {
        this.zzE = J2.f11292e;
    }

    public final long M() {
        return this.zzK;
    }

    public final S0 M0() {
        S0 s02 = this.zzan;
        return s02 == null ? S0.P() : s02;
    }

    public final /* synthetic */ void M1(String str) {
        this.zzb |= 16777216;
        this.zzF = str;
    }

    public final boolean N() {
        return (this.zzb & Integer.MIN_VALUE) != 0;
    }

    public final boolean N0() {
        return (this.zzd & 67108864) != 0;
    }

    public final /* synthetic */ void N1(int i3) {
        this.zzb |= 33554432;
        this.zzG = i3;
    }

    public final String O() {
        return this.zzM;
    }

    public final C0687u1 O0() {
        C0687u1 c0687u1 = this.zzap;
        return c0687u1 == null ? C0687u1.r() : c0687u1;
    }

    public final /* synthetic */ void O1() {
        this.zzb &= -268435457;
        this.zzJ = zzat.zzJ;
    }

    public final boolean P() {
        return (this.zzb & 1) != 0;
    }

    public final int P0() {
        return this.zze;
    }

    public final List P1() {
        return this.zzf;
    }

    public final boolean Q() {
        return (this.zzd & 134217728) != 0;
    }

    public final /* synthetic */ void Q0(long j) {
        this.zzb |= PKIFailureInfo.duplicateCertReq;
        this.zzK = j;
    }

    public final void Q1() {
        InterfaceC0669q2 interfaceC0669q2 = this.zzf;
        if (((W1) interfaceC0669q2).f11400a) {
            return;
        }
        int size = interfaceC0669q2.size();
        this.zzf = interfaceC0669q2.A(size + size);
    }

    public final long R() {
        return this.zzaq;
    }

    public final /* synthetic */ void R0(String str) {
        str.getClass();
        this.zzb |= Integer.MIN_VALUE;
        this.zzM = str;
    }

    public final void R1() {
        InterfaceC0669q2 interfaceC0669q2 = this.zzg;
        if (((W1) interfaceC0669q2).f11400a) {
            return;
        }
        int size = interfaceC0669q2.size();
        this.zzg = interfaceC0669q2.A(size + size);
    }

    public final boolean S() {
        return (this.zzd & PKIFailureInfo.duplicateCertReq) != 0;
    }

    public final /* synthetic */ void S0() {
        this.zzb &= IntCompanionObject.MAX_VALUE;
        this.zzM = zzat.zzM;
    }

    public final int S1() {
        return this.zzf.size();
    }

    public final C0593b1 T() {
        C0593b1 c0593b1 = this.zzas;
        return c0593b1 == null ? C0593b1.r() : c0593b1;
    }

    public final /* synthetic */ void T0(int i3) {
        this.zzd |= 2;
        this.zzO = i3;
    }

    public final C0613f1 T1(int i3) {
        return (C0613f1) this.zzf.get(i3);
    }

    public final void U0(ArrayList arrayList) {
        RandomAccess randomAccess = this.zzR;
        if (!((W1) randomAccess).f11400a) {
            C0644l2 c0644l2 = (C0644l2) randomAccess;
            int i3 = c0644l2.f11609c;
            this.zzR = c0644l2.A(i3 + i3);
        }
        V1.c(arrayList, this.zzR);
    }

    public final InterfaceC0669q2 U1() {
        return this.zzg;
    }

    public final /* synthetic */ void V0(long j) {
        this.zzd |= 16;
        this.zzS = j;
    }

    public final int V1() {
        return this.zzg.size();
    }

    public final /* synthetic */ void W() {
        this.zzb |= 1;
        this.zze = 1;
    }

    public final /* synthetic */ void W0(long j) {
        this.zzd |= 32;
        this.zzT = j;
    }

    public final C0697w1 W1(int i3) {
        return (C0697w1) this.zzg.get(i3);
    }

    public final /* synthetic */ void X(int i3, C0613f1 c0613f1) {
        Q1();
        this.zzf.set(i3, c0613f1);
    }

    public final /* synthetic */ void X0(String str) {
        this.zzd |= 128;
        this.zzV = str;
    }

    public final boolean X1() {
        return (this.zzb & 2) != 0;
    }

    public final /* synthetic */ void Y(C0613f1 c0613f1) {
        Q1();
        this.zzf.add(c0613f1);
    }

    public final /* synthetic */ void Y0(String str) {
        str.getClass();
        this.zzd |= 8192;
        this.zzab = str;
    }

    public final long Y1() {
        return this.zzh;
    }

    public final /* synthetic */ void Z(List list) {
        Q1();
        V1.c(list, this.zzf);
    }

    public final /* synthetic */ void Z0() {
        this.zzd &= -8193;
        this.zzab = zzat.zzab;
    }

    public final boolean Z1() {
        return (this.zzb & 4) != 0;
    }

    public final void a0() {
        this.zzf = J2.f11292e;
    }

    public final void a1(Set set) {
        InterfaceC0669q2 interfaceC0669q2 = this.zzac;
        if (!((W1) interfaceC0669q2).f11400a) {
            int size = interfaceC0669q2.size();
            this.zzac = interfaceC0669q2.A(size + size);
        }
        V1.c(set, this.zzac);
    }

    public final long a2() {
        return this.zzi;
    }

    public final /* synthetic */ void b0(int i3) {
        Q1();
        this.zzf.remove(i3);
    }

    public final /* synthetic */ void b1(String str) {
        str.getClass();
        this.zzd |= 16384;
        this.zzad = str;
    }

    public final boolean b2() {
        return (this.zzb & 8) != 0;
    }

    public final /* synthetic */ void c0(int i3, C0697w1 c0697w1) {
        R1();
        this.zzg.set(i3, c0697w1);
    }

    public final /* synthetic */ void c1(long j) {
        this.zzd |= 32768;
        this.zzae = j;
    }

    public final long c2() {
        return this.zzj;
    }

    public final /* synthetic */ void d0(C0697w1 c0697w1) {
        R1();
        this.zzg.add(c0697w1);
    }

    public final /* synthetic */ void d1(boolean z2) {
        this.zzd |= PKIFailureInfo.notAuthorized;
        this.zzaf = z2;
    }

    public final boolean d2() {
        return (this.zzb & 16) != 0;
    }

    public final /* synthetic */ void e0(int i3) {
        R1();
        this.zzg.remove(i3);
    }

    public final /* synthetic */ void e1(String str) {
        this.zzd |= PKIFailureInfo.unsupportedVersion;
        this.zzag = str;
    }

    public final long e2() {
        return this.zzk;
    }

    public final /* synthetic */ void f0(long j) {
        this.zzb |= 2;
        this.zzh = j;
    }

    public final /* synthetic */ void f1(boolean z2) {
        this.zzd |= PKIFailureInfo.transactionIdInUse;
        this.zzah = z2;
    }

    public final boolean f2() {
        return (this.zzb & 32) != 0;
    }

    public final /* synthetic */ void g0() {
        this.zzb &= -3;
        this.zzh = 0L;
    }

    public final /* synthetic */ void g1(String str) {
        str.getClass();
        this.zzd |= PKIFailureInfo.signerNotTrusted;
        this.zzai = str;
    }

    public final long g2() {
        return this.zzl;
    }

    public final /* synthetic */ void h0(long j) {
        this.zzb |= 4;
        this.zzi = j;
    }

    public final /* synthetic */ void h1(int i3) {
        this.zzd |= PKIFailureInfo.badCertTemplate;
        this.zzaj = i3;
    }

    public final String h2() {
        return this.zzm;
    }

    public final /* synthetic */ void i0(long j) {
        this.zzb |= 8;
        this.zzj = j;
    }

    public final /* synthetic */ void i1(V0 v02) {
        this.zzal = v02;
        this.zzd |= 4194304;
    }

    public final String i2() {
        return this.zzn;
    }

    public final /* synthetic */ void j0(long j) {
        this.zzb |= 16;
        this.zzk = j;
    }

    public final /* synthetic */ void j1(int i3) {
        this.zzd |= 8388608;
        this.zzam = i3;
    }

    public final String j2() {
        return this.zzo;
    }

    public final /* synthetic */ void k0() {
        this.zzb &= -17;
        this.zzk = 0L;
    }

    public final /* synthetic */ void k1(S0 s02) {
        this.zzan = s02;
        this.zzd |= 16777216;
    }

    public final String k2() {
        return this.zzp;
    }

    public final /* synthetic */ void l0(long j) {
        this.zzb |= 32;
        this.zzl = j;
    }

    public final /* synthetic */ void l1(C0687u1 c0687u1) {
        this.zzap = c0687u1;
        this.zzd |= 67108864;
    }

    public final boolean l2() {
        return (this.zzb & 1024) != 0;
    }

    public final /* synthetic */ void m0() {
        this.zzb &= -33;
        this.zzl = 0L;
    }

    public final /* synthetic */ void m1(long j) {
        this.zzd |= 134217728;
        this.zzaq = j;
    }

    public final int m2() {
        return this.zzq;
    }

    public final /* synthetic */ void n0() {
        this.zzb |= 64;
        this.zzm = StubApp.getString2(3400);
    }

    public final /* synthetic */ void n1() {
        this.zzd |= 268435456;
        this.zzar = "";
    }

    public final String n2() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0639k2
    public final Object o(int i3) {
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new K2(zzat, StubApp.getString2(12174), new Object[]{StubApp.getString2(11560), StubApp.getString2(11558), StubApp.getString2(11559), StubApp.getString2(11561), C0613f1.class, StubApp.getString2(11562), C0697w1.class, StubApp.getString2(11564), StubApp.getString2(11565), StubApp.getString2(11688), StubApp.getString2(11690), StubApp.getString2(11691), StubApp.getString2(11692), StubApp.getString2(11693), StubApp.getString2(11694), StubApp.getString2(11686), StubApp.getString2(11687), StubApp.getString2(11695), StubApp.getString2(11696), StubApp.getString2(12125), StubApp.getString2(12126), StubApp.getString2(12127), StubApp.getString2(12128), StubApp.getString2(12129), StubApp.getString2(12130), StubApp.getString2(12131), StubApp.getString2(12132), StubApp.getString2(12133), StubApp.getString2(11689), StubApp.getString2(12134), StubApp.getString2(12135), X0.class, StubApp.getString2(12136), StubApp.getString2(12137), StubApp.getString2(12138), StubApp.getString2(12139), StubApp.getString2(12140), StubApp.getString2(12141), StubApp.getString2(12142), StubApp.getString2(12143), StubApp.getString2(12144), StubApp.getString2(12145), StubApp.getString2(12146), StubApp.getString2(12147), StubApp.getString2(12148), StubApp.getString2(12149), StubApp.getString2(12150), StubApp.getString2(12151), StubApp.getString2(12152), StubApp.getString2(12153), C0696w0.f11750g, StubApp.getString2(12154), StubApp.getString2(12155), StubApp.getString2(12156), StubApp.getString2(12157), StubApp.getString2(12158), StubApp.getString2(12159), StubApp.getString2(12160), StubApp.getString2(12161), StubApp.getString2(12162), StubApp.getString2(12163), StubApp.getString2(12164), StubApp.getString2(12165), StubApp.getString2(12166), StubApp.getString2(12167), StubApp.getString2(12168), StubApp.getString2(12169), StubApp.getString2(12170), StubApp.getString2(12171), StubApp.getString2(12123), StubApp.getString2(12124), StubApp.getString2(12172), StubApp.getString2(12173)});
        }
        if (i10 == 3) {
            return new C0653n1();
        }
        if (i10 == 4) {
            return new C0648m1(zzat);
        }
        if (i10 == 5) {
            return zzat;
        }
        throw null;
    }

    public final /* synthetic */ void o0(String str) {
        str.getClass();
        this.zzb |= 128;
        this.zzn = str;
    }

    public final /* synthetic */ void o1(C0593b1 c0593b1) {
        this.zzas = c0593b1;
        this.zzd |= PKIFailureInfo.duplicateCertReq;
    }

    public final String p() {
        return this.zzs;
    }

    public final boolean p0() {
        return (this.zzd & 2) != 0;
    }

    public final /* synthetic */ void p1() {
        String str = Build.MODEL;
        str.getClass();
        this.zzb |= 256;
        this.zzo = str;
    }

    public final String q() {
        return this.zzt;
    }

    public final int q0() {
        return this.zzO;
    }

    public final /* synthetic */ void q1() {
        this.zzb &= -257;
        this.zzo = zzat.zzo;
    }

    public final boolean r() {
        return (this.zzb & 16384) != 0;
    }

    public final boolean r0() {
        return (this.zzd & 16) != 0;
    }

    public final /* synthetic */ void r1(String str) {
        str.getClass();
        this.zzb |= 512;
        this.zzp = str;
    }

    public final long s() {
        return this.zzu;
    }

    public final long s0() {
        return this.zzS;
    }

    public final /* synthetic */ void s1(int i3) {
        this.zzb |= 1024;
        this.zzq = i3;
    }

    public final boolean t() {
        return (this.zzb & 32768) != 0;
    }

    public final boolean t0() {
        return (this.zzd & 128) != 0;
    }

    public final /* synthetic */ void t1(String str) {
        str.getClass();
        this.zzb |= 2048;
        this.zzr = str;
    }

    public final long u() {
        return this.zzv;
    }

    public final String u0() {
        return this.zzV;
    }

    public final /* synthetic */ void u1(String str) {
        str.getClass();
        this.zzb |= 4096;
        this.zzs = str;
    }

    public final String v() {
        return this.zzw;
    }

    public final boolean v0() {
        return (this.zzd & 8192) != 0;
    }

    public final /* synthetic */ void v1(String str) {
        str.getClass();
        this.zzb |= 8192;
        this.zzt = str;
    }

    public final boolean w() {
        return (this.zzb & PKIFailureInfo.unsupportedVersion) != 0;
    }

    public final String w0() {
        return this.zzab;
    }

    public final /* synthetic */ void w1(long j) {
        this.zzb |= 16384;
        this.zzu = j;
    }

    public final boolean x() {
        return this.zzx;
    }

    public final boolean x0() {
        return (this.zzd & 32768) != 0;
    }

    public final /* synthetic */ void x1() {
        this.zzb |= 32768;
        this.zzv = 130000L;
    }

    public final String y() {
        return this.zzy;
    }

    public final long y0() {
        return this.zzae;
    }

    public final /* synthetic */ void y1(String str) {
        str.getClass();
        this.zzb |= PKIFailureInfo.notAuthorized;
        this.zzw = str;
    }

    public final boolean z() {
        return (this.zzb & PKIFailureInfo.signerNotTrusted) != 0;
    }

    public final boolean z0() {
        return this.zzaf;
    }

    public final /* synthetic */ void z1() {
        this.zzb &= -65537;
        this.zzw = zzat.zzw;
    }
}
