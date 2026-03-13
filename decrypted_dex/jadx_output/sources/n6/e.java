package n6;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import android.view.SurfaceHolder;
import com.stub.StubApp;
import m6.q;
import r0.C1552m;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17817a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f17818b;

    public /* synthetic */ e(f fVar, int i3) {
        this.f17817a = i3;
        this.f17818b = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z2 = true;
        q qVar = null;
        switch (this.f17817a) {
            case 0:
                f fVar = this.f17818b;
                String string2 = StubApp.getString2(4931);
                try {
                    Log.d(string2, StubApp.getString2("21413"));
                    fVar.f17822c.c();
                    return;
                } catch (Exception e10) {
                    Handler handler = fVar.f17823d;
                    if (handler != null) {
                        handler.obtainMessage(2131231183, e10).sendToTarget();
                    }
                    Log.e(string2, StubApp.getString2(21414), e10);
                    return;
                }
            case 1:
                String string22 = StubApp.getString2(4931);
                f fVar2 = this.f17818b;
                try {
                    Log.d(string22, StubApp.getString2("21410"));
                    fVar2.f17822c.b();
                    Handler handler2 = fVar2.f17823d;
                    if (handler2 != null) {
                        h hVar = fVar2.f17822c;
                        q qVar2 = hVar.j;
                        if (qVar2 != null) {
                            int i3 = hVar.f17844k;
                            if (i3 == -1) {
                                throw new IllegalStateException(StubApp.getString2("21411"));
                            }
                            if (i3 % 180 == 0) {
                                z2 = false;
                            }
                            qVar = z2 ? new q(qVar2.f17121b, qVar2.f17120a) : qVar2;
                        }
                        handler2.obtainMessage(2131231189, qVar).sendToTarget();
                        return;
                    }
                    return;
                } catch (Exception e11) {
                    Handler handler3 = fVar2.f17823d;
                    if (handler3 != null) {
                        handler3.obtainMessage(2131231183, e11).sendToTarget();
                    }
                    Log.e(string22, StubApp.getString2(21412), e11);
                    return;
                }
            case 2:
                String string23 = StubApp.getString2(4931);
                f fVar3 = this.f17818b;
                try {
                    Log.d(string23, StubApp.getString2("21076"));
                    h hVar2 = fVar3.f17822c;
                    V6.b bVar = fVar3.f17821b;
                    Camera camera = hVar2.f17835a;
                    SurfaceHolder surfaceHolder = (SurfaceHolder) bVar.f7761b;
                    if (surfaceHolder != null) {
                        camera.setPreviewDisplay(surfaceHolder);
                    } else {
                        camera.setPreviewTexture((SurfaceTexture) bVar.f7762c);
                    }
                    fVar3.f17822c.f();
                    return;
                } catch (Exception e12) {
                    Handler handler4 = fVar3.f17823d;
                    if (handler4 != null) {
                        handler4.obtainMessage(2131231183, e12).sendToTarget();
                    }
                    Log.e(string23, StubApp.getString2(21409), e12);
                    return;
                }
            default:
                try {
                    Log.d(StubApp.getString2("4931"), StubApp.getString2("21407"));
                    h hVar3 = this.f17818b.f17822c;
                    C1388b c1388b = hVar3.f17837c;
                    if (c1388b != null) {
                        c1388b.c();
                        hVar3.f17837c = null;
                    }
                    if (hVar3.f17838d != null) {
                        hVar3.f17838d = null;
                    }
                    Camera camera2 = hVar3.f17835a;
                    if (camera2 != null && hVar3.f17839e) {
                        camera2.stopPreview();
                        hVar3.f17845l.f17831a = null;
                        hVar3.f17839e = false;
                    }
                    h hVar4 = this.f17818b.f17822c;
                    Camera camera3 = hVar4.f17835a;
                    if (camera3 != null) {
                        camera3.release();
                        hVar4.f17835a = null;
                    }
                } catch (Exception e13) {
                    Log.e(StubApp.getString2(4931), StubApp.getString2(21408), e13);
                }
                f fVar4 = this.f17818b;
                fVar4.f17826g = true;
                fVar4.f17823d.sendEmptyMessage(2131231182);
                C1552m c1552m = this.f17818b.f17820a;
                synchronized (c1552m.f20172d) {
                    int i10 = c1552m.f20169a - 1;
                    c1552m.f20169a = i10;
                    if (i10 == 0) {
                        synchronized (c1552m.f20172d) {
                            ((HandlerThread) c1552m.f20171c).quit();
                            c1552m.f20171c = null;
                            c1552m.f20170b = null;
                        }
                    }
                }
                return;
        }
    }
}
