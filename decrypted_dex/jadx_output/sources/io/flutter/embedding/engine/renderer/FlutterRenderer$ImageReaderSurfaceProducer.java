package io.flutter.embedding.engine.renderer;

import android.annotation.TargetApi;
import android.hardware.SyncFence;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.view.Surface;
import androidx.annotation.Keep;
import com.stub.StubApp;
import io.flutter.view.TextureRegistry$ImageConsumer;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import io.flutter.view.p;
import io.flutter.view.q;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import rb.C1585b;
import v0.C1830z;

@Keep
@TargetApi(29)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
final class FlutterRenderer$ImageReaderSurfaceProducer implements TextureRegistry$SurfaceProducer, TextureRegistry$ImageConsumer, p {
    private static final boolean CLEANUP_ON_MEMORY_PRESSURE = true;
    private static final int MAX_DEQUEUED_IMAGES = 2;
    private static final int MAX_IMAGES = 6;
    private static final String TAG = StubApp.getString2(18656);
    private static final boolean VERBOSE_LOGS = false;
    private static final boolean trimOnMemoryPressure = true;
    private final long id;
    private boolean released;
    final /* synthetic */ l this$0;
    private boolean ignoringFence = VERBOSE_LOGS;
    private int requestedWidth = 1;
    private int requestedHeight = 1;
    private boolean createNewReader = true;
    private boolean notifiedDestroy = VERBOSE_LOGS;
    private long lastDequeueTime = 0;
    private long lastQueueTime = 0;
    private long lastScheduleTime = 0;
    private int numTrims = 0;
    private final Object lock = new Object();
    private final ArrayDeque<h> imageReaderQueue = new ArrayDeque<>();
    private final HashMap<ImageReader, h> perImageReaders = new HashMap<>();
    private ArrayList<f> lastDequeuedImage = new ArrayList<>();
    private h lastReaderDequeuedFrom = null;
    private q callback = null;

    public FlutterRenderer$ImageReaderSurfaceProducer(l lVar, long j) {
        this.this$0 = lVar;
        this.id = j;
    }

    private void cleanup() {
        synchronized (this.lock) {
            try {
                for (h hVar : this.perImageReaders.values()) {
                    if (this.lastReaderDequeuedFrom == hVar) {
                        this.lastReaderDequeuedFrom = null;
                    }
                    hVar.f15032c = true;
                    hVar.f15030a.close();
                    hVar.f15031b.clear();
                }
                this.perImageReaders.clear();
                if (this.lastDequeuedImage.size() > 0) {
                    Iterator<f> it = this.lastDequeuedImage.iterator();
                    while (it.hasNext()) {
                        it.next().f15027a.close();
                    }
                    this.lastDequeuedImage.clear();
                }
                h hVar2 = this.lastReaderDequeuedFrom;
                if (hVar2 != null) {
                    hVar2.f15032c = true;
                    hVar2.f15030a.close();
                    hVar2.f15031b.clear();
                    this.lastReaderDequeuedFrom = null;
                }
                this.imageReaderQueue.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private ImageReader createImageReader() {
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
    private ImageReader createImageReader29() {
        ImageReader newInstance;
        newInstance = ImageReader.newInstance(this.requestedWidth, this.requestedHeight, 34, 6, 256L);
        return newInstance;
    }

    @TargetApi(33)
    private ImageReader createImageReader33() {
        ImageReader build;
        d.f();
        ImageReader.Builder d8 = d.d(this.requestedWidth, this.requestedHeight);
        d8.setMaxImages(6);
        d8.setImageFormat(34);
        d8.setUsage(256L);
        build = d8.build();
        return build;
    }

    private h getActiveReader() {
        synchronized (this.lock) {
            try {
                if (!this.createNewReader) {
                    return this.imageReaderQueue.peekLast();
                }
                this.createNewReader = VERBOSE_LOGS;
                return getOrCreatePerImageReader(createImageReader());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$dequeueImage$0() {
        if (this.released) {
            return;
        }
        this.this$0.f15057a.scheduleFrame();
    }

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

    private void releaseInternal() {
        cleanup();
        this.released = true;
        this.this$0.f(this);
        this.this$0.f15063g.remove(this);
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
        f dequeueImage = dequeueImage();
        if (dequeueImage == null) {
            return null;
        }
        Image image = dequeueImage.f15027a;
        maybeWaitOnFence(image);
        return image;
    }

    public double deltaMillis(long j) {
        return j / 1000000.0d;
    }

    public f dequeueImage() {
        f fVar;
        boolean z2;
        synchronized (this.lock) {
            try {
                Iterator<h> it = this.imageReaderQueue.iterator();
                fVar = null;
                while (true) {
                    boolean hasNext = it.hasNext();
                    z2 = VERBOSE_LOGS;
                    if (!hasNext) {
                        break;
                    }
                    h next = it.next();
                    ArrayDeque arrayDeque = next.f15031b;
                    f fVar2 = arrayDeque.isEmpty() ? null : (f) arrayDeque.removeFirst();
                    if (fVar2 == null) {
                        fVar = fVar2;
                    } else {
                        while (this.lastDequeuedImage.size() > 2) {
                            this.lastDequeuedImage.remove(0).f15027a.close();
                        }
                        this.lastDequeuedImage.add(fVar2);
                        this.lastReaderDequeuedFrom = next;
                        fVar = fVar2;
                    }
                }
                pruneImageReaderQueue();
                Iterator<h> it2 = this.imageReaderQueue.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (!it2.next().f15031b.isEmpty()) {
                        z2 = true;
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            this.this$0.f15061e.post(new e(this, 0));
        }
        return fVar;
    }

    public void disableFenceForTest() {
        this.ignoringFence = true;
    }

    public void finalize() throws Throwable {
        try {
            if (this.released) {
                return;
            }
            releaseInternal();
            l lVar = this.this$0;
            lVar.f15061e.post(new Vc.i(this.id, lVar.f15057a));
        } finally {
            super.finalize();
        }
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public int getHeight() {
        return this.requestedHeight;
    }

    public h getOrCreatePerImageReader(ImageReader imageReader) {
        h hVar = this.perImageReaders.get(imageReader);
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(this, imageReader);
        this.perImageReaders.put(imageReader, hVar2);
        this.imageReaderQueue.add(hVar2);
        return hVar2;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public Surface getSurface() {
        return getActiveReader().f15030a.getSurface();
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public int getWidth() {
        return this.requestedWidth;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public boolean handlesCropAndRotation() {
        return VERBOSE_LOGS;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public long id() {
        return this.id;
    }

    public int numImageReaders() {
        int size;
        synchronized (this.lock) {
            size = this.imageReaderQueue.size();
        }
        return size;
    }

    public int numImages() {
        int i3;
        synchronized (this.lock) {
            try {
                Iterator<h> it = this.imageReaderQueue.iterator();
                i3 = 0;
                while (it.hasNext()) {
                    i3 += it.next().f15031b.size();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i3;
    }

    public int numTrims() {
        int i3;
        synchronized (this.lock) {
            i3 = this.numTrims;
        }
        return i3;
    }

    public void onImage(ImageReader imageReader, Image image) {
        f fVar;
        synchronized (this.lock) {
            h orCreatePerImageReader = getOrCreatePerImageReader(imageReader);
            if (orCreatePerImageReader.f15032c) {
                fVar = null;
            } else {
                FlutterRenderer$ImageReaderSurfaceProducer flutterRenderer$ImageReaderSurfaceProducer = orCreatePerImageReader.f15033d;
                System.nanoTime();
                f fVar2 = new f(flutterRenderer$ImageReaderSurfaceProducer, image);
                ArrayDeque arrayDeque = orCreatePerImageReader.f15031b;
                arrayDeque.add(fVar2);
                while (arrayDeque.size() > 2) {
                    ((f) arrayDeque.removeFirst()).f15027a.close();
                }
                fVar = fVar2;
            }
        }
        if (fVar == null) {
            return;
        }
        this.this$0.f15057a.scheduleFrame();
    }

    @Override // io.flutter.view.p
    public void onTrimMemory(int i3) {
        if (i3 < 40) {
            return;
        }
        synchronized (this.lock) {
            this.numTrims++;
        }
        q qVar = this.callback;
        if (qVar != null) {
            this.notifiedDestroy = true;
            C1585b c1585b = (C1585b) qVar;
            ((C1830z) c1585b.f19800d).G(null);
            c1585b.f20550e = true;
        }
        cleanup();
        this.createNewReader = true;
    }

    public int pendingDequeuedImages() {
        return this.lastDequeuedImage.size();
    }

    public void pruneImageReaderQueue() {
        h peekFirst;
        while (this.imageReaderQueue.size() > 1 && (peekFirst = this.imageReaderQueue.peekFirst()) != null) {
            ArrayDeque arrayDeque = peekFirst.f15031b;
            if (!arrayDeque.isEmpty() || peekFirst.f15033d.lastReaderDequeuedFrom == peekFirst) {
                return;
            }
            this.imageReaderQueue.removeFirst();
            HashMap<ImageReader, h> hashMap = this.perImageReaders;
            ImageReader imageReader = peekFirst.f15030a;
            hashMap.remove(imageReader);
            peekFirst.f15032c = true;
            imageReader.close();
            arrayDeque.clear();
        }
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public void release() {
        if (this.released) {
            return;
        }
        releaseInternal();
        l lVar = this.this$0;
        lVar.f15057a.unregisterTexture(this.id);
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public void scheduleFrame() {
        this.this$0.f15057a.scheduleFrame();
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public void setCallback(q qVar) {
        this.callback = qVar;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public void setSize(int i3, int i10) {
        int max = Math.max(1, i3);
        int max2 = Math.max(1, i10);
        if (this.requestedWidth == max && this.requestedHeight == max2) {
            return;
        }
        this.createNewReader = true;
        this.requestedHeight = max2;
        this.requestedWidth = max;
    }
}
