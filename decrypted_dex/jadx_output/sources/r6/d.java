package r6;

import android.content.Context;
import android.content.Intent;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import b3.C0510l;
import com.llfbandit.record.service.AudioRecordingService;
import com.stub.StubApp;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodChannel;
import kotlin.jvm.internal.Intrinsics;
import t6.C1737d;
import u6.C1775a;
import u6.InterfaceC1776b;
import y6.C1972a;
import y6.C1974c;
import y6.InterfaceC1973b;
import z6.C2011a;
import z6.C2012b;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class d implements InterfaceC1776b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f20364a;

    /* renamed from: b, reason: collision with root package name */
    public EventChannel f20365b;

    /* renamed from: c, reason: collision with root package name */
    public final C2012b f20366c;

    /* renamed from: d, reason: collision with root package name */
    public EventChannel f20367d;

    /* renamed from: e, reason: collision with root package name */
    public final C2011a f20368e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC1973b f20369f;

    /* renamed from: g, reason: collision with root package name */
    public C1775a f20370g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f20371h;

    /* renamed from: i, reason: collision with root package name */
    public final c f20372i;

    public d(Context context, String recorderId, BinaryMessenger messenger) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(recorderId, "recorderId");
        Intrinsics.checkNotNullParameter(messenger, "messenger");
        this.f20364a = context;
        C2012b c2012b = new C2012b();
        this.f20366c = c2012b;
        C2011a c2011a = new C2011a();
        this.f20368e = c2011a;
        EventChannel eventChannel = new EventChannel(messenger, E1.a.j(StubApp.getString2(22732), recorderId));
        this.f20365b = eventChannel;
        eventChannel.setStreamHandler(c2012b);
        EventChannel eventChannel2 = new EventChannel(messenger, E1.a.j(StubApp.getString2(22733), recorderId));
        this.f20367d = eventChannel2;
        eventChannel2.setStreamHandler(c2011a);
        this.f20372i = new c();
    }

    public final InterfaceC1973b a(C1737d c1737d) {
        boolean z2 = c1737d.f21196k;
        Context context = this.f20364a;
        if (z2) {
            AudioDeviceInfo audioDeviceInfo = c1737d.f21190d;
            if (audioDeviceInfo == null || audioDeviceInfo.getType() == 7) {
                if (this.f20370g == null) {
                    this.f20370g = new C1775a(context);
                }
                C1775a c1775a = this.f20370g;
                Intrinsics.checkNotNull(c1775a);
                if (c1775a.f21457d.isEmpty()) {
                    C1775a c1775a2 = this.f20370g;
                    Intrinsics.checkNotNull(c1775a2);
                    c1775a2.f21454a.registerReceiver(c1775a2, c1775a2.f21455b);
                    c1775a2.f21460g = true;
                    Q9.c cVar = new Q9.c(c1775a2, 1);
                    c1775a2.f21459f = cVar;
                    c1775a2.f21456c.registerAudioDeviceCallback(cVar, null);
                    C1775a c1775a3 = this.f20370g;
                    Intrinsics.checkNotNull(c1775a3);
                    c1775a3.getClass();
                    Intrinsics.checkNotNullParameter(this, "listener");
                    c1775a3.f21457d.add(this);
                }
            } else {
                b();
            }
        }
        boolean z10 = c1737d.f21194h;
        C2012b c2012b = this.f20366c;
        return z10 ? new C1974c(context, c2012b) : new C1972a(c2012b, this.f20368e, context);
    }

    public final void b() {
        C1775a c1775a;
        C1775a c1775a2 = this.f20370g;
        if (c1775a2 != null) {
            Intrinsics.checkNotNullParameter(this, "listener");
            c1775a2.f21457d.remove(this);
        }
        if ((this.f20370g == null || !(!r0.f21457d.isEmpty())) && (c1775a = this.f20370g) != null) {
            AudioManager audioManager = c1775a.f21456c;
            if (audioManager.isBluetoothScoOn()) {
                audioManager.stopBluetoothSco();
            }
            Q9.c cVar = c1775a.f21459f;
            if (cVar != null) {
                audioManager.unregisterAudioDeviceCallback(cVar);
                c1775a.f21459f = null;
            }
            c1775a.f21457d.clear();
            if (c1775a.f21460g) {
                c1775a.f21454a.unregisterReceiver(c1775a);
                c1775a.f21460g = false;
            }
        }
    }

    public final void c(C1737d c1737d, MethodChannel.Result result) {
        try {
            InterfaceC1973b interfaceC1973b = this.f20369f;
            if (interfaceC1973b == null) {
                InterfaceC1973b a3 = a(c1737d);
                this.f20369f = a3;
                Intrinsics.checkNotNull(a3);
                a3.d(c1737d);
                result.success(null);
            } else {
                Intrinsics.checkNotNull(interfaceC1973b);
                if (interfaceC1973b.a()) {
                    InterfaceC1973b interfaceC1973b2 = this.f20369f;
                    Intrinsics.checkNotNull(interfaceC1973b2);
                    interfaceC1973b2.e(new C0510l(this, c1737d, result, 2));
                } else {
                    InterfaceC1973b interfaceC1973b3 = this.f20369f;
                    Intrinsics.checkNotNull(interfaceC1973b3);
                    interfaceC1973b3.d(c1737d);
                    result.success(null);
                }
            }
            d(c1737d);
        } catch (Exception e10) {
            result.error(StubApp.getString2(22685), e10.getMessage(), e10.getCause());
        }
    }

    public final void d(C1737d c1737d) {
        C2.a aVar = c1737d.f21195i;
        if (aVar != null) {
            Context context = this.f20364a;
            Intent intent = new Intent(context, (Class<?>) AudioRecordingService.class);
            intent.putExtra(StubApp.getString2(616), aVar.f1045a);
            intent.putExtra(StubApp.getString2(1248), aVar.f1046b);
            context.startService(intent);
            this.f20371h = context.bindService(new Intent(context, (Class<?>) AudioRecordingService.class), this.f20372i, 1);
        }
    }

    public final void e() {
        if (this.f20371h) {
            c cVar = this.f20372i;
            Context context = this.f20364a;
            context.unbindService(cVar);
            context.stopService(new Intent(context, (Class<?>) AudioRecordingService.class));
            this.f20371h = false;
        }
    }
}
