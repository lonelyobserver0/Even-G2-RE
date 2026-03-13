package Vc;

import android.os.Handler;
import android.os.SystemClock;
import com.stub.StubApp;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.HashMap;
import java.util.Objects;
import l4.C1162a1;
import l4.C1200n0;
import l4.C1219x;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8012a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final long f8013b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f8014c;

    public i(C1219x c1219x, long j) {
        this.f8013b = j;
        Objects.requireNonNull(c1219x);
        this.f8014c = c1219x;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8012a) {
            case 0:
                long elapsedRealtime = SystemClock.elapsedRealtime() - this.f8013b;
                j jVar = (j) this.f8014c;
                long j = elapsedRealtime - jVar.f8022f;
                try {
                    o oVar = jVar.f8018b;
                    double d8 = 0.0d;
                    if (oVar != null) {
                        double log10 = Math.log10((oVar.a() / 51805.5336d) / 2.0E-4d) * 20.0d;
                        if (!Double.isInfinite(log10)) {
                            d8 = log10;
                        }
                    }
                    Wc.d dVar = jVar.f8020d;
                    dVar.getClass();
                    HashMap hashMap = new HashMap();
                    hashMap.put(StubApp.getString2("2091"), Long.valueOf(j));
                    hashMap.put(StubApp.getString2("25808"), Double.valueOf(d8));
                    dVar.e(StubApp.getString2("25809"), hashMap);
                    Handler handler = jVar.f8019c;
                    if (handler != null) {
                        handler.postDelayed(jVar.f8026k, jVar.j);
                        break;
                    }
                } catch (Exception e10) {
                    jVar.f8020d.f(2, org.bouncycastle.asn1.a.b(e10, new StringBuilder(StubApp.getString2(25810))));
                    return;
                }
                break;
            case 1:
                FlutterJNI flutterJNI = (FlutterJNI) this.f8014c;
                if (flutterJNI.isAttached()) {
                    flutterJNI.unregisterTexture(this.f8013b);
                    break;
                }
                break;
            case 2:
                ((C1219x) this.f8014c).q(this.f8013b);
                break;
            default:
                C1162a1 c1162a1 = (C1162a1) this.f8014c;
                C1219x c1219x = ((C1200n0) c1162a1.f4728a).f16548p;
                C1200n0.i(c1219x);
                c1219x.n(this.f8013b);
                c1162a1.f16349e = null;
                break;
        }
    }

    public i(C1162a1 c1162a1, long j) {
        this.f8013b = j;
        Objects.requireNonNull(c1162a1);
        this.f8014c = c1162a1;
    }

    public i(j jVar, long j) {
        this.f8014c = jVar;
        this.f8013b = j;
    }

    public i(long j, FlutterJNI flutterJNI) {
        this.f8013b = j;
        this.f8014c = flutterJNI;
    }
}
