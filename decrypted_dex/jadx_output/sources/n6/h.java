package n6;

import android.content.Context;
import android.hardware.Camera;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import m6.q;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class h {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f17834m = 0;

    /* renamed from: a, reason: collision with root package name */
    public Camera f17835a;

    /* renamed from: b, reason: collision with root package name */
    public Camera.CameraInfo f17836b;

    /* renamed from: c, reason: collision with root package name */
    public C1388b f17837c;

    /* renamed from: d, reason: collision with root package name */
    public R5.b f17838d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f17839e;

    /* renamed from: f, reason: collision with root package name */
    public String f17840f;

    /* renamed from: h, reason: collision with root package name */
    public Bc.i f17842h;

    /* renamed from: i, reason: collision with root package name */
    public q f17843i;
    public q j;

    /* renamed from: g, reason: collision with root package name */
    public i f17841g = new i();

    /* renamed from: k, reason: collision with root package name */
    public int f17844k = -1;

    /* renamed from: l, reason: collision with root package name */
    public final g f17845l = new g(this);

    public h(Context context) {
    }

    public final int a() {
        int i3 = this.f17842h.f766b;
        int i10 = 0;
        if (i3 != 0) {
            if (i3 == 1) {
                i10 = 90;
            } else if (i3 == 2) {
                i10 = 180;
            } else if (i3 == 3) {
                i10 = 270;
            }
        }
        Camera.CameraInfo cameraInfo = this.f17836b;
        int i11 = cameraInfo.facing == 1 ? (360 - ((cameraInfo.orientation + i10) % 360)) % 360 : ((cameraInfo.orientation - i10) + 360) % 360;
        Log.i(StubApp.getString2(4933), StubApp.getString2(21419) + i11);
        return i11;
    }

    public final void b() {
        if (this.f17835a == null) {
            throw new RuntimeException(StubApp.getString2(21422));
        }
        String string2 = StubApp.getString2(4933);
        try {
            int a3 = a();
            this.f17844k = a3;
            this.f17835a.setDisplayOrientation(a3);
        } catch (Exception unused) {
            Log.w(string2, StubApp.getString2(21420));
        }
        try {
            d(false);
        } catch (Exception unused2) {
            try {
                d(true);
            } catch (Exception unused3) {
                Log.w(string2, StubApp.getString2(21421));
            }
        }
        Camera.Size previewSize = this.f17835a.getParameters().getPreviewSize();
        if (previewSize == null) {
            this.j = this.f17843i;
        } else {
            this.j = new q(previewSize.width, previewSize.height);
        }
        this.f17845l.f17832b = this.j;
    }

    public final void c() {
        int v2 = hc.b.v(this.f17841g.f17846a);
        Camera open = v2 == -1 ? null : Camera.open(v2);
        this.f17835a = open;
        if (open == null) {
            throw new RuntimeException(StubApp.getString2(21414));
        }
        int v8 = hc.b.v(this.f17841g.f17846a);
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        this.f17836b = cameraInfo;
        Camera.getCameraInfo(v8, cameraInfo);
    }

    public final void d(boolean z2) {
        String string2;
        Camera.Parameters parameters = this.f17835a.getParameters();
        String str = this.f17840f;
        if (str == null) {
            this.f17840f = parameters.flatten();
        } else {
            parameters.unflatten(str);
        }
        String string22 = StubApp.getString2(4933);
        if (parameters == null) {
            Log.w(string22, StubApp.getString2(21423));
            return;
        }
        Log.i(string22, StubApp.getString2(21424) + parameters.flatten());
        if (z2) {
            Log.w(string22, StubApp.getString2(21425));
        }
        this.f17841g.getClass();
        int i3 = AbstractC1389c.f17813a;
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        String[] strArr = {StubApp.getString2(3305)};
        String string23 = StubApp.getString2(21426);
        String a3 = AbstractC1389c.a(string23, supportedFocusModes, strArr);
        if (!z2 && a3 == null) {
            a3 = AbstractC1389c.a(string23, supportedFocusModes, StubApp.getString2(21390), StubApp.getString2(21427));
        }
        String string24 = StubApp.getString2(21397);
        if (a3 != null) {
            if (a3.equals(parameters.getFocusMode())) {
                Log.i(string24, StubApp.getString2(21428).concat(a3));
            } else {
                parameters.setFocusMode(a3);
            }
        }
        if (!z2) {
            AbstractC1389c.b(parameters, false);
            if (this.f17841g.f17847b) {
                String colorEffect = parameters.getColorEffect();
                String string25 = StubApp.getString2(21429);
                if (string25.equals(colorEffect)) {
                    Log.i(string24, StubApp.getString2(21430));
                } else {
                    String a9 = AbstractC1389c.a(StubApp.getString2(21431), parameters.getSupportedColorEffects(), string25);
                    if (a9 != null) {
                        parameters.setColorEffect(a9);
                    }
                }
            }
            this.f17841g.getClass();
            this.f17841g.getClass();
        }
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        ArrayList arrayList = new ArrayList();
        if (supportedPreviewSizes == null) {
            Camera.Size previewSize = parameters.getPreviewSize();
            if (previewSize != null) {
                arrayList.add(new q(previewSize.width, previewSize.height));
            }
        } else {
            for (Camera.Size size : supportedPreviewSizes) {
                arrayList.add(new q(size.width, size.height));
            }
        }
        int[] iArr = null;
        if (arrayList.size() == 0) {
            this.f17843i = null;
        } else {
            Bc.i iVar = this.f17842h;
            int i10 = this.f17844k;
            if (i10 == -1) {
                throw new IllegalStateException(StubApp.getString2(21411));
            }
            boolean z10 = i10 % 180 != 0;
            q qVar = (q) iVar.f767c;
            if (qVar == null) {
                qVar = null;
            } else if (z10) {
                qVar = new q(qVar.f17121b, qVar.f17120a);
            }
            l lVar = (l) iVar.f768d;
            lVar.getClass();
            if (qVar != null) {
                Collections.sort(arrayList, new k(lVar, qVar));
            }
            String str2 = StubApp.getString2(21432) + qVar;
            String string26 = StubApp.getString2(1314);
            Log.i(string26, str2);
            Log.i(string26, StubApp.getString2(21433) + arrayList);
            q qVar2 = (q) arrayList.get(0);
            this.f17843i = qVar2;
            parameters.setPreviewSize(qVar2.f17120a, qVar2.f17121b);
        }
        if (Build.DEVICE.equals(StubApp.getString2(21434))) {
            List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
            StringBuilder sb2 = new StringBuilder(StubApp.getString2(21435));
            if (supportedPreviewFpsRange == null || supportedPreviewFpsRange.isEmpty()) {
                string2 = StubApp.getString2(11096);
            } else {
                StringBuilder sb3 = new StringBuilder(StubApp.getString2(1557));
                Iterator<int[]> it = supportedPreviewFpsRange.iterator();
                while (it.hasNext()) {
                    sb3.append(Arrays.toString(it.next()));
                    if (it.hasNext()) {
                        sb3.append(StubApp.getString2(81));
                    }
                }
                sb3.append(']');
                string2 = sb3.toString();
            }
            sb2.append(string2);
            Log.i(string24, sb2.toString());
            if (supportedPreviewFpsRange != null && !supportedPreviewFpsRange.isEmpty()) {
                Iterator<int[]> it2 = supportedPreviewFpsRange.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    int[] next = it2.next();
                    int i11 = next[0];
                    int i12 = next[1];
                    if (i11 >= 10000 && i12 <= 20000) {
                        iArr = next;
                        break;
                    }
                }
                if (iArr == null) {
                    Log.i(string24, StubApp.getString2(21436));
                } else {
                    int[] iArr2 = new int[2];
                    parameters.getPreviewFpsRange(iArr2);
                    if (Arrays.equals(iArr2, iArr)) {
                        Log.i(string24, StubApp.getString2(21437) + Arrays.toString(iArr));
                    } else {
                        Log.i(string24, StubApp.getString2(21438) + Arrays.toString(iArr));
                        parameters.setPreviewFpsRange(iArr[0], iArr[1]);
                    }
                }
            }
        }
        Log.i(string22, StubApp.getString2(21439) + parameters.flatten());
        this.f17835a.setParameters(parameters);
    }

    public final void e(boolean z2) {
        String flashMode;
        Camera camera = this.f17835a;
        if (camera != null) {
            try {
                Camera.Parameters parameters = camera.getParameters();
                if (z2 != ((parameters == null || (flashMode = parameters.getFlashMode()) == null || (!StubApp.getString2("16330").equals(flashMode) && !StubApp.getString2("21081").equals(flashMode))) ? false : true)) {
                    C1388b c1388b = this.f17837c;
                    if (c1388b != null) {
                        c1388b.c();
                    }
                    Camera.Parameters parameters2 = this.f17835a.getParameters();
                    AbstractC1389c.b(parameters2, z2);
                    this.f17841g.getClass();
                    this.f17835a.setParameters(parameters2);
                    C1388b c1388b2 = this.f17837c;
                    if (c1388b2 != null) {
                        c1388b2.f17807a = false;
                        c1388b2.b();
                    }
                }
            } catch (RuntimeException e10) {
                Log.e(StubApp.getString2(4933), StubApp.getString2(21440), e10);
            }
        }
    }

    public final void f() {
        Camera camera = this.f17835a;
        if (camera == null || this.f17839e) {
            return;
        }
        camera.startPreview();
        this.f17839e = true;
        this.f17837c = new C1388b(this.f17835a, this.f17841g);
        i iVar = this.f17841g;
        R5.b bVar = new R5.b();
        bVar.f6213a = this;
        bVar.f6214b = new Handler();
        this.f17838d = bVar;
        iVar.getClass();
    }
}
