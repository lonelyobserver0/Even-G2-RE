package com.mapbox.maps.renderer.gl;

import android.annotation.SuppressLint;
import android.opengl.GLES20;
import android.opengl.GLES30;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u0014\u001a\u00020\tH\u0007J\b\u0010\u0015\u001a\u00020\u0016H\u0003J\u0006\u0010\u0017\u001a\u00020\u0016R\u0016\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/mapbox/maps/renderer/gl/PixelReader;", "", "width", "", "height", "legacyMode", "", "(IIZ)V", "buffer", "Ljava/nio/ByteBuffer;", "kotlin.jvm.PlatformType", "bufferSize", "getHeight", "()I", "idsPbo", "", "getLegacyMode", "()Z", "supportsPbo", "getWidth", "readPixels", "readPixelsWithPBO", "", "release", "Companion", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class PixelReader {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    private static final int channelNum = 4;
    private ByteBuffer buffer;
    private final int bufferSize;
    private final int height;
    private final int[] idsPbo;
    private final boolean legacyMode;
    private final boolean supportsPbo;
    private final int width;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/mapbox/maps/renderer/gl/PixelReader$Companion;", "", "()V", "channelNum", "", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public PixelReader(int i3, int i10, boolean z2) {
        this.width = i3;
        this.height = i10;
        this.legacyMode = z2;
        this.supportsPbo = !z2;
        int i11 = i3 * i10 * 4;
        this.bufferSize = i11;
        this.buffer = ByteBuffer.allocateDirect(i11).order(ByteOrder.nativeOrder());
        int[] iArr = {0};
        this.idsPbo = iArr;
        if (z2) {
            return;
        }
        GLES20.glGenBuffers(iArr.length, iArr, 0);
        GLES20.glBindBuffer(35051, iArr[0]);
        GLES20.glBufferData(35051, i11, null, 35041);
        GLES20.glBindBuffer(35051, 0);
    }

    private final void readPixelsWithPBO() {
        GLES30.glReadBuffer(1028);
        GLES20.glBindBuffer(35051, this.idsPbo[0]);
        GLES30.glReadPixels(0, 0, this.width, this.height, 6408, 5121, 0);
        Buffer glMapBufferRange = GLES30.glMapBufferRange(35051, 0, this.bufferSize, 1);
        if (glMapBufferRange != null) {
            this.buffer = ((ByteBuffer) glMapBufferRange).order(ByteOrder.nativeOrder());
            GLES30.glUnmapBuffer(35051);
        }
        GLES20.glBindBuffer(35051, 0);
    }

    public final int getHeight() {
        return this.height;
    }

    public final boolean getLegacyMode() {
        return this.legacyMode;
    }

    public final int getWidth() {
        return this.width;
    }

    @SuppressLint({"NewApi"})
    public final ByteBuffer readPixels() {
        this.buffer.rewind();
        if (this.supportsPbo) {
            readPixelsWithPBO();
        } else {
            GLES20.glReadPixels(0, 0, this.width, this.height, 6408, 5121, this.buffer);
        }
        ByteBuffer buffer = this.buffer;
        Intrinsics.checkNotNullExpressionValue(buffer, "buffer");
        return buffer;
    }

    public final void release() {
        if (this.supportsPbo) {
            int[] iArr = this.idsPbo;
            GLES20.glDeleteBuffers(iArr.length, IntBuffer.wrap(iArr));
        }
    }
}
