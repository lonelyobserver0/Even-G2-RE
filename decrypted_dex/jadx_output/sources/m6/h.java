package m6;

import aa.C0398e;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.util.Log;
import com.journeyapps.barcodescanner.CaptureActivity;
import com.journeyapps.barcodescanner.DecoratedBarcodeView;
import com.stub.StubApp;
import f4.C0879c;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class h {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f17093n = 0;

    /* renamed from: a, reason: collision with root package name */
    public final CaptureActivity f17094a;

    /* renamed from: b, reason: collision with root package name */
    public final DecoratedBarcodeView f17095b;

    /* renamed from: h, reason: collision with root package name */
    public final Mb.a f17101h;

    /* renamed from: i, reason: collision with root package name */
    public final C0398e f17102i;
    public final Handler j;

    /* renamed from: m, reason: collision with root package name */
    public boolean f17105m;

    /* renamed from: c, reason: collision with root package name */
    public int f17096c = -1;

    /* renamed from: d, reason: collision with root package name */
    public boolean f17097d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f17098e = true;

    /* renamed from: f, reason: collision with root package name */
    public String f17099f = "";

    /* renamed from: g, reason: collision with root package name */
    public boolean f17100g = false;

    /* renamed from: k, reason: collision with root package name */
    public boolean f17103k = false;

    /* renamed from: l, reason: collision with root package name */
    public final C0879c f17104l = new C0879c(this);

    /* JADX WARN: Type inference failed for: r0v2, types: [m6.f] */
    public h(CaptureActivity captureActivity, DecoratedBarcodeView decoratedBarcodeView) {
        d dVar = new d(this, 1);
        this.f17105m = false;
        this.f17094a = captureActivity;
        this.f17095b = decoratedBarcodeView;
        decoratedBarcodeView.getBarcodeView().f17076k.add(dVar);
        this.j = new Handler();
        final int i3 = 0;
        this.f17101h = new Mb.a(captureActivity, (f) new Runnable(this) { // from class: m6.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f17091b;

            {
                this.f17091b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                h hVar = this.f17091b;
                switch (i3) {
                    case 0:
                        hVar.getClass();
                        Log.d(StubApp.getString2(4933), StubApp.getString2(21083));
                        hVar.f17094a.finish();
                        break;
                    default:
                        Intent intent = new Intent(StubApp.getString2(10092));
                        intent.putExtra(StubApp.getString2(3469), true);
                        hVar.f17094a.setResult(0, intent);
                        hVar.a();
                        break;
                }
            }
        });
        C0398e c0398e = new C0398e();
        c0398e.f9343a = true;
        captureActivity.setVolumeControlStream(3);
        c0398e.f9344b = StubApp.getOrigApplicationContext(captureActivity.getApplicationContext());
        this.f17102i = c0398e;
    }

    public final void a() {
        DecoratedBarcodeView decoratedBarcodeView = this.f17095b;
        n6.f fVar = decoratedBarcodeView.getBarcodeView().f17068a;
        if (fVar == null || fVar.f17826g) {
            this.f17094a.finish();
        } else {
            this.f17103k = true;
        }
        decoratedBarcodeView.f12260a.i();
        this.f17101h.d();
    }

    public final void b(String str) {
        CaptureActivity captureActivity = this.f17094a;
        if (captureActivity.isFinishing() || this.f17100g || this.f17103k) {
            return;
        }
        if (str.isEmpty()) {
            str = captureActivity.getString(2131755243);
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(captureActivity);
        builder.setTitle(captureActivity.getString(2131755241));
        builder.setMessage(str);
        builder.setPositiveButton(2131755242, new c7.b(this, 3));
        builder.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: m6.g
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                h.this.f17094a.finish();
            }
        });
        builder.show();
    }
}
