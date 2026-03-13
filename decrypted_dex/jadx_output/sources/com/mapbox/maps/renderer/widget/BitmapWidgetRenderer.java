package com.mapbox.maps.renderer.widget;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import com.mapbox.maps.renderer.gl.GlUtils;
import com.mapbox.maps.renderer.widget.WidgetPosition;
import com.stub.StubApp;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0015\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0001\u0018\u0000 >2\u00020\u0001:\u0001>B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010,\u001a\u00020\u0005H\u0017J\b\u0010-\u001a\u00020\fH\u0017J\b\u0010.\u001a\u00020\fH\u0002J\u0018\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\b2\u0006\u00102\u001a\u00020\bH\u0016J\b\u00103\u001a\u000200H\u0016J\b\u00104\u001a\u000200H\u0016J\b\u00105\u001a\u000200H\u0016J\u0010\u00106\u001a\u0002002\u0006\u00107\u001a\u00020\u0005H\u0017J\u0010\u00108\u001a\u0002002\u0006\u00109\u001a\u00020\fH\u0017J\b\u0010:\u001a\u000200H\u0002J\b\u0010;\u001a\u00020\fH\u0002J\u0010\u0010(\u001a\u0002002\u0006\u0010\u0002\u001a\u00020\u0003H\u0007J\b\u0010<\u001a\u000200H\u0002J\b\u0010=\u001a\u000200H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00158W@WX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006?"}, d2 = {"Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;", "Lcom/mapbox/maps/renderer/widget/WidgetRenderer;", "bitmap", "Landroid/graphics/Bitmap;", "position", "Lcom/mapbox/maps/renderer/widget/WidgetPosition;", "(Landroid/graphics/Bitmap;Lcom/mapbox/maps/renderer/widget/WidgetPosition;)V", "attributeTexturePosition", "", "attributeVertexPosition", "fragmentShader", "halfBitmapHeight", "", "halfBitmapWidth", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "mvpMatrix", "", "mvpMatrixBuffer", "Ljava/nio/FloatBuffer;", "<set-?>", "", "needRender", "getNeedRender", "()Z", "setNeedRender", "(Z)V", "program", "rotationDegrees", "rotationMatrix", "screenMatrix", "surfaceHeight", "surfaceWidth", "texturePositionBuffer", "textures", "", "translateMatrix", "translateRotate", "uniformMvpMatrix", "uniformTexture", "updateBitmap", "updateMatrix", "vertexPositionBuffer", "vertexShader", "getPosition", "getRotation", "leftX", "onSurfaceChanged", "", "width", "height", "prepare", "release", "render", "setPosition", "widgetPosition", "setRotation", "angleDegrees", "textureFromBitmapIfChanged", "topY", "updateTranslateMatrix", "updateVertexBuffer", "Companion", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class BitmapWidgetRenderer implements WidgetRenderer {

    @Deprecated
    public static final int BYTES_PER_FLOAT = 4;

    @Deprecated
    public static final int COORDS_PER_VERTEX = 2;

    @Deprecated
    public static final int VERTEX_COUNT = 4;

    @Deprecated
    public static final int VERTEX_STRIDE = 8;
    private int attributeTexturePosition;
    private int attributeVertexPosition;
    private Bitmap bitmap;
    private int fragmentShader;
    private float halfBitmapHeight;
    private float halfBitmapWidth;
    private final ReentrantLock lock;
    private final float[] mvpMatrix;
    private final FloatBuffer mvpMatrixBuffer;
    private boolean needRender;
    private volatile WidgetPosition position;
    private int program;
    private volatile float rotationDegrees;
    private final float[] rotationMatrix;
    private float[] screenMatrix;
    private int surfaceHeight;
    private int surfaceWidth;
    private final FloatBuffer texturePositionBuffer;
    private final int[] textures;
    private final float[] translateMatrix;
    private float[] translateRotate;
    private int uniformMvpMatrix;
    private int uniformTexture;
    private boolean updateBitmap;
    private boolean updateMatrix;
    private final FloatBuffer vertexPositionBuffer;
    private int vertexShader;
    private static final Companion Companion = new Companion(null);

    @Deprecated
    private static final String VERTEX_SHADER_CODE = StubApp.getString2(14580);

    @Deprecated
    private static final String FRAGMENT_SHADER_CODE = StubApp.getString2(14581);

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\tR\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer$Companion;", "", "()V", "BYTES_PER_FLOAT", "", "COORDS_PER_VERTEX", "FRAGMENT_SHADER_CODE", "", "getFRAGMENT_SHADER_CODE", "()Ljava/lang/String;", "VERTEX_COUNT", "VERTEX_SHADER_CODE", "getVERTEX_SHADER_CODE", "VERTEX_STRIDE", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getFRAGMENT_SHADER_CODE() {
            return BitmapWidgetRenderer.FRAGMENT_SHADER_CODE;
        }

        public final String getVERTEX_SHADER_CODE() {
            return BitmapWidgetRenderer.VERTEX_SHADER_CODE;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[WidgetPosition.Vertical.values().length];
            try {
                iArr[WidgetPosition.Vertical.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WidgetPosition.Vertical.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WidgetPosition.Vertical.BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[WidgetPosition.Horizontal.values().length];
            try {
                iArr2[WidgetPosition.Horizontal.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[WidgetPosition.Horizontal.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[WidgetPosition.Horizontal.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public BitmapWidgetRenderer(Bitmap bitmap, WidgetPosition position) {
        Intrinsics.checkNotNullParameter(position, "position");
        this.bitmap = bitmap;
        this.position = position;
        this.lock = new ReentrantLock();
        this.halfBitmapWidth = (this.bitmap != null ? r3.getWidth() : 0) / 2.0f;
        this.halfBitmapHeight = (this.bitmap != null ? r3.getHeight() : 0) / 2.0f;
        this.textures = new int[]{0};
        this.screenMatrix = new float[16];
        this.translateRotate = new float[16];
        GlUtils glUtils = GlUtils.INSTANCE;
        this.rotationMatrix = glUtils.getIdentityMatrix();
        this.translateMatrix = glUtils.getIdentityMatrix();
        float[] identityMatrix = glUtils.getIdentityMatrix();
        this.mvpMatrix = identityMatrix;
        this.mvpMatrixBuffer = glUtils.toFloatBuffer(identityMatrix);
        this.updateBitmap = true;
        this.updateMatrix = true;
        this.vertexPositionBuffer = glUtils.toFloatBuffer(new float[8]);
        this.texturePositionBuffer = glUtils.toFloatBuffer(new float[]{0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f});
        this.needRender = true;
    }

    private final float leftX() {
        float f10;
        float offsetX = this.position.getOffsetX();
        int i3 = WhenMappings.$EnumSwitchMapping$1[this.position.getHorizontalAlignment().ordinal()];
        if (i3 == 1) {
            f10 = this.halfBitmapWidth;
        } else if (i3 == 2) {
            f10 = this.surfaceWidth / 2;
        } else {
            if (i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            f10 = this.surfaceWidth - this.halfBitmapWidth;
        }
        return offsetX + f10;
    }

    private final void textureFromBitmapIfChanged() {
        if (!this.updateBitmap || this.bitmap == null) {
            return;
        }
        int[] iArr = this.textures;
        if (iArr[0] == 0) {
            GLES20.glGenTextures(1, iArr, 0);
        }
        GLES20.glBindTexture(3553, this.textures[0]);
        GLES20.glTexParameterf(3553, 10241, 9728.0f);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLES20.glTexParameterf(3553, 10242, 33071.0f);
        GLES20.glTexParameterf(3553, 10243, 33071.0f);
        GLUtils.texImage2D(3553, 0, this.bitmap, 0);
        GLES20.glBindTexture(3553, 0);
        this.updateBitmap = false;
    }

    private final float topY() {
        float f10;
        float offsetY = this.position.getOffsetY();
        int i3 = WhenMappings.$EnumSwitchMapping$0[this.position.getVerticalAlignment().ordinal()];
        if (i3 == 1) {
            f10 = this.halfBitmapHeight;
        } else if (i3 == 2) {
            f10 = this.surfaceHeight / 2;
        } else {
            if (i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            f10 = this.surfaceHeight - this.halfBitmapHeight;
        }
        return offsetY + f10;
    }

    private final void updateTranslateMatrix() {
        Matrix.setIdentityM(this.translateMatrix, 0);
        Matrix.translateM(this.translateMatrix, 0, leftX(), topY(), 0.0f);
        this.updateMatrix = true;
        setNeedRender(true);
    }

    private final void updateVertexBuffer() {
        GlUtils glUtils = GlUtils.INSTANCE;
        FloatBuffer floatBuffer = this.vertexPositionBuffer;
        float f10 = this.halfBitmapWidth;
        float f11 = this.halfBitmapHeight;
        glUtils.put(floatBuffer, -f10, -f11, -f10, f11, f10, -f11, f10, f11);
    }

    @Override // com.mapbox.maps.renderer.widget.WidgetRenderer
    public boolean getNeedRender() {
        return this.needRender;
    }

    @Override // com.mapbox.maps.renderer.widget.WidgetRenderer
    public WidgetPosition getPosition() {
        return this.position;
    }

    @Override // com.mapbox.maps.renderer.widget.WidgetRenderer
    /* renamed from: getRotation, reason: from getter */
    public float getRotationDegrees() {
        return this.rotationDegrees;
    }

    @Override // com.mapbox.maps.renderer.widget.WidgetRenderer
    public void onSurfaceChanged(int width, int height) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            this.surfaceWidth = width;
            this.surfaceHeight = height;
            GlUtils.INSTANCE.put(this.screenMatrix, 2.0f / width, 0.0f, 0.0f, 0.0f, 0.0f, (-2.0f) / height, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f);
            updateVertexBuffer();
            updateTranslateMatrix();
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // com.mapbox.maps.renderer.widget.WidgetRenderer
    public void prepare() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            GLES20.glGetIntegerv(34921, new int[1], 0);
            GlUtils glUtils = GlUtils.INSTANCE;
            int loadShader = glUtils.loadShader(35633, VERTEX_SHADER_CODE);
            glUtils.checkCompileStatus(loadShader);
            this.vertexShader = loadShader;
            int loadShader2 = glUtils.loadShader(35632, FRAGMENT_SHADER_CODE);
            glUtils.checkCompileStatus(loadShader2);
            this.fragmentShader = loadShader2;
            int glCreateProgram = GLES20.glCreateProgram();
            GLES20.glAttachShader(glCreateProgram, this.vertexShader);
            GLES20.glAttachShader(glCreateProgram, this.fragmentShader);
            GLES20.glLinkProgram(glCreateProgram);
            this.program = glCreateProgram;
            this.uniformMvpMatrix = GLES20.glGetUniformLocation(glCreateProgram, StubApp.getString2("14582"));
            this.attributeVertexPosition = GLES20.glGetAttribLocation(this.program, StubApp.getString2("14577"));
            this.attributeTexturePosition = GLES20.glGetAttribLocation(this.program, StubApp.getString2("14583"));
            this.uniformTexture = GLES20.glGetUniformLocation(this.program, StubApp.getString2("14579"));
            setNeedRender(true);
            this.updateBitmap = true;
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // com.mapbox.maps.renderer.widget.WidgetRenderer
    public void release() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.program != 0) {
                GLES20.glDisableVertexAttribArray(this.attributeVertexPosition);
                GLES20.glDetachShader(this.program, this.vertexShader);
                GLES20.glDetachShader(this.program, this.fragmentShader);
                GLES20.glDeleteShader(this.vertexShader);
                GLES20.glDeleteShader(this.fragmentShader);
                int[] iArr = this.textures;
                GLES20.glDeleteTextures(iArr.length, iArr, 0);
                GLES20.glDeleteProgram(this.program);
                this.program = 0;
            }
            setNeedRender(false);
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // com.mapbox.maps.renderer.widget.WidgetRenderer
    public void render() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.program == 0) {
                prepare();
            }
            GLES20.glUseProgram(this.program);
            GlUtils glUtils = GlUtils.INSTANCE;
            if (this.updateMatrix) {
                Matrix.setIdentityM(this.mvpMatrix, 0);
                Matrix.multiplyMM(this.translateRotate, 0, this.translateMatrix, 0, this.rotationMatrix, 0);
                Matrix.multiplyMM(this.mvpMatrix, 0, this.screenMatrix, 0, this.translateRotate, 0);
                this.mvpMatrixBuffer.rewind();
                this.mvpMatrixBuffer.put(this.mvpMatrix);
                this.mvpMatrixBuffer.rewind();
                this.updateMatrix = false;
            }
            GLES20.glUniformMatrix4fv(this.uniformMvpMatrix, 1, false, this.mvpMatrixBuffer);
            textureFromBitmapIfChanged();
            GLES20.glBindTexture(3553, this.textures[0]);
            GLES20.glUniform1i(this.uniformTexture, 0);
            GLES20.glEnableVertexAttribArray(this.attributeVertexPosition);
            GLES20.glVertexAttribPointer(this.attributeVertexPosition, 2, 5126, false, 8, (Buffer) this.vertexPositionBuffer);
            GLES20.glEnableVertexAttribArray(this.attributeTexturePosition);
            GLES20.glVertexAttribPointer(this.attributeTexturePosition, 2, 5126, false, 8, (Buffer) this.texturePositionBuffer);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glDisableVertexAttribArray(this.attributeVertexPosition);
            GLES20.glDisableVertexAttribArray(this.attributeTexturePosition);
            GLES20.glBindBuffer(34962, 0);
            GLES20.glBindTexture(3553, 0);
            GLES20.glUseProgram(0);
            setNeedRender(false);
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public void setNeedRender(boolean z2) {
        this.needRender = z2;
    }

    @Override // com.mapbox.maps.renderer.widget.WidgetRenderer
    public void setPosition(WidgetPosition widgetPosition) {
        Intrinsics.checkNotNullParameter(widgetPosition, "widgetPosition");
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            this.position = widgetPosition;
            updateTranslateMatrix();
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // com.mapbox.maps.renderer.widget.WidgetRenderer
    public void setRotation(float angleDegrees) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            this.rotationDegrees = angleDegrees;
            Matrix.setIdentityM(this.rotationMatrix, 0);
            Matrix.setRotateM(this.rotationMatrix, 0, angleDegrees, 0.0f, 0.0f, 1.0f);
            this.updateMatrix = true;
            setNeedRender(true);
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void updateBitmap(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            this.bitmap = bitmap;
            this.halfBitmapWidth = bitmap.getWidth() / 2.0f;
            this.halfBitmapHeight = bitmap.getHeight() / 2.0f;
            updateTranslateMatrix();
            updateVertexBuffer();
            this.updateBitmap = true;
            this.updateMatrix = true;
            setNeedRender(true);
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }
}
