package da;

import android.util.Log;
import com.stub.StubApp;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class t extends H {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f13533f;

    /* renamed from: g, reason: collision with root package name */
    public Serializable f13534g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(J j, int i3) {
        super(j);
        this.f13533f = i3;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [c5.C[], java.io.Serializable] */
    @Override // da.H
    public final void a(J j, F f10) {
        int i3;
        switch (this.f13533f) {
            case 0:
                int G4 = f10.G();
                if (G4 != 0) {
                    G4 = (G4 << 16) | f10.G();
                }
                String string2 = StubApp.getString2(948);
                if (G4 == 0) {
                    i3 = f10.G();
                } else if (G4 == 1) {
                    i3 = (int) f10.F();
                } else {
                    Xa.h.v(G4, StubApp.getString2(17226), string2);
                    i3 = 0;
                }
                if (i3 > 0) {
                    this.f13534g = new c5.C[i3];
                    for (int i10 = 0; i10 < i3; i10++) {
                        c5.C c10 = new c5.C(2);
                        if (G4 == 0) {
                            int G10 = f10.G();
                            if (G10 != 0) {
                                Log.i(string2, StubApp.getString2(17227) + G10);
                            } else {
                                int G11 = f10.G();
                                if (G11 < 6) {
                                    throw new IOException(Xa.h.g(G11, StubApp.getString2(17230), StubApp.getString2(17231)));
                                }
                                int G12 = (f10.G() & 65280) >> 8;
                                if (G12 == 0) {
                                    J7.h hVar = new J7.h();
                                    int G13 = f10.G();
                                    f10.G();
                                    f10.G();
                                    f10.G();
                                    hVar.f3432b = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, G13, 3);
                                    for (int i11 = 0; i11 < G13; i11++) {
                                        int G14 = f10.G();
                                        int G15 = f10.G();
                                        short A4 = f10.A();
                                        int[] iArr = ((int[][]) hVar.f3432b)[i11];
                                        iArr[0] = G14;
                                        iArr[1] = G15;
                                        iArr[2] = A4;
                                    }
                                } else if (G12 == 2) {
                                    Log.i(string2, StubApp.getString2(17228));
                                } else {
                                    Xa.h.v(G12, StubApp.getString2(17229), string2);
                                }
                            }
                        } else {
                            if (G4 != 1) {
                                throw new IllegalStateException();
                            }
                            Log.i(string2, StubApp.getString2(17232));
                        }
                        ((c5.C[]) this.f13534g)[i10] = c10;
                    }
                }
                this.f13472d = true;
                return;
            default:
                f10.k();
                f10.A();
                int G16 = f10.G();
                this.f13534g = new ConcurrentHashMap(G16);
                for (int i12 = 0; i12 < G16; i12++) {
                    ((ConcurrentHashMap) this.f13534g).put(Integer.valueOf(f10.G()), Integer.valueOf(f10.A()));
                }
                this.f13472d = true;
                return;
        }
    }
}
