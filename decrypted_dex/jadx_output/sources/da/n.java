package da;

import com.stub.StubApp;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class n extends H {

    /* renamed from: f, reason: collision with root package name */
    public LinkedHashMap f13516f;

    /* renamed from: g, reason: collision with root package name */
    public C0819i[] f13517g;

    /* renamed from: h, reason: collision with root package name */
    public Ab.g[] f13518h;

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f13519i;
    public final HashMap j;

    /* renamed from: k, reason: collision with root package name */
    public String f13520k;

    public n(J j) {
        super(j);
        this.f13519i = new HashMap();
        this.j = new HashMap();
    }

    public static J1.s b(F f10, long j) {
        f10.seek(j);
        int G4 = f10.G();
        int i3 = 0;
        if (G4 == 1) {
            C0818h c0818h = new C0818h(0);
            c0818h.f3376b = G4;
            int G10 = f10.G();
            c0818h.f13507d = new int[G10];
            while (i3 < G10) {
                ((int[]) c0818h.f13507d)[i3] = f10.G();
                i3++;
            }
            return c0818h;
        }
        if (G4 != 2) {
            throw new IOException(i2.u.p(G4, StubApp.getString2(17216)));
        }
        C0818h c0818h2 = new C0818h(1);
        c0818h2.f3376b = G4;
        int G11 = f10.G();
        c0818h2.f13507d = new R0.d[G11];
        while (i3 < G11) {
            R0.d[] dVarArr = (R0.d[]) c0818h2.f13507d;
            R0.d dVar = new R0.d(4);
            dVar.f5935b = f10.G();
            dVar.f5936c = f10.G();
            dVar.f5937d = f10.G();
            dVarArr[i3] = dVar;
            i3++;
        }
        return c0818h2;
    }

    public static C0820j c(F f10, long j) {
        f10.seek(j);
        C0820j c0820j = new C0820j();
        f10.G();
        c0820j.f13510a = f10.G();
        int G4 = f10.G();
        c0820j.f13511b = new int[G4];
        for (int i3 = 0; i3 < G4; i3++) {
            c0820j.f13511b[i3] = f10.G();
        }
        return c0820j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x01ab, code lost:
    
        android.util.Log.w(r9, r13 + r10.f13508a + r15 + r12);
        r11 = 0;
        r5 = new da.C0819i[0];
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v7, types: [androidx.datastore.preferences.protobuf.j[]] */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.datastore.preferences.protobuf.j, da.k, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v8, types: [androidx.datastore.preferences.protobuf.j, da.l, java.lang.Object] */
    @Override // da.H
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(da.J r27, da.F r28) {
        /*
            Method dump skipped, instructions count: 812
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: da.n.a(da.J, da.F):void");
    }
}
