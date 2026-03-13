package pb;

import android.content.Context;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.Surface;
import c5.B;
import com.stub.StubApp;
import db.C0824a;
import db.InterfaceC0825b;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import java.io.File;
import java.util.HashMap;
import java.util.Objects;
import p0.AbstractC1482f;
import qb.C1535b;
import qb.C1537d;
import qb.C1538e;
import rb.C1585b;
import v0.C1830z;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class v implements InterfaceC0825b, e {

    /* renamed from: b, reason: collision with root package name */
    public B3.s f19805b;

    /* renamed from: a, reason: collision with root package name */
    public final LongSparseArray f19804a = new LongSparseArray();

    /* renamed from: c, reason: collision with root package name */
    public final R4.b f19806c = new R4.b(3);

    /* renamed from: d, reason: collision with root package name */
    public long f19807d = 1;

    public static q f(f fVar) {
        String str = fVar.f19776a;
        if (str.startsWith(StubApp.getString2(22174))) {
            if (str.startsWith(StubApp.getString2(22175))) {
                return new c(str, 0);
            }
            throw new IllegalArgumentException(StubApp.getString2(22176));
        }
        if (str.startsWith(StubApp.getString2(22177))) {
            if (str.startsWith(StubApp.getString2(2363))) {
                return new c(str, 1);
            }
            throw new IllegalArgumentException(StubApp.getString2(22178));
        }
        h hVar = fVar.f19777b;
        int i3 = 1;
        if (hVar != null) {
            int ordinal = hVar.ordinal();
            if (ordinal == 0) {
                i3 = 3;
            } else if (ordinal == 1) {
                i3 = 4;
            } else if (ordinal == 2) {
                i3 = 2;
            }
        }
        return new b(str, i3, new HashMap(fVar.f19778c), fVar.f19779d);
    }

    public final Long b(f fVar) {
        q f10 = f(fVar);
        long j = this.f19807d;
        this.f19807d = 1 + j;
        B3.s sVar = this.f19805b;
        Context context = (Context) sVar.f651c;
        EventChannel eventChannel = new EventChannel((BinaryMessenger) sVar.f650b, Xa.h.h(j, StubApp.getString2(22179)));
        p pVar = new p();
        eventChannel.setStreamHandler(new s(pVar));
        C1538e c1538e = new C1538e(new t(pVar), f10.a(), this.f19806c, null, new C1537d(context, f10, 0));
        BinaryMessenger binaryMessenger = (BinaryMessenger) this.f19805b.f650b;
        String l9 = Long.toString(j);
        m.a(binaryMessenger, l9, c1538e);
        c1538e.f19799c = new kb.e(binaryMessenger, l9);
        this.f19804a.put(j, c1538e);
        return Long.valueOf(j);
    }

    public final k c(f fVar) {
        q f10 = f(fVar);
        long j = this.f19807d;
        this.f19807d = 1 + j;
        io.flutter.view.r rVar = (io.flutter.view.r) this.f19805b.f654f;
        rVar.getClass();
        TextureRegistry$SurfaceProducer c10 = ((io.flutter.embedding.engine.renderer.l) rVar).c(1);
        B3.s sVar = this.f19805b;
        Context context = (Context) sVar.f651c;
        EventChannel eventChannel = new EventChannel((BinaryMessenger) sVar.f650b, Xa.h.h(j, StubApp.getString2(22179)));
        p pVar = new p();
        eventChannel.setStreamHandler(new s(pVar));
        C1585b c1585b = new C1585b(new t(pVar), f10.a(), this.f19806c, c10, new C1537d(context, f10, 1));
        c1585b.f20550e = true;
        c10.setCallback(c1585b);
        Surface surface = c10.getSurface();
        ((C1830z) c1585b.f19800d).G(surface);
        c1585b.f20550e = surface == null;
        BinaryMessenger binaryMessenger = (BinaryMessenger) this.f19805b.f650b;
        String l9 = Long.toString(j);
        m.a(binaryMessenger, l9, c1585b);
        c1585b.f19799c = new kb.e(binaryMessenger, l9);
        this.f19804a.put(j, c1585b);
        Long valueOf = Long.valueOf(j);
        Long valueOf2 = Long.valueOf(c10.id());
        k kVar = new k();
        kVar.f19786a = valueOf;
        kVar.f19787b = valueOf2;
        return kVar;
    }

    public final void d(Long l9) {
        long longValue = l9.longValue();
        LongSparseArray longSparseArray = this.f19804a;
        r rVar = (r) longSparseArray.get(longValue);
        if (rVar != null) {
            rVar.c();
            longSparseArray.remove(l9.longValue());
            return;
        }
        String str = StubApp.getString2(22180) + longValue + StubApp.getString2(3372);
        if (longSparseArray.size() == 0) {
            str = AbstractC1482f.g(str, StubApp.getString2(22181));
        }
        throw new IllegalStateException(str);
    }

    public final String e(String str, String str2) {
        if (str2 == null) {
            return ((u) this.f19805b.f652d).f19803a.b(str);
        }
        bb.d dVar = ((u) this.f19805b.f653e).f19803a;
        dVar.getClass();
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(22182));
        String str3 = File.separator;
        sb2.append(str3);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str);
        return dVar.b(sb2.toString());
    }

    @Override // db.InterfaceC0825b
    public final void onAttachedToEngine(C0824a c0824a) {
        Q2.g H2 = Q2.g.H();
        Context context = c0824a.f13553a;
        bb.d dVar = (bb.d) H2.f5711b;
        u uVar = new u(dVar);
        u uVar2 = new u(dVar);
        io.flutter.view.r rVar = c0824a.f13555c;
        BinaryMessenger binaryMessenger = c0824a.f13554b;
        this.f19805b = new B3.s(context, binaryMessenger, uVar, uVar2, rVar, 10);
        e.a(binaryMessenger, this);
        LongSparseArray longSparseArray = this.f19804a;
        Objects.requireNonNull(longSparseArray);
        c0824a.f13556d.registerViewFactory(StubApp.getString2(22183), new C1535b(new B(longSparseArray, 22)));
    }

    @Override // db.InterfaceC0825b
    public final void onDetachedFromEngine(C0824a c0824a) {
        if (this.f19805b == null) {
            Log.wtf(StubApp.getString2(22184), StubApp.getString2(22185));
        }
        B3.s sVar = this.f19805b;
        BinaryMessenger binaryMessenger = c0824a.f13554b;
        sVar.getClass();
        e.a(binaryMessenger, null);
        this.f19805b = null;
        int i3 = 0;
        while (true) {
            LongSparseArray longSparseArray = this.f19804a;
            if (i3 >= longSparseArray.size()) {
                longSparseArray.clear();
                return;
            } else {
                ((r) longSparseArray.valueAt(i3)).c();
                i3++;
            }
        }
    }
}
