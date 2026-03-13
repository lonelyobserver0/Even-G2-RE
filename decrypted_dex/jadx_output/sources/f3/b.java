package f3;

import android.util.Log;
import com.google.android.gms.internal.measurement.AbstractC0624h2;
import com.stub.StubApp;
import db.C0824a;
import db.InterfaceC0825b;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import oa.C1468a;
import oa.C1471d;
import oa.j;
import sa.C1609b;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class b implements InterfaceC0825b, MethodChannel.MethodCallHandler {

    /* renamed from: b, reason: collision with root package name */
    public static MethodChannel.Result f13735b;

    /* renamed from: a, reason: collision with root package name */
    public MethodChannel f13736a;

    @Override // db.InterfaceC0825b
    public final void onAttachedToEngine(C0824a c0824a) {
        MethodChannel methodChannel = new MethodChannel(c0824a.f13554b, StubApp.getString2(17437));
        this.f13736a = methodChannel;
        methodChannel.setMethodCallHandler(this);
        AbstractC0624h2.f11579a = StubApp.getOrigApplicationContext(c0824a.f13553a.getApplicationContext()).getAssets();
    }

    @Override // db.InterfaceC0825b
    public final void onDetachedFromEngine(C0824a c0824a) {
        MethodChannel methodChannel = this.f13736a;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
            this.f13736a = null;
        }
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        C1609b c1609b;
        f13735b = result;
        boolean equals = methodCall.method.equals(StubApp.getString2(17438));
        String string2 = StubApp.getString2(1251);
        if (equals) {
            new a(1).execute((String) methodCall.argument(string2));
            return;
        }
        if (methodCall.method.equals(StubApp.getString2(17439))) {
            new a(0).execute((String) methodCall.argument(string2));
            return;
        }
        if (!methodCall.method.equals(StubApp.getString2(17440))) {
            result.notImplemented();
            return;
        }
        String str = (String) methodCall.argument(string2);
        String string22 = StubApp.getString2(17431);
        try {
            c1609b = C1609b.d(new File(str));
            try {
                c1609b.close();
            } catch (IOException e10) {
                Log.e(string22, StubApp.getString2(17430), e10);
            }
        } catch (IOException e11) {
            Log.e(string22, StubApp.getString2(17441), e11);
            c1609b = null;
        }
        if (c1609b == null) {
            f13735b.error(StubApp.getString2(17435), StubApp.getString2(17436), null);
            return;
        }
        MethodChannel.Result result2 = f13735b;
        C1471d c1471d = (C1471d) ((C1471d) c1609b.a().f20829b).J(j.f18431C2);
        new HashSet();
        if (c1471d == null) {
            throw new IllegalArgumentException(StubApp.getString2(17434));
        }
        boolean equals2 = j.f18426B2.equals(c1471d.H(j.f18621y3));
        C1471d c1471d2 = c1471d;
        if (equals2) {
            C1468a c1468a = new C1468a();
            c1468a.a(c1471d);
            C1471d c1471d3 = new C1471d();
            c1471d3.V(j.f18480N1, c1468a);
            c1471d3.U(j.f18597t0, 1);
            c1471d2 = c1471d3;
        }
        result2.success(Integer.valueOf(c1471d2.N(j.f18597t0, null, 0)));
    }
}
