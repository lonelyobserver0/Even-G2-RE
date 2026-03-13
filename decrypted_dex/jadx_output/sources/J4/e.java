package J4;

import D5.A;
import N5.j;
import N5.m;
import N5.o;
import P3.k;
import P3.l;
import Xa.h;
import Z9.C0366a;
import Z9.q;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Iterator;
import m6.C1274b;
import m6.i;
import m6.r;
import n6.C1388b;
import n6.RunnableC1390d;
import n6.f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class e implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3409a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3410b;

    public /* synthetic */ e(Object obj, int i3) {
        this.f3409a = i3;
        this.f3410b = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        T5.c cVar;
        int i3;
        j jVar;
        m mVar = null;
        int i10 = 1;
        switch (this.f3409a) {
            case 0:
                if (message.what != 0) {
                    return false;
                }
                q qVar = (q) this.f3410b;
                if (message.obj != null) {
                    throw new ClassCastException();
                }
                synchronized (qVar.f9143b) {
                    throw null;
                }
            case 1:
                String string2 = StubApp.getString2(3015);
                String string22 = StubApp.getString2(3016);
                int i11 = message.arg1;
                if (Log.isLoggable(string22, 3)) {
                    h.v(i11, StubApp.getString2(3017), StubApp.getString2(3016));
                }
                k kVar = (k) this.f3410b;
                synchronized (kVar) {
                    try {
                        l lVar = (l) kVar.f5519e.get(i11);
                        if (lVar != null) {
                            kVar.f5519e.remove(i11);
                            kVar.c();
                            Bundle data = message.getData();
                            if (!data.getBoolean(StubApp.getString2(3018), false)) {
                                switch (lVar.f5525e) {
                                    case 0:
                                        if (data.getBoolean(StubApp.getString2(3020), false)) {
                                            lVar.c(null);
                                            break;
                                        } else {
                                            lVar.b(new A(StubApp.getString2(3021), (Throwable) null));
                                            break;
                                        }
                                    default:
                                        Bundle bundle = data.getBundle(StubApp.getString2(1485));
                                        if (bundle == null) {
                                            bundle = Bundle.EMPTY;
                                        }
                                        lVar.c(bundle);
                                        break;
                                }
                            } else {
                                lVar.b(new A(StubApp.getString2(3019), (Throwable) null));
                            }
                        } else {
                            Log.w(StubApp.getString2("3016"), string2 + i11);
                        }
                    } finally {
                    }
                }
                return true;
            case 2:
                int i12 = message.what;
                m6.l lVar2 = (m6.l) this.f3410b;
                if (i12 != 2131231184) {
                    int i13 = 0;
                    if (i12 != 2131231188) {
                        return true;
                    }
                    f fVar = (f) lVar2.f17111c;
                    fVar.f17827h.post(new RunnableC1390d(fVar, (C0366a) lVar2.j, i13));
                    return true;
                }
                r rVar = (r) message.obj;
                lVar2.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                Rect rect = (Rect) lVar2.f17115g;
                rVar.f17125d = rect;
                T5.c cVar2 = rVar.f17122a;
                if (rect == null) {
                    jVar = null;
                    i3 = 1;
                } else {
                    byte[] bArr = cVar2.f7187a;
                    int i14 = rVar.f17124c;
                    int i15 = cVar2.f7189c;
                    int i16 = cVar2.f7188b;
                    if (i14 == 90) {
                        byte[] bArr2 = new byte[i16 * i15];
                        int i17 = 0;
                        for (int i18 = 0; i18 < i16; i18++) {
                            for (int i19 = i15 - 1; i19 >= 0; i19--) {
                                bArr2[i17] = bArr[(i19 * i16) + i18];
                                i17++;
                            }
                        }
                        cVar = new T5.c(bArr2, i15, i16);
                    } else if (i14 == 180) {
                        int i20 = i16 * i15;
                        byte[] bArr3 = new byte[i20];
                        int i21 = i20 - 1;
                        for (int i22 = 0; i22 < i20; i22++) {
                            bArr3[i21] = bArr[i22];
                            i21--;
                        }
                        cVar = new T5.c(bArr3, i16, i15);
                    } else if (i14 != 270) {
                        cVar = cVar2;
                    } else {
                        int i23 = i16 * i15;
                        byte[] bArr4 = new byte[i23];
                        int i24 = i23 - 1;
                        for (int i25 = 0; i25 < i16; i25++) {
                            for (int i26 = i15 - 1; i26 >= 0; i26--) {
                                bArr4[i24] = bArr[(i26 * i16) + i25];
                                i24--;
                            }
                        }
                        cVar = new T5.c(bArr4, i15, i16);
                    }
                    Rect rect2 = rVar.f17125d;
                    int width = rect2.width();
                    int height = rect2.height();
                    int i27 = rect2.top;
                    byte[] bArr5 = new byte[width * height];
                    int i28 = cVar.f7188b;
                    int i29 = (i27 * i28) + rect2.left;
                    int i30 = 0;
                    while (i30 < height) {
                        System.arraycopy(cVar.f7187a, i29, bArr5, i30 * width, width);
                        i29 += i28;
                        i30++;
                        i10 = i10;
                    }
                    i3 = i10;
                    jVar = new j(bArr5, width, height, width, height);
                }
                if (jVar != null) {
                    i iVar = (i) lVar2.f17114f;
                    N5.b b2 = iVar.b(jVar);
                    N5.h hVar = iVar.f17106a;
                    iVar.f17107b.clear();
                    try {
                        if (hVar != null) {
                            if (hVar.f4901b == null) {
                                hVar.c(null);
                            }
                            mVar = hVar.b(b2);
                        } else {
                            hVar.c(null);
                            mVar = hVar.b(b2);
                        }
                    } catch (Exception unused) {
                    } catch (Throwable th) {
                        hVar.reset();
                        throw th;
                    }
                    hVar.reset();
                }
                Handler handler = (Handler) lVar2.f17113e;
                if (mVar != null) {
                    Log.d(StubApp.getString2(1314), StubApp.getString2(3014) + (System.currentTimeMillis() - currentTimeMillis) + StubApp.getString2(559));
                    if (handler != null) {
                        C1274b c1274b = new C1274b();
                        c1274b.f17058a = mVar;
                        c1274b.f17059b = rVar;
                        Message obtain = Message.obtain(handler, 2131231186, c1274b);
                        obtain.setData(new Bundle());
                        obtain.sendToTarget();
                    }
                } else if (handler != null) {
                    Message.obtain(handler, 2131231185).sendToTarget();
                }
                if (handler != null) {
                    i iVar2 = (i) lVar2.f17114f;
                    iVar2.getClass();
                    ArrayList arrayList = new ArrayList(iVar2.f17107b);
                    ArrayList arrayList2 = new ArrayList(arrayList.size());
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        o oVar = (o) it.next();
                        float f10 = i3;
                        float f11 = oVar.f4926a * f10;
                        Rect rect3 = rVar.f17125d;
                        float f12 = f11 + rect3.left;
                        float f13 = (oVar.f4927b * f10) + rect3.top;
                        if (rVar.f17126e) {
                            f12 = cVar2.f7188b - f12;
                        }
                        arrayList2.add(new o(f12, f13));
                        i3 = 1;
                    }
                    Message.obtain(handler, 2131231187, arrayList2).sendToTarget();
                }
                f fVar2 = (f) lVar2.f17111c;
                fVar2.f17827h.post(new RunnableC1390d(fVar2, (C0366a) lVar2.j, 0));
                return true;
            default:
                int i31 = message.what;
                C1388b c1388b = (C1388b) this.f3410b;
                c1388b.getClass();
                if (i31 != 1) {
                    return false;
                }
                c1388b.b();
                return true;
        }
    }
}
