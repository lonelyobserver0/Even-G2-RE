package X2;

import Xa.AbstractActivityC0364d;
import android.content.Context;
import android.util.Log;
import androidx.lifecycle.InterfaceC0444t;
import b3.C0498N;
import b3.C0503e;
import com.google.android.gms.internal.measurement.L1;
import com.stub.StubApp;
import db.C0824a;
import db.InterfaceC0825b;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.platform.PlatformViewRegistry;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LX2/w;", "Ldb/b;", "Leb/a;", "<init>", "()V", "even_navigate_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class w implements InterfaceC0825b, eb.a {

    /* renamed from: a, reason: collision with root package name */
    public Context f8330a;

    /* renamed from: b, reason: collision with root package name */
    public BinaryMessenger f8331b;

    /* renamed from: c, reason: collision with root package name */
    public PlatformViewRegistry f8332c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC0444t f8333d;

    /* renamed from: e, reason: collision with root package name */
    public n f8334e;

    /* renamed from: f, reason: collision with root package name */
    public m f8335f;

    /* renamed from: g, reason: collision with root package name */
    public p f8336g;

    /* renamed from: h, reason: collision with root package name */
    public EventChannel f8337h;
    public f j;

    /* renamed from: k, reason: collision with root package name */
    public Double f8338k;

    /* renamed from: l, reason: collision with root package name */
    public List f8339l = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public j f8340m = j.f8289c;

    /* renamed from: n, reason: collision with root package name */
    public String f8341n = "";

    /* renamed from: p, reason: collision with root package name */
    public final r f8342p = new r(this);

    /* renamed from: q, reason: collision with root package name */
    public final v f8343q = new v(this);

    /* renamed from: r, reason: collision with root package name */
    public final F5.c f8344r = new F5.c(this, 26);

    /* renamed from: s, reason: collision with root package name */
    public final q f8345s = new q(this);

    public final void a(eb.b bVar) {
        AbstractActivityC0364d abstractActivityC0364d = ((Ya.d) bVar).f8882a;
        PlatformViewRegistry platformViewRegistry = null;
        if (abstractActivityC0364d == null) {
            abstractActivityC0364d = null;
        }
        this.f8333d = abstractActivityC0364d;
        if (abstractActivityC0364d != null) {
            BinaryMessenger binaryMessenger = this.f8331b;
            String string2 = StubApp.getString2(7134);
            if (binaryMessenger == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                binaryMessenger = null;
            }
            InterfaceC0444t interfaceC0444t = this.f8333d;
            Intrinsics.checkNotNull(interfaceC0444t);
            this.f8334e = new n(binaryMessenger, interfaceC0444t, this.f8344r);
            PlatformViewRegistry platformViewRegistry2 = this.f8332c;
            String string22 = StubApp.getString2(7135);
            if (platformViewRegistry2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string22);
                platformViewRegistry2 = null;
            }
            n nVar = this.f8334e;
            Intrinsics.checkNotNull(nVar);
            platformViewRegistry2.registerViewFactory(StubApp.getString2(7136), nVar);
            n nVar2 = this.f8334e;
            L1.f11306b = nVar2;
            String string23 = StubApp.getString2(7137);
            String string24 = StubApp.getString2(7138);
            String concat = StubApp.getString2(7139).concat(nVar2 != null ? string24 : string23);
            String string25 = StubApp.getString2(7096);
            R2.c.b(string25, concat);
            v vVar = this.f8343q;
            L1.f11307c = vVar;
            if (vVar != null) {
                string23 = string24;
            }
            R2.c.b(string25, StubApp.getString2(7140).concat(string23));
            BinaryMessenger binaryMessenger2 = this.f8331b;
            if (binaryMessenger2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                binaryMessenger2 = null;
            }
            InterfaceC0444t interfaceC0444t2 = this.f8333d;
            Intrinsics.checkNotNull(interfaceC0444t2);
            this.f8335f = new m(binaryMessenger2, interfaceC0444t2);
            PlatformViewRegistry platformViewRegistry3 = this.f8332c;
            if (platformViewRegistry3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string22);
            } else {
                platformViewRegistry = platformViewRegistry3;
            }
            m mVar = this.f8335f;
            Intrinsics.checkNotNull(mVar);
            platformViewRegistry.registerViewFactory(StubApp.getString2(7141), mVar);
        }
    }

    @Override // eb.a
    public final void onAttachedToActivity(eb.b p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        String string2 = StubApp.getString2(390);
        String string22 = StubApp.getString2(7142);
        R2.c.b(string2, string22);
        Log.d(string2, string22);
        a(p02);
    }

    @Override // db.InterfaceC0825b
    public final void onAttachedToEngine(C0824a flutterPluginBinding) {
        Intrinsics.checkNotNullParameter(flutterPluginBinding, "flutterPluginBinding");
        String string2 = StubApp.getString2(390);
        String string22 = StubApp.getString2(7143);
        R2.c.b(string2, string22);
        Log.d(string2, string22);
        this.f8330a = flutterPluginBinding.f13553a;
        BinaryMessenger binaryMessenger = flutterPluginBinding.f13554b;
        this.f8331b = binaryMessenger;
        A a3 = B.f8255a;
        String string23 = StubApp.getString2(7134);
        BinaryMessenger binaryMessenger2 = null;
        if (binaryMessenger == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string23);
            binaryMessenger = null;
        }
        A.b(a3, binaryMessenger, this.f8343q);
        BinaryMessenger binaryMessenger3 = this.f8331b;
        if (binaryMessenger3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string23);
            binaryMessenger3 = null;
        }
        this.f8336g = new p(binaryMessenger3);
        BinaryMessenger binaryMessenger4 = this.f8331b;
        if (binaryMessenger4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string23);
        } else {
            binaryMessenger2 = binaryMessenger4;
        }
        EventChannel eventChannel = new EventChannel(binaryMessenger2, StubApp.getString2(7144));
        this.f8337h = eventChannel;
        eventChannel.setStreamHandler(this.f8342p);
        this.f8332c = flutterPluginBinding.f13556d;
    }

    @Override // eb.a
    public final void onDetachedFromActivity() {
        C0498N c0498n;
        String string2 = StubApp.getString2(390);
        String string22 = StubApp.getString2(7145);
        R2.c.b(string2, string22);
        Log.d(string2, string22);
        try {
            n nVar = this.f8334e;
            C0498N c0498n2 = nVar != null ? nVar.f8311d : null;
            String string23 = StubApp.getString2(7146);
            if (c0498n2 != null) {
                R2.c.f(string2, StubApp.getString2("7147"));
                m mVar = this.f8335f;
                if (mVar != null) {
                    C0503e c0503e = mVar.f8307c;
                    if (c0503e == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string23);
                        c0503e = null;
                    }
                    if (c0503e != null) {
                        c0503e.dispose();
                    }
                }
                this.f8335f = null;
                return;
            }
            R2.c.b(string2, StubApp.getString2("7148"));
            n nVar2 = this.f8334e;
            if (nVar2 != null && (c0498n = nVar2.f8311d) != null) {
                c0498n.dispose();
            }
            this.f8334e = null;
            m mVar2 = this.f8335f;
            if (mVar2 != null) {
                C0503e c0503e2 = mVar2.f8307c;
                if (c0503e2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string23);
                    c0503e2 = null;
                }
                if (c0503e2 != null) {
                    c0503e2.dispose();
                }
            }
            this.f8335f = null;
            this.f8333d = null;
        } catch (Exception e10) {
            E1.a.u(StubApp.getString2(7149), e10.getMessage(), string2);
        }
    }

    @Override // eb.a
    public final void onDetachedFromActivityForConfigChanges() {
        String string2 = StubApp.getString2(390);
        String string22 = StubApp.getString2(7150);
        R2.c.b(string2, string22);
        Log.d(string2, string22);
    }

    @Override // db.InterfaceC0825b
    public final void onDetachedFromEngine(C0824a binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        String string2 = StubApp.getString2(390);
        String string22 = StubApp.getString2(7151);
        R2.c.b(string2, string22);
        Log.d(string2, string22);
        A a3 = B.f8255a;
        BinaryMessenger binaryMessenger = binding.f13554b;
        Intrinsics.checkNotNullExpressionValue(binaryMessenger, "getBinaryMessenger(...)");
        A.b(a3, binaryMessenger, null);
        this.f8336g = null;
        EventChannel eventChannel = this.f8337h;
        if (eventChannel != null) {
            eventChannel.setStreamHandler(null);
        }
        this.f8337h = null;
        L1.f11306b = null;
        String string23 = StubApp.getString2(7139);
        String string24 = StubApp.getString2(7137);
        String concat = string23.concat(string24);
        String string25 = StubApp.getString2(7096);
        R2.c.b(string25, concat);
        L1.f11307c = null;
        R2.c.b(string25, StubApp.getString2(7140).concat(string24));
    }

    @Override // eb.a
    public final void onReattachedToActivityForConfigChanges(eb.b p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        R2.c.b(StubApp.getString2(390), StubApp.getString2(7152));
        a(p02);
    }
}
