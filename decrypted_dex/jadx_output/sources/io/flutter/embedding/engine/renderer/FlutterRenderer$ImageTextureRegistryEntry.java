package io.flutter.embedding.engine.renderer;

import android.annotation.TargetApi;
import android.hardware.SyncFence;
import android.media.Image;
import android.os.Build;
import android.util.Log;
import androidx.annotation.Keep;
import com.stub.StubApp;
import io.flutter.view.TextureRegistry$ImageConsumer;
import io.flutter.view.TextureRegistry$ImageTextureEntry;
import java.io.IOException;

@Keep
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
final class FlutterRenderer$ImageTextureRegistryEntry implements TextureRegistry$ImageTextureEntry, TextureRegistry$ImageConsumer {
    private static final String TAG = StubApp.getString2(18657);
    private final long id;
    private boolean ignoringFence = false;
    private Image image;
    private boolean released;
    final /* synthetic */ l this$0;

    public FlutterRenderer$ImageTextureRegistryEntry(l lVar, long j) {
        this.this$0 = lVar;
        this.id = j;
    }

    @TargetApi(29)
    private void maybeWaitOnFence(Image image) {
        if (image == null || this.ignoringFence) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            waitOnFence(image);
        } else {
            this.ignoringFence = true;
        }
    }

    @TargetApi(33)
    private void waitOnFence(Image image) {
        SyncFence fence;
        try {
            fence = image.getFence();
            fence.awaitForever();
        } catch (IOException unused) {
        }
    }

    @Override // io.flutter.view.TextureRegistry$ImageConsumer
    @TargetApi(29)
    public Image acquireLatestImage() {
        Image image;
        synchronized (this) {
            image = this.image;
            this.image = null;
        }
        maybeWaitOnFence(image);
        return image;
    }

    public void finalize() throws Throwable {
        try {
            if (this.released) {
                super.finalize();
                return;
            }
            Image image = this.image;
            if (image != null) {
                image.close();
                this.image = null;
            }
            this.released = true;
            l lVar = this.this$0;
            lVar.f15061e.post(new Vc.i(this.id, lVar.f15057a));
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    @Override // io.flutter.view.TextureRegistry$ImageTextureEntry
    public long id() {
        return this.id;
    }

    @Override // io.flutter.view.TextureRegistry$ImageTextureEntry
    public void pushImage(Image image) {
        Image image2;
        if (this.released) {
            return;
        }
        synchronized (this) {
            image2 = this.image;
            this.image = image;
        }
        if (image2 != null) {
            Log.e(StubApp.getString2(18657), StubApp.getString2(18658));
            image2.close();
        }
        if (image != null) {
            this.this$0.f15057a.scheduleFrame();
        }
    }

    @Override // io.flutter.view.TextureRegistry$ImageTextureEntry
    public void release() {
        if (this.released) {
            return;
        }
        this.released = true;
        Image image = this.image;
        if (image != null) {
            image.close();
            this.image = null;
        }
        l lVar = this.this$0;
        lVar.f15057a.unregisterTexture(this.id);
    }
}
