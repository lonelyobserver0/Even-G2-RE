package io.flutter.plugin.platform;

import android.annotation.TargetApi;
import android.view.Surface;
import com.stub.StubApp;
import io.flutter.view.TextureRegistry$SurfaceProducer;

@TargetApi(29)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class SurfaceProducerPlatformViewRenderTarget implements PlatformViewRenderTarget {
    private static final String TAG = StubApp.getString2(18804);
    private TextureRegistry$SurfaceProducer producer;

    public SurfaceProducerPlatformViewRenderTarget(TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer) {
        this.producer = textureRegistry$SurfaceProducer;
    }

    @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
    public int getHeight() {
        return this.producer.getHeight();
    }

    @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
    public long getId() {
        return this.producer.id();
    }

    @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
    public Surface getSurface() {
        return this.producer.getSurface();
    }

    @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
    public int getWidth() {
        return this.producer.getWidth();
    }

    @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
    public boolean isReleased() {
        return this.producer == null;
    }

    @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
    public void release() {
        this.producer.release();
        this.producer = null;
    }

    @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
    public void resize(int i3, int i10) {
        this.producer.setSize(i3, i10);
    }

    @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
    public void scheduleFrame() {
        this.producer.scheduleFrame();
    }
}
