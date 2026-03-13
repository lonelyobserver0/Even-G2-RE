package n6;

import Z9.C0366a;
import android.hardware.Camera;
import android.util.Log;
import com.stub.StubApp;

/* renamed from: n6.d, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final /* synthetic */ class RunnableC1390d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17814a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f17815b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0366a f17816c;

    public /* synthetic */ RunnableC1390d(f fVar, C0366a c0366a, int i3) {
        this.f17814a = i3;
        this.f17815b = fVar;
        this.f17816c = c0366a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0366a c0366a = this.f17816c;
        f fVar = this.f17815b;
        switch (this.f17814a) {
            case 0:
                if (!fVar.f17825f) {
                    Log.d(StubApp.getString2(4931), StubApp.getString2(21406));
                    break;
                } else {
                    fVar.f17820a.d(new RunnableC1390d(fVar, c0366a, 1));
                    break;
                }
            default:
                h hVar = fVar.f17822c;
                Camera camera = hVar.f17835a;
                if (camera != null && hVar.f17839e) {
                    g gVar = hVar.f17845l;
                    gVar.f17831a = c0366a;
                    camera.setOneShotPreviewCallback(gVar);
                    break;
                }
                break;
        }
    }
}
