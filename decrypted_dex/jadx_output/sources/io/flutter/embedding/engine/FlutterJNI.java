package io.flutter.embedding.engine;

import Ac.q;
import Ya.b;
import Ya.i;
import Ya.j;
import Za.o;
import Za.p;
import a5.c;
import ab.InterfaceC0399a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import android.util.Size;
import android.view.Choreographer;
import android.view.Surface;
import android.view.SurfaceControl;
import androidx.annotation.Keep;
import com.stub.StubApp;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.embedding.engine.renderer.SurfaceTextureWrapper;
import io.flutter.embedding.engine.renderer.m;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugin.localization.LocalizationPlugin;
import io.flutter.plugin.platform.PlatformViewsController;
import io.flutter.plugin.platform.PlatformViewsController2;
import io.flutter.view.FlutterCallbackInformation;
import io.flutter.view.TextureRegistry$ImageConsumer;
import io.flutter.view.e;
import io.flutter.view.f;
import io.flutter.view.l;
import io.flutter.view.s;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import l4.C1221y;
import l4.C1223z;
import p0.AbstractC1482f;
import p3.C1488a;

@Keep
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class FlutterJNI {
    private static final String TAG = StubApp.getString2(18619);
    private static j asyncWaitForVsyncDelegate = null;
    private static float displayDensity = -1.0f;
    private static float displayHeight = -1.0f;
    private static float displayWidth = -1.0f;
    private static boolean initCalled = false;
    private static boolean loadLibraryCalled = false;
    private static boolean prefetchDefaultFontManagerCalled = false;
    private static float refreshRateFPS = 60.0f;
    private static String vmServiceUri;
    private i accessibilityDelegate;
    private InterfaceC0399a deferredComponentManager;
    private LocalizationPlugin localizationPlugin;
    private Long nativeShellHolderId;
    private p platformMessageHandler;
    private PlatformViewsController platformViewsController;
    private PlatformViewsController2 platformViewsController2;
    private ReentrantReadWriteLock shellHolderLock = new ReentrantReadWriteLock();
    private final Set<b> engineLifecycleListeners = new CopyOnWriteArraySet();
    private final Set<m> flutterUiDisplayListeners = new CopyOnWriteArraySet();
    private final Looper mainLooper = Looper.getMainLooper();

    private static void asyncWaitForVsync(long j) {
        j jVar = asyncWaitForVsyncDelegate;
        if (jVar == null) {
            throw new IllegalStateException(StubApp.getString2(18618));
        }
        io.flutter.view.b bVar = (io.flutter.view.b) jVar;
        bVar.getClass();
        Choreographer choreographer = Choreographer.getInstance();
        q qVar = (q) bVar.f15099a;
        s sVar = (s) qVar.f383d;
        if (sVar != null) {
            sVar.f15218a = j;
            qVar.f383d = null;
        } else {
            sVar = new s(qVar, j);
        }
        choreographer.postFrameCallback(sVar);
    }

    public static Bitmap decodeImage(ByteBuffer byteBuffer, final long j) {
        try {
            return ImageDecoder.decodeBitmap(ImageDecoder.createSource(byteBuffer), new ImageDecoder.OnHeaderDecodedListener() { // from class: Ya.h
                @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
                public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
                    FlutterJNI.lambda$decodeImage$0(j, imageDecoder, imageInfo, source);
                }
            });
        } catch (IOException e10) {
            Log.e(StubApp.getString2(18619), StubApp.getString2(18620), e10);
            return null;
        }
    }

    private void ensureAttachedToNative() {
        if (this.nativeShellHolderId == null) {
            throw new RuntimeException(StubApp.getString2(18621));
        }
    }

    private void ensureNotAttachedToNative() {
        if (this.nativeShellHolderId != null) {
            throw new RuntimeException(StubApp.getString2(18622));
        }
    }

    private void ensureRunningOnMainThread() {
        if (Looper.myLooper() == this.mainLooper) {
            return;
        }
        throw new RuntimeException(StubApp.getString2(18623) + Thread.currentThread().getName());
    }

    @Deprecated
    public static String getObservatoryUri() {
        return vmServiceUri;
    }

    public static String getVMServiceUri() {
        return vmServiceUri;
    }

    private void handlePlatformMessageResponse(int i3, ByteBuffer byteBuffer) {
        BinaryMessenger.BinaryReply binaryReply;
        p pVar = this.platformMessageHandler;
        if (pVar == null || (binaryReply = (BinaryMessenger.BinaryReply) ((o) pVar).f9196f.remove(Integer.valueOf(i3))) == null) {
            return;
        }
        try {
            binaryReply.reply(byteBuffer);
            if (byteBuffer == null || !byteBuffer.isDirect()) {
                return;
            }
            byteBuffer.limit(0);
        } catch (Error e10) {
            Thread currentThread = Thread.currentThread();
            if (currentThread.getUncaughtExceptionHandler() == null) {
                throw e10;
            }
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, e10);
        } catch (Exception e11) {
            Log.e(StubApp.getString2(8263), StubApp.getString2(18624), e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$decodeImage$0(long j, ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
        imageDecoder.setAllocator(1);
        Size size = imageInfo.getSize();
        nativeImageHeaderCallback(j, size.getWidth(), size.getHeight());
    }

    private native long nativeAttach(FlutterJNI flutterJNI);

    private native void nativeCleanupMessageData(long j);

    private native void nativeDeferredComponentInstallFailure(int i3, String str, boolean z2);

    private native void nativeDestroy(long j);

    private native void nativeDispatchEmptyPlatformMessage(long j, String str, int i3);

    private native void nativeDispatchPlatformMessage(long j, String str, ByteBuffer byteBuffer, int i3, int i10);

    private native void nativeDispatchPointerDataPacket(long j, ByteBuffer byteBuffer, int i3);

    private native void nativeDispatchSemanticsAction(long j, int i3, int i10, ByteBuffer byteBuffer, int i11);

    private native boolean nativeFlutterTextUtilsIsEmoji(int i3);

    private native boolean nativeFlutterTextUtilsIsEmojiModifier(int i3);

    private native boolean nativeFlutterTextUtilsIsEmojiModifierBase(int i3);

    private native boolean nativeFlutterTextUtilsIsRegionalIndicator(int i3);

    private native boolean nativeFlutterTextUtilsIsVariationSelector(int i3);

    private native Bitmap nativeGetBitmap(long j);

    private native boolean nativeGetIsSoftwareRenderingEnabled();

    public static native void nativeImageHeaderCallback(long j, int i3, int i10);

    private static native void nativeInit(Context context, String[] strArr, String str, String str2, String str3, long j, int i3);

    private native void nativeInvokePlatformMessageEmptyResponseCallback(long j, int i3);

    private native void nativeInvokePlatformMessageResponseCallback(long j, int i3, ByteBuffer byteBuffer, int i10);

    private native boolean nativeIsSurfaceControlEnabled(long j);

    private native void nativeLoadDartDeferredLibrary(long j, int i3, String[] strArr);

    @Deprecated
    public static native FlutterCallbackInformation nativeLookupCallbackInformation(long j);

    private native void nativeMarkTextureFrameAvailable(long j, long j3);

    private native void nativeNotifyLowMemoryWarning(long j);

    private native void nativeOnVsync(long j, long j3, long j10);

    private static native void nativePrefetchDefaultFontManager();

    private native void nativeRegisterImageTexture(long j, long j3, WeakReference<TextureRegistry$ImageConsumer> weakReference, boolean z2);

    private native void nativeRegisterTexture(long j, long j3, WeakReference<SurfaceTextureWrapper> weakReference);

    private native void nativeRunBundleAndSnapshotFromLibrary(long j, String str, String str2, String str3, AssetManager assetManager, List<String> list, long j3);

    private native void nativeScheduleFrame(long j);

    private native void nativeSetAccessibilityFeatures(long j, int i3);

    private native void nativeSetSemanticsEnabled(long j, boolean z2);

    private native void nativeSetViewportMetrics(long j, float f10, int i3, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int[] iArr, int[] iArr2, int[] iArr3);

    private native FlutterJNI nativeSpawn(long j, String str, String str2, String str3, List<String> list, long j3);

    private native void nativeSurfaceChanged(long j, int i3, int i10);

    private native void nativeSurfaceCreated(long j, Surface surface);

    private native void nativeSurfaceDestroyed(long j);

    private native void nativeSurfaceWindowChanged(long j, Surface surface);

    private native void nativeUnregisterTexture(long j, long j3);

    private native void nativeUpdateDisplayMetrics(long j);

    private native void nativeUpdateJavaAssetManager(long j, AssetManager assetManager, String str);

    private native void nativeUpdateRefreshRate(float f10);

    private void onPreEngineRestart() {
        Iterator<b> it = this.engineLifecycleListeners.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    private void updateCustomAccessibilityActions(ByteBuffer byteBuffer, String[] strArr) {
        ensureRunningOnMainThread();
        i iVar = this.accessibilityDelegate;
        if (iVar != null) {
            io.flutter.view.b bVar = (io.flutter.view.b) iVar;
            bVar.getClass();
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            l lVar = (l) bVar.f15099a;
            lVar.getClass();
            while (byteBuffer.hasRemaining()) {
                f b2 = lVar.b(byteBuffer.getInt());
                b2.f15128c = byteBuffer.getInt();
                int i3 = byteBuffer.getInt();
                String str = null;
                b2.f15129d = i3 == -1 ? null : strArr[i3];
                int i10 = byteBuffer.getInt();
                if (i10 != -1) {
                    str = strArr[i10];
                }
                b2.f15130e = str;
            }
        }
    }

    private void updateSemantics(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
        ensureRunningOnMainThread();
        i iVar = this.accessibilityDelegate;
        if (iVar != null) {
            ((io.flutter.view.b) iVar).a(byteBuffer, strArr, byteBufferArr);
        }
    }

    public boolean IsSurfaceControlEnabled() {
        return nativeIsSurfaceControlEnabled(this.nativeShellHolderId.longValue());
    }

    public void addEngineLifecycleListener(b bVar) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.add(bVar);
    }

    public void addIsDisplayingFlutterUiListener(m mVar) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.add(mVar);
    }

    @SuppressLint({"NewApi"})
    public void applyTransactions() {
        PlatformViewsController2 platformViewsController2 = this.platformViewsController2;
        if (platformViewsController2 == null) {
            throw new RuntimeException("");
        }
        platformViewsController2.applyTransactions();
    }

    public void attachToNative() {
        ensureRunningOnMainThread();
        ensureNotAttachedToNative();
        this.shellHolderLock.writeLock().lock();
        try {
            this.nativeShellHolderId = Long.valueOf(performNativeAttach(this));
        } finally {
            this.shellHolderLock.writeLock().unlock();
        }
    }

    public void cleanupMessageData(long j) {
        nativeCleanupMessageData(j);
    }

    public String[] computePlatformResolvedLocale(String[] strArr) {
        if (this.localizationPlugin == null) {
            return new String[0];
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < strArr.length; i3 += 3) {
            String str = strArr[i3];
            String str2 = strArr[i3 + 1];
            String str3 = strArr[i3 + 2];
            Locale.Builder builder = new Locale.Builder();
            if (!str.isEmpty()) {
                builder.setLanguage(str);
            }
            if (!str2.isEmpty()) {
                builder.setRegion(str2);
            }
            if (!str3.isEmpty()) {
                builder.setScript(str3);
            }
            arrayList.add(builder.build());
        }
        Locale resolveNativeLocale = this.localizationPlugin.resolveNativeLocale(arrayList);
        return resolveNativeLocale == null ? new String[0] : new String[]{resolveNativeLocale.getLanguage(), resolveNativeLocale.getCountry(), resolveNativeLocale.getScript()};
    }

    public FlutterOverlaySurface createOverlaySurface() {
        ensureRunningOnMainThread();
        PlatformViewsController platformViewsController = this.platformViewsController;
        if (platformViewsController != null) {
            return platformViewsController.createOverlaySurface();
        }
        throw new RuntimeException(StubApp.getString2(18625));
    }

    @SuppressLint({"NewApi"})
    public FlutterOverlaySurface createOverlaySurface2() {
        PlatformViewsController2 platformViewsController2 = this.platformViewsController2;
        if (platformViewsController2 != null) {
            return platformViewsController2.createOverlaySurface();
        }
        throw new RuntimeException(StubApp.getString2(18625));
    }

    @SuppressLint({"NewApi"})
    public SurfaceControl.Transaction createTransaction() {
        PlatformViewsController2 platformViewsController2 = this.platformViewsController2;
        if (platformViewsController2 != null) {
            return platformViewsController2.createTransaction();
        }
        throw new RuntimeException("");
    }

    public void deferredComponentInstallFailure(int i3, String str, boolean z2) {
        ensureRunningOnMainThread();
        nativeDeferredComponentInstallFailure(i3, str, z2);
    }

    @SuppressLint({"NewApi"})
    public void destroyOverlaySurface2() {
        ensureRunningOnMainThread();
        PlatformViewsController2 platformViewsController2 = this.platformViewsController2;
        if (platformViewsController2 == null) {
            throw new RuntimeException(StubApp.getString2(18626));
        }
        platformViewsController2.destroyOverlaySurface();
    }

    public void destroyOverlaySurfaces() {
        ensureRunningOnMainThread();
        PlatformViewsController platformViewsController = this.platformViewsController;
        if (platformViewsController == null) {
            throw new RuntimeException(StubApp.getString2(18626));
        }
        platformViewsController.destroyOverlaySurfaces();
    }

    public void detachFromNativeAndReleaseResources() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        this.shellHolderLock.writeLock().lock();
        try {
            nativeDestroy(this.nativeShellHolderId.longValue());
            this.nativeShellHolderId = null;
        } finally {
            this.shellHolderLock.writeLock().unlock();
        }
    }

    public void dispatchEmptyPlatformMessage(String str, int i3) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchEmptyPlatformMessage(this.nativeShellHolderId.longValue(), str, i3);
            return;
        }
        Log.w(StubApp.getString2(18619), StubApp.getString2(18627) + str + StubApp.getString2(18628) + i3);
    }

    public void dispatchPlatformMessage(String str, ByteBuffer byteBuffer, int i3, int i10) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchPlatformMessage(this.nativeShellHolderId.longValue(), str, byteBuffer, i3, i10);
            return;
        }
        Log.w(StubApp.getString2(18619), StubApp.getString2(18627) + str + StubApp.getString2(18628) + i10);
    }

    public void dispatchPointerDataPacket(ByteBuffer byteBuffer, int i3) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchPointerDataPacket(this.nativeShellHolderId.longValue(), byteBuffer, i3);
    }

    public void dispatchSemanticsAction(int i3, e eVar) {
        dispatchSemanticsAction(i3, eVar, null);
    }

    @SuppressLint({"NewApi"})
    public void endFrame2() {
        PlatformViewsController2 platformViewsController2 = this.platformViewsController2;
        if (platformViewsController2 == null) {
            throw new RuntimeException("");
        }
        platformViewsController2.onEndFrame();
    }

    public Bitmap getBitmap() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        return nativeGetBitmap(this.nativeShellHolderId.longValue());
    }

    public boolean getIsSoftwareRenderingEnabled() {
        return nativeGetIsSoftwareRenderingEnabled();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public float getScaledFontSize(float r7, int r8) {
        /*
            r6 = this;
            gb.Y r0 = gb.Z.f14319b
            gb.X r1 = r0.f14317b
            java.util.concurrent.ConcurrentLinkedQueue r2 = r0.f14316a
            if (r1 != 0) goto L10
            java.lang.Object r1 = r2.poll()
            gb.X r1 = (gb.X) r1
            r0.f14317b = r1
        L10:
            gb.X r1 = r0.f14317b
            if (r1 == 0) goto L21
            int r3 = r1.f14314a
            if (r3 >= r8) goto L21
            java.lang.Object r1 = r2.poll()
            gb.X r1 = (gb.X) r1
            r0.f14317b = r1
            goto L10
        L21:
            r2 = 0
            r3 = 18629(0x48c5, float:2.6105E-41)
            java.lang.String r3 = com.stub.StubApp.getString2(r3)
            r4 = 17870(0x45ce, float:2.5041E-41)
            java.lang.String r4 = com.stub.StubApp.getString2(r4)
            if (r1 != 0) goto L51
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
            java.lang.String r1 = java.lang.String.valueOf(r8)
            r0.append(r1)
            r1 = 18630(0x48c6, float:2.6106E-41)
            java.lang.String r1 = com.stub.StubApp.getString2(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r4, r0)
        L4f:
            r1 = r2
            goto L7e
        L51:
            int r5 = r1.f14314a
            if (r5 == r8) goto L7e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            java.lang.String r3 = java.lang.String.valueOf(r8)
            r1.append(r3)
            r3 = 18631(0x48c7, float:2.6108E-41)
            java.lang.String r3 = com.stub.StubApp.getString2(r3)
            r1.append(r3)
            gb.X r0 = r0.f14317b
            int r0 = r0.f14314a
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.e(r4, r0)
            goto L4f
        L7e:
            if (r1 != 0) goto L81
            goto L83
        L81:
            android.util.DisplayMetrics r2 = r1.f14315b
        L83:
            if (r2 != 0) goto Lb3
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r0 = 18632(0x48c8, float:2.6109E-41)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            r7.<init>(r0)
            java.lang.String r8 = java.lang.String.valueOf(r8)
            r7.append(r8)
            r8 = 18633(0x48c9, float:2.611E-41)
            java.lang.String r8 = com.stub.StubApp.getString2(r8)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r8 = 18619(0x48bb, float:2.6091E-41)
            java.lang.String r8 = com.stub.StubApp.getString2(r8)
            android.util.Log.e(r8, r7)
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            return r7
        Lb3:
            r8 = 2
            float r7 = android.util.TypedValue.applyDimension(r8, r7, r2)
            float r8 = r2.density
            float r7 = r7 / r8
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.engine.FlutterJNI.getScaledFontSize(float, int):float");
    }

    public void handlePlatformMessage(String str, ByteBuffer byteBuffer, int i3, long j) {
        Za.j jVar;
        boolean z2;
        p pVar = this.platformMessageHandler;
        if (pVar == null) {
            nativeCleanupMessageData(j);
            return;
        }
        o oVar = (o) pVar;
        synchronized (oVar.f9194d) {
            try {
                jVar = (Za.j) oVar.f9192b.get(str);
                z2 = oVar.f9195e.get() && jVar == null;
                if (z2) {
                    if (!oVar.f9193c.containsKey(str)) {
                        oVar.f9193c.put(str, new LinkedList());
                    }
                    ((List) oVar.f9193c.get(str)).add(new Za.f(j, byteBuffer, i3));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            return;
        }
        oVar.a(str, jVar, byteBuffer, i3, j);
    }

    @SuppressLint({"NewApi"})
    public void hideOverlaySurface2() {
        PlatformViewsController2 platformViewsController2 = this.platformViewsController2;
        if (platformViewsController2 == null) {
            throw new RuntimeException(StubApp.getString2(18626));
        }
        platformViewsController2.hideOverlaySurface();
    }

    public void init(Context context, String[] strArr, String str, String str2, String str3, long j, int i3) {
        if (initCalled) {
            Log.w(StubApp.getString2(18619), StubApp.getString2(18634));
        }
        nativeInit(context, strArr, str, str2, str3, j, i3);
        initCalled = true;
    }

    public void invokePlatformMessageEmptyResponseCallback(int i3) {
        String string2 = StubApp.getString2(18635);
        this.shellHolderLock.readLock().lock();
        try {
            if (isAttached()) {
                nativeInvokePlatformMessageEmptyResponseCallback(this.nativeShellHolderId.longValue(), i3);
            } else {
                Log.w(StubApp.getString2("18619"), string2 + i3);
            }
            this.shellHolderLock.readLock().unlock();
        } catch (Throwable th) {
            this.shellHolderLock.readLock().unlock();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v9, types: [io.flutter.embedding.engine.FlutterJNI] */
    public void invokePlatformMessageResponseCallback(int i3, ByteBuffer byteBuffer, int i10) {
        FlutterJNI flutterJNI;
        String string2 = StubApp.getString2(18635);
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException(StubApp.getString2(18636));
        }
        this.shellHolderLock.readLock().lock();
        try {
            flutterJNI = isAttached();
            try {
                if (flutterJNI != 0) {
                    FlutterJNI flutterJNI2 = this;
                    flutterJNI2.nativeInvokePlatformMessageResponseCallback(this.nativeShellHolderId.longValue(), i3, byteBuffer, i10);
                    flutterJNI = flutterJNI2;
                } else {
                    flutterJNI = this;
                    Log.w(StubApp.getString2("18619"), string2 + i3);
                }
                flutterJNI.shellHolderLock.readLock().unlock();
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                flutterJNI.shellHolderLock.readLock().unlock();
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
            flutterJNI = this;
        }
    }

    public boolean isAttached() {
        return this.nativeShellHolderId != null;
    }

    public boolean isCodePointEmoji(int i3) {
        return nativeFlutterTextUtilsIsEmoji(i3);
    }

    public boolean isCodePointEmojiModifier(int i3) {
        return nativeFlutterTextUtilsIsEmojiModifier(i3);
    }

    public boolean isCodePointEmojiModifierBase(int i3) {
        return nativeFlutterTextUtilsIsEmojiModifierBase(i3);
    }

    public boolean isCodePointRegionalIndicator(int i3) {
        return nativeFlutterTextUtilsIsRegionalIndicator(i3);
    }

    public boolean isCodePointVariantSelector(int i3) {
        return nativeFlutterTextUtilsIsVariationSelector(i3);
    }

    public void loadDartDeferredLibrary(int i3, String[] strArr) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeLoadDartDeferredLibrary(this.nativeShellHolderId.longValue(), i3, strArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    public void loadLibrary(Context context) {
        V6.b bVar;
        V6.b g10;
        String[] strArr;
        ZipFile zipFile;
        String str;
        InputStream inputStream;
        InputStream inputStream2;
        Closeable closeable;
        Closeable closeable2;
        Closeable closeable3;
        FileOutputStream fileOutputStream;
        if (loadLibraryCalled) {
            Log.w(StubApp.getString2(18619), StubApp.getString2(18637));
        }
        c cVar = new c(24);
        if (context == null) {
            throw new IllegalArgumentException(StubApp.getString2(18648));
        }
        c.B(StubApp.getString2(18638), StubApp.getString2(3040));
        C1223z c1223z = (C1223z) cVar.f9283c;
        HashSet hashSet = (HashSet) cVar.f9282b;
        String string2 = StubApp.getString2(3040);
        if (hashSet.contains(string2)) {
            c.B(StubApp.getString2(18639), string2);
        } else {
            try {
                c1223z.getClass();
                System.loadLibrary(string2);
                hashSet.add(string2);
                c.B(StubApp.getString2("18640"), string2, null);
            } catch (UnsatisfiedLinkError e10) {
                c.B(StubApp.getString2(18641), Log.getStackTraceString(e10));
                c.B(StubApp.getString2(18642), string2, null);
                File v2 = cVar.v(context);
                if (!v2.exists()) {
                    boolean z2 = false;
                    File dir = context.getDir(StubApp.getString2(8500), 0);
                    File v8 = cVar.v(context);
                    c1223z.getClass();
                    File[] listFiles = dir.listFiles(new C1488a(System.mapLibraryName(string2)));
                    if (listFiles != null) {
                        for (File file : listFiles) {
                            if (!file.getAbsolutePath().equals(v8.getAbsolutePath())) {
                                file.delete();
                            }
                        }
                    }
                    String[] strArr2 = Build.SUPPORTED_ABIS;
                    if (strArr2.length <= 0) {
                        String str2 = Build.CPU_ABI2;
                        strArr2 = (str2 == null || str2.length() == 0) ? new String[]{Build.CPU_ABI} : new String[]{Build.CPU_ABI, str2};
                    }
                    String mapLibraryName = System.mapLibraryName(string2);
                    ((C1221y) cVar.f9284d).getClass();
                    try {
                        g10 = C1221y.g(context, strArr2, mapLibraryName, cVar);
                    } catch (Throwable th) {
                        th = th;
                        bVar = null;
                    }
                    try {
                        if (g10 == null) {
                            try {
                                strArr = C1221y.j(context, mapLibraryName);
                            } catch (Exception e11) {
                                strArr = new String[]{e11.toString()};
                            }
                            StringBuilder l9 = com.mapbox.common.b.l(StubApp.getString2("18645"), mapLibraryName, StubApp.getString2("18646"));
                            l9.append(Arrays.toString(strArr2));
                            l9.append(StubApp.getString2("18647"));
                            throw new H9.b(AbstractC1482f.k(l9, Arrays.toString(strArr), StubApp.getString2("1")));
                        }
                        int i3 = 0;
                        while (true) {
                            int i10 = i3 + 1;
                            zipFile = (ZipFile) g10.f7761b;
                            if (i3 < 5) {
                                c.B(StubApp.getString2("18643"), mapLibraryName);
                                try {
                                    if (v2.exists() || v2.createNewFile()) {
                                        try {
                                            inputStream2 = zipFile.getInputStream((ZipEntry) g10.f7762c);
                                            try {
                                                fileOutputStream = new FileOutputStream(v2);
                                            } catch (FileNotFoundException unused) {
                                                str = mapLibraryName;
                                                closeable3 = null;
                                                C1221y.f(inputStream2);
                                                C1221y.f(closeable3);
                                                mapLibraryName = str;
                                                i3 = i10;
                                                z2 = false;
                                            } catch (IOException unused2) {
                                                str = mapLibraryName;
                                                closeable2 = null;
                                                C1221y.f(inputStream2);
                                                C1221y.f(closeable2);
                                                mapLibraryName = str;
                                                i3 = i10;
                                                z2 = false;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                inputStream = inputStream2;
                                                closeable = null;
                                                C1221y.f(inputStream);
                                                C1221y.f(closeable);
                                                throw th;
                                            }
                                        } catch (FileNotFoundException unused3) {
                                            str = mapLibraryName;
                                            inputStream2 = null;
                                        } catch (IOException unused4) {
                                            str = mapLibraryName;
                                            inputStream2 = null;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            inputStream = null;
                                        }
                                        try {
                                            byte[] bArr = new byte[4096];
                                            long j = 0;
                                            ?? r8 = z2;
                                            while (true) {
                                                int read = inputStream2.read(bArr);
                                                if (read == -1) {
                                                    break;
                                                }
                                                fileOutputStream.write(bArr, r8, read);
                                                j += read;
                                                mapLibraryName = mapLibraryName;
                                                r8 = 0;
                                            }
                                            fileOutputStream.flush();
                                            fileOutputStream.getFD().sync();
                                            if (j == v2.length()) {
                                                C1221y.f(inputStream2);
                                                C1221y.f(fileOutputStream);
                                                v2.setReadable(true, r8);
                                                v2.setExecutable(true, r8);
                                                v2.setWritable(true);
                                                break;
                                            }
                                            C1221y.f(inputStream2);
                                            C1221y.f(fileOutputStream);
                                        } catch (FileNotFoundException unused5) {
                                            str = mapLibraryName;
                                            closeable3 = fileOutputStream;
                                            C1221y.f(inputStream2);
                                            C1221y.f(closeable3);
                                            mapLibraryName = str;
                                            i3 = i10;
                                            z2 = false;
                                        } catch (IOException unused6) {
                                            str = mapLibraryName;
                                            closeable2 = fileOutputStream;
                                            C1221y.f(inputStream2);
                                            C1221y.f(closeable2);
                                            mapLibraryName = str;
                                            i3 = i10;
                                            z2 = false;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            inputStream = inputStream2;
                                            closeable = fileOutputStream;
                                            C1221y.f(inputStream);
                                            C1221y.f(closeable);
                                            throw th;
                                        }
                                    }
                                } catch (IOException unused7) {
                                }
                                str = mapLibraryName;
                                mapLibraryName = str;
                                i3 = i10;
                                z2 = false;
                            }
                        }
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused8) {
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        bVar = g10;
                        if (bVar != null) {
                            try {
                                ((ZipFile) bVar.f7761b).close();
                            } catch (IOException unused9) {
                            }
                        }
                        throw th;
                    }
                }
                String absolutePath = v2.getAbsolutePath();
                c1223z.getClass();
                System.load(absolutePath);
                hashSet.add(string2);
                c.B(StubApp.getString2(18644), string2, null);
            }
        }
        loadLibraryCalled = true;
    }

    public void markTextureFrameAvailable(long j) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeMarkTextureFrameAvailable(this.nativeShellHolderId.longValue(), j);
    }

    public void notifyLowMemoryWarning() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeNotifyLowMemoryWarning(this.nativeShellHolderId.longValue());
    }

    public void onBeginFrame() {
        ensureRunningOnMainThread();
        PlatformViewsController platformViewsController = this.platformViewsController;
        if (platformViewsController == null) {
            throw new RuntimeException(StubApp.getString2(18649));
        }
        platformViewsController.onBeginFrame();
    }

    public void onDisplayOverlaySurface(int i3, int i10, int i11, int i12, int i13) {
        ensureRunningOnMainThread();
        PlatformViewsController platformViewsController = this.platformViewsController;
        if (platformViewsController == null) {
            throw new RuntimeException(StubApp.getString2(18625));
        }
        platformViewsController.onDisplayOverlaySurface(i3, i10, i11, i12, i13);
    }

    public void onDisplayPlatformView(int i3, int i10, int i11, int i12, int i13, int i14, int i15, FlutterMutatorsStack flutterMutatorsStack) {
        ensureRunningOnMainThread();
        PlatformViewsController platformViewsController = this.platformViewsController;
        if (platformViewsController == null) {
            throw new RuntimeException(StubApp.getString2(18650));
        }
        platformViewsController.onDisplayPlatformView(i3, i10, i11, i12, i13, i14, i15, flutterMutatorsStack);
    }

    @SuppressLint({"NewApi"})
    public void onDisplayPlatformView2(int i3, int i10, int i11, int i12, int i13, int i14, int i15, FlutterMutatorsStack flutterMutatorsStack) {
        ensureRunningOnMainThread();
        PlatformViewsController2 platformViewsController2 = this.platformViewsController2;
        if (platformViewsController2 == null) {
            throw new RuntimeException(StubApp.getString2(18650));
        }
        platformViewsController2.onDisplayPlatformView(i3, i10, i11, i12, i13, i14, i15, flutterMutatorsStack);
    }

    public void onEndFrame() {
        ensureRunningOnMainThread();
        PlatformViewsController platformViewsController = this.platformViewsController;
        if (platformViewsController == null) {
            throw new RuntimeException(StubApp.getString2(18651));
        }
        platformViewsController.onEndFrame();
    }

    public void onFirstFrame() {
        ensureRunningOnMainThread();
        Iterator<m> it = this.flutterUiDisplayListeners.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    public void onRenderingStopped() {
        ensureRunningOnMainThread();
        Iterator<m> it = this.flutterUiDisplayListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public void onSurfaceChanged(int i3, int i10) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceChanged(this.nativeShellHolderId.longValue(), i3, i10);
    }

    public void onSurfaceCreated(Surface surface) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceCreated(this.nativeShellHolderId.longValue(), surface);
    }

    public void onSurfaceDestroyed() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        onRenderingStopped();
        nativeSurfaceDestroyed(this.nativeShellHolderId.longValue());
    }

    public void onSurfaceWindowChanged(Surface surface) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceWindowChanged(this.nativeShellHolderId.longValue(), surface);
    }

    public void onVsync(long j, long j3, long j10) {
        nativeOnVsync(j, j3, j10);
    }

    public long performNativeAttach(FlutterJNI flutterJNI) {
        return nativeAttach(flutterJNI);
    }

    public void prefetchDefaultFontManager() {
        if (prefetchDefaultFontManagerCalled) {
            Log.w(StubApp.getString2(18619), StubApp.getString2(18652));
        }
        nativePrefetchDefaultFontManager();
        prefetchDefaultFontManagerCalled = true;
    }

    public void registerImageTexture(long j, TextureRegistry$ImageConsumer textureRegistry$ImageConsumer, boolean z2) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterImageTexture(this.nativeShellHolderId.longValue(), j, new WeakReference<>(textureRegistry$ImageConsumer), z2);
    }

    public void registerTexture(long j, SurfaceTextureWrapper surfaceTextureWrapper) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterTexture(this.nativeShellHolderId.longValue(), j, new WeakReference<>(surfaceTextureWrapper));
    }

    public void removeEngineLifecycleListener(b bVar) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.remove(bVar);
    }

    public void removeIsDisplayingFlutterUiListener(m mVar) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.remove(mVar);
    }

    public void requestDartDeferredLibrary(int i3) {
        Log.e(StubApp.getString2(18619), StubApp.getString2(18653));
    }

    public void runBundleAndSnapshotFromLibrary(String str, String str2, String str3, AssetManager assetManager, List<String> list, long j) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRunBundleAndSnapshotFromLibrary(this.nativeShellHolderId.longValue(), str, str2, str3, assetManager, list, j);
    }

    public void scheduleFrame() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeScheduleFrame(this.nativeShellHolderId.longValue());
    }

    public void setAccessibilityDelegate(i iVar) {
        ensureRunningOnMainThread();
        this.accessibilityDelegate = iVar;
    }

    public void setAccessibilityFeatures(int i3) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            setAccessibilityFeaturesInNative(i3);
        }
    }

    public void setAccessibilityFeaturesInNative(int i3) {
        nativeSetAccessibilityFeatures(this.nativeShellHolderId.longValue(), i3);
    }

    public void setAsyncWaitForVsyncDelegate(j jVar) {
        asyncWaitForVsyncDelegate = jVar;
    }

    public void setDeferredComponentManager(InterfaceC0399a interfaceC0399a) {
        ensureRunningOnMainThread();
        if (interfaceC0399a != null) {
            interfaceC0399a.a();
        }
    }

    public void setLocalizationPlugin(LocalizationPlugin localizationPlugin) {
        ensureRunningOnMainThread();
        this.localizationPlugin = localizationPlugin;
    }

    public void setPlatformMessageHandler(p pVar) {
        ensureRunningOnMainThread();
        this.platformMessageHandler = pVar;
    }

    public void setPlatformViewsController(PlatformViewsController platformViewsController) {
        ensureRunningOnMainThread();
        this.platformViewsController = platformViewsController;
    }

    public void setPlatformViewsController2(PlatformViewsController2 platformViewsController2) {
        ensureRunningOnMainThread();
        this.platformViewsController2 = platformViewsController2;
    }

    public void setRefreshRateFPS(float f10) {
        refreshRateFPS = f10;
        updateRefreshRate();
    }

    public void setSemanticsEnabled(boolean z2) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            setSemanticsEnabledInNative(z2);
        }
    }

    public void setSemanticsEnabledInNative(boolean z2) {
        nativeSetSemanticsEnabled(this.nativeShellHolderId.longValue(), z2);
    }

    public void setViewportMetrics(float f10, int i3, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int[] iArr, int[] iArr2, int[] iArr3) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSetViewportMetrics(this.nativeShellHolderId.longValue(), f10, i3, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, iArr, iArr2, iArr3);
    }

    @SuppressLint({"NewApi"})
    public void showOverlaySurface2() {
        PlatformViewsController2 platformViewsController2 = this.platformViewsController2;
        if (platformViewsController2 == null) {
            throw new RuntimeException(StubApp.getString2(18626));
        }
        platformViewsController2.showOverlaySurface();
    }

    public FlutterJNI spawn(String str, String str2, String str3, List<String> list, long j) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        FlutterJNI nativeSpawn = nativeSpawn(this.nativeShellHolderId.longValue(), str, str2, str3, list, j);
        Long l9 = nativeSpawn.nativeShellHolderId;
        if ((l9 == null || l9.longValue() == 0) ? false : true) {
            return nativeSpawn;
        }
        throw new IllegalStateException(StubApp.getString2(18654));
    }

    @SuppressLint({"NewApi"})
    public void swapTransactions() {
        PlatformViewsController2 platformViewsController2 = this.platformViewsController2;
        if (platformViewsController2 == null) {
            throw new RuntimeException("");
        }
        platformViewsController2.swapTransactions();
    }

    public void unregisterTexture(long j) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeUnregisterTexture(this.nativeShellHolderId.longValue(), j);
    }

    public void updateDisplayMetrics(int i3, float f10, float f11, float f12) {
        displayWidth = f10;
        displayHeight = f11;
        displayDensity = f12;
        if (loadLibraryCalled) {
            nativeUpdateDisplayMetrics(this.nativeShellHolderId.longValue());
        }
    }

    public void updateJavaAssetManager(AssetManager assetManager, String str) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeUpdateJavaAssetManager(this.nativeShellHolderId.longValue(), assetManager, str);
    }

    public void updateRefreshRate() {
        if (loadLibraryCalled) {
            nativeUpdateRefreshRate(refreshRateFPS);
        }
    }

    public void dispatchSemanticsAction(int i3, e eVar, Object obj) {
        ByteBuffer byteBuffer;
        int i10;
        ensureAttachedToNative();
        if (obj != null) {
            byteBuffer = StandardMessageCodec.INSTANCE.encodeMessage(obj);
            i10 = byteBuffer.position();
        } else {
            byteBuffer = null;
            i10 = 0;
        }
        dispatchSemanticsAction(i3, eVar.f15125a, byteBuffer, i10);
    }

    public void dispatchSemanticsAction(int i3, int i10, ByteBuffer byteBuffer, int i11) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchSemanticsAction(this.nativeShellHolderId.longValue(), i3, i10, byteBuffer, i11);
    }
}
