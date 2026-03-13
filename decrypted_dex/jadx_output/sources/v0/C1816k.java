package v0;

import android.content.Context;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import p0.C1478b;
import p0.C1484h;
import p0.InterfaceC1480d;
import r0.AbstractC1550k;
import s.C1590a;
import sa.C1608a;

/* renamed from: v0.k, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1816k {

    /* renamed from: a, reason: collision with root package name */
    public final Context f21772a;

    /* renamed from: b, reason: collision with root package name */
    public final B3.k f21773b;

    public C1816k(Context context) {
        this.f21772a = context;
        B3.k kVar = new B3.k();
        kVar.f631a = context;
        this.f21773b = kVar;
    }

    public final AbstractC1810e[] a(Handler handler, SurfaceHolderCallbackC1827w surfaceHolderCallbackC1827w, SurfaceHolderCallbackC1827w surfaceHolderCallbackC1827w2, SurfaceHolderCallbackC1827w surfaceHolderCallbackC1827w3, SurfaceHolderCallbackC1827w surfaceHolderCallbackC1827w4) {
        ArrayList arrayList = new ArrayList();
        B3.k kVar = this.f21773b;
        Context context = this.f21772a;
        arrayList.add(new R0.f(context, kVar, handler, surfaceHolderCallbackC1827w));
        K2.c cVar = new K2.c(context);
        AbstractC1550k.g(!cVar.f3638b);
        cVar.f3638b = true;
        if (((C1608a) cVar.f3641e) == null) {
            InterfaceC1480d[] interfaceC1480dArr = new InterfaceC1480d[0];
            x0.x xVar = new x0.x();
            C1484h c1484h = new C1484h();
            c1484h.f19642c = 1.0f;
            c1484h.f19643d = 1.0f;
            C1478b c1478b = C1478b.f19606e;
            c1484h.f19644e = c1478b;
            c1484h.f19645f = c1478b;
            c1484h.f19646g = c1478b;
            c1484h.f19647h = c1478b;
            ByteBuffer byteBuffer = InterfaceC1480d.f19611a;
            c1484h.f19649k = byteBuffer;
            c1484h.f19650l = byteBuffer.asShortBuffer();
            c1484h.f19651m = byteBuffer;
            c1484h.f19641b = -1;
            C1608a c1608a = new C1608a();
            InterfaceC1480d[] interfaceC1480dArr2 = new InterfaceC1480d[interfaceC1480dArr.length + 2];
            c1608a.f20820a = interfaceC1480dArr2;
            System.arraycopy(interfaceC1480dArr, 0, interfaceC1480dArr2, 0, interfaceC1480dArr.length);
            c1608a.f20821b = xVar;
            c1608a.f20822c = c1484h;
            interfaceC1480dArr2[interfaceC1480dArr.length] = xVar;
            interfaceC1480dArr2[interfaceC1480dArr.length + 1] = c1484h;
            cVar.f3641e = c1608a;
        }
        if (((C1590a) cVar.f3644h) == null) {
            C1590a c1590a = new C1590a();
            c1590a.f20574a = context;
            cVar.f3644h = c1590a;
        }
        arrayList.add(new x0.v(this.f21772a, kVar, handler, surfaceHolderCallbackC1827w2, new x0.s(cVar)));
        arrayList.add(new N0.d(surfaceHolderCallbackC1827w3, handler.getLooper()));
        arrayList.add(new F0.b(surfaceHolderCallbackC1827w4, handler.getLooper()));
        arrayList.add(new S0.a());
        arrayList.add(new D0.h(D0.c.f1239i));
        return (AbstractC1810e[]) arrayList.toArray(new AbstractC1810e[0]);
    }
}
