package l4;

import com.google.android.gms.internal.measurement.C0703x2;
import com.stub.StubApp;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* renamed from: l4.f0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final /* synthetic */ class CallableC1176f0 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16424a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1179g0 f16425b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f16426c;

    public /* synthetic */ CallableC1176f0(C1179g0 c1179g0, String str, int i3) {
        this.f16424a = i3;
        this.f16425b = c1179g0;
        this.f16426c = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f16424a) {
            case 0:
                return new com.google.android.gms.internal.measurement.N1(new CallableC1176f0(this.f16425b, this.f16426c, 1));
            case 1:
                C1179g0 c1179g0 = this.f16425b;
                C1199n c1199n = c1179g0.f16651b.f16061c;
                F1.S(c1199n);
                String str = this.f16426c;
                X o02 = c1199n.o0(str);
                HashMap hashMap = new HashMap();
                hashMap.put(StubApp.getString2(17625), StubApp.getString2(3400));
                hashMap.put(StubApp.getString2(5234), str);
                ((C1200n0) c1179g0.f4728a).f16539d.p();
                hashMap.put(StubApp.getString2(19915), 130000L);
                if (o02 != null) {
                    String N3 = o02.N();
                    if (N3 != null) {
                        hashMap.put(StubApp.getString2(20029), N3);
                    }
                    hashMap.put(StubApp.getString2(20027), Long.valueOf(o02.P()));
                    hashMap.put(StubApp.getString2(20216), Long.valueOf(o02.b()));
                }
                return hashMap;
            default:
                V6.b bVar = new V6.b(this.f16425b, this.f16426c);
                C0703x2 c0703x2 = new C0703x2(StubApp.getString2(20414), 0);
                c0703x2.f11577b.put(StubApp.getString2(11766), new com.google.android.gms.internal.measurement.N1(c0703x2, bVar));
                return c0703x2;
        }
    }
}
