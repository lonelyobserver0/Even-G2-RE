package Xa;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import com.stub.StubApp;
import java.nio.ByteBuffer;
import java.util.Locale;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class j extends View implements io.flutter.embedding.engine.renderer.n {
    private static final String TAG = StubApp.getString2(7417);
    private Bitmap currentBitmap;
    private Image currentImage;
    private io.flutter.embedding.engine.renderer.l flutterRenderer;
    private ImageReader imageReader;
    private boolean isAttachedToFlutterRenderer;
    private i kind;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, int i3, int i10, i iVar) {
        super(context, null);
        ImageReader a3 = a(i3, i10);
        this.isAttachedToFlutterRenderer = false;
        this.imageReader = a3;
        this.kind = iVar;
        setAlpha(0.0f);
    }

    public static ImageReader a(int i3, int i10) {
        ImageReader newInstance;
        String string2 = StubApp.getString2(7417);
        if (i3 <= 0) {
            Locale locale = Locale.US;
            Log.w(string2, StubApp.getString2(7418) + i3 + StubApp.getString2(7419));
            i3 = 1;
        }
        if (i10 <= 0) {
            Locale locale2 = Locale.US;
            Log.w(string2, StubApp.getString2(7420) + i10 + StubApp.getString2(7421));
            i10 = 1;
        }
        if (Build.VERSION.SDK_INT < 29) {
            return ImageReader.newInstance(i3, i10, 1, 3);
        }
        newInstance = ImageReader.newInstance(i3, i10, 1, 3, 768L);
        return newInstance;
    }

    public boolean acquireLatestImage() {
        if (!this.isAttachedToFlutterRenderer) {
            return false;
        }
        Image acquireLatestImage = this.imageReader.acquireLatestImage();
        if (acquireLatestImage != null) {
            Image image = this.currentImage;
            if (image != null) {
                image.close();
                this.currentImage = null;
            }
            this.currentImage = acquireLatestImage;
            invalidate();
        }
        return acquireLatestImage != null;
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public void attachToRenderer(io.flutter.embedding.engine.renderer.l lVar) {
        if (this.kind.ordinal() == 0) {
            Surface surface = this.imageReader.getSurface();
            lVar.f15059c = surface;
            lVar.f15057a.onSurfaceWindowChanged(surface);
        }
        setAlpha(1.0f);
        this.flutterRenderer = lVar;
        this.isAttachedToFlutterRenderer = true;
    }

    public void closeImageReader() {
        this.imageReader.close();
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public void detachFromRenderer() {
        if (this.isAttachedToFlutterRenderer) {
            setAlpha(0.0f);
            acquireLatestImage();
            this.currentBitmap = null;
            Image image = this.currentImage;
            if (image != null) {
                image.close();
                this.currentImage = null;
            }
            invalidate();
            this.isAttachedToFlutterRenderer = false;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public io.flutter.embedding.engine.renderer.l getAttachedRenderer() {
        return this.flutterRenderer;
    }

    public ImageReader getImageReader() {
        return this.imageReader;
    }

    public Surface getSurface() {
        return this.imageReader.getSurface();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Bitmap wrapHardwareBuffer;
        super.onDraw(canvas);
        Image image = this.currentImage;
        if (image != null) {
            if (Build.VERSION.SDK_INT >= 29) {
                HardwareBuffer hardwareBuffer = image.getHardwareBuffer();
                wrapHardwareBuffer = Bitmap.wrapHardwareBuffer(hardwareBuffer, ColorSpace.get(ColorSpace.Named.SRGB));
                this.currentBitmap = wrapHardwareBuffer;
                hardwareBuffer.close();
            } else {
                Image.Plane[] planes = image.getPlanes();
                if (planes.length == 1) {
                    Image.Plane plane = planes[0];
                    int rowStride = plane.getRowStride() / plane.getPixelStride();
                    int height = this.currentImage.getHeight();
                    Bitmap bitmap = this.currentBitmap;
                    if (bitmap == null || bitmap.getWidth() != rowStride || this.currentBitmap.getHeight() != height) {
                        this.currentBitmap = Bitmap.createBitmap(rowStride, height, Bitmap.Config.ARGB_8888);
                    }
                    ByteBuffer buffer = plane.getBuffer();
                    buffer.rewind();
                    this.currentBitmap.copyPixelsFromBuffer(buffer);
                }
            }
        }
        Bitmap bitmap2 = this.currentBitmap;
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i3, int i10, int i11, int i12) {
        if (!(i3 == this.imageReader.getWidth() && i10 == this.imageReader.getHeight()) && this.kind == i.f8545a && this.isAttachedToFlutterRenderer) {
            resizeIfNeeded(i3, i10);
            io.flutter.embedding.engine.renderer.l lVar = this.flutterRenderer;
            Surface surface = this.imageReader.getSurface();
            lVar.f15059c = surface;
            lVar.f15057a.onSurfaceWindowChanged(surface);
        }
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public void pause() {
    }

    public void resizeIfNeeded(int i3, int i10) {
        if (this.flutterRenderer == null) {
            return;
        }
        if (i3 == this.imageReader.getWidth() && i10 == this.imageReader.getHeight()) {
            return;
        }
        Image image = this.currentImage;
        if (image != null) {
            image.close();
            this.currentImage = null;
        }
        closeImageReader();
        this.imageReader = a(i3, i10);
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public void resume() {
    }
}
