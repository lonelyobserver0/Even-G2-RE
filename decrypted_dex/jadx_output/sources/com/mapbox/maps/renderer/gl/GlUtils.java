package com.mapbox.maps.renderer.gl;

import android.opengl.GLES20;
import android.opengl.Matrix;
import com.stub.StubApp;
import io.flutter.plugin.platform.PlatformPlugin;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p0.AbstractC1482f;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0015\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u0086\bJ\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\tJ\u0012\u0010\u000f\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0002J\u0016\u0010\u0010\u001a\u00020\u0004*\u00020\u00112\n\u0010\u0012\u001a\u00020\u000b\"\u00020\u0013J\u0016\u0010\u0010\u001a\u00020\u0004*\u00020\u000b2\n\u0010\u0012\u001a\u00020\u000b\"\u00020\u0013J\n\u0010\u0014\u001a\u00020\u0011*\u00020\u000b¨\u0006\u0015"}, d2 = {"Lcom/mapbox/maps/renderer/gl/GlUtils;", "", "()V", "checkCompileStatus", "", "shader", "", "checkError", "cmd", "", "getIdentityMatrix", "", "loadShader", "type", "shaderCode", "throwIfError", "put", "Ljava/nio/FloatBuffer;", "values", "", "toFloatBuffer", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class GlUtils {
    public static final GlUtils INSTANCE = new GlUtils();

    private GlUtils() {
    }

    public static /* synthetic */ void checkError$default(GlUtils glUtils, String str, int i3, Object obj) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void throwIfError(String cmd) {
        Object string2;
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            StringBuilder n10 = AbstractC1482f.n(cmd, StubApp.getString2(14569));
            switch (glGetError) {
                case PlatformPlugin.DEFAULT_SYSTEM_UI /* 1280 */:
                    string2 = StubApp.getString2(14574);
                    break;
                case 1281:
                    string2 = StubApp.getString2(14573);
                    break;
                case 1282:
                    string2 = StubApp.getString2(14572);
                    break;
                case 1283:
                case 1284:
                default:
                    string2 = Integer.valueOf(glGetError);
                    break;
                case 1285:
                    string2 = StubApp.getString2(14571);
                    break;
                case 1286:
                    string2 = StubApp.getString2(14570);
                    break;
            }
            n10.append(string2);
            throw new RuntimeException(n10.toString());
        }
    }

    public final void checkCompileStatus(int shader) {
    }

    public final void checkError(String cmd) {
    }

    public final float[] getIdentityMatrix() {
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        return fArr;
    }

    public final int loadShader(int type, String shaderCode) {
        Intrinsics.checkNotNullParameter(shaderCode, "shaderCode");
        int glCreateShader = GLES20.glCreateShader(type);
        GLES20.glShaderSource(glCreateShader, shaderCode);
        GLES20.glCompileShader(glCreateShader);
        return glCreateShader;
    }

    public final void put(FloatBuffer floatBuffer, float... values) {
        Intrinsics.checkNotNullParameter(floatBuffer, "<this>");
        Intrinsics.checkNotNullParameter(values, "values");
        floatBuffer.rewind();
        for (float f10 : values) {
            floatBuffer.put(f10);
        }
        floatBuffer.rewind();
    }

    public final FloatBuffer toFloatBuffer(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        asFloatBuffer.put(fArr);
        asFloatBuffer.rewind();
        Intrinsics.checkNotNullExpressionValue(asFloatBuffer, "allocateDirect(size * 4)…)\n      it.rewind()\n    }");
        return asFloatBuffer;
    }

    public final void put(float[] fArr, float... values) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(values, "values");
        int length = values.length;
        int i3 = 0;
        int i10 = 0;
        while (i3 < length) {
            fArr[i10] = values[i3];
            i3++;
            i10++;
        }
    }
}
