package uc;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.stub.StubApp;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import l4.C1221y;
import tc.q;
import tc.s;
import tc.t;
import tc.v;
import vc.C1850b;
import wb.f;

/* renamed from: uc.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public final class C1787a extends f {

    /* renamed from: u, reason: collision with root package name */
    public final C1850b f21486u;

    /* renamed from: v, reason: collision with root package name */
    public final Handler f21487v;

    /* renamed from: w, reason: collision with root package name */
    public final ArrayList f21488w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1787a(Context context, BluetoothDevice device, C1850b logStreamHandler) {
        super(context, device);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter(logStreamHandler, "logStreamHandler");
        this.f21486u = logStreamHandler;
        this.f21487v = new Handler(Looper.getMainLooper());
        this.f21488w = new ArrayList();
    }

    @Override // no.nordicsemi.android.ble.c
    public final void b(int i3, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        boolean z2 = StringsKt.O(message, StubApp.getString2(35393)) || StringsKt.O(message, StubApp.getString2(35394));
        C1221y c1221y = q.f21339b;
        t tVar = new t(message, z2 ? s.f21358g : i3 != 2 ? i3 != 3 ? i3 != 4 ? i3 != 5 ? s.j : s.f21359h : s.f21357f : s.f21355d : s.f21356e, System.currentTimeMillis());
        String address = this.j.getAddress();
        Intrinsics.checkNotNullExpressionValue(address, "getAddress(...)");
        v vVar = new v(address, tVar, 22);
        this.f21488w.add(tVar);
        this.f21487v.post(new com.even.translate.a(19, this, vVar));
    }

    public final void e(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        C1221y c1221y = q.f21339b;
        this.f21488w.add(new t(message, s.f21358g, System.currentTimeMillis()));
    }
}
