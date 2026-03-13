package Bc;

import B0.v;
import H0.B;
import H0.C;
import H0.o;
import H0.p;
import K.m;
import L4.j;
import M4.G;
import M4.J;
import M4.K;
import M4.c0;
import M4.e0;
import M4.n0;
import M4.r;
import N.I;
import R3.AbstractC0239h;
import T0.C0318i;
import T0.InterfaceC0319j;
import T0.l;
import Z9.q;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.widget.ImageView;
import com.google.android.gms.internal.measurement.D1;
import com.stub.StubApp;
import ea.C0855b;
import h.AbstractC0997a;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import n.AbstractC1346k0;
import n.C1365u;
import n.Q0;
import o0.C1406C;
import o0.C1438m;
import r0.AbstractC1550k;
import r0.AbstractC1560u;
import r0.C1553n;
import r0.C1558s;
import t.C1692e;
import t0.InterfaceC1707g;
import wc.y;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class i implements U9.g, InterfaceC0319j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f765a;

    /* renamed from: b, reason: collision with root package name */
    public int f766b;

    /* renamed from: c, reason: collision with root package name */
    public Object f767c;

    /* renamed from: d, reason: collision with root package name */
    public Object f768d;

    public /* synthetic */ i(int i3, byte b2) {
        this.f765a = i3;
    }

    @Override // T0.InterfaceC0319j
    public C0318i b(l lVar, long j) {
        long j3;
        long j10 = lVar.f7030d;
        int min = (int) Math.min(112800, lVar.f7029c - j10);
        C1553n c1553n = (C1553n) this.f768d;
        c1553n.D(min);
        lVar.i(c1553n.f20176a, 0, min, false);
        int i3 = c1553n.f20178c;
        long j11 = -1;
        long j12 = -1;
        long j13 = -9223372036854775807L;
        while (true) {
            if (c1553n.a() < 188) {
                j3 = -9223372036854775807L;
                break;
            }
            byte[] bArr = c1553n.f20176a;
            int i10 = c1553n.f20177b;
            while (true) {
                if (i10 >= i3) {
                    j3 = -9223372036854775807L;
                    break;
                }
                j3 = -9223372036854775807L;
                if (bArr[i10] == 71) {
                    break;
                }
                i10++;
            }
            int i11 = i10 + 188;
            if (i11 > i3) {
                break;
            }
            long s10 = W.a.s(c1553n, i10, this.f766b);
            if (s10 != j3) {
                long b2 = ((C1558s) this.f767c).b(s10);
                if (b2 > j) {
                    return j13 == j3 ? new C0318i(b2, -1, j10) : new C0318i(-9223372036854775807L, 0, j10 + j12);
                }
                j13 = b2;
                if (100000 + j13 > j) {
                    return new C0318i(-9223372036854775807L, 0, j10 + i10);
                }
                j12 = i10;
            }
            c1553n.G(i11);
            j11 = i11;
        }
        return j13 != j3 ? new C0318i(j13, -2, j10 + j11) : C0318i.f7017d;
    }

    @Override // U9.g
    public void c() {
        HandlerThread handlerThread = (HandlerThread) this.f767c;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f767c = null;
            this.f768d = null;
        }
    }

    @Override // U9.g
    public void d(U9.e eVar) {
        ((Handler) this.f768d).post(eVar.f7513b);
    }

    @Override // T0.InterfaceC0319j
    public void e() {
        byte[] bArr = AbstractC1560u.f20195f;
        C1553n c1553n = (C1553n) this.f768d;
        c1553n.getClass();
        c1553n.E(bArr.length, bArr);
    }

    public void f() {
        Q0 q02;
        ImageView imageView = (ImageView) this.f767c;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            AbstractC1346k0.a(drawable);
        }
        if (drawable == null || (q02 = (Q0) this.f768d) == null) {
            return;
        }
        C1365u.e(drawable, q02, imageView.getDrawableState());
    }

    public z5.b g() {
        if (!"".isEmpty()) {
            throw new IllegalStateException(StubApp.getString2(555).concat(""));
        }
        return new z5.b(((Long) this.f767c).longValue(), (String) this.f768d, this.f766b);
    }

    public e0 h() {
        K k3 = (K) this.f768d;
        if (k3 != null) {
            throw k3.a();
        }
        e0 b2 = e0.b(this.f766b, (Object[]) this.f767c, this);
        K k4 = (K) this.f768d;
        if (k4 == null) {
            return b2;
        }
        throw k4.a();
    }

    public Object i(int i3) {
        SparseArray sparseArray;
        if (this.f766b == -1) {
            this.f766b = 0;
        }
        while (true) {
            int i10 = this.f766b;
            sparseArray = (SparseArray) this.f767c;
            if (i10 <= 0 || i3 >= sparseArray.keyAt(i10)) {
                break;
            }
            this.f766b--;
        }
        while (this.f766b < sparseArray.size() - 1 && i3 >= sparseArray.keyAt(this.f766b + 1)) {
            this.f766b++;
        }
        return sparseArray.valueAt(this.f766b);
    }

    public char j() {
        try {
            return (char) ((ByteBuffer) this.f767c).get();
        } catch (BufferUnderflowException unused) {
            throw new IOException(StubApp.getString2(25067));
        }
    }

    public C k(int i3, String str, Map map, Uri uri) {
        o oVar = (o) this.f768d;
        String str2 = oVar.f2597c;
        int i10 = this.f766b;
        this.f766b = i10 + 1;
        F5.c cVar = new F5.c(i10, str2, str);
        if (oVar.f2607p != null) {
            AbstractC1550k.h(oVar.f2603k);
            try {
                cVar.f(StubApp.getString2("2407"), oVar.f2607p.b(oVar.f2603k, uri, i3));
            } catch (C1406C e10) {
                o.a(oVar, new v(e10));
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            cVar.f((String) entry.getKey(), (String) entry.getValue());
        }
        return new C(uri, i3, new p(cVar), "");
    }

    public void l(AttributeSet attributeSet, int i3) {
        int resourceId;
        ImageView imageView = (ImageView) this.f767c;
        Context context = imageView.getContext();
        int[] iArr = AbstractC0997a.f14399f;
        a5.c E10 = a5.c.E(context, attributeSet, iArr, i3);
        I.h(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) E10.f9283c, i3);
        try {
            Drawable drawable = imageView.getDrawable();
            TypedArray typedArray = (TypedArray) E10.f9283c;
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = D1.m(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                AbstractC1346k0.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(E10.p(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(AbstractC1346k0.c(typedArray.getInt(3, -1), null));
            }
            E10.I();
        } catch (Throwable th) {
            E10.I();
            throw th;
        }
    }

    public C0855b m() {
        C0855b c0855b = (C0855b) this.f768d;
        this.f768d = r(c0855b);
        return c0855b;
    }

    public boolean n(int i3) {
        C0855b c0855b = (C0855b) this.f768d;
        return c0855b != null && c0855b.f13673c == i3;
    }

    public void o(Object obj, Object obj2) {
        int i3 = (this.f766b + 1) * 2;
        Object[] objArr = (Object[]) this.f767c;
        if (i3 > objArr.length) {
            this.f767c = Arrays.copyOf(objArr, M4.C.f(objArr.length, i3));
        }
        r.c(obj, obj2);
        Object[] objArr2 = (Object[]) this.f767c;
        int i10 = this.f766b;
        int i11 = i10 * 2;
        objArr2[i11] = obj;
        objArr2[i11 + 1] = obj2;
        this.f766b = i10 + 1;
    }

    public void p(Collection collection) {
        if (collection != null) {
            int size = (collection.size() + this.f766b) * 2;
            Object[] objArr = (Object[]) this.f767c;
            if (size > objArr.length) {
                this.f767c = Arrays.copyOf(objArr, M4.C.f(objArr.length, size));
            }
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            o(entry.getKey(), entry.getValue());
        }
    }

    public String q() {
        ByteBuffer byteBuffer;
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            byteBuffer = (ByteBuffer) this.f767c;
            if (!byteBuffer.hasRemaining()) {
                break;
            }
            byteBuffer.mark();
            char j = j();
            if (Character.isWhitespace(j) || j == '(' || j == ')' || j == '<' || j == '>' || j == '[' || j == ']' || j == '{' || j == '}' || j == '/' || j == '%') {
                break;
            }
            sb2.append(j);
        }
        byteBuffer.reset();
        if (sb2.length() == 0) {
            return null;
        }
        return sb2.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:220:0x037c, code lost:
    
        r18 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0382, code lost:
    
        if (r6 != false) goto L193;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0267 A[LOOP:4: B:60:0x0261->B:62:0x0267, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02ff A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0300  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ea.C0855b r(ea.C0855b r21) {
        /*
            Method dump skipped, instructions count: 905
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Bc.i.r(ea.b):ea.b");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void s() {
        AbstractC1550k.h((C) this.f767c);
        J j = ((C) this.f767c).f2480c.f2613a;
        HashMap hashMap = new HashMap();
        n0 it = ((c0) j.f4550d.keySet()).iterator();
        while (true) {
            G g10 = (G) it;
            if (!g10.hasNext()) {
                C c10 = (C) this.f767c;
                t(k(c10.f2479b, ((o) this.f768d).f2604l, hashMap, c10.f2478a));
                return;
            }
            String str = (String) g10.next();
            if (!str.equals(StubApp.getString2(393)) && !str.equals(StubApp.getString2(2015)) && !str.equals(StubApp.getString2(403)) && !str.equals(StubApp.getString2(2407))) {
                hashMap.put(str, (String) r.j(j.d(str)));
            }
        }
    }

    @Override // U9.g
    public void start() {
        HandlerThread handlerThread = new HandlerThread(StubApp.getString2(6389), this.f766b);
        this.f767c = handlerThread;
        handlerThread.start();
        this.f768d = new Handler(((HandlerThread) this.f767c).getLooper());
    }

    public void t(C c10) {
        String b2 = c10.f2480c.b(StubApp.getString2(393));
        b2.getClass();
        int parseInt = Integer.parseInt(b2);
        o oVar = (o) this.f768d;
        AbstractC1550k.g(oVar.f2600f.get(parseInt) == null);
        oVar.f2600f.append(parseInt, c10);
        oVar.j.d(B.g(c10));
        this.f767c = c10;
    }

    public String toString() {
        switch (this.f765a) {
            case 0:
                StringBuilder sb2 = new StringBuilder();
                if (((y) this.f767c) == y.f22485b) {
                    sb2.append(StubApp.getString2(25074));
                } else {
                    sb2.append(StubApp.getString2(25075));
                }
                sb2.append(' ');
                sb2.append(this.f766b);
                sb2.append(' ');
                sb2.append((String) this.f768d);
                String sb3 = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
                return sb3;
            case 15:
                StringBuilder sb4 = new StringBuilder();
                sb4.append((String) this.f768d);
                String string2 = StubApp.getString2(999);
                sb4.append(string2);
                sb4.append((String) this.f767c);
                sb4.append(string2);
                sb4.append(this.f766b);
                return sb4.toString();
            default:
                return super.toString();
        }
    }

    public List u(CharSequence charSequence) {
        charSequence.getClass();
        q qVar = (q) this.f768d;
        qVar.getClass();
        j jVar = new j(qVar, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (jVar.hasNext()) {
            arrayList.add((String) jVar.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public void v(String str, AbstractC0239h abstractC0239h) {
        Map map = (Map) this.f767c;
        if (map.containsKey(str)) {
            throw new IllegalArgumentException(E1.a.k(StubApp.getString2(25076), str, StubApp.getString2(25077)));
        }
        map.put(str, abstractC0239h);
        if (this.f766b > 0) {
            new c4.h(Looper.getMainLooper(), 3).post(new m(2, this, abstractC0239h, str, false));
        }
    }

    public void w(Bundle bundle) {
        this.f766b = 1;
        this.f768d = bundle;
        for (Map.Entry entry : ((Map) this.f767c).entrySet()) {
            ((AbstractC0239h) entry.getValue()).d(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public void x(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : ((Map) this.f767c).entrySet()) {
            Bundle bundle2 = new Bundle();
            ((AbstractC0239h) entry.getValue()).g(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    public /* synthetic */ i(int i3, int i10, Object obj, Object obj2) {
        this.f765a = i10;
        this.f768d = obj;
        this.f767c = obj2;
        this.f766b = i3;
    }

    public i() {
        this.f765a = 8;
        this.f767c = Collections.synchronizedMap(new C1692e(0));
        this.f766b = 0;
    }

    public i(y protocol, int i3, String message) {
        this.f765a = 0;
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(message, "message");
        this.f767c = protocol;
        this.f766b = i3;
        this.f768d = message;
    }

    public i(T5.b bVar, ArrayList arrayList, int i3) {
        this.f765a = 11;
        this.f767c = bVar;
        this.f768d = arrayList;
        this.f766b = i3;
    }

    public i(int i3, p pVar, String str) {
        this.f765a = 2;
        this.f766b = i3;
        this.f767c = pVar;
        this.f768d = str;
    }

    public i(ImageView imageView) {
        this.f765a = 12;
        this.f766b = 0;
        this.f767c = imageView;
    }

    public i(A1.a aVar) {
        this.f765a = 3;
        this.f767c = new SparseArray();
        this.f768d = aVar;
        this.f766b = -1;
    }

    public i(byte[] bArr) {
        this.f765a = 10;
        this.f766b = 0;
        this.f767c = ByteBuffer.wrap(bArr);
        this.f768d = r(null);
    }

    public i(int i3, C1558s c1558s) {
        this.f765a = 17;
        this.f766b = i3;
        this.f767c = c1558s;
        this.f768d = new C1553n();
    }

    public i(InterfaceC1707g interfaceC1707g) {
        this.f765a = 16;
        this.f768d = M0.d.f4445k;
        this.f767c = interfaceC1707g;
        this.f766b = 1;
    }

    public i(q qVar) {
        this.f765a = 4;
        this.f768d = qVar;
        this.f767c = L4.d.f4180a;
        this.f766b = IntCompanionObject.MAX_VALUE;
    }

    public i(o oVar) {
        this.f765a = 1;
        this.f768d = oVar;
    }

    public i(int i3, int i10) {
        this.f765a = i10;
        switch (i10) {
            case 9:
                this.f766b = i3;
                break;
            default:
                this.f767c = new Object[i3 * 2];
                this.f766b = 0;
                break;
        }
    }

    public i(C1438m c1438m, int i3, String str) {
        this.f765a = 14;
        this.f767c = c1438m;
        this.f766b = i3;
        this.f768d = str;
    }

    public i(R0.f fVar, E0.m mVar, int i3, long j) {
        this.f765a = 6;
        this.f768d = fVar;
        this.f767c = mVar;
        this.f766b = i3;
    }
}
