package Ta;

import com.stub.StubApp;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodChannel;
import java.util.LinkedHashMap;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import no.nordicsemi.android.dfu.DfuProgressListenerAdapter;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c extends DfuProgressListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f7242a;

    public c(d dVar) {
        this.f7242a = dVar;
    }

    @Override // no.nordicsemi.android.dfu.DfuProgressListenerAdapter, no.nordicsemi.android.dfu.DfuProgressListener
    public final void onDeviceConnected(String deviceAddress) {
        Intrinsics.checkNotNullParameter(deviceAddress, "deviceAddress");
        super.onDeviceConnected(deviceAddress);
        e eVar = this.f7242a.f7245b;
        Intrinsics.checkNotNullParameter(deviceAddress, "deviceAddress");
        EventChannel.EventSink eventSink = eVar.f7251c;
        if (eventSink != null) {
            eventSink.success(MapsKt.mapOf(TuplesKt.to(StubApp.getString2(6240), deviceAddress)));
        }
    }

    @Override // no.nordicsemi.android.dfu.DfuProgressListenerAdapter, no.nordicsemi.android.dfu.DfuProgressListener
    public final void onDeviceConnecting(String deviceAddress) {
        Intrinsics.checkNotNullParameter(deviceAddress, "deviceAddress");
        super.onDeviceConnecting(deviceAddress);
        e eVar = this.f7242a.f7245b;
        Intrinsics.checkNotNullParameter(deviceAddress, "deviceAddress");
        EventChannel.EventSink eventSink = eVar.f7251c;
        if (eventSink != null) {
            eventSink.success(MapsKt.mapOf(TuplesKt.to(StubApp.getString2(6241), deviceAddress)));
        }
    }

    @Override // no.nordicsemi.android.dfu.DfuProgressListenerAdapter, no.nordicsemi.android.dfu.DfuProgressListener
    public final void onDeviceDisconnected(String deviceAddress) {
        Intrinsics.checkNotNullParameter(deviceAddress, "deviceAddress");
        super.onDeviceDisconnected(deviceAddress);
        e eVar = this.f7242a.f7245b;
        Intrinsics.checkNotNullParameter(deviceAddress, "deviceAddress");
        EventChannel.EventSink eventSink = eVar.f7251c;
        if (eventSink != null) {
            eventSink.success(MapsKt.mapOf(TuplesKt.to(StubApp.getString2(6242), deviceAddress)));
        }
    }

    @Override // no.nordicsemi.android.dfu.DfuProgressListenerAdapter, no.nordicsemi.android.dfu.DfuProgressListener
    public final void onDeviceDisconnecting(String deviceAddress) {
        Intrinsics.checkNotNullParameter(deviceAddress, "deviceAddress");
        super.onDeviceDisconnecting(deviceAddress);
        e eVar = this.f7242a.f7245b;
        Intrinsics.checkNotNullParameter(deviceAddress, "deviceAddress");
        EventChannel.EventSink eventSink = eVar.f7251c;
        if (eventSink != null) {
            eventSink.success(MapsKt.mapOf(TuplesKt.to(StubApp.getString2(6243), deviceAddress)));
        }
    }

    @Override // no.nordicsemi.android.dfu.DfuProgressListenerAdapter, no.nordicsemi.android.dfu.DfuProgressListener
    public final void onDfuAborted(String deviceAddress) {
        Intrinsics.checkNotNullParameter(deviceAddress, "deviceAddress");
        super.onDfuAborted(deviceAddress);
        d dVar = this.f7242a;
        d.a(dVar);
        e eVar = dVar.f7245b;
        Intrinsics.checkNotNullParameter(deviceAddress, "deviceAddress");
        EventChannel.EventSink eventSink = eVar.f7251c;
        if (eventSink != null) {
            eventSink.success(MapsKt.mapOf(TuplesKt.to(StubApp.getString2(6244), deviceAddress)));
        }
        LinkedHashMap linkedHashMap = eVar.f7252d;
        MethodChannel.Result result = (MethodChannel.Result) linkedHashMap.get(deviceAddress);
        if (result != null) {
            result.error(StubApp.getString2(6246), StubApp.getString2(6247), StubApp.getString2(6245) + deviceAddress);
        }
        linkedHashMap.remove(deviceAddress);
        dVar.f7246c.remove(deviceAddress);
    }

    @Override // no.nordicsemi.android.dfu.DfuProgressListenerAdapter, no.nordicsemi.android.dfu.DfuProgressListener
    public final void onDfuCompleted(String deviceAddress) {
        Intrinsics.checkNotNullParameter(deviceAddress, "deviceAddress");
        super.onDfuCompleted(deviceAddress);
        d dVar = this.f7242a;
        d.a(dVar);
        e eVar = dVar.f7245b;
        Intrinsics.checkNotNullParameter(deviceAddress, "deviceAddress");
        EventChannel.EventSink eventSink = eVar.f7251c;
        if (eventSink != null) {
            eventSink.success(MapsKt.mapOf(TuplesKt.to(StubApp.getString2(6248), deviceAddress)));
        }
        LinkedHashMap linkedHashMap = eVar.f7252d;
        MethodChannel.Result result = (MethodChannel.Result) linkedHashMap.get(deviceAddress);
        if (result != null) {
            result.success(deviceAddress);
        }
        linkedHashMap.remove(deviceAddress);
        dVar.f7246c.remove(deviceAddress);
    }

    @Override // no.nordicsemi.android.dfu.DfuProgressListenerAdapter, no.nordicsemi.android.dfu.DfuProgressListener
    public final void onDfuProcessStarted(String deviceAddress) {
        Intrinsics.checkNotNullParameter(deviceAddress, "deviceAddress");
        super.onDfuProcessStarted(deviceAddress);
        e eVar = this.f7242a.f7245b;
        Intrinsics.checkNotNullParameter(deviceAddress, "deviceAddress");
        EventChannel.EventSink eventSink = eVar.f7251c;
        if (eventSink != null) {
            eventSink.success(MapsKt.mapOf(TuplesKt.to(StubApp.getString2(6249), deviceAddress)));
        }
    }

    @Override // no.nordicsemi.android.dfu.DfuProgressListenerAdapter, no.nordicsemi.android.dfu.DfuProgressListener
    public final void onDfuProcessStarting(String deviceAddress) {
        Intrinsics.checkNotNullParameter(deviceAddress, "deviceAddress");
        super.onDfuProcessStarting(deviceAddress);
        e eVar = this.f7242a.f7245b;
        Intrinsics.checkNotNullParameter(deviceAddress, "deviceAddress");
        EventChannel.EventSink eventSink = eVar.f7251c;
        if (eventSink != null) {
            eventSink.success(MapsKt.mapOf(TuplesKt.to(StubApp.getString2(6250), deviceAddress)));
        }
    }

    @Override // no.nordicsemi.android.dfu.DfuProgressListenerAdapter, no.nordicsemi.android.dfu.DfuProgressListener
    public final void onEnablingDfuMode(String deviceAddress) {
        Intrinsics.checkNotNullParameter(deviceAddress, "deviceAddress");
        super.onEnablingDfuMode(deviceAddress);
        e eVar = this.f7242a.f7245b;
        Intrinsics.checkNotNullParameter(deviceAddress, "deviceAddress");
        EventChannel.EventSink eventSink = eVar.f7251c;
        if (eventSink != null) {
            eventSink.success(MapsKt.mapOf(TuplesKt.to(StubApp.getString2(6251), deviceAddress)));
        }
    }

    @Override // no.nordicsemi.android.dfu.DfuProgressListenerAdapter, no.nordicsemi.android.dfu.DfuProgressListener
    public final void onError(String deviceAddress, int i3, int i10, String message) {
        Intrinsics.checkNotNullParameter(deviceAddress, "deviceAddress");
        Intrinsics.checkNotNullParameter(message, "message");
        super.onError(deviceAddress, i3, i10, message);
        d dVar = this.f7242a;
        d.a(dVar);
        e eVar = dVar.f7245b;
        Intrinsics.checkNotNullParameter(deviceAddress, "deviceAddress");
        Intrinsics.checkNotNullParameter(message, "message");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("deviceAddress", deviceAddress);
        linkedHashMap.put(StubApp.getString2(435), Integer.valueOf(i3));
        linkedHashMap.put(StubApp.getString2(6252), Integer.valueOf(i10));
        linkedHashMap.put("message", message);
        EventChannel.EventSink eventSink = eVar.f7251c;
        if (eventSink != null) {
            eventSink.success(MapsKt.mapOf(TuplesKt.to(StubApp.getString2(6253), linkedHashMap)));
        }
        LinkedHashMap linkedHashMap2 = eVar.f7252d;
        MethodChannel.Result result = (MethodChannel.Result) linkedHashMap2.get(deviceAddress);
        if (result != null) {
            result.error(String.valueOf(i3), E1.a.j(StubApp.getString2(6254), message), StubApp.getString2(6255) + deviceAddress + StubApp.getString2(6256) + i10);
        }
        linkedHashMap2.remove(deviceAddress);
        dVar.f7246c.remove(deviceAddress);
    }

    @Override // no.nordicsemi.android.dfu.DfuProgressListenerAdapter, no.nordicsemi.android.dfu.DfuProgressListener
    public final void onFirmwareValidating(String deviceAddress) {
        Intrinsics.checkNotNullParameter(deviceAddress, "deviceAddress");
        super.onFirmwareValidating(deviceAddress);
        e eVar = this.f7242a.f7245b;
        Intrinsics.checkNotNullParameter(deviceAddress, "deviceAddress");
        EventChannel.EventSink eventSink = eVar.f7251c;
        if (eventSink != null) {
            eventSink.success(MapsKt.mapOf(TuplesKt.to(StubApp.getString2(6257), deviceAddress)));
        }
    }

    @Override // no.nordicsemi.android.dfu.DfuProgressListenerAdapter, no.nordicsemi.android.dfu.DfuProgressListener
    public final void onProgressChanged(String deviceAddress, int i3, float f10, float f11, int i10, int i11) {
        Intrinsics.checkNotNullParameter(deviceAddress, "deviceAddress");
        super.onProgressChanged(deviceAddress, i3, f10, f11, i10, i11);
        e eVar = this.f7242a.f7245b;
        Intrinsics.checkNotNullParameter(deviceAddress, "deviceAddress");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("deviceAddress", deviceAddress);
        linkedHashMap.put(StubApp.getString2(6258), Integer.valueOf(i3));
        linkedHashMap.put(StubApp.getString2(2029), Float.valueOf(f10));
        linkedHashMap.put(StubApp.getString2(6259), Float.valueOf(f11));
        linkedHashMap.put(StubApp.getString2(6260), Integer.valueOf(i10));
        linkedHashMap.put(StubApp.getString2(6261), Integer.valueOf(i11));
        EventChannel.EventSink eventSink = eVar.f7251c;
        if (eventSink != null) {
            eventSink.success(MapsKt.mapOf(TuplesKt.to(StubApp.getString2(6262), linkedHashMap)));
        }
    }
}
