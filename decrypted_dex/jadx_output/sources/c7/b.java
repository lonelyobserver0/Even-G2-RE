package c7;

import android.content.DialogInterface;
import com.mapbox.maps.module.MapTelemetry;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class b implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10997a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10998b;

    public /* synthetic */ b(Object obj, int i3) {
        this.f10997a = i3;
        this.f10998b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i3) {
        switch (this.f10997a) {
            case 0:
                String string2 = StubApp.getString2(392);
                e eVar = (e) this.f10998b;
                Intrinsics.checkNotNullParameter(eVar, string2);
                MapTelemetry mapTelemetry = eVar.f11009g;
                if (mapTelemetry != null) {
                    mapTelemetry.setUserTelemetryRequestState(true);
                }
                dialogInterface.cancel();
                break;
            case 1:
                String string22 = StubApp.getString2(392);
                e eVar2 = (e) this.f10998b;
                Intrinsics.checkNotNullParameter(eVar2, string22);
                String string = eVar2.f11003a.getResources().getString(2131755167);
                Intrinsics.checkNotNullExpressionValue(string, "context.resources.getStr…ing.mapbox_telemetryLink)");
                eVar2.b(string);
                dialogInterface.cancel();
                break;
            case 2:
                String string23 = StubApp.getString2(392);
                e eVar3 = (e) this.f10998b;
                Intrinsics.checkNotNullParameter(eVar3, string23);
                MapTelemetry mapTelemetry2 = eVar3.f11009g;
                if (mapTelemetry2 != null) {
                    mapTelemetry2.setUserTelemetryRequestState(false);
                }
                dialogInterface.cancel();
                break;
            default:
                ((m6.h) this.f10998b).f17094a.finish();
                break;
        }
    }
}
