package io.flutter.plugin.platform;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.view.Surface;
import com.stub.StubApp;
import io.flutter.view.TextureRegistry$SurfaceTextureEntry;
import io.flutter.view.p;

@TargetApi(26)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class SurfaceTexturePlatformViewRenderTarget implements PlatformViewRenderTarget {
    private static final String TAG = StubApp.getString2(18805);
    private Surface surface;
    private SurfaceTexture surfaceTexture;
    private final TextureRegistry$SurfaceTextureEntry surfaceTextureEntry;
    private final p trimMemoryListener;
    private int bufferWidth = 0;
    private int bufferHeight = 0;
    private boolean shouldRecreateSurfaceForLowMemory = false;

    public SurfaceTexturePlatformViewRenderTarget(TextureRegistry$SurfaceTextureEntry textureRegistry$SurfaceTextureEntry) {
        p pVar = new p() { // from class: io.flutter.plugin.platform.SurfaceTexturePlatformViewRenderTarget.1
            @Override // io.flutter.view.p
            public void onTrimMemory(int i3) {
                if (i3 != 80 || Build.VERSION.SDK_INT < 29) {
                    return;
                }
                SurfaceTexturePlatformViewRenderTarget.this.shouldRecreateSurfaceForLowMemory = true;
            }
        };
        this.trimMemoryListener = pVar;
        this.surfaceTextureEntry = textureRegistry$SurfaceTextureEntry;
        this.surfaceTexture = textureRegistry$SurfaceTextureEntry.surfaceTexture();
        textureRegistry$SurfaceTextureEntry.setOnTrimMemoryListener(pVar);
    }

    private void recreateSurfaceIfNeeded() {
        Surface surface = this.surface;
        if (surface == null || this.shouldRecreateSurfaceForLowMemory) {
            if (surface != null) {
                surface.release();
                this.surface = null;
            }
            this.surface = createSurface();
            this.shouldRecreateSurfaceForLowMemory = false;
        }
    }

    public Surface createSurface() {
        return new Surface(this.surfaceTexture);
    }

    @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
    public int getHeight() {
        return this.bufferHeight;
    }

    @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
    public long getId() {
        return this.surfaceTextureEntry.id();
    }

    @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
    public Surface getSurface() {
        recreateSurfaceIfNeeded();
        SurfaceTexture surfaceTexture = this.surfaceTexture;
        if (surfaceTexture == null || surfaceTexture.isReleased()) {
            return null;
        }
        return this.surface;
    }

    @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
    public int getWidth() {
        return this.bufferWidth;
    }

    @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
    public boolean isReleased() {
        return this.surfaceTexture == null;
    }

    @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
    public void release() {
        this.surfaceTexture = null;
        Surface surface = this.surface;
        if (surface != null) {
            surface.release();
            this.surface = null;
        }
    }

    @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
    public void resize(int i3, int i10) {
        this.bufferWidth = i3;
        this.bufferHeight = i10;
        SurfaceTexture surfaceTexture = this.surfaceTexture;
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(i3, i10);
        }
    }
}
