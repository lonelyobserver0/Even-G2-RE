package c7;

import E0.x;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.widget.Toast;
import com.mapbox.common.MapboxOptions;
import com.mapbox.geojson.Point;
import com.mapbox.maps.CameraState;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.Style;
import com.mapbox.maps.geofencing.MapGeofencingConsent;
import com.mapbox.maps.module.MapTelemetry;
import com.stub.StubApp;
import h.AbstractC0997a;
import i.C1021b;
import i.DialogInterfaceC1025f;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import l.C1132c;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class e implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final Context f11003a;

    /* renamed from: b, reason: collision with root package name */
    public List f11004b;

    /* renamed from: c, reason: collision with root package name */
    public DialogInterfaceC1025f f11005c;

    /* renamed from: d, reason: collision with root package name */
    public DialogInterfaceC1025f f11006d;

    /* renamed from: e, reason: collision with root package name */
    public DialogInterfaceC1025f f11007e;

    /* renamed from: f, reason: collision with root package name */
    public X6.g f11008f;

    /* renamed from: g, reason: collision with root package name */
    public MapTelemetry f11009g;

    /* renamed from: h, reason: collision with root package name */
    public MapGeofencingConsent f11010h;

    public e(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f11003a = context;
    }

    public final x a() {
        boolean z2;
        int[] iArr = AbstractC0997a.j;
        Context context = this.f11003a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…styleable.AppCompatTheme)");
        try {
            z2 = obtainStyledAttributes.hasValue(117);
        } catch (Throwable unused) {
            z2 = false;
        }
        x xVar = z2 ? new x(context) : new x(new C1132c(context, 2131821009));
        obtainStyledAttributes.recycle();
        return xVar;
    }

    public final void b(String str) {
        Context context = this.f11003a;
        try {
            Intent intent = new Intent(StubApp.getString2("5111"));
            intent.setData(Uri.parse(str));
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(context, 2131755138, 1).show();
        } catch (Throwable th) {
            Toast.makeText(context, th.getLocalizedMessage(), 1).show();
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialog, int i3) {
        boolean contains$default;
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        List list = this.f11004b;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("attributionList");
            list = null;
        }
        C0574a c0574a = (C0574a) list.get(i3);
        String str = c0574a.f10996b;
        if (Intrinsics.areEqual(str, "https://www.mapbox.com/telemetry/")) {
            x a3 = a();
            C1021b c1021b = (C1021b) a3.f1862b;
            c1021b.f14555d = c1021b.f14552a.getText(2131755149);
            c1021b.f14557f = c1021b.f14552a.getText(2131755145);
            b bVar = new b(this, 0);
            c1021b.f14558g = c1021b.f14552a.getText(2131755148);
            c1021b.f14559h = bVar;
            b bVar2 = new b(this, 1);
            c1021b.f14561k = c1021b.f14552a.getText(2131755147);
            c1021b.f14562l = bVar2;
            b bVar3 = new b(this, 2);
            c1021b.f14560i = c1021b.f14552a.getText(2131755146);
            c1021b.j = bVar3;
            DialogInterfaceC1025f e10 = a3.e();
            e10.show();
            this.f11006d = e10;
            return;
        }
        if (Intrinsics.areEqual(str, "geofencing_url_marker")) {
            x a9 = a();
            C1021b c1021b2 = (C1021b) a9.f1862b;
            c1021b2.f14555d = c1021b2.f14552a.getText(2131755144);
            c1021b2.f14557f = c1021b2.f14552a.getText(2131755141);
            MapGeofencingConsent mapGeofencingConsent = this.f11010h;
            boolean userConsent = mapGeofencingConsent != null ? mapGeofencingConsent.getUserConsent() : false;
            int i10 = userConsent ? 2131755140 : 2131755143;
            int i11 = userConsent ? 2131755139 : 2131755142;
            final R4.i iVar = new R4.i(17);
            final int i12 = 0;
            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener(this) { // from class: c7.c

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ e f11000b;

                {
                    this.f11000b = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i13) {
                    switch (i12) {
                        case 0:
                            e this$0 = this.f11000b;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            R4.i callback = iVar;
                            Intrinsics.checkNotNullParameter(callback, "$callback");
                            MapGeofencingConsent mapGeofencingConsent2 = this$0.f11010h;
                            if (mapGeofencingConsent2 != null) {
                                mapGeofencingConsent2.setUserConsent(true, callback);
                            }
                            dialogInterface.cancel();
                            break;
                        default:
                            e this$02 = this.f11000b;
                            Intrinsics.checkNotNullParameter(this$02, "this$0");
                            R4.i callback2 = iVar;
                            Intrinsics.checkNotNullParameter(callback2, "$callback");
                            MapGeofencingConsent mapGeofencingConsent3 = this$02.f11010h;
                            if (mapGeofencingConsent3 != null) {
                                mapGeofencingConsent3.setUserConsent(false, callback2);
                            }
                            dialogInterface.cancel();
                            break;
                    }
                }
            };
            c1021b2.f14558g = c1021b2.f14552a.getText(i10);
            c1021b2.f14559h = onClickListener;
            final int i13 = 1;
            DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener(this) { // from class: c7.c

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ e f11000b;

                {
                    this.f11000b = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i132) {
                    switch (i13) {
                        case 0:
                            e this$0 = this.f11000b;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            R4.i callback = iVar;
                            Intrinsics.checkNotNullParameter(callback, "$callback");
                            MapGeofencingConsent mapGeofencingConsent2 = this$0.f11010h;
                            if (mapGeofencingConsent2 != null) {
                                mapGeofencingConsent2.setUserConsent(true, callback);
                            }
                            dialogInterface.cancel();
                            break;
                        default:
                            e this$02 = this.f11000b;
                            Intrinsics.checkNotNullParameter(this$02, "this$0");
                            R4.i callback2 = iVar;
                            Intrinsics.checkNotNullParameter(callback2, "$callback");
                            MapGeofencingConsent mapGeofencingConsent3 = this$02.f11010h;
                            if (mapGeofencingConsent3 != null) {
                                mapGeofencingConsent3.setUserConsent(false, callback2);
                            }
                            dialogInterface.cancel();
                            break;
                    }
                }
            };
            c1021b2.f14560i = c1021b2.f14552a.getText(i11);
            c1021b2.j = onClickListener2;
            DialogInterfaceC1025f e11 = a9.e();
            e11.show();
            this.f11007e = e11;
            return;
        }
        X6.g gVar = this.f11008f;
        String str2 = c0574a.f10996b;
        if (gVar != null) {
            contains$default = StringsKt__StringsKt.contains$default(str2, (CharSequence) StubApp.getString2(9616), false, 2, (Object) null);
            if (contains$default) {
                String string2 = StubApp.getString2(354);
                Context context = this.f11003a;
                Intrinsics.checkNotNullParameter(context, string2);
                Uri.Builder buildUpon = Uri.parse(StubApp.getString2(9617)).buildUpon();
                MapboxMap mapboxMap = gVar.f8451a;
                CameraState cameraState = mapboxMap.getCameraState();
                Point center = cameraState.getCenter();
                buildUpon.encodedFragment(StubApp.getString2(601) + center.longitude() + '/' + center.latitude() + '/' + cameraState.getZoom() + '/' + cameraState.getBearing() + '/' + cameraState.getPitch());
                String packageName = StubApp.getOrigApplicationContext(context.getApplicationContext()).getPackageName();
                if (packageName != null) {
                    buildUpon.appendQueryParameter(StubApp.getString2(1174), packageName);
                }
                buildUpon.appendQueryParameter(StubApp.getString2(5151), MapboxOptions.getAccessToken());
                Style styleDeprecated = mapboxMap.getStyleDeprecated();
                if (styleDeprecated != null) {
                    Pattern compile = Pattern.compile(StubApp.getString2(9618));
                    Intrinsics.checkNotNullExpressionValue(compile, "compile(MAP_FEEDBACK_STYLE_URI_REGEX)");
                    Matcher matcher = compile.matcher(styleDeprecated.getStyleURI());
                    Intrinsics.checkNotNullExpressionValue(matcher, "pattern.matcher(it.styleURI)");
                    if (matcher.find()) {
                        buildUpon.appendQueryParameter(StubApp.getString2(9619), matcher.group(2)).appendQueryParameter(StubApp.getString2(290), matcher.group(3));
                    }
                }
                str2 = buildUpon.build().toString();
                Intrinsics.checkNotNullExpressionValue(str2, "builder.build().toString()");
            }
        }
        if (str2.length() > 0) {
            b(str2);
        }
    }
}
