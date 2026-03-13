package io.flutter.plugin.platform;

import android.annotation.TargetApi;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.Surface;
import com.stub.StubApp;
import io.flutter.view.TextureRegistry$ImageTextureEntry;

@TargetApi(29)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class ImageReaderPlatformViewRenderTarget implements PlatformViewRenderTarget {
    private static final int MAX_IMAGES = 4;
    private static final String TAG = StubApp.getString2(18755);
    private ImageReader reader;
    private TextureRegistry$ImageTextureEntry textureEntry;
    private int bufferWidth = 0;
    private int bufferHeight = 0;
    private final Handler onImageAvailableHandler = new Handler();
    private final ImageReader.OnImageAvailableListener onImageAvailableListener = new ImageReader.OnImageAvailableListener() { // from class: io.flutter.plugin.platform.ImageReaderPlatformViewRenderTarget.1
        @Override // android.media.ImageReader.OnImageAvailableListener
        public void onImageAvailable(ImageReader imageReader) {
            Image image;
            try {
                image = imageReader.acquireLatestImage();
            } catch (IllegalStateException e10) {
                Log.e(StubApp.getString2(18755), StubApp.getString2(18659) + e10.toString());
                image = null;
            }
            if (image == null) {
                return;
            }
            ImageReaderPlatformViewRenderTarget.this.textureEntry.pushImage(image);
        }
    };

    public ImageReaderPlatformViewRenderTarget(TextureRegistry$ImageTextureEntry textureRegistry$ImageTextureEntry) {
        if (Build.VERSION.SDK_INT < 29) {
            throw new UnsupportedOperationException(StubApp.getString2(18655));
        }
        this.textureEntry = textureRegistry$ImageTextureEntry;
    }

    private void closeReader() {
        if (this.reader != null) {
            this.textureEntry.pushImage(null);
            this.reader.close();
            this.reader = null;
        }
    }

    public ImageReader createImageReader() {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 33) {
            return createImageReader33();
        }
        if (i3 >= 29) {
            return createImageReader29();
        }
        throw new UnsupportedOperationException(StubApp.getString2(18655));
    }

    @TargetApi(29)
    public ImageReader createImageReader29() {
        ImageReader newInstance;
        newInstance = ImageReader.newInstance(this.bufferWidth, this.bufferHeight, 34, 4, 256L);
        newInstance.setOnImageAvailableListener(this.onImageAvailableListener, this.onImageAvailableHandler);
        return newInstance;
    }

    @TargetApi(33)
    public ImageReader createImageReader33() {
        ImageReader build;
        io.flutter.embedding.engine.renderer.d.f();
        ImageReader.Builder d8 = io.flutter.embedding.engine.renderer.d.d(this.bufferWidth, this.bufferHeight);
        d8.setMaxImages(4);
        d8.setImageFormat(34);
        d8.setUsage(256L);
        build = d8.build();
        build.setOnImageAvailableListener(this.onImageAvailableListener, this.onImageAvailableHandler);
        return build;
    }

    @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
    public int getHeight() {
        return this.bufferHeight;
    }

    @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
    public long getId() {
        return this.textureEntry.id();
    }

    @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
    public Surface getSurface() {
        return this.reader.getSurface();
    }

    @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
    public int getWidth() {
        return this.bufferWidth;
    }

    @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
    public boolean isReleased() {
        return this.textureEntry == null;
    }

    @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
    public void release() {
        closeReader();
        this.textureEntry = null;
    }

    @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
    public void resize(int i3, int i10) {
        if (this.reader != null && this.bufferWidth == i3 && this.bufferHeight == i10) {
            return;
        }
        closeReader();
        this.bufferWidth = i3;
        this.bufferHeight = i10;
        this.reader = createImageReader();
    }
}
