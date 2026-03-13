package com.mapbox.maps.renderer;

import android.opengl.EGLContext;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.renderer.egl.EGLCore;
import com.mapbox.maps.renderer.widget.Widget;
import com.stub.StubApp;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001aJ\b\u0010\u001f\u001a\u00020\u001dH\u0002J\b\u0010 \u001a\u00020\u001dH\u0002J\u0006\u0010!\u001a\u00020\u001dJ\b\u0010\"\u001a\u00020\u001dH\u0002J\u0006\u0010#\u001a\u00020\u0003J\u0006\u0010$\u001a\u00020\u000bJ\u0006\u0010%\u001a\u00020\u000bJ\u0016\u0010&\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003J\b\u0010'\u001a\u00020\u001dH\u0002J\u0006\u0010(\u001a\u00020\u001dJ\u0010\u0010)\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020\u000bH\u0002J\u000e\u0010+\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001aJ\u0006\u0010,\u001a\u00020\u001dJ\u000e\u0010-\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020/R\u0014\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0013\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;", "", "antialiasingSampleCount", "", "mapName", "", "(ILjava/lang/String;)V", "TAG", "getTAG$annotations", "()V", "eglContextCreated", "", "eglCore", "Lcom/mapbox/maps/renderer/egl/EGLCore;", "eglSurface", "Landroid/opengl/EGLSurface;", "framebuffers", "", "height", "needRender", "getNeedRender", "()Z", "sizeChanged", "textures", "widgets", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Lcom/mapbox/maps/renderer/widget/Widget;", "width", "addWidget", "", "widget", "checkEgl", "checkSizeChanged", "cleanUpAllWidgets", "deleteFrameBufferWithTexture", "getTexture", "hasTexture", "hasWidgets", "onSurfaceChanged", "prepareFrameBufferWithTexture", "release", "releaseAll", "resizing", "removeWidget", "renderToFrameBuffer", "setSharedContext", "sharedContext", "Landroid/opengl/EGLContext;", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class MapboxWidgetRenderer {
    private final String TAG;
    private final int antialiasingSampleCount;
    private boolean eglContextCreated;
    private EGLCore eglCore;
    private EGLSurface eglSurface;
    private final int[] framebuffers;
    private int height;
    private final String mapName;
    private boolean sizeChanged;
    private final int[] textures;
    private final CopyOnWriteArraySet<Widget> widgets;
    private int width;

    public MapboxWidgetRenderer(int i3, String mapName) {
        Intrinsics.checkNotNullParameter(mapName, "mapName");
        this.antialiasingSampleCount = i3;
        this.mapName = mapName;
        this.textures = new int[]{0};
        this.framebuffers = new int[]{0};
        this.widgets = new CopyOnWriteArraySet<>();
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(14505));
        sb2.append(!StringsKt.isBlank(mapName) ? E1.a.j(StubApp.getString2(639), mapName) : "");
        this.TAG = sb2.toString();
    }

    private final void checkEgl() {
        EGLSurface eGLSurface = this.eglSurface;
        EGLCore eGLCore = this.eglCore;
        if (eGLCore == null) {
            MapboxLogger.logE(this.TAG, StubApp.getString2(14506));
            return;
        }
        if (eGLSurface == null || Intrinsics.areEqual(eGLSurface, eGLCore.getEglNoSurface())) {
            if (!this.eglContextCreated) {
                boolean prepareEgl = eGLCore.prepareEgl();
                this.eglContextCreated = prepareEgl;
                if (!prepareEgl) {
                    MapboxLogger.logE(this.TAG, StubApp.getString2(14507));
                    return;
                }
            }
            if (eGLSurface == null || Intrinsics.areEqual(eGLSurface, eGLCore.getEglNoSurface())) {
                EGLSurface createOffscreenSurface = eGLCore.createOffscreenSurface(this.width, this.height);
                this.eglSurface = createOffscreenSurface;
                if (Intrinsics.areEqual(createOffscreenSurface, eGLCore.getEglNoSurface())) {
                    MapboxLogger.logE(this.TAG, StubApp.getString2(14508));
                }
            }
        }
    }

    private final void checkSizeChanged() {
        if (this.sizeChanged) {
            EGLCore eGLCore = this.eglCore;
            EGLSurface eGLSurface = this.eglSurface;
            if (eGLCore != null && eGLSurface != null && !Intrinsics.areEqual(eGLSurface, eGLCore.getEglNoSurface())) {
                releaseAll(true);
            }
            this.sizeChanged = false;
        }
    }

    private final void deleteFrameBufferWithTexture() {
        int[] iArr = this.framebuffers;
        GLES20.glDeleteFramebuffers(iArr.length, iArr, 0);
        int[] iArr2 = this.textures;
        GLES20.glDeleteTextures(iArr2.length, iArr2, 0);
        this.framebuffers[0] = 0;
        this.textures[0] = 0;
    }

    private static /* synthetic */ void getTAG$annotations() {
    }

    private final void prepareFrameBufferWithTexture() {
        GLES20.glGenFramebuffers(1, this.framebuffers, 0);
        GLES20.glGenTextures(1, this.textures, 0);
        GLES20.glBindTexture(3553, this.textures[0]);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, 10242, 33071.0f);
        GLES20.glTexParameterf(3553, 10243, 33071.0f);
        GLES20.glTexImage2D(3553, 0, 6408, this.width, this.height, 0, 6408, 5121, null);
        GLES20.glBindTexture(3553, 0);
        GLES20.glBindFramebuffer(36160, this.framebuffers[0]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.textures[0], 0);
        GLES20.glBindFramebuffer(36160, 0);
    }

    private final void releaseAll(boolean resizing) {
        EGLCore eGLCore = this.eglCore;
        EGLSurface eGLSurface = this.eglSurface;
        if (eGLCore != null) {
            if (eGLSurface != null && !Intrinsics.areEqual(eGLSurface, eGLCore.getEglNoSurface())) {
                eGLCore.makeCurrent(eGLSurface);
                deleteFrameBufferWithTexture();
                Iterator<T> it = this.widgets.iterator();
                while (it.hasNext()) {
                    ((Widget) it.next()).getRenderer().release();
                }
                eGLCore.releaseSurface(eGLSurface);
            }
            eGLCore.release();
        }
        this.eglSurface = null;
        if (!resizing) {
            this.eglCore = null;
        }
        this.eglContextCreated = false;
    }

    public final void addWidget(Widget widget) {
        Intrinsics.checkNotNullParameter(widget, "widget");
        widget.getRenderer().onSurfaceChanged(this.width, this.height);
        this.widgets.add(widget);
    }

    public final void cleanUpAllWidgets() {
        Iterator<T> it = this.widgets.iterator();
        while (it.hasNext()) {
            ((Widget) it.next()).setTriggerRepaintAction$maps_sdk_release(null);
        }
        this.widgets.clear();
    }

    public final boolean getNeedRender() {
        CopyOnWriteArraySet<Widget> copyOnWriteArraySet = this.widgets;
        if (copyOnWriteArraySet != null && copyOnWriteArraySet.isEmpty()) {
            return false;
        }
        Iterator<T> it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            if (((Widget) it.next()).getRenderer().getNeedRender()) {
                return true;
            }
        }
        return false;
    }

    public final int getTexture() {
        return this.textures[0];
    }

    public final boolean hasTexture() {
        return this.textures[0] != 0;
    }

    public final boolean hasWidgets() {
        return !this.widgets.isEmpty();
    }

    public final void onSurfaceChanged(int width, int height) {
        this.sizeChanged = true;
        this.width = width;
        this.height = height;
        Iterator<T> it = this.widgets.iterator();
        while (it.hasNext()) {
            ((Widget) it.next()).getRenderer().onSurfaceChanged(width, height);
        }
    }

    public final void release() {
        releaseAll(false);
    }

    public final boolean removeWidget(Widget widget) {
        Intrinsics.checkNotNullParameter(widget, "widget");
        boolean remove = this.widgets.remove(widget);
        if (remove) {
            widget.setTriggerRepaintAction$maps_sdk_release(null);
        }
        return remove;
    }

    public final void renderToFrameBuffer() {
        checkSizeChanged();
        checkEgl();
        EGLCore eGLCore = this.eglCore;
        EGLSurface eGLSurface = this.eglSurface;
        if (eGLCore == null || eGLSurface == null || Intrinsics.areEqual(eGLSurface, eGLCore.getEglNoSurface())) {
            return;
        }
        eGLCore.makeCurrent(eGLSurface);
        if (!hasTexture()) {
            prepareFrameBufferWithTexture();
        }
        GLES20.glBindFramebuffer(36160, this.framebuffers[0]);
        GLES20.glClear(17664);
        Iterator<T> it = this.widgets.iterator();
        while (it.hasNext()) {
            ((Widget) it.next()).getRenderer().render();
        }
        GLES20.glBindFramebuffer(36160, 0);
    }

    public final void setSharedContext(EGLContext sharedContext) {
        Intrinsics.checkNotNullParameter(sharedContext, "sharedContext");
        if (this.eglContextCreated) {
            release();
        }
        this.eglCore = new EGLCore(false, this.antialiasingSampleCount, sharedContext, this.mapName);
    }
}
