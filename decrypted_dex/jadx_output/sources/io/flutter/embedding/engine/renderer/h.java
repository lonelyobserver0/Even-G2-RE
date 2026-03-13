package io.flutter.embedding.engine.renderer;

import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.stub.StubApp;
import java.util.ArrayDeque;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final ImageReader f15030a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f15031b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public boolean f15032c = false;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ FlutterRenderer$ImageReaderSurfaceProducer f15033d;

    public h(FlutterRenderer$ImageReaderSurfaceProducer flutterRenderer$ImageReaderSurfaceProducer, ImageReader imageReader) {
        this.f15033d = flutterRenderer$ImageReaderSurfaceProducer;
        this.f15030a = imageReader;
        imageReader.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: io.flutter.embedding.engine.renderer.g
            @Override // android.media.ImageReader.OnImageAvailableListener
            public final void onImageAvailable(ImageReader imageReader2) {
                Image image;
                boolean z2;
                h hVar = h.this;
                hVar.getClass();
                try {
                    image = imageReader2.acquireLatestImage();
                } catch (IllegalStateException e10) {
                    Log.e(StubApp.getString2(18656), StubApp.getString2(18659) + e10);
                    image = null;
                }
                if (image == null) {
                    return;
                }
                FlutterRenderer$ImageReaderSurfaceProducer flutterRenderer$ImageReaderSurfaceProducer2 = hVar.f15033d;
                z2 = flutterRenderer$ImageReaderSurfaceProducer2.released;
                if (z2 || hVar.f15032c) {
                    image.close();
                } else {
                    flutterRenderer$ImageReaderSurfaceProducer2.onImage(imageReader2, image);
                }
            }
        }, new Handler(Looper.getMainLooper()));
    }
}
